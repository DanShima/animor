package com.danshima.animor.di

import android.content.Context
import androidx.room.Room
import com.danshima.animor.network.AnimeDao
import com.danshima.animor.network.AppDatabase
import com.danshima.animor.network.MainApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.multibindings.IntoSet
import okhttp3.Authenticator
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Named
import javax.inject.Singleton

@Module
class ApplicationModule {

    @Provides
    @Singleton
    internal fun provideApi(@Named("REST") okHttpClient: OkHttpClient): MainApi {
        return buildRetrofit("http://localhost/", okHttpClient)
            .create(MainApi::class.java)
    }

    @Provides
    @Singleton
    internal fun provideRoomDb(context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "app-database")
            .fallbackToDestructiveMigration()
            .build()

    @Provides
    internal fun provideAnimeDao(db: AppDatabase): AnimeDao = db.animeDao()

    @Provides
    @IntoSet
    @Singleton
    internal fun provideOkHttpLoggingInterceptor(): Interceptor {
        val loggingInterceptor = HttpLoggingInterceptor()
        loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return loggingInterceptor
    }

    @Provides
    @Named("REST")
    @Singleton
    internal fun provideRestHttpClient(
        context: Context,
        interceptors: MutableSet<Interceptor>,
        authenticator: Authenticator
    ): OkHttpClient {
        val builder = OkHttpClient.Builder()
        for (interceptor in interceptors) {
            builder.addNetworkInterceptor(interceptor)
        }
        builder.authenticator(authenticator)
        builder.connectTimeout(15, TimeUnit.SECONDS)
        builder.writeTimeout(15, TimeUnit.SECONDS)
        builder.readTimeout(15, TimeUnit.SECONDS)
        val cacheSize = 10 * 1024 * 1024 // 10 MiB
        builder.cache(Cache(context.cacheDir, cacheSize.toLong()))
        builder.cache(null)
        return builder.build()
    }



}

private fun buildRetrofit(url: String, okHttpClient: OkHttpClient) =
    Retrofit.Builder()
        .baseUrl(url)
        //.addConverterFactory(ScalarsConverterFactory.create())
        //.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .client(okHttpClient)
        .build()
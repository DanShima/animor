object AndroidVersion {
    const val compileSdk = 30
    const val minSdk = 21
    const val targetSdk = 30
    const val versionCode = 1
    const val versionName = "1.0.0"
}

object Versions {
    const val gradle = "4.2.0-alpha10"
    const val kotlin = "1.4.0"
    const val appcompat = "1.3.0-alpha02"
    const val junit = "4.13"
    const val nav = "2.3.0"
    const val coro = "1.3.3"
    const val hilt = "2.28.3-alpha"
    const val hiltExt = "1.0.0-alpha02"
    const val room = "2.2.2"
    const val retrofit = "2.6.2"
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core = "androidx.core:core-ktx:1.5.0-alpha01"

    const val material = "com.google.android.material:material:1.3.0-alpha02"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta1"
    const val recyclerView = "androidx.recyclerview:recyclerview:1.1.0"
    const val cardView = "androidx.cardview:cardview:1.0.0"
    const val viewPager = "androidx.viewpager2:viewpager2:1.0.0"

    const val navigation = "androidx.navigation:navigation-fragment:${Versions.nav}"
    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.nav}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    // ViewModel and LiveData
    const val lifeCycleExt = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:2.2.0-rc02"
    const val lifeCycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0"
    // Room for database
    const val roomDb = "androidx.room:room-ktx:${Versions.room}"
    // network & serialization
    const val gson = "com.google.code.gson:gson:2.8.6"
    const val retrofitConverter = "com.squareup.retrofit2:converter-gson:${Versions.retrofit}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    const val logging = "com.squareup.okhttp3:logging-interceptor:4.2.0"

    const val playCore = "com.google.android.play:core:1.8.0"
    const val playCoreKtx = "com.google.android.play:core-ktx:1.8.1"
    //coroutines
    const val coroutine = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coro}"
    const val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coro}"
    const val coroutinePlayService = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:1.3.9"
    //dagger
    const val dagger = "com.google.dagger:dagger:2.24"
    const val daggerCompiler = "com.google.dagger:dagger-compiler:2.24"
    const val hilt = "com.google.dagger:hilt-android:${Versions.hilt}"
    const val hiltAndroidCompiler = "com.google.dagger:hilt-android-compiler:${Versions.hilt}"
    // Hilt ViewModel extension
    const val hiltCompiler = "androidx.hilt:hilt-compiler:${Versions.hiltExt}"
    const val hiltWork = "androidx.hilt:hilt-work:${Versions.hiltExt}"
    const val hiltLifeCycle = "androidx.hilt:hilt-lifecycle-viewmodel:${Versions.hiltExt}"
    const val hiltTesting = "com.google.dagger:hilt-android-testing:${Versions.hilt}"

    const val workRuntime = "androidx.work:work-runtime-ktx:2.2.0"

}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitAndroid = "androidx.test.ext:junit:1.1.2-rc03"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0-rc03"
}
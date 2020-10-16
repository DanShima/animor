plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(AndroidVersion.compileSdk)

    defaultConfig {
        applicationId = "com.danshima.animor"
        minSdkVersion(AndroidVersion.minSdk)
        targetSdkVersion(AndroidVersion.targetSdk)
        versionCode = AndroidVersion.versionCode
        versionName = AndroidVersion.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Libs.kotlin)
    implementation(Libs.appcompat)
    implementation(Libs.core)
    implementation(Libs.material)
    implementation(Libs.constraintLayout)
    implementation(Libs.cardView)
    implementation(Libs.viewPager)
    implementation(Libs.recyclerView)
    implementation(Libs.navigation)
    implementation(Libs.navigationUi)
    implementation(Libs.navigationFrag)

    implementation(Libs.lifeCycleExt)
    implementation(Libs.liveDataKtx)
    implementation(Libs.lifeCycleViewModel)

    implementation(Libs.navigationUiKtx)
    implementation(Libs.playCore)
    implementation(Libs.playCoreKtx)
    implementation(Libs.coroutine)
    implementation(Libs.coroutineAndroid)

    implementation(Libs.dagger)
    annotationProcessor(Libs.daggerCompiler)
    implementation(Libs.hilt)
    annotationProcessor(Libs.hiltAndroidCompiler)
    annotationProcessor(Libs.hiltCompiler)
    implementation(Libs.hiltLifeCycle)

    implementation(Libs.roomDb)
    implementation(Libs.gson)
    implementation(Libs.retrofit)
    implementation(Libs.retrofitConverter)
    implementation(Libs.logging)
    implementation(Libs.workRuntime)


    androidTestImplementation(TestLibs.junitAndroid)
    androidTestImplementation(TestLibs.espresso)
    testImplementation(TestLibs.junit)
}

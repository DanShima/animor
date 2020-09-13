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
}

object Libs {
    const val kotlin = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"
    const val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    const val core = "androidx.core:core-ktx:1.5.0-alpha01"
    const val material = "com.google.android.material:material:1.3.0-alpha02"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.0.0-rc1"
    const val navigation = "androidx.navigation:navigation-fragment:${Versions.nav}"
    const val navigationUi = "androidx.navigation:navigation-ui:${Versions.nav}"
    const val navigationUiKtx = "androidx.navigation:navigation-ui-ktx:${Versions.nav}"
    const val navigationFrag = "androidx.navigation:navigation-fragment-ktx:${Versions.nav}"
    const val lifeCycleExt = "androidx.lifecycle:lifecycle-extensions:2.2.0"
    const val playCore = "com.google.android.play:core:1.8.0"
    const val playCoreKtx = "com.google.android.play:core-ktx:1.8.1"
}

object TestLibs {
    const val junit = "junit:junit:${Versions.junit}"
    const val junitAndroid = "androidx.test.ext:junit:1.1.2-rc03"
    const val espresso = "androidx.test.espresso:espresso-core:3.3.0-rc03"
}
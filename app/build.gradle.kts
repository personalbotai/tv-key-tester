plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android") version "1.8.20"
}

android {
    namespace = "com.personalbotai.keytester"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.personalbotai.keytester"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.8.20")
}

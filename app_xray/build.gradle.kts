plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

setupAll()

android {
    defaultConfig {
        applicationId = "moe.matsuri.plugin.xray"
        versionCode = 21
        versionName = "v1.8.13"
    }
}

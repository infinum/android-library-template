plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

apply {
    from("$rootDir/config.gradle.kts")
}

val buildConfig: Map<String, Any> by project
val releaseConfig: Map<String, Any> by project
val sonatype: Map<String, Any> by project

android {
    namespace = "com.infinum.libname"
    compileSdk = buildConfig["compileSdk"] as Int

    defaultConfig {
        applicationId = "com.infinum.libname.sample"
        minSdk = buildConfig["minSdk"] as Int
        targetSdk = buildConfig["targetSdk"] as Int
        versionCode = releaseConfig["versionCode"] as Int
        versionName = releaseConfig["version"] as String
     }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    // TODO - replace with your module names accordingly
    // Comment this out for testing local deploy
    implementation(project(":libModule1"))
    implementation(project(":libModule2"))

    // TODO - replace with your module packages accordingly
    // Uncomment this for testing local deploy
    //    implementation(packages.android-libname.libModule1)
    //    implementation(packages.android-libname.libModule2)

    implementation("com.android.support:appcompat-v7:28.0.0")
    implementation("com.android.support.constraint:constraint-layout:2.0.4")
}

plugins {
    alias(libs.plugins.detekt.plugin)
}

buildscript {
    apply(from = "maven.gradle")

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath(libs.tools.gradle)
        classpath(libs.kotlin.plugin)
        classpath(libs.dokka.plugin)
        classpath(libs.gradleMavenPublishPlugin)
    }
}

allprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}

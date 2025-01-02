plugins {
    alias(libs.plugins.detekt.plugin)
    alias(libs.plugins.kotlin.binary.compatibility.validator)
}

apiValidation {
    ignoredProjects.addAll(listOf("sample"))
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
    }
}

allprojects {
    repositories {
        google()
        mavenLocal()
        mavenCentral()
    }
}

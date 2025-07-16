plugins {
    id("java-library")
    id("kotlin")
    alias(libs.plugins.gradle.maven.publish)
}

apply {
    from("$rootDir/config.gradle.kts")
    from("$rootDir/dokka.gradle")
    from("$rootDir/detekt.gradle")
}

val groupId: String by project

mavenPublishing {
    coordinates(
        groupId = groupId,
        artifactId = "libModule1", // each module should have unique artifact id
        version = libs.versions.library.get()
    )
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}


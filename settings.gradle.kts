plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version("0.8.0")
}

include(":libModule1")
include(":libModule2")
include(":sample")

// TODO - add project name
rootProject.name = "Android Library Template"

extra["major"] = 0
extra["minor"] = 0
extra["patch"] = 1

extra["buildConfig"] = mapOf(
    "minSdk" to 28,
    "compileSdk" to 33,
    "targetSdk" to 33
)

extra["releaseConfig"] = mapOf(
    // TODO - com.infinum.<YOUR-AWESOME-LIBRARY-NAME>
    "group" to "com.infinum.libname",
    "version" to "${extra["major"]}.${extra["minor"]}.${extra["patch"]}",
    "versionCode" to (extra["major"] as Int * 100 * 100 + extra["minor"] as Int * 100 + extra["patch"] as Int)
)

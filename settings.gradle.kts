rootProject.name = "gmm"

include(":Utils:ArgParser")
include(":Packager")

gradle.allprojects {
    repositories {
        mavenCentral()
    }
}

rootProject.name = "gmm"

include(":utils:argparser")
include(":packager")

gradle.allprojects {
    repositories {
        mavenCentral()
    }
}

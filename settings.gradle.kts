rootProject.name = "gmm"

include(":utils:argparser")
include(":utils:networking")
include(":packager")

gradle.allprojects {
    repositories {
        mavenLocal {
            name = "GenoLocal"
            url = uri("/srv/http/geno1024/m2repo")
        }
        mavenLocal {
            isAllowInsecureProtocol = true
            name = "GenoServer"
            url = uri("http://geno1024-manjaro/m2repo")
        }
        mavenCentral()
    }
}

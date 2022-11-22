plugins {
    kotlin("multiplatform") version "1.7.21"
    `java-library`
    `maven-publish`
}

group = "com.geno1024.utils"
version = "0.1"

kotlin {
    linuxX64 {
        binaries {
            staticLib("gmm-argparser") {
            }
        }
    }
}

java {
    withSourcesJar()
}

publishing {
    repositories {
        mavenLocal {
            name = "GenoLocal"
            url = uri("/srv/http/geno1024/m2repo")
        }
    }
}

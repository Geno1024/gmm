plugins {
    kotlin("multiplatform") version "1.7.21"
    `maven-publish`
}

kotlin {
    linuxX64 {
        binaries {
            staticLib("gmm-argparser") {
            }
        }
    }
}

publishing {
}

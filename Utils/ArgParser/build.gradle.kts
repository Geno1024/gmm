plugins {
    kotlin("multiplatform") version "1.7.21"
}

kotlin {
    linuxX64 {
        binaries {
            staticLib("gmm-argparser") {
            }
        }
    }
}

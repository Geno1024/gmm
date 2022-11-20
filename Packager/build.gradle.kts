plugins {
    kotlin("multiplatform") version "1.7.21"
}

repositories {
    mavenCentral()
}

kotlin {
    linuxX64 {
        binaries {
            executable("gmm-packager") {
                entryPoint = "com.geno1024.gmm.packager.Packager"
            }
        }
    }
}

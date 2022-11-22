plugins {
    kotlin("multiplatform") version "1.7.21"
}

kotlin {
    sourceSets {
        getByName("commonMain") {
            dependencies {
                implementation("com.geno1024.utils:argparser:0.1")
            }
        }
    }
    linuxX64 {
        binaries {
            executable("gmm-packager") {
                entryPoint = "com.geno1024.gmm.packager.Packager"
            }
        }
    }
}

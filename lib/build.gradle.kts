plugins {
    kotlin("multiplatform")
    `maven-publish`
}

group = "me.mark"
version = "1.0.0"

repositories {
    mavenCentral()
}

kotlin {
    jvm {
        withJava()
    }
    js {
        browser()
        nodejs()
    }
    mingwX64("windows")
    linuxX64("linux")

    sourceSets {
        val commonMain by getting
    }
}
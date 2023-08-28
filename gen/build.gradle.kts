plugins {
    kotlin("jvm")
    application
}

group = "me.mark"

repositories {
    mavenCentral()
}

application {
    mainClass.set("me.mark.gen.partikt.MainKt")
}
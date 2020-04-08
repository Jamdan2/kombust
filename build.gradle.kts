group = "org.example"
version = "1.0-SNAPSHOT"

group = "org.example"
version = "1.0-SNAPSHOT"

 plugins {
    kotlin("multiplatform")  version "1.4-M1" apply false
    kotlin("js") version "1.4-M1" apply false
}

allprojects {
    repositories {
        jcenter()
        mavenCentral()

        // Remove when kotlin 1.4 is stable
        maven("https://dl.bintray.com/kotlin/kotlin-eap/")
    }
}

rootProject.name = "kombust"
include("kombust-js")

pluginManagement {
    repositories {
        jcenter()
        mavenCentral()

        // Remove when kotlin 1.4 is stable
        maven("https://dl.bintray.com/kotlin/kotlin-eap/")
    }
}
include("kombust-js-example")

plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.5")
}

kotlin.target {
    produceKotlinLibrary()
    browser()
}

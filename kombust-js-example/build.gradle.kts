plugins {
    kotlin("js")
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(project(":kombust-js"))
}

kotlin.target {
    produceExecutable()
    browser {
        runTask {
            devServer = org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig.DevServer(
                    inline = true,
                    lazy = false,
                    noInfo = true,
                    open = true,
                    overlay = false,
                    port = 3333,
                    proxy = null,
                    contentBase = listOf("$projectDir/src/main/resources")
            )
        }
    }
}

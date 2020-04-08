package com.example

import kombust.dom.div
import kombust.dom.p
import kombust.render
import kotlin.browser.document

fun main() = render(document.body!!) {
    div {
        p {
            +"Hello, world!"
        }
    }
}

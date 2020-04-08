package kombust.dom

import kombust.Ktx

fun Ktx.div(build: Div.() -> Unit) = +Div().apply(build)
fun Ktx.span(build: Span.() -> Unit) = +Span().apply(build)

fun Ktx.p(build: P.() -> Unit) = +P().apply(build)

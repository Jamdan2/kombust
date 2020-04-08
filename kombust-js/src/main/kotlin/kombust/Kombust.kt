package kombust

fun render(root: W3CElement, builder: Ktx.() -> Unit) {
    root.appendChild(Ktx().apply(builder).actuate())
}

package kombust

import kotlin.browser.document

open class Ktx : Node {
    internal val children = mutableListOf<Node>()

    fun add(child: Node) {
        children += child
    }

    operator fun Node.unaryPlus() {
        add(this)
    }

    operator fun String.unaryPlus() {
        add(Text(this))
    }

    override fun actuate(): W3CNode {
        val node = document.createDocumentFragment()
        children.forEach {
            node.appendChild(it.actuate())
        }
        return node
    }
}

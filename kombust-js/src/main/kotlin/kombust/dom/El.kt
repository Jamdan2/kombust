package kombust.dom

import kombust.Ktx
import kombust.W3CNode
import kotlin.browser.document

abstract class El(val name: String) : Ktx() {
    override fun actuate(): W3CNode {
        val node = document.createElement(name)
        children.forEach {
            node.appendChild(it.actuate())
        }
        return node
    }
}

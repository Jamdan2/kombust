package kombust

import kotlin.browser.document

data class Text(val content: String) : Node {
    override fun actuate() = document.createTextNode(content)
}

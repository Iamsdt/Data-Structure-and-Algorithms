package tree

fun main(args: Array<String>) {
    val bt = BT()

    bt.add(10)
    bt.add(20)
    bt.add(6)
    bt.add(25)
    bt.add(30)
    bt.add(7)
    bt.add(4)

    //now search
    bt.search(4)
    bt.search(3)
}

class BT {

    private var root: Node? = null

    fun add(value: Int) {
        if (root == null) {
            root = createNode(value)
        }

        added(root, createNode(value))
    }

    private fun added(start: Node?, newNode: Node) {

        if (newNode.value > start?.value ?: 0) {

            //this is the place to add
            if (start?.right == null) {
                start?.right = newNode
                return
            }

            added(start.right, newNode)
        } else if (newNode.value < start?.value ?: 0) {

            //this is the place to add
            if (start?.left == null) {
                start?.left = newNode
                return
            }

            added(start.left, newNode)
        }
    }

    private fun createNode(value: Int) = Node(value, null, null)

    fun search(value: Int) {

        if (root == null) {
            throw RuntimeException("Searching on empty tree")
        }

        search(value, root)
    }

    private fun search(value: Int, start: Node?) {

        if (start == null) {
            println("Search value: $value is not in the tree")
            return
        }

        if (start.value == value) {
            println("Searched found: $value")
            return
        }

        if (value > start.value) {
            search(value, start.right)
        }

        if (value < start.value) {
            search(value, start.left)
        }
    }

    inner class Node(
            var value: Int,
            var left: Node?,
            var right: Node?)

}

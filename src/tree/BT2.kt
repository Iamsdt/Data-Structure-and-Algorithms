package tree


fun main(arg: Array<String>) {

    val tree = BinaryTree()

    tree.add(tree.root, tree.nodeCreate(5))
    tree.add(tree.root, tree.nodeCreate(10))
    tree.add(tree.root, tree.nodeCreate(12))
    tree.add(tree.root, tree.nodeCreate(11))
    tree.add(tree.root, tree.nodeCreate(7))
    tree.add(tree.root, tree.nodeCreate(8))


    tree.search(10, tree.root)
}

private class BinaryTree {

    var root: Node? = null

    fun nodeCreate(value: Int): Node {
        return Node(value, null, null)
    }

    fun add(start: Node?, newNode: Node) {
        if (root == null) {
            root = newNode
            return
        }

        if (newNode.value > start!!.value) {
            if (start.right == null) {
                start.right = newNode
                return
            }

            add(start.right, newNode)
        }

        if (newNode.value < start.value) {
            if (start.left == null) {
                start.left = newNode
                return
            }

            add(start.left, newNode)
        }

    }

    fun search(value: Int, start: Node?) {

        if (start == null) {
            println("Node not find")
            return
        }

        if (start.value == value) {
            println("Search Found $value")
            return
        }

        if (value > start.value) {
            search(value, start.right)
        }

        if (value > start.value) {
            search(value, start.left)
        }

    }
}

private class Node(var value: Int, var left: Node?, var right: Node?)

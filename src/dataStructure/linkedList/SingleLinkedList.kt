package dataStructure.linkedList

fun main(args: Array<String>) {
    val list = SingleLinkedList<Int>()

    list.addFirst(1)
    list.addFirst(2)
    list.addFirst(3)
    list.addFirst(4)
    list.addFirst(5)
    list.addLast(6)
    list.addAfter(3,10)

    list.displayAllNode()
}

class SingleLinkedList<T> {
    private var head: Node<T>? = null
    private var size = 0

    fun displayAllNode() {
        if (head == null) {
            println("Linked List is empty")
        }

        var temp = head
        while (temp != null) {
            println("Value: ${temp.value}")
            temp = temp.next
        }
    }

    fun addFirst(value: T) {
        head = if (head == null) Node(value, null)
        else Node(value, head)
        size++
    }

    fun addLast(value: T) {
        if (head == null) {
            head = Node(value, null)
        } else {
            //don't change the head node
            var temp = head
            //go to last node
            while (temp?.next != null) {
                temp = temp.next
            }

            //now at the last node add new node
            temp?.next = Node(value, null)
            size++
        }
    }

    fun search(value: T): Node<T>? {
        if (head == null) {
            throw IllegalAccessException("Linked list is empty")
        }

        var search: Node<T>? = null

        var temp = head
        while (temp?.next != null) {
            if (temp.value == value) {
                search = temp
                break
            }
            temp = temp.next
        }
        return search
    }

    fun delete(value: T) {
        if (head == null) {
            throw IllegalAccessException("List is empty")
        }

        var isFound = false
        //two case for deleting node
        //if the node is on the first node
        // just change the head
        if (head?.value == value) {
            isFound = true
            head = head?.next
        } else {
            //if node is on the middle
            //10 *11* 12
            //I want to remove node 11
            //so change the 10 next to 12
            //if node on the last
            // remove 12 then make 11 next node is null
            var temp = head

            while (temp?.next != null) {
                if (temp.next.value == value) {
                    isFound = true
                    val deleteNode = temp.next
                    //skip this node
                    temp.next = deleteNode.next
                }
                temp = temp.next
            }

        }

        if (!isFound) {
            println("$value no found in the list")
        }

    }

    fun addAfter(old: T, value: T) {
        val node = search(old)
        node?.let {
            if (it.next == null) {
                it.next = Node(value, null)
            } else {
                it.next = Node(value, it.next)
            }
        }
    }
}

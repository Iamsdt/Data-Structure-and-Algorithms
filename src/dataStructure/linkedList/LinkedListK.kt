package dataStructure.linkedList

fun main(args: Array<String>) {
    val linkedList = MyLinkedListK()

    linkedList.add("Shudipto")
    linkedList.add(1)
    linkedList.add(3)
    linkedList.add(6)

    println("Size: ${linkedList.size}")

    for (item in linkedList.getList()){
        println(item)
    }
}

class MyLinkedListK {

    private var head:Node ?= null
    var size:Int = 0

    fun add(value: Any){

        val newNode:Node ?= Node(value,null)

        if (head != null) {
            newNode?.next = head
            head = newNode
        } else
            head = newNode

        size++
    }

    fun getList():List<Any>{
        var newNode = head
        val list = arrayListOf<Any>()
        while (newNode != null){
            list.add(newNode.value)
            newNode = newNode.next
        }
        return list
    }


    private inner class Node(val value: Any, var next: Node?)
}
package dataStructure.linkedList

fun main(args: Array<String>) {

    val linkedList = MyLinkedListK()

    linkedList.add("Shudipto")
    linkedList.add(1)
    linkedList.add(3)
    linkedList.add(6)
    linkedList.add(7)
    linkedList.add(8)
    linkedList.add(8)
    linkedList.add(10)
    linkedList.add("Trafder")

    println("Size: ${linkedList.size}")

    for (item in linkedList.getList()){
        println(item)
    }

//    println("\n\nAfter delete")
//    linkedList.delete("Trafder")
//    for (item in linkedList.getList()){
//        println(item)
//    }
//
//    println("\n\nAfter delete")
//    linkedList.delete(7)
//    for (item in linkedList.getList()){
//        println(item)
//    }

    println("\nDelete Last Node")
    linkedList.delete("Shudipto")
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

    fun delete(value: Any){
        //for delete
        //if we want to delete the first entity of the value
        // check what is the first value. It's contain the
        // position of second value and value
        //so if we want to delete the second value the first move the of head.
        // for example if the head point as A the go to the next value with the help of(a already
        //contain the position of B
        //now point the head on B
        // that's the idea for one case

        var currentNode = head

        if (currentNode?.value == value){
            head = currentNode.next
            return
        }

        //the second case
        //we have to find the the current code
        //if the node value is same as my given value
        //then we find our current node
        while (currentNode != null){
            if (currentNode.value == value){
                break
            }
            currentNode = currentNode.next
        }

        //so now
        //currentNode is the previous node that to delete
        //delete node is to delete

        //check that value is find or not
        if (currentNode != null){
            head
            currentNode.next = currentNode.next?.next
        }
    }


    private inner class Node(val value: Any, var next: Node?)
    //node consist of both two value and address of next node
    

    //use of
    //use in graph algorithm
    // use to implement on hastable
    //operating system
}
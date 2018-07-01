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

    //now delete
}
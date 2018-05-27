package dataStructure.queue

fun main(args: Array<String>) {

    val queue = CircularQueueK(5)

    var s = 0

    while (!queue.isFull()){
        queue.enqueue(s)
        s++
    }

    for ((i,v) in queue.iterator()) {
        println("Index:$i and value:$v")
    }

    println("\nGet value1:${queue.dequeue()}")
    println("Get value2:${queue.dequeue()}")
    println("Get value3:${queue.dequeue()}")

    println("\nNow Input new value")

    var d = 10
    while (!queue.isFull()){
        queue.enqueue(d)
        d++
    }

    for ((i,v) in queue.iterator()) {
        println("Index:$i and value:$v")
    }
}

class CircularQueueK(size: Int){

    private val list:Array<Any> = Array(size,{ i: Int -> i })
    private var head = 0
    private var tail = 0

    fun enqueue(value: Any){
        if (isFull()){
            return
        }

        list[tail] = value
        tail = (tail+1) % list.size
    }

    fun dequeue():Any{

        var a:Any = ""

        if (!isEmpty()){
            a = list[head]
            head = (head +1) % list.size
        }

        return a
    }

    fun isFull() = (tail + 1) % list.size == head

    fun isEmpty() = head == tail

    fun iterator() = list.withIndex()

}


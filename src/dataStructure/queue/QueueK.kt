package dataStructure.queue


var ints = IntArray(10)
var head = 0
var tail = 0

val isEmpty: Boolean
    get() = head == tail

fun main(arg: Array<String>) {

    //in queue
    //track head/front and Tail/rear
    //to put data -> enqueue
    //to get data -> dequeue

    //here i implement basic queue
    // but it's waste memory

    for (i in 0..9) {
        enqueue(i)
    }

    //now access
    while (!isEmpty) {
        println("value: " + dequeue())
    }

}

fun enqueue(n: Int) {
    ints[tail] = n
    tail += 1
    println("Input:" + n)
}

fun dequeue(): Int {
    val n = ints[head]
    head += 1
    return n
}


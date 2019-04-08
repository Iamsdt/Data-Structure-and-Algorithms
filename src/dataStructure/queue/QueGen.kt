package dataStructure.queue

fun main(args: Array<String>) {

    val queGen = QueGen(10)

    queGen.enqueue(10)
    println(queGen.dequeue())

}

class QueGen(size: Int) {

    private var tail = 0
    private var head = 0

    val array: Array<Any> = Array(size) { i: Int -> i}

    fun enqueue(data: Any) {
        array[tail] = data
        tail++
    }

    fun dequeue(): Any {
        val data = array[head]
        head++
        return data
    }
}
package dataStructure.stack

fun main(args: Array<String>) {

    val stack = Stack<Int>()

    for (i in 0 until 10){
        stack.push(i)
    }

    println("Stack length:${stack.length}")

    while (stack.length > 0){
        println("Stack: value:${stack.pop()} length:${stack.length}")
    }

    //get data on empty stack
    //println("Stack ${stack.pop()}")
}

class Stack<T> {
    private var top = -1
    private val array:MutableList<T> = mutableListOf()

    fun push(value: T) {
        top += 1
        array.add(top,value)
    }

    fun pop(): T {

        if (top == -1) {
            throw Exception("Stack is empty")
        }

        val value = array[top]
        top -= 1
        return value
    }

    val length:Int get() {
        return if (top == -1) 0
        else top + 1
    }

}
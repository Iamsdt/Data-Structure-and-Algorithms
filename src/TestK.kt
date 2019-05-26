import java.util.*

fun main(args: Array<String>) {
    val array = arrayOf(10, 5, 8, 9, 1)
    println("Before sorting\n${Arrays.toString(array)}")
    selectionSort(array = array)
    println("After sorting\n${Arrays.toString(array)}")
}

fun selectionSort(array: Array<Int>) {
    for (i in 0 until array.size) {
        var index = i

        for (j in i + 1 until array.size) {
            if (array[j] < array[i]) {
                index = j
            }
        }

        if (index != i) {
            val temp = array[index]
            array[index] = array[i]
            array[i] = temp
        }
    }
}
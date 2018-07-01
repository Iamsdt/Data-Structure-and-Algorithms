package sortingAlgorithm

import java.util.*


/*
How it works
Lets see with an example
we have to short
10, 5, 2, 7, 8, 9

first it take 10 then compare with next element
5 is less than 10 => yes
2 is less than 10 => yes
2 is less than 7 => no
....................
2 is less than 9 => no

so 2 is the lowest number. now swap the position with 10 and 2

now array is
2, 5, 10, 7, 8, 9

now take 5 and compare with next element,
10 is less than 5 => no
.......................
7 is less than 5 => no

so, 5 is lowest number, no need to change the position.
now array is
2, 5, 10, 7, 8, 9

and repeat same things until last
and finally array is
2, 5, 7, 8, 9, 20

Big 0 => n2

 */

private fun selectionSort(array: Array<Int>) {
    for (i in 0 until array.size - 1) {
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

fun main(args: Array<String>) {
    val array = arrayOf(10,5,8,9,1)
    println("Before sorting\n${Arrays.toString(array)}")
    selectionSort(array = array);
    println("After sorting\n${Arrays.toString(array)}")
}
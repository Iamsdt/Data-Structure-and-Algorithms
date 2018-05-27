package searchingAlgorithms

fun main(args: Array<String>) {

    val data = DataK(100000)

    val search = 99999;
    var numberOfTry = 0

    var result = - 1


    for (i in 0 until (data.array.size - 1)) {
        val number = data.array[i]
        if (number == search) {
            result = number as Int
            break
        }

        numberOfTry++
    }

    if (result != -1)
        println("Data found on: $numberOfTry")
    else
        println("Data not found try: $numberOfTry")
}
package searchingAlgorithms


//the main condition is list must be sorted
fun main(args: Array<String>) {
    val data = DataK(100000)

    var left = 0
    var right = data.array.size - 1
    var medium: Int

    val search = 99999
    var numberOfTry = 0

    var result = -1

    while (left <= right) {

        medium = (left + right) / 2

        val number = data.array[medium]

        if (number == search) {
            result = search
        }

        if (medium > result) {
            right = medium - 1
        } else {
            left = medium + 1
        }

        numberOfTry++
    }

    if (result != -1)
        println("Data found on: $numberOfTry")
    else
        println("Data not found try: $numberOfTry")


    //in kotlin we can use by default binary search
    val s = data.array.binarySearch(element = search)
    println("S:$s")

    //method
    val (v,r) = search(data.array,search)

    println("$v : $r")
}

fun search(args: Array<Int>, search: Int): Pair<Int,Int> {

    var left = 0
    var right = args.size - 1
    var mid: Int

    var numberOfTry = 0

    while (left <= right) {
        numberOfTry ++

        mid = (left + right) / 2

        val i = args[mid]

        if (i == search) {
            return Pair(i,numberOfTry)
        }

        if (mid < i) {
            left = mid + 1
        } else{
            right = mid - 1
        }
    }

    return Pair(-1,numberOfTry)
}
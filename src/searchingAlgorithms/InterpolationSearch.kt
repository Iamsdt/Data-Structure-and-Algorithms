package searchingAlgorithms


//for example
//we have a phone book app
//we want to find a number of bangladesh
//so why we search for other country number
//if we use linear search or binary search
//same thing for dictionary

/*
The formula is
mid = low+(high-low/a[high] - a[low]) * (x - a[low])
here, a = array and x = number we are looking for
 */

/*
For example
array = {0 to 10000000}
we are looking for 9999999
so, mid = 0 + (9999999 - 0 / 10000000 - 0) * ( 9999999 - 0)
        = 9999998

A small example, array = 0 to 10
looking for 5

mid = 0 + ( 9 - 0 / 10 - 0) * ( 5 - 0)
    = 4.5
    = 4

    so, it take date from index 4.5
 */

//big o is n

fun main(args: Array<String>) {
    val data = DataK(10)
    val search = 3

    var low = 0
    var mid: Int
    var high = data.array.size - 1

    var isFound = false

    while (!isFound){
        if (low > high){
            println("Number is not found")
            break
        }

        val arrayLow:Int = data.array[low]
        val arrayHigh:Int = data.array[high]
        mid = low + ((high-low) / (arrayHigh - arrayLow)) * (search -arrayLow)

        data.numberOfTry++

        if (data.array[mid] == search){
            println("Found on ${data.numberOfTry}")
            isFound = true
        }

        //adjust the low and high

        if (arrayHigh > search){
            high = mid -1
        } else{
            low = mid + 1
        }
    }
}


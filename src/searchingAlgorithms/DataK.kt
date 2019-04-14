package searchingAlgorithms

class DataK(size:Int){

    val array: Array<Int> = Array(size) { i -> i}
    var numberOfTry = 0

    init {
        for (i in 1 until size){
            array[i-1] = i
        }
    }

}
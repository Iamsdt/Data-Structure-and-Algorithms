package searchingAlgorithms

class DataK(size:Int){

    val array: Array<Any> = Array(size,init = {})

    init {
        for (i in 1 until size){
            array[i-1] = i
        }
    }

}
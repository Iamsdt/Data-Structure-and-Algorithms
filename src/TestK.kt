fun main(args: Array<String>) {
    val list = listOf<String>("Shudipto","Trafder","Himu")


    val sb = StringBuilder()
    for (s in list){
        sb.append("$s,")
    }

    val string = sb.toString()
    println("List to String:$string")

    println("\n\n Do reverse")
    val newLIst = arrayListOf<String>()

    if (string.contains(",")){
        val strings = string.split(",")
        for (li in strings){
            newLIst.add(li)
        }
    }

    println("NewList $newLIst")
}
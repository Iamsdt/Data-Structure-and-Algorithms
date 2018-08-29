import java.math.RoundingMode

//fun main(args: Array<String>) {
//    val list = listOf<String>("Shudipto","Trafder","Himu")
//
//
//    val sb = StringBuilder()
//    for (s in list){
//        sb.append("$s,")
//    }
//
//    val string = sb.toString()
//    println("List to String:$string")
//
//    println("\n\n Do reverse")
//    val newLIst = arrayListOf<String>()
//
//    if (string.contains(",")){
//        val strings = string.split(",")
//        for (li in strings){
//            newLIst.add(li)
//        }
//    }
//
//    println("NewList $newLIst")
//}

//fun main(args: Array<String>) {
//    val buget:Double = 30.45
//    val complete = 20.15
//
//    val data = (complete/buget) * 100
//
//    print(data.absoluteValue)
//}

fun main(args: Array<String>) {
    val hours = "2"
    val minutes = "45"
    val completeTime = 5.30

    val h: Double = if (hours.isEmpty()) 0.0 else hours.toDouble()
    val m: Double = if (minutes.isEmpty()) 0.0 else minutes.toDouble()
    val update = completeTime + h + (m / 100)

    val data = ""


    var r = update.toBigDecimal()
            .setScale(0, RoundingMode.FLOOR).toDouble()

    var de = update - r

    if (de > .59) {
        r += 1
        de -= .60
    }

    val time = r + de

    val add = time.toBigDecimal()
            .setScale(2, RoundingMode.UP)
            .toDouble()

    println(add)
}
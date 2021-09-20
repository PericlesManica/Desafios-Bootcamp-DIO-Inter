package Desafios

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()
    var sum : Int = 0
    var n1 : Int = 0
    var n2 : Int = 1

    for (i in 1..(n-1)) {
        if (sum == 0) {
            print("$sum "+(sum+1))
        } else print(" " + sum)
        sum = n1 + n2
        n1 = n2
        n2 = sum
    }
}
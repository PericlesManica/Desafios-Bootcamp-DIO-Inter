package Desafios

fun main(args: Array<String>) {

    val n = readLine()!!.toInt()

    for (i in 2.rangeTo(n).step(2)) println(i)
}
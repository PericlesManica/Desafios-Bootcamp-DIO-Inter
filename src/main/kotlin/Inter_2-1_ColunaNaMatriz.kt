package Desafios

fun main(args: Array<String>) {

    val C = readLine()!!.toInt()
    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12)}

    for ( i in 0 .. 11) {
        for ( j in 0 .. 11) {
            M[i][j] = readLine()!!.toDouble()
        }
    }
    for (k in 0.until(M.size)) {
        sum += M[k][C]
    }
    if (T == "M") sum /= M.size
    println(sum.format(1))
}
fun Double.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')



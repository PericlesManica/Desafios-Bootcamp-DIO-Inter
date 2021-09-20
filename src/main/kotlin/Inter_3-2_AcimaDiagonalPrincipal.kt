package Desafios

fun main(args: Array<String>) {

    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }
    var cont : Int

    for ( i in 0 .. 11 ) {
        for ( j in 0 .. 11 ) {
            M[i][j] = readLine()!!.toDouble()
        }
    }

    for ( i in 0 .. 10 ) {
        cont=i+1
        for ( j in cont .. 11 ) {
            sum+= M[i][j]
            cont++
        }
    }

    if ( T == "M" )
    {sum /= 66 }
    println(sum.format(1))
}

//private fun Double.format(digits: Int) = "%.${digits}f"
//    .format(this).replace(',','.')

/*
fun main(args: Array<String>) {

    var sum = 0.0
    val T = readLine()!!.toUpperCase()
    val M = Array(12) { DoubleArray(12) }

    for (                   ) {
        for (                        ) {
            M[i][j] = readLine()!!.toDouble()
        }
    }

    for (                      ) {
        for (                                   ) {

        }
    }

    if (               ) sum /= (               ) / 2
    println(sum.format(1))
}

private fun Double.format(digits: Int) = "%.${digits}f"
        .format(this).replace(',','.')
 */
package Desafios

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {

        val scanner = Scanner(System.`in`)
        val raio : Double = scanner.nextDouble()
        val pi = 3.14159
        val area : Double = (raio*raio)*pi
        val resultado = BigDecimal(area).setScale(4, RoundingMode.HALF_EVEN)
        println("A=${resultado}")
}



/*
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')

    val raio = readLine()?.toDouble()
    val pi = 3.14159
    val area : Double = (raio?.times(raio)?.times(pi) ?: 0) as Double
    println("A=${area.format(4)}")
    println("A=${
        String.format("%.3f km/l", area}")

}

import java.math.BigDecimal
import java.math.RoundingMode
import kotlin.math.pow

fun main(args: Array<String>) {

    val raio =
    val pi =
    val area =
    val resultado = BigDecimal(    ).setScale(0, RoundingMode.HALF_EVEN)
    println("A=     ")

}
 */
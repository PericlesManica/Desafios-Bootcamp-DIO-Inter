package Desafios
    //Recebe 2 valores, distância e litros e calcula o consumo de combustível, exibe com 3 casas decimais.

fun main(args: Array<String>) {
    val x: Float = readLine()!!.toFloat()           //Captura primeiro valor
    val y: Float = readLine()!!.toFloat()           //Captura segundo valor
    val media: Float =x/y                           //Calcula média
    println(String.format("%.3f km/l", media))      //Exibe resultado formatado
}
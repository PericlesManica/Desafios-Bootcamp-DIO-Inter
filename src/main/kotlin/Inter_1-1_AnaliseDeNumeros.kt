package Desafios
    //Inserir 5 valores inteiros positivos e negativos. Receberá resumo das caracteristicas

fun main() {

    val inteiros = mutableListOf<Int>()
    var par:Int=0                                           //Variável contadora par iniciada e zerada
    var imp:Int=0                                           //Variável contadora impar iniciada e zerada
    var pos:Int=0                                           //Variável contadora positiva iniciada e zerada
    var neg:Int=0                                           //Variável contadora negativa iniciada e zerada

    for (i in 1..5) {inteiros.add(readLine()!!.toInt()) }   //Captura valores
    for (i in inteiros) { if (  i%2 == 0  ) { par++ } }     //Verifica se são pares
    for (i in inteiros) { if (  i%2 != 0  ) { imp++ } }     //Verifica se não são pares
    for (i in inteiros) { if (  i > 0  ) { pos++ } }        //Verifica se são positivos
    for (i in inteiros) { if (  i < 0  ) { neg++ } }        //Verifica se são negativos

    println("${par} valor(es) par(es)")                     //Exibe quantos são pares
    println("${imp} valor(es) impar(es)")                   //Exibe quantos são impares
    println("${pos} valor(es) positivo(s)")                 //Exibe quantos são Positivos
    println("${neg} valor(es) negativo(s)")                 //Exibe quantos são negativos
}

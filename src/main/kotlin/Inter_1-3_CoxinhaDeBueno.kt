package Desafios
    //Recebe dois valores em uma única linha separados por espaço e dividindo o um valor pelo outro.

fun main(args: Array<String>) {
    val leitor: String? = readLine()                      //Captura uma string com os valores separados por espaço
    var x : List<String>? = leitor?.split(" ")  //Cria uma lista separando os valores da String
    val H: Double = x?.get(0)?.toDouble() ?: 10.0         //Cria a variável e insere o 1º valor da lista como double
    val P: Double = x?.get(1)?.toDouble() ?: 10.0         //Cria a variável e insere o 2º valor da lista como double
    val media: Double = H / P;                            //Calcula a média
    println(String.format("%.2f", media));                //Exibe o valor da média formatado
}
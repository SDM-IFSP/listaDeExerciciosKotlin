package br.edu.ifsp.scl.listadeexercicioskotlin

/*
Exercício 3
Dadas as funções abaixo e as chamadas na função main. Crie duas funções (foo e bar) de
alta ordem que recebam essas funções como parâmetro e soltem a seguinte saída.
fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"
fun main() {
println(foo(10, 20, ::soma))
println(bar("Ped", "ro", ::cat))
}
Saída
30
Pedro
 */

fun soma(i: Int, j: Int) = i + j
fun cat(i: String, j: String): String = "${i}${j}"

fun main(){

    val foo: (Int, Int) -> Int = ::soma

    val bar: (String, String) -> String = ::cat

    println(foo(10, 20, ))
    println(bar("Ped", "ro",))

}

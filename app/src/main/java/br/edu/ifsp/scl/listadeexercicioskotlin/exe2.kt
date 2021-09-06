package br.edu.ifsp.scl.listadeexercicioskotlin

/*
Exercício 2
Dado o código abaixo de um Map, imprima seu conteúdo conforme mostrado na saída.
val familiaMap: MutableMap<String, String> = mutableMapOf(Pair("Pai", "Pedro"),
Pair("Mãe", "Marcela"),
Pair("Filho", "João"),
Pair("Caçula", "Cadu"),
Pair("Pet", "Paçoca"))
Saída
Pai: Pedro
Mãe: Marcela
Filho: João
Caçula: Cadu
Pet: Paçoca
 */

fun main(){

    val familiaMap: MutableMap<String, String> = mutableMapOf(
        Pair("Pai", "Pedro"),
        Pair("Mãe", "Marcela"),
        Pair("Filho", "João"),
        Pair("Caçula", "Cadu"),
        Pair("Pet", "Paçoca"))

    familiaMap.keys.forEach {println("$it: ${familiaMap.get(it)}")}


}
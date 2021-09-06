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

    //lista de cursos
    val listaCursos: MutableList<String> = mutableListOf(
        "Sistemas para Dispositivos Móveis",
        "Análise e Desevolvimento de Sistemas")
    listaCursos.add("Técnico em Informática para Internet")
    listaCursos.add("Manutenção de Aeronaves")
    listaCursos.add("Técnico em Células")
    listaCursos.add("Processos Gerenciais")

    listaCursos.forEach( { println(it)})

    println("Palavra sistema: ${listaCursos.count {palavra: String ->
        palavra == "Sistema"
    }}")



}
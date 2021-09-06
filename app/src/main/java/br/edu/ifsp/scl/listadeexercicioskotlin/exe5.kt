package br.edu.ifsp.scl.listadeexercicioskotlin

/*
Exercício 5
Dadas as funções abaixo:
1. Na função main, faça chamadas normais das funções de alta ordem passando as funções
soma, multiplica e raizQuadrada como parâmetro de acordo com a equivalência dos
parâmetros.
2. Na função main, faça chamadas das funções de alta ordem passando expressões
lambdas equivalentes as funções soma, multiplica e raizQuadrada.
// Funções de alta ordem
fun processaInteiro(i: Int, f: (Int) -> Int): Int{
return f(i)
}
fun processaInteiros(i: Int, j: Int, f: (Int, Int) -> Int): Int{
return f(i, j)
}
// Funções
fun soma(i: Int, j: Int): Int{
return i + j
}
fun multiplica(i: Int, j: Int): Int{
return i * j
}
fun raizQuadrada(numero: Int): Int {
for (n in 1..numero) {
if (n * n == numero)
return n
}
return -1
}
// Main
fun main() {
// 1. Chamadas do primeiro passo
// 2. Chamadas do segundo passo
}
 */
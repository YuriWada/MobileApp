package br.com.alura.ugames.principal

import br.com.alura.ugames.servicos.ConsumoAPI

fun main() {
    val consumo = ConsumoAPI()
    val listaGamers = consumo.buscaGamers()

    println(listaGamers)
}
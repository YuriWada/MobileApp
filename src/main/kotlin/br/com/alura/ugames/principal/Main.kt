package br.com.alura.ugames.principal

import br.com.alura.ugames.modelo.Jogo
import br.com.alura.ugames.servicos.ConsumoAPI
import java.util.*

fun main() {

    val leitura = Scanner(System.`in`)
    println("Digite um código de jogo para buscar:")
    val busca = leitura.nextLine()

    val buscaApi = ConsumoAPI()
    val informacaoJogo = buscaApi.buscaJogo(busca)

    var meuJogo: Jogo? = null

    val resultado = runCatching {
        meuJogo = Jogo(
            informacaoJogo.info.title,
            informacaoJogo.info.thumb
        )
    }

    resultado.onFailure {
        println("br.com.alura.ugames.modelo.Jogo inexistente. Tente outro ID!")
    }

    resultado.onSuccess {
        println("Deseja inserir uma descrição personalizada? S/N")
        val opcao = leitura.nextLine()
        if (opcao.equals("S", true)) {
            println("Insira a descricao personalizada para o jogo: ")
            val descricaoPersonalizada = leitura.nextLine()
            meuJogo?.descricao = descricaoPersonalizada
        } else {
            meuJogo?.descricao = meuJogo?.titulo
        }

        println(meuJogo)
    }
}
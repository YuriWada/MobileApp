package br.com.alura.ugames.modelo

data class Jogo(val titulo: String,
                val capa: String) {
    var descricao: String? = null

    override fun toString(): String {
        return "Meu jogo: \n" +
                "Título: $titulo \n" +
                "Capa: $capa \n" +
                "Descrição: $descricao"
    }
}
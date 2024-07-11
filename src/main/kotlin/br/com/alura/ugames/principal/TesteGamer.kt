import br.com.alura.ugames.modelo.Gamer

fun main() {
    val gamer1 = Gamer(
        "Yuri",
        "yuri.wadah@gmail.com",
        "11/11/1999",
        "yuri01"
    )
    println(gamer1)
    gamer1.usuario = "yuriw"
    println(gamer1)

    val gamer2 = Gamer(
        "Renato",
        "renato@example.com",
        "13/06/1997",
        "renato01"
    )

    println(gamer2)
}
package personagem

import model.Atributos
import model.TiposDistribuicao
import  model.Raca
import model.Classes


class Personagem(
    val nome: String,
    var atributos : Atributos,
    val raca: Raca,
    val classe: Classes
) {
    val atributosComBonus = raca.aplicarBonus(atributos)

    fun mostrarFicha() {
        println("===== FICHA DO PERSONAGEM =====")
        println("Nome: $nome")
        println("Raça: ${raca.javaClass.simpleName}")
        println("Classe: ${classe.nome}")
        println("Movimento: ${raca.movimento}")
        println("Infravisão: ${raca.infravisao}")
        println("Alinhamento: ${raca.alinhamento}")
        println("Atributos: $atributosComBonus")
        println("Habilidades: ${classe.habilidades()}")
        println("Vida base: ${classe.vidabase}")
        println("===============================")
    }
}

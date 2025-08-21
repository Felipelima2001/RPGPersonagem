// Main.kt
import personagem.Personagem
import model.TiposDistribuicao
import model.classes.*
import model.racas.*
import utils.DistribuicaoAtributos

fun main() {
    val atributos = DistribuicaoAtributos.distribuir(TiposDistribuicao.Classica)
    val personagem = Personagem("Aragorn", atributos, Humano(), Guerreiro())
    personagem.mostrarFicha()

    val personagem2 = Personagem("Gandalf", DistribuicaoAtributos.distribuir(TiposDistribuicao.Herioca), Elfo(), Mago())
    personagem2.mostrarFicha()

    val personagem3 = Personagem("Bilbo", DistribuicaoAtributos.distribuir(TiposDistribuicao.Aventureira), Anao(), Ladino())
    personagem3.mostrarFicha()
}

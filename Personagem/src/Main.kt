
import personagem.Personagem
import model.TiposDistribuicao
import model.classes.Ladino
import model.classes.Mago
import model.classes.Guerreiro
import model.racas.Anao
import model.racas.Elfo
import model.racas.Humano
import utils.DistribuicaoAtributos

fun main() {
        println("=== CRIAÇÃO DE PERSONAGEM ===")


        print("Digite o nome do personagem: ")
        val nome = readln()


        println("Escolha a distribuição de atributos:")
        println("1 - Clássica")
        println("2 - Heróica")
        println("3 - Aventureiro")
        val escolhaDist = readln().toInt()
        val tipoDistribuicao = when (escolhaDist) {
            1 -> TiposDistribuicao.Classica
            2 -> TiposDistribuicao.Herioca
            else -> TiposDistribuicao.Aventureira
        }
        val atributos = DistribuicaoAtributos.distribuir(tipoDistribuicao)


        println("Escolha a raça:")
        println("1 - Humano")
        println("2 - Elfo")
        println("3 - Anão")
        val escolhaRaca = readln().toInt()
        val raca = when (escolhaRaca) {
            1 -> Humano()
            2 -> Elfo()
            else -> Anao()
        }

        println("Escolha a classe:")
        println("1 - Guerreiro")
        println("2 - Mago")
        println("3 - Ladino")
        val escolhaClasse = readln().toInt()
        val classe = when (escolhaClasse) {
            1 -> Guerreiro()
            2 -> Mago()
            else -> Ladino()
        }

        val personagem = Personagem(nome,atributos,raca,classe)

        personagem.mostrarFicha()
    }

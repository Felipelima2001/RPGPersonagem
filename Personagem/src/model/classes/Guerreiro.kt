package model.classes

import model.Classes
import java.text.ListFormat

class Guerreiro : Classes{
    override val nome = "Guerreiro"
    override val vidabase = 100
    override fun habilidades() =
        listOf("Investida Letal","Resistência a Dano")
}
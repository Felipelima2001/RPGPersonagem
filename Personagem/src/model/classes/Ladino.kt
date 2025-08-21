package model.classes

import model.Classes

class Ladino : Classes {
    override val nome = "Ladino"
    override  val vidabase = 100
    override fun habilidades() =
        listOf("Ataque Furtivo", "Esquiva")
}
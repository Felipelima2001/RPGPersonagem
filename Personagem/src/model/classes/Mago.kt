package model.classes

import model.Classes

class Mago : Classes {
    override val nome = " Mago"
    override  val vidabase = 110
    override fun habilidades()=
        listOf("Bola de Fogo", "Escudo Espiritual")
}
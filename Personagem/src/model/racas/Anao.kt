package model.racas

import model.Atributos
import  model.Raca

class Anao : Raca {
    override val movimento= 9
    override val infravisao=60
    override val alinhamento= "SUPER LEAL"

    override fun aplicarBonus(atributos: Atributos): Atributos {

        val novosAtributos = atributos.copy(
            constituicao = atributos.constituicao + 2,
            carisma = atributos.carisma - 2
        )
        return novosAtributos
    }
}






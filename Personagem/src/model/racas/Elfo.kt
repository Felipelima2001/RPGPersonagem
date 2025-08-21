package model.racas

import model.Raca
import model.Atributos

class Elfo : Raca{


    override val alinhamento = "Neutro"
    override val infravisao = 63
    override val movimento = 11
    override fun aplicarBonus(atributos: Atributos) =
    atributos.copy(sabedoria = atributos.sabedoria + 5)

}
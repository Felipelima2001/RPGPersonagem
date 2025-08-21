package model.racas

import model.Raca
import model.Atributos

class Humano : Raca {
    override val movimento = 15
    override val infravisao =50
    override val alinhamento ="Em Constante mudança"

    override fun aplicarBonus(atributos: Atributos) =
        atributos.copy(
            forca = atributos.forca + 20,
            sabedoria = atributos.sabedoria +15
        )
    }


package model

interface Raca {
    val  movimento : Int
    val  infravisao : Int
    val  alinhamento : String
    fun aplicarBonus(atributos: Atributos): Atributos

}
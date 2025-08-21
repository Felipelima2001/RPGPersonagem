package utils

import model.Atributos
import model.TiposDistribuicao

object DistribuicaoAtributos {
    fun distribuir (tipos: TiposDistribuicao): Atributos {
        return  when(tipos){
            TiposDistribuicao.Classica -> Atributos(15, 14, 13, 12, 10, 8)
            TiposDistribuicao.Herioca -> Atributos( 18, 16, 14, 12, 10, 8)
            TiposDistribuicao.Aventureira -> Atributos(25,13,12,15,12,13)

            }
        }
    }

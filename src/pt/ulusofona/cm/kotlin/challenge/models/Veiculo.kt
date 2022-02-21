import java.util.*

class Veiculo(identificador: String) {

    val posicao : Posicao = Posicao(0, 0)
    val dataDeAquisicao : Date = Date()

    fun requerCarta() : Boolean {
        return true
    }
}
import java.util.*

class Pessoa constructor(nome: String, veiculos: List<Veiculo>, dataDeNascimento: Date, carta: Carta, posicao: Posicao) {
    fun comprarVeiculo(veiculo: Veiculo) {}
    /*
    fun pesquisarVeiculo(identificador: String) : Veiculo {
        return null
    }
    */
    fun venderVeiculo(identificador: String, comprador: Pessoa) {}
    fun moverVeiculoPara(identificador: String, x: Int, y: Int) {}
    fun temCarta() : Boolean {
        return true
    }
    fun tirarCarta() {}
}
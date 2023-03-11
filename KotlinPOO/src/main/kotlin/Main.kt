fun main() {
    println("BEM VINDO AO JBNK")

    val contaJohn = Conta(titular = "John", numero = 1001)
    contaJohn.deposita(200.0)

    println("Titular: ${contaJohn.titular}")
    println("Número: ${contaJohn.numero}")
    println("Saldo: ${contaJohn.saldo}")

    println("O Valor de $50 foi depositado na conta de ${contaJohn.titular}.")
    contaJohn.deposita(50.0)
    println("Novo saldo: ${contaJohn.saldo}")

    println("O Valor de $250 foi sacado da conta de ${contaJohn.titular}.")
    contaJohn.saca(250.0)
    println("O saldo da conta atual é: ${contaJohn.saldo}")

    println("---------------")

    val contaSouza = Conta(numero = 1002, titular = "Douglas")
    contaSouza.deposita(200.0)

    println("Titular: ${contaSouza.titular}")
    println("Número: ${contaSouza.numero}")
    println("Saldo: ${contaSouza.saldo}")

    println("O Valor de $50 foi depositado na conta de ${contaSouza.titular}.")
    contaSouza.deposita(50.0)
    println("Novo saldo: ${contaSouza.saldo}")

    println("O Valor de $40 foi sacado da conta de ${contaSouza.titular}.")
    contaSouza.saca(40.0)
    println("O saldo da conta atual é: ${contaSouza.saldo}")

    println("---------------")

    println("Transferência da conta de ${contaSouza.titular} para a conta de ${contaJohn.titular}.")

    if (contaSouza.transfere(destino = contaJohn, valor = 50.0)) {
        println("Transferência sucedida!")
    } else {
        println("Falha da transferência.")
    }

    println("---------------")

    println("Saldo da conta de ${contaJohn.titular} é ${contaJohn.saldo}")
    println("Saldo da conta de ${contaSouza.titular} é ${contaSouza.saldo}")

}

class Conta(
    var titular: String,
    val numero: Int
) {
    var saldo = 0.0
        private set

    fun deposita(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
        }
    }

    fun saca(valor: Double) {
        if (saldo >= valor) {
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean {
        if (saldo >= valor) {
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

}

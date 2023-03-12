package fundamentals

fun main() {
    //Safe Call Operator
//    var a: Int? = null
//    println(a?.dec())

    //Elvis Operator
//    val opcional: String? = null
//    val obrigatorio: String = opcional ?: "Valor Padrão"
//    println(obrigatorio)

    //NullPointerException = Forçando excessão null pointer
    var a: Int? = null
    println(a?.inc())

    println("momento do erro...")
    println(a!!.inc())


}


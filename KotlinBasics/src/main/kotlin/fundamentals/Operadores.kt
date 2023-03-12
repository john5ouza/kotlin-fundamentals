package fundamentals

import java.util.Date

//Operadores de Atribuição Binário
//fun main() {
//    var a: Int = 7
//    var b: Int = 3
//
//    b += a // b = b + a
//    b -= 4 // b = b - 4
//    b *= 2 // b = b * 2
//    b /= 2 // b = b / 2
//    b %= 2
//}

//Operador Destructuring
//data class Carro(val marca: String, val modelo: String)
//
//fun main() {
//    val (marca, modelo) = Carro("Ford", "Fusion")
//    println("${marca} ${modelo}")
//
//    val (marido, esposa) = listOf("João", "Maria")
//    println("${marido} e ${esposa}")
//}

//Operadores Aritiméticos
//fun main() {
//    val (v1, v2, v3, v4) = listOf(3 , 5 ,6 ,8)
//
//    val soma = v1 + v2 + v3 + v4
//    val subtracao = v1 - v4
//    val divisao = v1 / v4
//    val multiplicacao = v1 * v4
//    val modulo = v1 % v4
//
//    println("$soma, $subtracao, $divisao, $multiplicacao, $modulo")
//}

//Operadores Relacionais
//fun main() {
//    println("Banana" === "Banana")
//    println(3 !== 2)
//    println(3 < 2)
//    println(3 > 2)
//    println(3 <= 2)
//    println(3 >= 2)
//
//    val d1 = Date(0)
//    val d2 = Date(0)
//
//    //Igualdade Referencial
//    println("Resultado com '===' ${d1 === d2}")
//
//    //Igualdade Estrutural
//    println("Resultado com '==' ${d1 == d2}")
//}

//Simulando Ternário com IF
//fun main() {
//    val nota: Double = 8.0
//    val resultado: String = if(nota >= 7) "Aprovado" else "Reprovado"
//    println(resultado)
//}

//fun obterResultado(nota: Double): String = if (nota >= 7.0) "Passou" else "Reprovado"
//fun main() = println(obterResultado(9.5))
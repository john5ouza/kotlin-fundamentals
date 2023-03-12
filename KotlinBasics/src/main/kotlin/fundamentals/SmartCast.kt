package fundamentals

//Smart Cast
//fun souEsperto(x: Any) {
//    if (x is String) {
//        println(x.toUpperCase())
//    } else if (x is Int) {
//        println(x.plus(3))
//    }
//}
//
//fun souEsperto2(x: Any){
//    when(x){
//        is String -> println(x.toUpperCase())
//        is Int -> println(x.plus(3))
//        else -> println("Repense sua vida.")
//    }
//}

//Operator Cast
fun imprimirConceito(nota: Any) {
    when (nota as? Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5 -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
        else -> println("Nota inválida")
    }
}

fun main() {
    val notas = arrayOf(9.6, 3.8, 7.2, 5.5, 4.1)
    for (nota in notas) {
        imprimirConceito(nota.toInt())
    }
}
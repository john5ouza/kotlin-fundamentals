package POO

sealed class Mammal(val name: String)

class Dog(val dogName: String) : Mammal(dogName)
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {
        is Human -> return "hello ${mammal.name}, You're working as a ${mammal.job}"
        is Dog -> return "hello ${mammal.name}"
    }
}

fun main() {
    val dog: Mammal = Dog("Floki")
    val human: Mammal = Human("John", "Designer at Cialne")

    println(greetMammal(dog))
    println(greetMammal(human))
}
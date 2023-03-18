package POO

data class User(val nome: String, val id: Int) {
    override fun equals(other: Any?) =
        other is User && other.id == this.id
}

fun main() {
    val user = User("John", 1)
    println(user)

    val secondUser = User("John", 1)
    val thirdUser = User("Souza", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // hashCode() function
    println(user.hashCode())
    println(secondUser.hashCode())
    println(thirdUser.hashCode())

    // copy() function
    println(user.copy())
    println(user === user.copy())
    println(user.copy("MAX"))
    println(user.copy(id = 2))

    println("name = ${user.component1()}")
    println("id = ${user.component2()}")
}

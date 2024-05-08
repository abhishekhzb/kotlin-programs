//................. String ....................
fun main() {
    val text = "world"
    val prefixedText = text.addPrefix("Hello, ")
    println("Prefixed text: $prefixedText")       // Output: Prefixed text: Hello, world
}

fun String.addPrefix(prefix: String): String {
    return "$prefix$this"
}

//...............  Int .......................

fun main() {
    val number = 5
    val squaredNumber = number.square()
    println("Square of $number is $squaredNumber")    // Output: Square of 5 is 25
}

fun Int.square(): Int {
    return this * this
}




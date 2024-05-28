fun main() {
    // Define the lambda function
    val sum: (Int, Int) -> Int = { a, b -> a + b }

    // Use the lambda function
    val result = sum(3, 5)
    println("The sum of 3 and 5 is: $result")
}
//********************************************

fun main() {
    // Define the lambda function
    val concatenate: (String, String) -> String = { a, b -> a + b }

    // Use the lambda function
    val result = concatenate("Hello, ", "World!")
    println(result)
}


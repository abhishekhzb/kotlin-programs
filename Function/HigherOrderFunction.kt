//.................. String ........................

fun main() {
    val toUpperCase: (String) -> String = { str -> str.toUpperCase() }    // Define a lambda to convert a string to uppercase

    val result = manipulateString("hello, kotlin!", toUpperCase)    // Call the higher-order function with the uppercase lambda

    println("Uppercase string: $result")   // Output: Uppercase string: HELLO, KOTLIN!
}

fun manipulateString(input: String, operation: (String) -> String): String {
    return operation(input)
}

//................ Int ...........................

fun main() {
    val add: (Int, Int) -> Int = { x, y -> x + y }  // Define a lambda for addition of integers

    val result = operateOnIntegers(10, 5, add)  // Call the higher-order function with the addition lambda

    println("Result of addition: $result")  // Output: Result of addition: 15
}

fun operateOnIntegers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}


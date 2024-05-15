val inputString = "Hello, how are you?"
val vowels = inputString.filter { it.toLowerCase() in "aeiou" }.toUpperCase()
println(vowels) // Outputs: "E, O, A, E, O, U"

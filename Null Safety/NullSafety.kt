1️⃣ Nullable Type (?)
Allows a variable to store either a value or null.

fun main() {
    var name: String? = null
    println(name)  // Output: null
}

2️⃣ Safe Call (?.)
Safely accesses a property/method, returns null instead of crashing if the object is null.

fun main() {
    val name: String? = null
    println(name?.length)  // Output: null
}

3️⃣ Elvis Operator (?:)
Provides a default value if the expression on the left is null.

fun main() {
    val name: String? = null
    println(name?.length ?: 0)  // Output: 0
}

4️⃣ Non-null Assertion (!!)
Forces Kotlin to treat a variable as non-null. Throws NullPointerException if it is null.

fun main() {
    val name: String? = null
    try {
        println(name!!.length)
    } catch (e: NullPointerException) {
        println("Caught NullPointerException")  // Output: Caught NullPointerException
    }
}

5️⃣ Safe Casting (as?)
Tries to cast an object safely. Returns null instead of throwing an exception if the cast fails.

fun main() {
    val obj: Any = 13
    val str: String? = obj as? String
    println(str)  // Output: null
}

6️⃣ Smart Cast (if != null)
Inside a null check, Kotlin automatically treats the variable as non-null.

fun main() {
    val name: String? = null
    if (name != null) {
        println(name.length)
    } else {
        println("Skipped since null")  // Output: Skipped since null
    }
}
.................................................................................

fun main() {

    // 1. Nullable type
    var name: String? = null
    println("1. Nullable type: $name")
.................................................................................
    // 2. Safe call (?.)
    println("2. Safe Call: ${name?.length}")  // avoids NPE, prints null
.................................................................................
    // 3. Elvis operator (?:)
    val length = name?.length ?: 0
    println("3. Elvis Operator: Length = $length")  // prints 0 if null
.................................................................................
    // 4. Non-null assertion (!!)
    try {
        println("4. Non-null Assertion: ${name!!.length}")  // throws NPE
    } catch (e: NullPointerException) {
        println("   Caught NPE using !! : ${e.message}")
    }
.................................................................................
    // 5. Safe casting (as?)
    val obj: Any? = "Hello Kotlin"
    val str: String? = obj as? String
    println("5. Safe Casting: ${str?.length}")  // prints 13
.................................................................................
    // 6. Smart casting with null check
    if (name != null) {
        println("6. Smart Cast: Name length = ${name.length}")
    } else {
        println("6. Smart Cast: name is null, skipping access")
    }
}

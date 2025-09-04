🔑 Null Handling in Kotlin

1️⃣ Nullable Type (?) → variable can hold null.
👉 Example: var name: String? = null → Output: null

2️⃣ Safe Call (?.) → safely access property, returns null if value is null.
👉 Example: name?.length → Output: null

3️⃣ Elvis Operator (?:) → provide default value if null.
👉 Example: name?.length ?: 0 → Output: 0

4️⃣ Non-null Assertion (!!) → force access, throws NPE if null.
👉 Example: name!!.length → Caught NullPointerException

5️⃣ Safe Casting (as?) → safely cast object, returns null if not possible.
👉 Example: obj as? String → Output: 13

6️⃣ Smart Cast (if != null) → compiler auto-casts inside null check.
👉 Example: if (name != null) println(name.length) → Output: skipped since null
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

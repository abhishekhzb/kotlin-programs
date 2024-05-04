object MySingleton {
    init {
        println("Singleton initialized")
    }

    fun doSomething() {
        println("Singleton method called")
    }
}

fun main() {
    MySingleton.doSomething() // Output: Singleton initialized \n Singleton method called
}

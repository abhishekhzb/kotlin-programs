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

//...........................................................................

object MySingleton {
    init {
        println("Singleton instance initialized")
    }
    
    fun doSomething() {
        println("Doing something in singleton")
    }
}

fun main() {
    MySingleton.doSomething()
    MySingleton.doSomething()
}


import kotlinx.coroutines.*

fun main() {
   // println("Main coroutine: Start")

    val job1 = GlobalScope.launch {
        delay(1000) // Simulating some work
        println("Coroutine 1: Finished")
    }

    val job2 = GlobalScope.launch {
        job1.join() // Wait for job1 to complete before starting job2
        delay(500) // Simulating some work
        println("Coroutine 2: Finished")
    }

    // Using runBlocking to wait for all coroutines to complete
    runBlocking {
        job2.join()
    }

    println("Main coroutine: End")
}

...............................................

import kotlinx.coroutines.*

suspend fun api1(): String {
    delay(1000)
    return "API 1"
}

suspend fun api2(): String {
    delay(1000)
    return "API 2"
}

suspend fun api3(): String {
    delay(1000)
    return "API 3"
}

fun main() = runBlocking {
    val result1 = api1()
    val result2 = api2()
    val result3 = api3()

    println(result1)
    println(result2)
    println(result3)
}


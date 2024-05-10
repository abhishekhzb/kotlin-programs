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

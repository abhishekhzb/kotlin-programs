import kotlinx.coroutines.*

fun main() {
    //println("Main coroutine: Start")

    val job1 = GlobalScope.launch {
        delay(1000) // Simulating some work
        println("Coroutine 1: Finished")
    }

    val job2 = GlobalScope.launch {
        delay(500) // Simulating some work
        println("Coroutine 2: Finished")
    }

    // Using runBlocking to wait for both coroutines to complete
    runBlocking {
        job1.join()
        job2.join()
    }

   // println("Main coroutine: End")
}

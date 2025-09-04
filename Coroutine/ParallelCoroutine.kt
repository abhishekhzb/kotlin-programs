import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun apiCall1(): String {
    delay(1000)
    return "API 1 Result"
}

suspend fun apiCall2(): String {
    delay(1000)
    return "API 2 Result"
}

suspend fun apiCall3(): String {
    delay(1000)
    return "API 3 Result"
}

fun main() = runBlocking {
    val time = measureTimeMillis {
        // Run all 3 in parallel
        val job1 = async { apiCall1() }
        val job2 = async { apiCall2() }
        val job3 = async { apiCall3() }

        val result1 = job1.await()
        val result2 = job2.await()
        val result3 = job3.await()

        println(result1)
        println(result2)
        println(result3)
    }

    println("Time taken: $time ms")
}
..........................................
OUTPUT :
API 1 Result
API 2 Result
API 3 Result
Time taken: ~1005 ms

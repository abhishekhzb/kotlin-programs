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
    val job1 = async { api1() }
    val job2 = async { api2() }
    val job3 = async { api3() }

    println(job1.await())
    println(job2.await())
    println(job3.await())
}

// Flow
fun main() = runBlocking<Unit> {
    val numbersFlow = flow {
        for (i in 1..3) {
            emit(i)
        }
    }

    numbersFlow.collect { value ->
        println(value)
    }
}



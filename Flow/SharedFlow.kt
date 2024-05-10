import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val sharedFlow = MutableSharedFlow<Int>() // Create a MutableSharedFlow

    val collector1 = launch {
        sharedFlow.collect { value ->
            println("Collector 1 received: $value")
        }
    }

    val collector2 = launch {
        sharedFlow.collect { value ->
            println("Collector 2 received: $value")
        }
    }

    // Emit values to SharedFlow
    sharedFlow.emit(1)
    sharedFlow.emit(2)

    collector1.cancel() // Cancel collector1
    collector2.cancel() // Cancel collector2
}

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val stateFlow = MutableStateFlow(0) // Initial state is 0
    val stateFlowAsState = stateFlow.asStateFlow() // Convert MutableStateFlow to StateFlow

    val job = launch {
        stateFlowAsState.collect { value ->
            println("StateFlow value: $value")
        }
    }

    // Emit new values to StateFlow
    stateFlow.value = 1
    stateFlow.value = 2

    job.cancel() // Cancel the collection job
}

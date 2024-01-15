import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState()

    Window(
        onCloseRequest = ::exitApplication,
        title = "ProductionSoftware",
        state = state
    ) {
        App(state.size.width.value, state.size.height.value, modifier = Modifier)
    }
}

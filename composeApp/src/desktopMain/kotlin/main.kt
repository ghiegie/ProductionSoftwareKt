import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState

fun main() = application {
    val state = rememberWindowState(
        size = DpSize(width = 800.dp, height = 560.dp)
    )

    Window(
        onCloseRequest = ::exitApplication,
        title = "ProductionSoftware",
        state = state
    ) {
        App(state.size.width.value, state.size.height.value, modifier = Modifier)
    }
}

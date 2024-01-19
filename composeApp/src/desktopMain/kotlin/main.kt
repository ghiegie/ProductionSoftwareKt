import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension

fun main() = application {
    val windowState = rememberWindowState()

    Window(
        onCloseRequest = ::exitApplication,
        title = "Untitled",
        state = windowState
    ) {
        window.minimumSize = Dimension(300, 300)
        CustomerForm(windowState)
    }
}

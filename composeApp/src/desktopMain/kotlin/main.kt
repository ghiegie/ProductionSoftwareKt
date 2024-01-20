import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import java.awt.Dimension

fun main() = application {
    val windowState = rememberWindowState()

    var showDialog by rememberSaveable { mutableStateOf(false) }
    val closeDialog = { showDialog = false }

    Window(
        onCloseRequest = ::exitApplication,
        title = "Untitled",
        state = windowState
    ) {
        window.minimumSize = Dimension(300, 300)
        CustomerForm(windowState, dialogDetails = Pair(showDialog, closeDialog))
    }
}

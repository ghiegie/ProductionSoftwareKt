import androidx.compose.material.Text
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import models.customerform.CustomerFormData
import models.customerform.CustomerWindowModel

fun main() = application {
//    val state = rememberWindowState(
//        size = DpSize(width = 800.dp, height = 560.dp),
//        position = WindowPosition(300.dp, 300.dp)
//    )
//
//    //val windowState = rememberSaveable { CustomerWindowModel(state.position) }
//
//    Window(
//        onCloseRequest = ::exitApplication,
//        title = "ProductionSoftware",
//        state = state
//    ) {
//        App(state.size.width.value, state.size.height.value, modifier = Modifier, windowState = rememberSaveable { CustomerWindowModel(state.position) })
//    }

    Window(
        onCloseRequest = ::exitApplication,
        //state: WindowState = rememberWindowState(),
        //visible: Boolean = true,
        title = "Untitled",
        //icon: Painter? = null,
        //undecorated: Boolean = false,
        //transparent: Boolean = false,
        //resizable: Boolean = true,
        //enabled: Boolean = true,
        //focusable: Boolean = true,
        //alwaysOnTop: Boolean = false,
        //onPreviewKeyEvent: (KeyEvent) -> Boolean = { false },
        //onKeyEvent: (KeyEvent) -> Boolean = { false },
    ) {
        Text("hey")
    }
}

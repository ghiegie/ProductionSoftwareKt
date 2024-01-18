import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.DialogWindow
import androidx.compose.ui.window.rememberDialogState
import composables.customerform.ButtonsArray
import composables.customerform.ContactsContent
import composables.customerform.CustomerContent
import composables.customerform.LabelWithTextBox
import composables.customerform.TitleLabel
import enums.customerform.CustomerFormDialogEnum
import models.customerform.CustomerFormData
import models.customerform.CustomerWindowModel
import kotlin.system.exitProcess

@Composable
fun App(
	width: Float,
	height: Float,
	modifier: Modifier = Modifier,
	windowState: CustomerWindowModel,
) {
	val customerFormData = rememberSaveable { CustomerFormData() }

	val test = windowState.pos.x

	if (windowState.showDialogType == CustomerFormDialogEnum.SQL_OPERATION_ERROR) {
		DialogWindow(
			onCloseRequest = {
				windowState.showDialogType = CustomerFormDialogEnum.NO_DIALOG
			},
		) {
			Button(
				onClick = {
					windowState.showDialogType = CustomerFormDialogEnum.NO_DIALOG
					println(test)
				}
			) {Text("Close Me")}
		}
	}

	Column(
		modifier = Modifier.fillMaxSize().padding(5.dp),
		verticalArrangement = Arrangement.Center
	) {
		TitleLabel()

		LabelWithTextBox(
			label = "Customer ID:",
			modifier = Modifier.fillMaxWidth().padding(
				start = 8.dp,
				top = 2.5.dp,
				end = 8.dp,
				bottom = 15.dp
			),
			labelModifier = Modifier.fillMaxWidth(0.15f),
			textFieldVal = customerFormData.id,
		) { customerFormData.id = it }

		CustomerContent(customerFormData)

		Spacer(Modifier.padding(10.dp))

		ContactsContent(customerFormData)

		Spacer(Modifier.padding(5.dp))

		ButtonsArray(customerFormData, windowState)
	}
}




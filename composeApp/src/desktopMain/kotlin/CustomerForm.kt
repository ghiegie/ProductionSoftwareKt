import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.WindowPosition
import androidx.compose.ui.window.WindowState
import composables.customerform.ButtonsArray
import composables.customerform.ContactsContent
import composables.customerform.CustomerContent
import composables.customerform.LabelWithTextBox
import model.customerform.CustomerFormModel

@Composable
fun CustomerForm(windowState: WindowState, modifier: Modifier = Modifier, dialogDetails: Pair<Boolean, () -> Unit>) {
	Column(
		modifier = modifier.fillMaxSize().padding(5.dp),
		verticalArrangement = Arrangement.Center
	) {
		val customerFormModel = rememberSaveable { CustomerFormModel() }

		Text(
			text = "CUSTOMER FORM",
			fontSize = 20.sp,
			fontWeight = FontWeight.Bold,
			modifier = Modifier.fillMaxWidth().padding(
				start = 8.dp,
				top = 2.5.dp,
				end = 8.dp,
				bottom = 15.dp
			)
		)

		// TitleLabel: END

		LabelWithTextBox(
			label = "Customer ID:",
			modifier = Modifier.fillMaxWidth().padding(
				start = 8.dp,
				top = 2.5.dp,
				end = 8.dp,
				bottom = 15.dp
			),
			labelModifier = Modifier.fillMaxWidth(0.15f),
			textFieldVal = customerFormModel.id,
		) { customerFormModel.id = it }

		CustomerContent(customerFormModel)

		Spacer(Modifier.padding(10.dp))

		ContactsContent(customerFormModel)

		Spacer(Modifier.padding(5.dp))

		ButtonsArray(customerFormModel, dialogDetails = dialogDetails)
	}
}
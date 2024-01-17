import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import composables.customerform.ButtonsArray
import composables.customerform.ContactsContent
import composables.customerform.CustomerContent
import composables.customerform.LabelWithTextBox
import composables.customerform.TitleLabel
import enums.LabelWithTextBoxFormat
import models.CustomerFormData

@Composable
fun App(
	width: Float,
	height: Float,
	modifier: Modifier = Modifier
) {
	var customerFormData by rememberSaveable { mutableStateOf(CustomerFormData()) }

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
			textFieldVal = customerFormData.customerID,
		) {customerFormData.custIDChange()}

		CustomerContent(
//			custName = Pair(customerFormData.customerName) {
//				customerFormData = customerFormData.copy(customerName = it)
//				println(customerFormData)
//			}
		)

		Spacer(Modifier.padding(10.dp))

		ContactsContent()

		Spacer(Modifier.padding(5.dp))

		ButtonsArray()
	}
}




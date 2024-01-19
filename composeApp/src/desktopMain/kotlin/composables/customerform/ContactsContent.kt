package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import model.customerform.CustomerFormModel

@Composable
fun ContactsContent(
	customerFormModel: CustomerFormModel,
	modifier: Modifier = Modifier
) {
	Surface(
		border = BorderStroke(
			width = 1.dp,
			color = Color.LightGray
		)
	) {
		Column(modifier = modifier.padding(5.dp)) {
			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Contact Person",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.contPers,
				) { customerFormModel.contPers = it }

				LabelWithTextBox(
					label = "Position",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.contPersPos,
				) { customerFormModel.contPersPos = it }
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.contPersTelNo,
				) { customerFormModel.contPersTelNo = it }

				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.contPersCellNo,
				) { customerFormModel.contPersCellNo = it}
			}

			Row(verticalAlignment = Alignment.CenterVertically) {
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.contPersEmail,
				) { customerFormModel.contPersEmail = it }

				Spacer(Modifier.fillMaxWidth(fraction = 0.5f))
			}
		}
	}
}
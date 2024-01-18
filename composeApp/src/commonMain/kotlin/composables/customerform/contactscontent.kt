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
import models.customerform.CustomerFormData

@Composable
fun ContactsContent(custForm: CustomerFormData) {
	Surface(
		border = BorderStroke(
			width = 1.dp,
			color = Color.LightGray
		)
	) {
		Column(modifier = Modifier.padding(5.dp)) {
			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Contact Person",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custForm.contPers,
				) { custForm.contPers = it }

				LabelWithTextBox(
					label = "Position",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custForm.contPersPos,
				) { custForm.contPersPos = it }
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custForm.contPersTelNo,
				) { custForm.contPersTelNo = it }

				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custForm.contPersCellNo,
				) { custForm.contPersCellNo = it}
			}

			Row(verticalAlignment = Alignment.CenterVertically) {
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custForm.contPersEmail,
				) { custForm.contPersEmail = it }

				Spacer(Modifier.fillMaxWidth(fraction = 0.5f))
			}
		}
	}
}
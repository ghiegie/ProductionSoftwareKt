package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ContactsContent() {
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
				var text9 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Contact Person",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text9,
				) {text9 = it}

				var text10 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Position",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text10,
				) {text10 = it}
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				var text11 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text11,
				) {text11 = it}

				var text12 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text12,
				) {text12 = it}
			}

			Row(verticalAlignment = Alignment.CenterVertically) {
				var text13 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text13,
				) {text13 = it}

				Spacer(Modifier.fillMaxWidth(fraction = 0.5f))
			}
		}
	}
}
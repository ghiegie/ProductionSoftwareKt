package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Checkbox
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import enums.LabelWithTextBoxFormat
import models.CustomerFormData

@Composable
fun CustomerContent(
//	custName: Pair<String, (String) -> Unit>,
//	addr: Pair<String, () -> Unit>,
//	delivAddr: Pair<String, () -> Unit>,
//	tin: Pair<String, () -> Unit>,
//	telNo: Pair<String, () -> Unit>,
//	cellNo: Pair<String, () -> Unit>,
//	email: Pair<String, () -> Unit>,
) {
	Surface(
		border = BorderStroke(width = 1.dp, color = Color.LightGray)
	) {
		Column(modifier = Modifier.padding(5.dp)) {
			LabelWithTextBox(
				label = "Customer Name",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = "",
			) {
				println()
			}

			var text3 by rememberSaveable { mutableStateOf("") }
			LabelWithTextBox(
				format = LabelWithTextBoxFormat.COLUMN,
				label = "Customer Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = text3,
			) {text3 = it}

			var text4 by rememberSaveable { mutableStateOf("") }
			var isChecked by rememberSaveable { mutableStateOf(false) }
			LabelWithTextBox(
				format = LabelWithTextBoxFormat.COLUMN,
				modForColumnFormat = {
					Row(
						verticalAlignment = Alignment.CenterVertically,
						modifier = Modifier.padding(start = 10.dp)
					) {
						Surface(
							border = BorderStroke(
								width = 1.dp,
								color = Color.Black
							),
							modifier = Modifier.size(15.dp).clickable { isChecked = !isChecked }
						) {
							if (isChecked) {
								Icon(
									imageVector = Icons.Filled.Check,
									contentDescription = null
								)
							}
						}

						Spacer(Modifier.padding(2.dp))

						Text(
							text = "Same as the Address",
							style = TextStyle(
								fontStyle = FontStyle.Italic
							)
						)
					}
				},
				label = "Delivery Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = text4,
			) {text4 = it}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				var text5 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "TIN",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text5,
				) {text5 = it}

				var text6 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text6,
				) {text6 = it}
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				var text7 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text7,
				) {text7 = it}

				var text8 by rememberSaveable { mutableStateOf("") }
				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = text8,
				) {text8 = it}
			}
		}
	}
}
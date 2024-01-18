package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import enums.LabelWithTextBoxFormat
import models.customerform.CustomerFormData

@Composable
fun CustomerContent(
	custFormData: CustomerFormData
) {
	Surface(
		border = BorderStroke(width = 1.dp, color = Color.LightGray)
	) {
		Column(modifier = Modifier.padding(5.dp)) {
			LabelWithTextBox(
				label = "Customer Name",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = custFormData.name
			) { custFormData.name = it }

			LabelWithTextBox(
				format = LabelWithTextBoxFormat.COLUMN,
				label = "Customer Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = custFormData.addr,
			) { custFormData.addr = it }

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
							modifier = Modifier.size(15.dp).clickable {
								custFormData.delivAddr = ""
								custFormData.isChecked = !custFormData.isChecked
							}
						) {
							if (custFormData.isChecked) {
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
				enabled = !custFormData.isChecked,
				label = "Delivery Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = custFormData.delivAddr,
			) { custFormData.delivAddr = it }

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "TIN",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custFormData.tin,
				) { custFormData.tin = it }

				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custFormData.telNo,
				) { custFormData.telNo = it }
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custFormData.email,
				) { custFormData.email = it }

				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = custFormData.cellNo,
				) { custFormData.cellNo = it }
			}
		}
	}
}
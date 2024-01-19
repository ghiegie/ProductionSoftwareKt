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
import enums.customerform.LabelWithTextBoxFormat
import model.customerform.CustomerFormModel

@Composable
fun CustomerContent(
	customerFormModel: CustomerFormModel,
	modifier: Modifier = Modifier
) {
	Surface(border = BorderStroke(
		width = 1.dp,
		color = Color.LightGray
	)) {
		Column(modifier = modifier.padding(5.dp)) {
			LabelWithTextBox(
				label = "Customer Name",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldModifier = Modifier.fillMaxWidth(),
				textFieldVal = customerFormModel.name,
			) { customerFormModel.name = it }

			LabelWithTextBox(
				format = LabelWithTextBoxFormat.COLUMN,
				label = "Customer Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = customerFormModel.addr,
			) { customerFormModel.addr = it }

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
								customerFormModel.delivAddr = ""
								customerFormModel.isChecked = !customerFormModel.isChecked
							}
						) {
							if (customerFormModel.isChecked) {
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
				enabled = !customerFormModel.isChecked,
				label = "Delivery Address",
				modifier = Modifier.fillMaxWidth().padding(2.5.dp),
				labelModifier = Modifier.fillMaxWidth(0.15f),
				textFieldVal = customerFormModel.delivAddr,
			) { customerFormModel.delivAddr = it }

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "TIN",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.tin,
				) { customerFormModel.tin = it }

				LabelWithTextBox(
					label = "Telephone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.telNo,
				) { customerFormModel.telNo = it }
			}

			Row(
				verticalAlignment = Alignment.CenterVertically
			) {
				LabelWithTextBox(
					label = "Email",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.email,
				) { customerFormModel.email = it }

				LabelWithTextBox(
					label = "Cellphone Number",
					modifier = Modifier.weight(0.5f).padding(2.5.dp),
					textFieldVal = customerFormModel.cellNo,
				) { customerFormModel.cellNo = it }
			}
		}
	}
}
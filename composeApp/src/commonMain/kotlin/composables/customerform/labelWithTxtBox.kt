package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import enums.LabelWithTextBoxFormat

@Composable
fun LabelWithTextBox(
	format: LabelWithTextBoxFormat = LabelWithTextBoxFormat.ROW,
	modForColumnFormat: @Composable () -> Unit = {},
	label: String,
	modifier: Modifier = Modifier,
	labelModifier: Modifier = Modifier.fillMaxWidth(fraction = 0.25f),
	textFieldModifier: Modifier = Modifier.fillMaxWidth(),
	enabled: Boolean = true,
	textFieldVal: String,
	textFieldEventHandler: (String) -> Unit
) {
	when (format) {
		LabelWithTextBoxFormat.ROW -> {
			Row(
				modifier = modifier,
				verticalAlignment = Alignment.CenterVertically
			) {
				Text(
					text = label,
					modifier = labelModifier
				)

				Spacer(Modifier.padding(5.dp))

				BasicTextField(
					enabled = enabled,
					singleLine = true,
					value = textFieldVal,
					onValueChange = textFieldEventHandler,
					modifier = textFieldModifier,
					decorationBox = {
						Surface(
							border = BorderStroke(
								width = 1.dp,
								color = if (enabled) Color.Black else Color.LightGray
							),
						) {
							Row(modifier = Modifier.padding(2.5.dp)) {
								it()
							}
						}
					}
				)
			}
		}
		LabelWithTextBoxFormat.COLUMN -> {
			Column(modifier = modifier) {
				Row (
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(bottom = 2.5.dp)
				) {
					Text(
						text = label,
					)
					Spacer(modifier = Modifier.padding(5.dp))
					modForColumnFormat()
				}

				BasicTextField(
					enabled = enabled,
					singleLine = true,
					value = textFieldVal,
					onValueChange = textFieldEventHandler,
					modifier = Modifier.fillMaxWidth(),
					decorationBox = {
						Surface(
							border = BorderStroke(
								width = 1.dp,
								color = if (enabled) Color.Black else Color.LightGray
							),
						) {
							Row(modifier = Modifier.padding(2.5.dp)) {
								it()
							}
						}
					}
				)
			}
		}
	}
}
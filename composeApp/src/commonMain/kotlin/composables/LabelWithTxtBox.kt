package composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp

@Composable
fun LabelWithTextBox(
	modifier: Modifier = Modifier,
	label: String,
	textBoxValue: String,
	onChangeHandler: (String) -> Unit
) {
	Surface {
		Row(
			verticalAlignment = Alignment.CenterVertically,
			modifier = Modifier.padding(bottom = 10.dp)
		) {
			Text(label)
			Spacer(
				modifier = Modifier.padding(10.dp)
			)

			Surface(
				modifier = Modifier.height(30.dp).weight(1f),
				border = BorderStroke(
					width = 1.dp,
					brush = SolidColor(Color.Black)
				)
			) {
				BasicTextField(
					value = textBoxValue,
					onValueChange = onChangeHandler,
					//modifier = Modifier.fillMaxWidth(),
					decorationBox = {
						Row(
							verticalAlignment = Alignment.CenterVertically,
							modifier = Modifier.padding(5.dp)
						) {
							it()
						}
					},
					singleLine = true
				)
			}
		}
	}
}
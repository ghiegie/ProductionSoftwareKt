import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp
import composables.LabelWithTextBox
import dataClasses.CustomerFormData

@Composable
fun App(
	width: Float,
	height: Float,
	modifier: Modifier = Modifier
) {
	var customerFormData by rememberSaveable { mutableStateOf(CustomerFormData()) }

	Surface(
		color = Color.Cyan,
		modifier = modifier
			.width(width.dp)
			.height(height.dp)
			.padding(10.dp)
	) {
		Column {
			// Label
			Surface {
				Text(
					text = "Customer Form",
					modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth()
				)
			}

			LabelWithTextBox(
				label = "Customer ID:",
				textBoxValue = customerFormData.customerID,
				onChangeHandler = {
					customerFormData = customerFormData.copy(customerID = it)
				}
			)

			Surface(
				color = Color.Magenta,
				border = BorderStroke(
					width = 1.dp,
					brush = SolidColor(Color.Black)
				)
			) {
				Column {
					LabelWithTextBox(
						label = "Customer ID:",
						textBoxValue = customerFormData.customerID,
						onChangeHandler = {
							customerFormData = customerFormData.copy(customerID = it)
						}
					)

					LabelWithTextBox(
						label = "Customer ID:",
						textBoxValue = customerFormData.customerID,
						onChangeHandler = {
							customerFormData = customerFormData.copy(customerID = it)
						}
					)

					LabelWithTextBox(
						label = "Customer ID:",
						textBoxValue = customerFormData.customerID,
						onChangeHandler = {
							customerFormData = customerFormData.copy(customerID = it)
						}
					)

					Row {
						LabelWithTextBox(
							label = "Customer ID:",
							textBoxValue = customerFormData.customerID,
							onChangeHandler = {
								customerFormData = customerFormData.copy(customerID = it)
							}
						)

						LabelWithTextBox(
							label = "Customer ID:",
							textBoxValue = customerFormData.customerID,
							onChangeHandler = {
								customerFormData = customerFormData.copy(customerID = it)
							}
						)
					}

					Row {
						LabelWithTextBox(
							label = "Customer ID:",
							textBoxValue = customerFormData.customerID,
							onChangeHandler = {
								customerFormData = customerFormData.copy(customerID = it)
							}
						)

						LabelWithTextBox(
							label = "Customer ID:",
							textBoxValue = customerFormData.customerID,
							onChangeHandler = {
								customerFormData = customerFormData.copy(customerID = it)
							}
						)
					}
				}
			}
		}
	}
}

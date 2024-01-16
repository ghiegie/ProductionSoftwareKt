import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun App(
	width: Float,
	height: Float,
	modifier: Modifier = Modifier
) {
	Surface(color = Color.Cyan,) {
		Column(
			modifier = Modifier.fillMaxSize().padding(5.dp)
		) {
			Surface(color = Color.Magenta) {
				Text(
					text = "Customer Form",
					modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp)
				)
			}

			Surface(color = Color(red = 255, green = 120, blue = 0)) {
				Row(modifier = Modifier.fillMaxWidth().padding(2.5.dp)) {
					Text("Customer ID:")
					Spacer(Modifier.width(5.dp))

					var text1 by rememberSaveable { mutableStateOf("") }

					BasicTextField(
						value = text1,
						onValueChange = {text1 = it},
						modifier = Modifier.fillMaxWidth(),
						decorationBox = {
							Surface(
								border = BorderStroke(
									width = 1.dp,
									color = Color.Black
								),
							) {
								it()
							}
						}
					)
				}
			}

			Surface(
				color = Color.Yellow,
				border = BorderStroke(
					width = 2.dp,
					color = Color.Black
				)
			) {
				Text(
					text = "Customer Form",
					modifier = Modifier.fillMaxWidth().padding(5.dp)
				)
			}
		}
	}
}

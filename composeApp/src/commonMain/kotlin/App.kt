import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.unit.dp

@Composable
fun App(width: Float, height: Float, modifier: Modifier = Modifier) {
	Surface(
		color = Color.Cyan,
		modifier = modifier.width(width.dp).height(height.dp).padding(10.dp)
	) {
		Column {
			Surface {
				Text(
					text = "Customer Form",
					modifier = Modifier.padding(bottom = 10.dp).fillMaxWidth()
				)
			}

			Surface {
				Row(
					verticalAlignment = Alignment.CenterVertically,
					modifier = Modifier.padding(bottom = 10.dp)
				) {
					Text("Customer Name:")
					Spacer(
						modifier = Modifier.padding(10.dp)
					)

					var text by rememberSaveable { mutableStateOf("") }

					Surface(
						modifier = Modifier.height(30.dp),
						border = BorderStroke(
							width = 1.dp,
							brush = SolidColor(Color.Black)
						)
					) {
						BasicTextField(
							value = text,
							onValueChange = {str: String -> text = str},
							modifier = Modifier.fillMaxWidth(),
							decorationBox = {
								innerTextField ->
								Row(
									verticalAlignment = Alignment.CenterVertically,
									modifier = Modifier.padding(5.dp)
								) {
									innerTextField()
								}
							},
							singleLine = true
						)
					}
				}
			}
		}
	}
}
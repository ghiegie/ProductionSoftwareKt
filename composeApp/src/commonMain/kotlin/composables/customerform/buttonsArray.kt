package composables.customerform

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun ButtonsArray() {
	Row(
		modifier = Modifier.fillMaxWidth().height(30.dp),
		horizontalArrangement = Arrangement.End,
		verticalAlignment = Alignment.CenterVertically
	) {
		Surface(border = BorderStroke(
			width = 1.dp,
			color = Color.Black
		)) {
			Text(
				text = "Cancel",
				textAlign = TextAlign.Center,
				modifier = Modifier.width(100.dp).clickable(onClick = {}).padding(5.dp)
			)
		}

		Spacer(Modifier.padding(5.dp))

		Surface(border = BorderStroke(
			width = 1.dp,
			color = Color.Black
		)) {
			Text(
				text = "Clear",
				textAlign = TextAlign.Center,
				modifier = Modifier.width(100.dp).clickable(onClick = {}).padding(5.dp)
			)
		}

		Spacer(Modifier.padding(5.dp))

		Surface(border = BorderStroke(
			width = 1.dp,
			color = Color.Black
		)) {
			Text(
				text = "Submit",
				textAlign = TextAlign.Center,
				modifier = Modifier.width(100.dp).clickable(onClick = {}).padding(5.dp)
			)
		}
	}
}
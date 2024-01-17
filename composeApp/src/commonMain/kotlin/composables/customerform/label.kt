package composables.customerform

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleLabel() {
	Text(
		text = "CUSTOMER FORM",
		fontSize = 20.sp,
		fontWeight = FontWeight.Bold,
		modifier = Modifier.fillMaxWidth().padding(
			start = 8.dp,
			top = 2.5.dp,
			end = 8.dp,
			bottom = 15.dp
		)
	)
}
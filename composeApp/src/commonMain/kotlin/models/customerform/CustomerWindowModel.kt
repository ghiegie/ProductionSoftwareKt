package models.customerform

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.WindowPosition
import enums.customerform.CustomerFormDialogEnum

class CustomerWindowModel(windowPosition: WindowPosition) {
	var showDialogType: CustomerFormDialogEnum by mutableStateOf(CustomerFormDialogEnum.NO_DIALOG)
	var pos by mutableStateOf(windowPosition)
}
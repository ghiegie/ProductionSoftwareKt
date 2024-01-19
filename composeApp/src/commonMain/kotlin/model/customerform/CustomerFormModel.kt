package model.customerform

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import java.sql.SQLException

class CustomerFormModel {
	var id by mutableStateOf("")
	var name by mutableStateOf("")
	var addr by mutableStateOf("")
	var delivAddr by mutableStateOf("")
	var tin by mutableStateOf("")
	var email by mutableStateOf("")
	var telNo by mutableStateOf("")
	var cellNo by mutableStateOf("")
	var contPers by mutableStateOf("")
	var contPersPos by mutableStateOf("")
	var contPersTelNo by mutableStateOf("")
	var contPersCellNo by mutableStateOf("")
	var contPersEmail by mutableStateOf("")

	var isChecked by mutableStateOf(false)

	fun clear() {
		id = ""
		name = ""
		addr = ""
		delivAddr = ""
		tin = ""
		email = ""
		telNo = ""
		cellNo = ""
		contPers = ""
		contPersPos = ""
		contPersTelNo = ""
		contPersCellNo = ""
		contPersEmail = ""

		isChecked = false
	}

	fun submit(): Boolean {
		return try {
			throw SQLException()
		} catch (e: SQLException) {
			false
		}
	}
}
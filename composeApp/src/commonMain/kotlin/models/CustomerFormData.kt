package models

class CustomerFormData(
	var customerName: String = "",
	var address: String = "",
	var deliveryAddress: String = "",
	var tin: String = "",
	var email: String = "",
	var telNo: String = "",
	var cellNo: String = "",
	var contPers: String = "",
	var contPersPos: String = "",
	var contPersTelNo: String = "",
	var contPersCellNo: String = "",
	var contPersEmail: String = "",
) {
	var customerID = ""

	fun custIDChange() {
		customerID = "some"
	}
}
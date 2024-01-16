package dataClasses

data class CustomerFormData(
	var customerID: String = "",
	var customerName: String = "",
	var address: String = "",
	var deliveryAddress: String = "",
	var tin: String = "",
	var email: String = "",
	var telephoneNumber: String = "",
	var cellphoneNumber: String = "",
	var contactPersonName: String = "",
	var contactPersonEmail: String = "",
	var contactPersonTelephoneNumber: String = "",
	var contactPersonCellphoneNUmber: String = "",
)
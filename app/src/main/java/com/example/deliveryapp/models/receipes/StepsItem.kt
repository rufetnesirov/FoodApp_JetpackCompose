package com.example.deliveryapp.models.receipes

data class StepsItem(
	val number: Int? = null,
	val ingredients: List<IngredientsItem?>? = null,
	val equipment: List<EquipmentItem?>? = null,
	val step: String? = null,
	val length: Length? = null
)

package com.clone.mycoupang.domain.model.store

data class Store(
    val id: Int,
    val storeName: String,
    val tag: String,
    val star: Float,
    val reviewCount: Int,
    val distance: Float,
    val fee: Int,
    val imgs: List<String>,
    val isPackage: Boolean,
    val isNew: Boolean,
    val isCi: Boolean,
    val isBlue: Boolean,
    val coupon: Int,
    val deliveryTime: String
)

package com.gram15inch.domain.model.store.detail

data class StoreCategory(
    val id: Int,
    val title: String,
    val decrip: String,
    val menuList: List<StoreCategoryMenu>
)
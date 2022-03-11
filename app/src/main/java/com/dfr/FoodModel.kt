package com.dfr

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class FoodModel(
    var FotoMakanan: Int  = 0,
    var namaMakanan: String = "",
    var HargaMakanan: String = ""
) : Parcelable {
}
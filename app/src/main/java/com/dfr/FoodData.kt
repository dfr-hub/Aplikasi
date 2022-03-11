package com.dfr

import com.dfr.ujikom.R

object FoodData {
    private val FotoMakananList = intArrayOf(
        R.drawable.ayam_bakar,
        R.drawable.ayam_goreng,
        R.drawable.bebek_goreng,
        R.drawable.fuyung_hai,
        R.drawable.nasi_bakar,
        R.drawable.telor_goreng
    )

    private val NamaMakananList = arrayOf(
        "Ayam Bakar",
        "Ayam Goreng",
        "Bebek Goreng",
        "Fuyung Hai",
        "Nasi Bakar",
        "Telor Goreng"
    )

    private val HargaMakananList = arrayOf(
        "Rp.19.000",
        "Rp.32.000",
        "Rp.12.000",
        "Rp.32.000",
        "Rp.21.000",
        "Rp.32.000"
    )

    val listData: ArrayList<FoodModel>
        get() {
            val list = arrayListOf<FoodModel>()
            for (postion in NamaMakananList.indices) {
                val List = FoodModel()
                List.FotoMakanan = FotoMakananList[postion]
                List.namaMakanan = NamaMakananList[postion]
                List.HargaMakanan = HargaMakananList[postion]
                list.add(List)
            }
            return list
        }
}
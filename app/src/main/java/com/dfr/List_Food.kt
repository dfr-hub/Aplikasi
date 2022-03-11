package com.dfr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.dfr.ujikom.R
import com.dfr.ujikom.databinding.ActivityListFoodBinding

class List_Food : AppCompatActivity() {

    private lateinit var binding: ActivityListFoodBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListFoodBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initRecyclerView()
    }

    private fun initRecyclerView() {
        val list: ArrayList<FoodModel> = arrayListOf()
        binding.rvFood.setHasFixedSize(true)
        list.addAll(FoodData.listData)
        binding.rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        binding.rvFood.adapter = listFoodAdapter
    }
}
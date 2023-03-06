package com.example.crypto3

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.crypto3.adapter.MarketAdapter
import com.example.crypto3.api.ApiInterface
import com.example.crypto3.api.ApiUtilities
import com.example.crypto3.databinding.ActivityMainBinding
import com.example.crypto3.models.CryptoCurrency
import com.example.crypto3.models.MarketModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var list: List<CryptoCurrency>
    //private var marketMutableList: MutableList<CryptoCurrency> = list.toMutableList()
    private lateinit var adapter: MarketAdapter

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        list = listOf()

        adapter = MarketAdapter(list)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.adapter = adapter

        lifecycleScope.launch(Dispatchers.IO) {
            val res = ApiUtilities.getInstance().create(ApiInterface::class.java).getMarketData()

            if (res.body() != null) {

                withContext(Dispatchers.Main){
                    list = res.body()!!.data.cryptoCurrencyList

                    adapter.updateData(list)


                }

            }
        }
        //initRecyclerView()



    }


}
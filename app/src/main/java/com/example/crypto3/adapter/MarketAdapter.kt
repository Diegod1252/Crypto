package com.example.crypto3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.crypto3.R
import com.example.crypto3.databinding.ItemCoinsBinding
import com.example.crypto3.models.CryptoCurrency
import kotlinx.coroutines.withContext

class MarketAdapter(var list: List<CryptoCurrency>) : RecyclerView.Adapter<MarketAdapter.MarketViewHolder>() {

    inner class MarketViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var binding = ItemCoinsBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MarketViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MarketViewHolder(layoutInflater.inflate(R.layout.item_coins, parent, false))
    }

    fun updateData(dataItem: List<CryptoCurrency>) {
        list = dataItem
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: MarketViewHolder, position: Int) {
        val item = list[position]
        holder.binding.currencyNameTextView.text = item.name
        holder.binding.currencySymbolTextView.text = item.symbol

        Glide.with(holder.binding.currencyImageView.context).load(
            "https://s2.coinmarketcap.com/static/img/coins/64x64/" + item.id + ".png"
        ).thumbnail(Glide.with(holder.binding.currencyImageView.context).load(R.drawable.spinner))
            .into(holder.binding.currencyImageView)

        holder.binding.currencyPriceTextView.text = "${String.format("$%.02f", item.quotes[0].price)}"
    }
}
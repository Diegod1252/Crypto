package com.example.crypto3.api

import com.example.crypto3.models.MarketModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("data-api/v3/cryptocurrency/listing?cmc_rank?start=1&limit=10")
    suspend fun getMarketData() : Response<MarketModel>

}
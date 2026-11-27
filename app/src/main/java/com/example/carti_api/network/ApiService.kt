package com.example.carti_api.network

import okhttp3.Call
import retrofit2.http.GET

interface ApiService {

    @GET("v1/songs")
    fun  getSongs(): Call<List><SongsDTO>>
}
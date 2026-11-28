package com.example.carti_api.data

import java.sql.Date

data class AlbumDTO(
    val id: Long,
    val album_name: String,
    val release_date : Date,
    val long : Int,
    val description : String?
)

data class SongDTO(
    val id: Long,
    val name : String,
    val duration : Int,
    val lyrics: String,
    val album : AlbumDTO?
)

data class SongRequest(
    val name : String,
    val duration : Int,
    val lyrics: String?= null,
    val album_id : Long,
)

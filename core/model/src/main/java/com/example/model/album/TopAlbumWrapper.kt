package com.example.model.album

import com.example.model.Model
import com.google.gson.annotations.SerializedName
import com.example.model.generic.LastFMAttr

data class TopAlbumWrapper(
    @SerializedName("album") val albumList: List<TopAlbum>? = null,
    @SerializedName("@attr") val attr: LastFMAttr? = null
) : Model()
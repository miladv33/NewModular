package com.example.model.artist

import com.google.gson.annotations.SerializedName

data class ArtistsSearchResponse(
  @SerializedName("results") val results: ArtistSearch? = null
)

package kr.eg.egiwon.githubrepositorysearch.data.entity

import com.google.gson.annotations.SerializedName

data class Owner(
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("type")
    val type: String = "",
    @SerializedName("url")
    val url: String = ""
)
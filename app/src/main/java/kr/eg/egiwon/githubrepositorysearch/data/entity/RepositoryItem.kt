package kr.eg.egiwon.githubrepositorysearch.data.entity

import com.google.gson.annotations.SerializedName

data class RepositoryItem(
    @SerializedName("forks_count")
    val forksCount: Int = 0,
    @SerializedName("full_name")
    val fullName: String = "",
    @SerializedName("git_url")
    val gitUrl: String = "",
    @SerializedName("id")
    val id: Int = 0,
    @SerializedName("name")
    val name: String = "",
    @SerializedName("owner")
    val ownerResponse: OwnerResponse = OwnerResponse(),
    @SerializedName("stargazers_count")
    val stargazersCount: Int = 0
)
package kr.eg.egiwon.githubrepositorysearch.data.entity

import com.google.gson.annotations.SerializedName

data class GithubRepositoryResponse(
    @SerializedName("incomplete_results")
    val incompleteResults: Boolean = false,
    @SerializedName("items")
    val items: List<Item> = emptyList(),
    @SerializedName("total_count")
    val totalCount: Int = 0
)
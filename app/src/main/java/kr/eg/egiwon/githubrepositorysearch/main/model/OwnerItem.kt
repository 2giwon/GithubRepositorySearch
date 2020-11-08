package kr.eg.egiwon.githubrepositorysearch.main.model

import kr.eg.egiwon.githubrepositorysearch.data.entity.OwnerResponse

data class OwnerItem(
    val id: Int = 0,
    val type: String = "",
    val url: String = ""
)

fun OwnerResponse.mapToOwner(): OwnerItem = OwnerItem(
    id = id,
    type = type,
    url = url
)
package kr.eg.egiwon.githubrepositorysearch.main.model

import kr.eg.egiwon.githubrepositorysearch.data.entity.OwnerResponse
import kr.eg.egiwon.githubrepositorysearch.data.entity.RepositoryItem

data class Repository(
    val forksCount: Int = 0,
    val fullName: String = "",
    val gitUrl: String = "",
    val id: Int = 0,
    val name: String = "",
    val ownerResponse: OwnerResponse = OwnerResponse(),
    val stargazersCount: Int = 0
)

fun RepositoryItem.mapToRepository(): Repository = Repository(
    forksCount = forksCount,
    fullName = fullName,
    gitUrl = gitUrl,
    id = id,
    name = name,
    ownerResponse = ownerResponse,
    stargazersCount = stargazersCount
)
package kr.eg.egiwon.githubrepositorysearch.data

import io.reactivex.Single
import kr.eg.egiwon.githubrepositorysearch.data.entity.GithubRepositoryResponse

interface GithubRepository {

    fun getRepository(query: String): Single<GithubRepositoryResponse>
}
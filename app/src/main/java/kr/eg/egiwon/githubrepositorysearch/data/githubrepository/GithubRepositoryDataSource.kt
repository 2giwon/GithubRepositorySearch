package kr.eg.egiwon.githubrepositorysearch.data.githubrepository

import io.reactivex.Single
import kr.eg.egiwon.githubrepositorysearch.data.entity.GithubRepositoryResponse

interface GithubRepositoryDataSource {
    fun getRepository(query: String): Single<GithubRepositoryResponse>
}
package kr.eg.egiwon.githubrepositorysearch.data.githubrepository

import io.reactivex.Single
import kr.eg.egiwon.githubrepositorysearch.data.GithubRepository
import kr.eg.egiwon.githubrepositorysearch.data.entity.GithubRepositoryResponse
import javax.inject.Inject

class GithubRepositoryImpl @Inject constructor(
    private val dataSource: GithubRepositoryDataSource
) : GithubRepository {

    override fun getRepository(query: String): Single<GithubRepositoryResponse> =
        dataSource.getRepository(query)
}
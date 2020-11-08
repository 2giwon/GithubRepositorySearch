package kr.eg.egiwon.githubrepositorysearch.data.source

import io.reactivex.Single
import kr.eg.egiwon.githubrepositorysearch.data.entity.GithubRepositoryResponse
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.GithubRepositoryDataSource
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.RepositoryService
import javax.inject.Inject

class GithubRepositoryRemoteDataSource @Inject constructor(
    private val repositoryService: RepositoryService
) : GithubRepositoryDataSource {

    override fun getRepository(query: String): Single<GithubRepositoryResponse> =
        repositoryService.getRepositories(query)

}
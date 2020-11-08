package kr.eg.egiwon.githubrepositorysearch.data.githubrepository

import io.reactivex.Single
import kr.eg.egiwon.githubrepositorysearch.data.entity.GithubRepositoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RepositoryService {

    @GET("repositories")
    fun getRepositories(
        @Query("q") query: String
    ): Single<GithubRepositoryResponse>
}
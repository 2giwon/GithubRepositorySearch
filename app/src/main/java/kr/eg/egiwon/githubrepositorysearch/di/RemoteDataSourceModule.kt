package kr.eg.egiwon.githubrepositorysearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.GithubRepositoryDataSource
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.RepositoryService
import kr.eg.egiwon.githubrepositorysearch.data.source.GithubRepositoryRemoteDataSource
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RemoteDataSourceModule {

    @Provides
    @Singleton
    fun provideGithubRemoteDataSource(
        repositoryService: RepositoryService
    ): GithubRepositoryDataSource = GithubRepositoryRemoteDataSource(repositoryService)
}
package kr.eg.egiwon.githubrepositorysearch.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import kr.eg.egiwon.githubrepositorysearch.data.GithubRepository
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.GithubRepositoryDataSource
import kr.eg.egiwon.githubrepositorysearch.data.githubrepository.GithubRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun provideGithubRepository(dataSource: GithubRepositoryDataSource): GithubRepository =
        GithubRepositoryImpl(dataSource)
}
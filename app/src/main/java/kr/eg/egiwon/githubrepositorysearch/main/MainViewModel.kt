package kr.eg.egiwon.githubrepositorysearch.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import kr.eg.egiwon.githubrepositorysearch.data.GithubRepository
import kr.eg.egiwon.githubrepositorysearch.data.entity.RepositoryItem
import kr.eg.egiwon.githubrepositorysearch.main.model.Repository
import kr.eg.egiwon.githubrepositorysearch.main.model.mapToRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: GithubRepository
) : ViewModel() {

    private val compositeDisposable: CompositeDisposable by lazy(::CompositeDisposable)

    private val _resultRepository = MutableLiveData<List<Repository>>()
    val resultRepository: LiveData<List<Repository>> get() = _resultRepository

    fun getRepository(query: String) {
        if (query.isNotEmpty()) {
            repository.getRepository(query)
                .subscribeOn(Schedulers.io())
                .map {
                    it.repositoryItems.map(RepositoryItem::mapToRepository)
                }
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeBy {
                    _resultRepository.value = it
                }.addTo(compositeDisposable)
        }
    }
}
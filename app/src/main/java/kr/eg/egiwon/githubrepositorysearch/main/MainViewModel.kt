package kr.eg.egiwon.githubrepositorysearch.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import kr.eg.egiwon.githubrepositorysearch.data.GithubRepository

class MainViewModel @ViewModelInject constructor(
    private val repository: GithubRepository
) : ViewModel()
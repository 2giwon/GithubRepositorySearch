package kr.eg.egiwon.githubrepositorysearch.main

import androidx.recyclerview.widget.RecyclerView
import kr.eg.egiwon.githubrepositorysearch.databinding.ItemRepositoryBinding
import kr.eg.egiwon.githubrepositorysearch.main.model.Repository

class RepositoryItemViewHolder(
    private val binding: ItemRepositoryBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun onBind(item: Repository?) {
        if (item == null) return

        binding.repositoryItem = item
        binding.executePendingBindings()
    }
}
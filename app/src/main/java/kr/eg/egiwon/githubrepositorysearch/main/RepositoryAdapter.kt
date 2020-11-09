package kr.eg.egiwon.githubrepositorysearch.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import kr.eg.egiwon.githubrepositorysearch.R
import kr.eg.egiwon.githubrepositorysearch.databinding.ItemRepositoryBinding
import kr.eg.egiwon.githubrepositorysearch.main.model.Repository

class RepositoryAdapter : RecyclerView.Adapter<RepositoryItemViewHolder>() {

    private val list = mutableListOf<Repository>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryItemViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_repository, parent, false)
        val binding: ItemRepositoryBinding = requireNotNull(DataBindingUtil.bind(view))
        return RepositoryItemViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RepositoryItemViewHolder, position: Int) =
        holder.onBind(list[position])

    override fun getItemCount(): Int = list.size

    fun replaceItems(items: List<Repository>?) {
        if (items != null) {
            list.clear()
            list.addAll(items)
        }
    }
}
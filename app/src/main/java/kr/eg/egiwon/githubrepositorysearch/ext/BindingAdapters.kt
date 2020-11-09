package kr.eg.egiwon.githubrepositorysearch.ext

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import kr.eg.egiwon.githubrepositorysearch.main.RepositoryAdapter
import kr.eg.egiwon.githubrepositorysearch.main.model.Repository

@BindingAdapter("replaceItem")
fun replaceItem(recyclerView: RecyclerView, items: List<Repository>?) {
    if (items != null) {
        (recyclerView.adapter as? RepositoryAdapter)?.run {
            replaceItems(items)
            notifyDataSetChanged()
        }
    }
}
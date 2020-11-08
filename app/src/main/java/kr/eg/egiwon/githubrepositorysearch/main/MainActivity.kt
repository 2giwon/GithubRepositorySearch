package kr.eg.egiwon.githubrepositorysearch.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import dagger.hilt.android.AndroidEntryPoint
import kr.eg.egiwon.githubrepositorysearch.R
import kr.eg.egiwon.githubrepositorysearch.databinding.ActivityMainBinding

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this

        binding.buttonSearch.setOnClickListener {
            viewModel.getRepository(binding.editSearch.text.toString())
        }
    }
}
package com.example.linkedinproject_gr1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.linkedinproject_gr1.R
import com.example.linkedinproject_gr1.adapter.PostAdapter
import com.example.linkedinproject_gr1.databinding.FragmentHomeBinding
import com.example.linkedinproject_gr1.models.Post


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val listOfPosts = listOf(
            Post(R.drawable.ic_post,"Test title 1", "Test desc 1","1d"),
            Post(R.drawable.ic_home,"Test title 2", "Test desc 2","2d"),
            Post(R.drawable.ic_job,"Test title 3", "Test desc 3","1w"),
            Post(R.drawable.ic_network,"Test title 4", "Test desc 4","4d"),
            Post(R.drawable.ic_settings,"Test title 5", "Test desc 5","1m"),
            )

        val postAdapter = PostAdapter(requireContext(),listOfPosts)
        binding.lvHome.adapter = postAdapter
    }

}
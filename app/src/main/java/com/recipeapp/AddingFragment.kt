package com.recipeapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recipeapp.databinding.FragmentAddingBinding

class AddingFragment : Fragment() {

    private var _binding: FragmentAddingBinding? = null
    private val binding: FragmentAddingBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddingBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}
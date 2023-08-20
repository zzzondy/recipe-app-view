package com.recipe_adding.presentation.screens.recipe_adding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recipe_adding.presentation.databinding.FragmentRecipeAddingBinding

class RecipeAddingFragment : Fragment() {

    private var _binding: FragmentRecipeAddingBinding? = null

    private val binding: FragmentRecipeAddingBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeAddingBinding.inflate(inflater, container, false)
        return binding.root
    }
}
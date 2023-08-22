package com.recipe_adding.presentation.screens.recipe_adding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.recipe_adding.presentation.databinding.FragmentRecipeAddingScreenBinding

class RecipeAddingScreenFragment : Fragment() {

    private var _binding: FragmentRecipeAddingScreenBinding? = null

    private val binding: FragmentRecipeAddingScreenBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeAddingScreenBinding.inflate(inflater, container, false)
        return binding.root
    }
}
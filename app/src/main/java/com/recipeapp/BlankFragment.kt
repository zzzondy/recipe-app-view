package com.recipeapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.recipeapp.components.animations.setOnBounceClickListener
import com.recipeapp.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null
    private val binding: FragmentBlankBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBlankBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.textInputLayout.isErrorEnabled = true
        binding.button.setOnBounceClickListener {
            Log.d("Bounce click", "yeeeee")
        }

        binding.button3.setOnBounceClickListener {
            Log.d("Bounce click", "yeeeee")
        }

        binding.button6.setOnBounceClickListener {
            Log.d("Bounce click", "yeeeee")
        }
    }
}
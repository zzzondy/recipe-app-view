package com.recipeapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.recipeapp.components.animations.AnimationConst
import com.recipeapp.components.animations.setOnBounceClickListener
import com.recipeapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment

        val navController = navHostFragment.navController

        setupBottomNavigation(navController)
        setupViewsListeners(navController)
    }

    private fun setupViewsListeners(navController: NavController) {
        binding.recipeAddingButton.setOnBounceClickListener {
            navController.navigate(R.id.addingFragment)
        }
    }

    private fun setupBottomNavigation(navController: NavController) {
        binding.bottomNavigationView.setupWithNavController(navController)
        animateBottomNavigationViewWithCurrentDestination(navController)
    }

    private fun animateBottomNavigationViewWithCurrentDestination(navController: NavController) {
        fun hideBottomNavigationView() {
            binding.bottomNavigationViewLayout.animate()
                .apply {
                    translationY(binding.bottomNavigationViewLayout.height.toFloat())
                    duration = AnimationConst.BOTTOM_NAVIGATION_VIEW_ANIMATION_DURATION
                }
        }

        fun showBottomNavigationView() {
            binding.bottomNavigationViewLayout.animate()
                .apply {
                    translationY(0f)
                    duration = AnimationConst.BOTTOM_NAVIGATION_VIEW_ANIMATION_DURATION
                }
        }

        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.home_destination -> {
                    showBottomNavigationView()
                }

                R.id.profile_destination -> {
                    showBottomNavigationView()
                }

                else -> {
                    hideBottomNavigationView()
                }
            }
        }
    }
}
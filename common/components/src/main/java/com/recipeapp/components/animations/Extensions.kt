package com.recipeapp.components.animations

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.os.Build
import android.view.MotionEvent
import android.view.View

fun View.setOnBounceClickListener(onClick: () -> Unit = {}) {
    this@setOnBounceClickListener.setOnClickListener {
        onClick()
    }

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        this.setOnTouchListener { view, motionEvent ->
            val scaleX =
                ObjectAnimator.ofFloat(this@setOnBounceClickListener, View.SCALE_X, 1f, 0.9f)
                    .apply {
                        duration = AnimationConst.BOUNCE_CLICK_EFFECT_DURATION
                    }

            val scaleY =
                ObjectAnimator.ofFloat(this@setOnBounceClickListener, View.SCALE_Y, 1f, 0.9f)
                    .apply {
                        duration = AnimationConst.BOUNCE_CLICK_EFFECT_DURATION
                        start()
                    }

            val bounceEffect = AnimatorSet().apply {
                play(scaleX).with(scaleY)
            }
            when (motionEvent.action) {
                MotionEvent.ACTION_DOWN -> {
                    bounceEffect.apply {
                        start()
                    }
                    return@setOnTouchListener true
                }

                MotionEvent.ACTION_UP -> {
                    this@setOnBounceClickListener.performClick()
                    bounceEffect.apply {
                        reverse()
                    }
                    return@setOnTouchListener true
                }

                else -> {
                    return@setOnTouchListener true
                }
            }
        }
    } else {
        this@setOnBounceClickListener.performClick()
    }

}
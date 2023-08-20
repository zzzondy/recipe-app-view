package com.recipeapp

import android.app.Application
import android.content.Context
import com.recipeapp.di.application.AppComponent
import com.recipeapp.di.application.DaggerAppComponent

class RecipeApp : Application() {

    private var _appComponent: AppComponent? = null

    val appComponent: AppComponent
        get() = checkNotNull(_appComponent) {
            "AppComponent didn't initialize"
        }

    override fun onCreate() {
        super.onCreate()

        _appComponent = DaggerAppComponent.create()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is RecipeApp -> appComponent
        else -> applicationContext.appComponent
    }
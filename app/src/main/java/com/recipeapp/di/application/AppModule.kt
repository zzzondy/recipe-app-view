package com.recipeapp.di.application

import com.recipeapp.network.NetworkModule
import dagger.Module

@Module(
    includes = [NetworkModule::class]
)
class AppModule
// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id(Plugins.androidApplication) version Plugins.androidApplicationVersion apply false
    id(Plugins.kotlinAndroid) version Plugins.kotlinVersion apply false
    id(Plugins.kotlinJvm) version Plugins.kotlinVersion apply false
    id(Plugins.androidLibrary) version Plugins.androidLibraryVersion apply false
    id(Plugins.kotlinSerialization) version Plugins.kotlinVersion apply false
}
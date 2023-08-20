pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "RecipeApp"

// App
include(":app")

// Common
include(":common:components")
include(":common:network")

// Features
include(":feature:recipe:presentation")

include(":feature:recipe_adding:presentation")

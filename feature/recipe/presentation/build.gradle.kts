plugins {
    id(Plugins.androidLibrary)
    id(Plugins.kotlinAndroid)
}

android {
    namespace = "com.recipe_feature.presentation"
    compileSdk = Config.compileSdk

    defaultConfig {
        minSdk = Config.minSdk

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }

        debug {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Modules
    implementation(project(Modules.commonComponents))

    implementation(project(Modules.featureRecipeAddingDomain))

    // Lifecycle
    implementation(Dependencies.Lifecycle.core)

    // UI
    implementation(Dependencies.UI.appCompat)
    implementation(Dependencies.UI.material)
    implementation(Dependencies.UI.constraintLayout)

    // Navigation
    implementation(Dependencies.Navigation.fragment)

    // Testing
    testImplementation(Dependencies.Testing.junit)
    androidTestImplementation(Dependencies.Testing.androidJunit)
    androidTestImplementation(Dependencies.Testing.espresso)
}
object Dependencies {

    object Lifecycle {

        const val core = "androidx.core:core-ktx:1.10.1"
    }

    object UI {

        const val appCompat = "androidx.appcompat:appcompat:1.6.1"
        const val material = "com.google.android.material:material:1.9.0"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:2.1.4"
    }

    object Navigation {
        private const val navigationVersion = "2.7.0"

        const val fragment = "androidx.navigation:navigation-fragment-ktx:$navigationVersion"
        const val ui = "androidx.navigation:navigation-ui-ktx:$navigationVersion"
    }

    object Dagger {
        private const val daggerVersion = "2.47"

        const val dagger = "com.google.dagger:dagger:$daggerVersion"
        const val compiler = "com.google.dagger:dagger-compiler:$daggerVersion"
    }

    object Serialization {
        const val kotlinSerialization = "org.jetbrains.kotlin:kotlin-serialization:1.9.0"
        const val kotlinSerializationJson = "org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1"
    }

    object OkHttp3 {
        private const val okHttpVersion = "4.9.0"

        const val okhttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
        const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
    }

    object Retrofit {
        const val retrofit = "com.squareup.retrofit2:retrofit:2.9.0"
        const val serialization =
            "com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter:1.0.0"
    }

    object Coil {
        const val coil = "io.coil-kt:coil:2.4.0"
    }

    object Paging {
        private const val pagingVersion = "3.2.0"

        const val common = "androidx.paging:paging-common-ktx:$pagingVersion"
        const val compose = "androidx.paging:paging-runtime:$pagingVersion"
    }

    object FlowRedux {
        private const val flowReduxVersion = "1.0.2"

        const val flowRedux = "com.freeletics.flowredux:flowredux-jvm:$flowReduxVersion"
    }

    object Testing {

        const val junit = "junit:junit:4.13.2"
        const val androidJunit = "androidx.test.ext:junit:1.1.5"
        const val espresso = "androidx.test.espresso:espresso-core:3.5.1"
    }
}
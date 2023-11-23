plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "fr.but.sae2024.edukid"
    compileSdk = 34

    defaultConfig {
        applicationId = "fr.but.sae2024.edukid"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
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

    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
    implementation("androidx.navigation:navigation-fragment-ktx:2.7.5")
    implementation("androidx.navigation:navigation-ui-ktx:2.7.5")

    //SplashScreen
    implementation("androidx.core:core-splashscreen:1.0.1")

    // Room
    implementation("androidx.room:room-runtime:2.6.0")
    kapt("androidx.room:room-compiler:2.6.0")
    implementation("androidx.room:room-ktx:2.6.0")

    // Recycler View
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    // Archcore Testing
    testImplementation("androidx.arch.core:core-testing:2.2.0")

    // Picasso
    implementation ("com.squareup.picasso:picasso:2.71828")
    implementation ("jp.wasabeef:picasso-transformations:2.4.0")

    // Daimajia (Dessin)
    implementation("com.daimajia.easing:library:2.0@aar")
    implementation("com.daimajia.androidanimations:library:2.3@aar")

    // Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.okhttp3:logging-interceptor:4.11.0")

    // Gson
    implementation ("com.google.code.gson:gson:2.8.7")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    // Graphique
/*
    implementation("com.github.PhilJay:MPAndroidChart:v3.1.0")
    implementation("com.kofigyan.stateprogressbar:stateprogressbar:1.0.0")*/
    implementation("com.makeramen:roundedimageview:2.3.0")

    // Co Routine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    // Timber
    implementation ("com.jakewharton.timber:timber:5.0.1")
    implementation("androidx.annotation:annotation:1.6.0")
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // Chiffrement
    implementation("com.ToxicBakery.library.bcrypt:bcrypt:1.0.9")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
plugins {
    alias(libs.plugins.android.application)
    id("org.jetbrains.kotlin.android" )
    id("com.google.gms.google-services" )
    id("org.jetbrains.compose" )
}
android {
    namespace = "br.ufc.quixada.investioraula"
    compileSdk = 35
    defaultConfig {
        applicationId = "br.ufc.quixada.investioraula"
        minSdk = 26
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile( "proguard-android-optimize.txt" ),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion .VERSION_1_8
        targetCompatibility = JavaVersion .VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}
dependencies {
    // Firebase
    implementation(platform("com.google.firebase:firebase-bom:33.7.0")) [cite: 168]
    implementation("com.google.firebase:firebase-analytics") [cite: 168]
    implementation(libs.firebase.database.ktx) [cite: 180]
    implementation("com.google.firebase:firebase-messaging-ktx:24.1.0") [cite: 181]

    // Jetpack Compose
    implementation(platform("androidx.compose:compose-bom:2023.09.01")) [cite: 170]
    implementation("androidx.compose.ui:ui") [cite: 170]
    implementation("androidx.compose.material3:material3") [cite: 178]
    implementation("androidx.compose.ui:ui-tooling-preview") [cite: 179]
    debugImplementation("androidx.compose.ui:ui-tooling") [cite: 182]

    // Navigation Compose
    implementation("androidx.navigation:navigation-compose:2.7.2") [cite: 184]

    // Coroutines
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3") [cite: 187]

    // Lifecycle
    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.6.2") [cite: 189]
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.6.2") [cite: 190]

    // Outras dependências do AndroidX
    implementation(libs.androidx.core.ktx) [cite: 191]
    implementation(libs.androidx.activity.compose) [cite: 193]
}
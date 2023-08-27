//
//
//plugins {
//    id("com.android.application")
//    id("org.jetbrains.kotlin.android")
//}
//
//android {
//    namespace="com.apiu.contactapp_assessment"
//    compileSdk=33
//
//    defaultConfig {
//        applicationId="com.apiu.contactapp_assessment"
//        minSdk=24
//        targetSdk=33
//        versionCode=1
//        versionName="1.0"
//
//        testInstrumentationRunner="androidx.test.runner.AndroidJUnitRunner"
//    }
//    kotlinOptions {
//        jvmTarget = "1.8" // Set this to the Java version you're using
//    }
//
//
//    buildFeatures {
//        viewBinding= true
//    }
//}
//
//
//dependencies {
//
//
//
//
//    implementation("androidx.core:core-ktx:1.7.0")
//    implementation("androidx.appcompat:appcompat:1.4.0")
//    implementation("com.google.android.material:material:1.5.0")
//    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
//    testImplementation("junit:junit:4.13.2")
//    androidTestImplementation("androidx.test.ext:junit:1.1.3")
//    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
//    implementation("com.squareup.retrofit2:retrofit:2.9.0")
//    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
//    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0-alpha02")
//    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-alpha02")
//    implementation("androidx.activity:activity-ktx:1.3.1")
//
//
//}

plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.apiu.contactapp_assessment"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.apiu.contactapp_assessment"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }

    buildFeatures {
        viewBinding = true
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.0")
    implementation("com.google.android.material:material:1.5.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.0")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.5.0")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.4.0-alpha02")
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.4.0-alpha02")
    implementation("androidx.activity:activity-ktx:1.3.1")
}

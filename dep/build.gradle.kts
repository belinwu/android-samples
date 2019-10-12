plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-android-extensions")
}

android {
    compileSdkVersion(Deps.compileSdk)
    buildToolsVersion(Deps.buildTools)
    defaultConfig {
        applicationId = "com.samelody.samples.dep"
        minSdkVersion(Deps.minSdk)
        targetSdkVersion(Deps.targetSdk)
        versionCode = 1
        versionName = "1.0"
        testInstrumentationRunner = "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(Deps.kotlinStdlib)
    implementation(Deps.kotlinReflect)
    implementation(Deps.kotlinCompiler)
    implementation(Deps.adsId)
    implementation(Deps.adsIdProvider)
    implementation(Deps.annotation)
    implementation(Deps.annotationExperimental)
    implementation(Deps.core)
    implementation(Deps.coreKtx)
    implementation(Deps.coreRole)
    implementation(Deps.cameraCore)
    implementation(Deps.cameraCamera2)
    implementation(Deps.cameraView)
    implementation(Deps.cameraExtensions)
    implementation(Deps.customView)
    implementation(Deps.activity)
    implementation(Deps.activityKtx)
    implementation(Deps.biometric)
    implementation(Deps.browser)
    implementation(Deps.dataBinding)
    implementation(Deps.dataBindingAdapters)
    implementation(Deps.dynamicAnimation)
    implementation(Deps.dynamicAnimationKtx)
    implementation(Deps.flexbox)
    implementation(Deps.enterpriseFeedback)
    implementation(Deps.fragment)
    implementation(Deps.fragmentKtx)
    implementation(Deps.loader)
    implementation(Deps.futures)
    implementation(Deps.listenableFuture)
    implementation(Deps.listenableFutureCallback)
    implementation(Deps.preference)
    implementation(Deps.preferenceKtx)
    implementation(Deps.viewModel)
    implementation(Deps.viewModelSavedState)
    implementation(Deps.liveDataKtx)
    implementation(Deps.recyclerView)
    implementation(Deps.recyclerViewSelection)
    implementation(Deps.lifecycle)
    implementation(Deps.lifecycleJava8)
    implementation(Deps.lifecycleReactiveStreams)
    implementation(Deps.appCompat)
    implementation(Deps.appCompatResources)
    implementation(Deps.autofill)
    implementation(Deps.emoji)
    implementation(Deps.emojiAppCompat)
    implementation(Deps.emojiBundled)
    implementation(Deps.room)
    implementation(Deps.roomKtx)
    implementation(Deps.roomCoroutines)
    implementation(Deps.roomMigration)
    implementation(Deps.sqlite)
    implementation(Deps.sqliteKtx)
    implementation(Deps.shareTarget)
    implementation(Deps.securityCrypto)
    implementation(Deps.versionedParcelable)
    implementation(Deps.paging)
    implementation(Deps.pagingKtx)
    implementation(Deps.pagingRxJava)
    implementation(Deps.pagingRxJavaKtx)
    implementation(Deps.heifWriter)
    implementation(Deps.palette)
    implementation(Deps.paletteKtx)
    implementation(Deps.recommendation)
    implementation(Deps.material)
    implementation(Deps.coroutinesCore)
    implementation(Deps.coroutinesAndroid)
    implementation(Deps.kotlinxIoJvm)
    implementation(Deps.atomicfu)
    implementation(Deps.media)
    implementation(Deps.mediaWidget)
    implementation(Deps.media2Common)
    implementation(Deps.media2Widget)
    implementation(Deps.media2Session)
    implementation(Deps.media2Player)
    implementation(Deps.media2ExoPlayer)
    implementation(Deps.mediaRouter)
    implementation(Deps.exifInterface)
    implementation(Deps.contentPager)
    implementation(Deps.slice)
    implementation(Deps.sliceView)
    implementation(Deps.sliceBuilders)
    implementation(Deps.multidex)
    implementation(Deps.savedState)
    implementation(Deps.navigation)
    implementation(Deps.navigationUi)
    implementation(Deps.navigationFragment)
    implementation(Deps.collection)
    implementation(Deps.collectionKtx)
    implementation(Deps.constraintLayout)
    implementation(Deps.swipeRefreshLayout)
    implementation(Deps.slidingPaneLayout)
    implementation(Deps.drawerLayout)
    implementation(Deps.gridLayout)
    implementation(Deps.cardView)
    implementation(Deps.transition)
    implementation(Deps.textClassifier)
    implementation(Deps.viewPager)
    implementation(Deps.viewPager2)
    implementation(Deps.biometric)
    implementation(Deps.car)
    implementation(Deps.wear)
    implementation(Deps.work)
    implementation(Deps.workKtx)
    implementation(Deps.workRxJava)
    implementation(Deps.webkit)
    implementation(Deps.leanback)
    implementation(Deps.leanbackPreference)
    implementation(Deps.localBroadcastManager)
    implementation(Deps.tvProvider)
    implementation(Deps.vectorDrawable)
    implementation(Deps.vectorDrawableAnimated)
    implementation(Deps.interpolator)
    implementation(Deps.ktorClientCore)
    implementation(Deps.ktorClientCoreJvm)
    implementation(Deps.ktorClientAndroid)
    implementation(Deps.ktorClientOkHttp)
    implementation(Deps.ktorClientIos)
    implementation(Deps.ktorClientJson)
    implementation(Deps.ktorClientGson)
    implementation(Deps.okHttp)
    implementation(Deps.okio)
    implementation(Deps.glide)
    implementation(Deps.rxJava3)
    implementation(Deps.photoView)
    implementation(Deps.exoPlayer)
    implementation(Deps.exoPlayerRtmp)
    implementation(Deps.retrofit)
    implementation(Deps.gson)
    implementation(Deps.coordinatorLayout)
    implementation(Deps.simpleCropView)
    implementation(Deps.remoteCallback)
    implementation(Deps.eventBus)
    implementation(Deps.gifEncoder)
    implementation(Deps.arCore)
    implementation(Deps.halCore)
    implementation(Deps.halCoreLiveData)
//    implementation(Deps.sceneformCore)
//    implementation(Deps.sceneformUx)
    implementation(Deps.eiffel)
    implementation(Deps.easyPermissions)
    implementation(Deps.leakCanary)
    implementation(Deps.lottie)
    implementation(Deps.subsamplingImageView)
    implementation(Deps.fresco)
    implementation(Deps.frescoGif)
    implementation(Deps.frescoWebp)
    implementation(Deps.workflowAndroid)
    implementation(Deps.coil)
    implementation(Deps.coilGif)
    implementation(Deps.kotlinImmutableCollections)
    implementation(Deps.timber)
//    implementation(Deps.guava)

    testImplementation(Deps.benchmark)
    testImplementation(Deps.workTesting)
    testImplementation(Deps.testCore)
    testImplementation(Deps.testMonitor)
    testImplementation(Deps.testRunner)
    testImplementation(Deps.testRules)
    testImplementation(Deps.espresso)
    testImplementation(Deps.junit)
    testImplementation(Deps.coroutinesTest)
    testImplementation(Deps.coroutinesDebug)
}

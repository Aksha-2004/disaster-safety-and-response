buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.2.0")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

subprojects {
    afterEvaluate {
        extensions.findByName("android")?.let {
            val androidExt = it as com.android.build.gradle.BaseExtension
            androidExt.compileSdkVersion(35)
            androidExt.defaultConfig {
                minSdk = 21
                targetSdk = 35
            }
        }
    }
}


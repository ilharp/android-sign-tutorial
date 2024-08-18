// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false

    alias(libs.plugins.spotless)
}

spotless {
    kotlin {
        target("**/*.kt")
        ktlint("1.2.1")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }

    kotlinGradle {
        target("**/*.kts")
        ktlint("1.2.1")
        trimTrailingWhitespace()
        indentWithSpaces()
        endWithNewline()
    }
}

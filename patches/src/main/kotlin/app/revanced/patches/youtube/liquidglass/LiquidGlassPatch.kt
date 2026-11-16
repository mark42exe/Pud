package app.revanced.patches.youtube.liquidglass

import app.revanced.patcher.patch.bytecodePatch

/**
 * Build scaffold only.
 *
 * The YouTube 20.40.45 navigation implementation has not yet been fingerprinted.
 * Do not add guessed method/resource targets here: inspect the target APK first.
 */
@Suppress("unused")
val liquidGlassNavigation = bytecodePatch(
    name = "Liquid Glass navigation (scaffold)",
    description = "Scaffold only; does not modify YouTube yet.",
) {
    compatibleWith("com.google.android.youtube"("20.40.45"))

    execute {
        // Intentionally empty until verified 20.40.45 fingerprints are available.
    }
}

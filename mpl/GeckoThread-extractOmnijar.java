/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */

// OnionzWeb's one change to Tor Browser for Android 16.0.2 (GeckoView 153.7.0esr).
//
// File:   mobile/android/geckoview/src/main/java/org/mozilla/gecko/GeckoThread.java
// Class:  org.mozilla.gecko.GeckoThread
// Method: static File extractOmnijar(Context context)
//
// Upstream, this method copies the engine's resource file (omni.ja) out of the app
// into the app's private storage and returns that copy. In OnionzWeb the same method
// returns the app's own installed package instead, because omni.ja is stored inside
// the OnionzWeb app file, uncompressed. Gecko reads it there through its existing
// support for archives inside archives. Nothing else in GeckoThread changes, and no
// other engine code, native library or omni.ja content is modified.
//
// The method's name, signature and access flags are kept. Its new body is exactly:

    static File extractOmnijar(final Context context) {
        return new File(context.getPackageResourcePath());
    }

// The change is applied when the app is built, to the compiled engine taken from
// the published Tor Browser for Android 16.0.2 (ARM64) app. The complete source code of
// that release, including the unmodified GeckoThread.java, is published by the
// Tor Project:
// https://dist.torproject.org/torbrowser/16.0.2/src-firefox-tor-browser-153.7.0esr-16.0-1-build2.tar.xz

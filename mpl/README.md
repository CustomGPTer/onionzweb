# Changed engine code (MPL-2.0)

OnionzWeb carries Tor Browser for Android 16.0.2 (GeckoView 153.7.0esr), which is covered by the
Mozilla Public License 2.0. OnionzWeb changes one method in one engine file, so that the engine reads
its resource file from inside the app instead of copying it out.

That change is here in source form: [GeckoThread-extractOmnijar.java](GeckoThread-extractOmnijar.java).

Everything else in the engine is used as Tor Browser publishes it. Its complete source code is at
https://dist.torproject.org/torbrowser/16.0.2/src-firefox-tor-browser-153.7.0esr-16.0-1-build2.tar.xz

The MPL-2.0 text: https://mozilla.org/MPL/2.0/

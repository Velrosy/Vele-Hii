[README.md](https://github.com/user-attachments/files/32782547/README.md)
# Vele-Hii# Vele Presence (personal build)

Private Android app to customize your own Discord presence (platform spoofing, dual mode, voice stay, AFK auto-reply).

- No telemetry: the app talks only to `discord.com` / `gateway.discord.gg`.
- Token stored with EncryptedSharedPreferences (Android Keystore); backups disabled; screenshots blocked.
- **Keep online 24/7** is OFF by default: closing/stopping the app sets the account offline.
- Set your own Discord *Application ID* in the app if you want images/buttons.

## Build
Push to a **private** GitHub repo -> Actions -> "Run workflow" -> download the `Discord-Activity-Status-APK` artifact.
Or: Android Studio (JDK 17) -> Build > Build APK(s).

> Using a user token is against Discord's ToS and can get the account banned. Use at your own risk; never share the APK or token.

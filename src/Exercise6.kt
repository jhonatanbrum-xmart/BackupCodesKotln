fun exercise6() {
    val favoriteApps = listOf("IntelliJ IDEA", "Android Studio", "WhatsApp", "TikTok", "Discord")
    val randomApp = "TikTok"
    if (favoriteApps.contains(randomApp)) {
        println("The app: $randomApp is part of your favourite apps.")
    } else {
        println("The app: $randomApp isn't part of your favourite apps.")
    }
}
package com.vele.discordactivity.data.models

import com.google.gson.annotations.SerializedName

data class DiscordPresence(
    @SerializedName("game_name") val gameName: String = "Visual Studio Code",
    
    @SerializedName("enable_details") val enableDetails: Boolean = true,
    @SerializedName("details") val details: String = "Developing awesome apps 🚀",
    
    @SerializedName("enable_state") val enableState: Boolean = true,
    @SerializedName("state") val state: String = "In Match (Score: 12 - 10)",
    
    @SerializedName("enable_large_image") val enableLargeImage: Boolean = true,
    @SerializedName("large_image") val largeImage: String = "",
    @SerializedName("large_text") val largeText: String = "Vele - Coding",
    
    @SerializedName("enable_small_image") val enableSmallImage: Boolean = true,
    @SerializedName("small_image") val smallImage: String = "",
    @SerializedName("small_text") val smallText: String = "Kotlin 1.9.23",
    
    @SerializedName("show_timer") val showTimer: Boolean = true,
    
    @SerializedName("enable_button1") val enableButton1: Boolean = true,
    @SerializedName("button1_label") val button1Label: String = "",
    @SerializedName("button1_url") val button1Url: String = "",
    
    @SerializedName("enable_button2") val enableButton2: Boolean = true,
    @SerializedName("button2_label") val button2Label: String = "",
    @SerializedName("button2_url") val button2Url: String = "",
    
    @SerializedName("start_timestamp") val startTimestamp: Long = System.currentTimeMillis()
)

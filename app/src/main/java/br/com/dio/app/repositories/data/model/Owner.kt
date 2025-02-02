package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName

data class Owner (
    val login: String,
    val id: Long,
    val nodeID: String,
    @SerializedName("avatar_url")
    val avatarURL: String,
    val gravatarID: String,
    val url: String,
    val htmlURL: String,
    val followersURL: String,
    val followingURL: String,
    val gistsURL: String,
    val starredURL: String,
    val subscriptionsURL: String,
    val organizationsURL: String,
    val reposURL: String,
    val eventsURL: String,
    val receivedEventsURL: String,
    val type: String,
    val siteAdmin: Boolean
)

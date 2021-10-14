package br.com.dio.app.repositories.data.model

import com.google.gson.annotations.SerializedName


data class Repo (
    val id: Long,
    val nodeID: String,
    val name: String,
    val description: String,
    @SerializedName("stargazers_count")
    val stargazersCount:Long,
    val fullName: String,
    val language: String,
    @SerializedName("html_url")
    val htmlUrl:String,
    val private: Boolean,
    val owner: Owner
)
package br.com.dio.app.repositories.data.model



data class Repo (
    val id: Long,
    val nodeID: String,
    val name: String,
    val fullName: String,
    val private: Boolean,
    val owner: Owner
)
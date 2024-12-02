package com.example.tp_etudiant.models


data class Etudiant(
    val id: Int,
    val firstname: String,
    val lastname: String,
    val age: String,
    val image: String,
    ){

    override fun toString(): String {
        return "$firstname $lastname"
    }

}









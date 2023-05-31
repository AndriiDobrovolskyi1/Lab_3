package com.andrii.lab_3.data

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize
data class CharacterResponse (
    val info: Info,
    val results: List<Character>
)

data class Info (
    val count: Long,
    val pages: Long,
    val next: String,
    val prev: String
)
@Parcelize
data class Character (
    val id: Long,
    val name: String,
    val status: String,
    val species: String,
    val type: String,
    val gender: String,
    val image: String,
    val episode: List<String>,
    val url: String,
    val created: String
):Parcelable



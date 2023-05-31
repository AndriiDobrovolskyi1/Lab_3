package com.andrii.lab_3.data

import android.os.Parcelable

import kotlinx.android.parcel.Parcelize
@Parcelize
data class Character(
    val name:String,
    val image:String
):Parcelable

data class CharacterResponse(val results:List<Character>)


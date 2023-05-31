package com.andrii.lab_3.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.andrii.lab_3.data.HomeRepository
import com.andrii.lab_3.data.Character
import kotlinx.coroutines.launch

class HomeViewModel:ViewModel() {
    val characters:MutableLiveData<List<Character>> = MutableLiveData()
    val repository = HomeRepository
    val error:MutableLiveData<String> = MutableLiveData()
    fun getCharacters(page:Int) {
        viewModelScope.launch {
            try{
                val result = repository.fetchCharacters(page)
                characters.postValue(result)
            }
            catch (e:Exception){
                error.postValue(e.message)
            }
        }

    }
}
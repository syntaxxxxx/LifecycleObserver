package com.hightech.lifecycleobserver

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _person = MutableLiveData<String>()
    val person : LiveData<String>
    get() = _person

    fun fetchNameWithSetValue() {
        _person.value = "Kece"
    }

    private val _personWithPost = MutableLiveData<String>()
    val personWithPost : LiveData<String>
        get() = _personWithPost

    fun fetchNameWithPostValue() {
        _personWithPost.postValue("Ganteng")
    }

}
package com.example.tp_etudiant.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DataViewModel : ViewModel() {
    private val _data = MutableLiveData<ArrayList<Etudiant>>()
    val data: LiveData<ArrayList<Etudiant>> get() = _data

    fun initData() {
        val initialData = arrayListOf<Etudiant>()
        _data.value = initialData
    }

    fun initDataebug() {
        _data.value?.add(
            Etudiant(
                15, "ROCHE", "Oceane", "22/01/2003", "http://michael.moser.free.fr/img/2024/ROCHE.jpg"
            )
        )

        _data.value?.add(
            Etudiant(
                16, "ROMANENKO", "Pavlo", "05/10/2004", "http://michael.moser.free.fr/img/2024/ROMANENKO.jpg"
            )
        )
    }

    fun updateData(data: ArrayList<Etudiant>) {
        _data.value = data
    }

}
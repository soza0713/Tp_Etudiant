package com.example.tp_etudiant.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.tp_etudiant.databinding.ItemEtudiantsBinding
import com.example.tp_etudiant.models.Etudiant

class MyHolder (private val binding : ItemEtudiantsBinding) : RecyclerView.ViewHolder(binding.root) {
    fun  bind(etudiant: Etudiant){
        binding.etudiant = etudiant
    }
}
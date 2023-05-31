package com.andrii.lab_3.presentation.home

import android.view.LayoutInflater
import com.andrii.lab_3.data.Character
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.andrii.lab_3.R
import androidx.navigation.NavDirections
import androidx.navigation.ActionOnlyNavDirections



class MainAdapter(var charactersList:List<Character>):RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    class MainViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.name)
        val image = itemView.findViewById<ImageView>(R.id.image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.rv_item, parent,false))
    }



    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val character = charactersList[position]
        holder.name.text = character.name
        holder.image.load(character.image){
            transformations(CircleCropTransformation())
        }
        holder.itemView.setOnClickListener { view ->
            val action = HomeFragmentDirections.actionHomeFragmentToDetailsFragment(character)
            view.findNavController().navigate(action)
        }
    }
    override fun getItemCount(): Int = charactersList.size

}
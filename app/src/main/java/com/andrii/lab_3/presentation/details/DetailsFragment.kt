package com.andrii.lab_3.presentation.details

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

import com.andrii.lab_3.R
import com.bumptech.glide.Glide


class DetailsFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: DetailsFragmentArgs by navArgs ()
        val character = args.transfer
        val name: TextView = view.findViewById(R.id.nameCharacter)
        val image: ImageView = view.findViewById(R.id.imageView)
        val gender: TextView = view.findViewById(R.id.gender)
        val status: TextView = view.findViewById(R.id.status)
        val type: TextView = view.findViewById(R.id.type)
        name.text = character.name
        gender.text = character.gender
        status.text = character.status
        type.text = character.type
        Glide.with(view)
            .load(character.image)
            .into(image)
    }

}
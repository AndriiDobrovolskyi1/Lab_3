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
import com.andrii.lab_3.databinding.FragmentDetailsBinding
import com.andrii.lab_3.databinding.FragmentHomeBinding
import com.bumptech.glide.Glide


class DetailsFragment : Fragment() {
    private lateinit var binding: FragmentDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val args: DetailsFragmentArgs by navArgs ()
        val character = args.transfer
        binding.nameCharacter.text = character.name
        binding.gender.text = character.gender
        binding.status.text = character.status
        binding.type.text = character.type
        Glide.with(view)
            .load(character.image)
            .into(binding.imageView)
    }

}
package com.example.autobahngame.player

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.autobahngame.R
import com.example.autobahngame.databinding.AddPlayerFragmentBinding

class AddPlayerFragment: Fragment() {
    // DataBinding
    private lateinit var binding: AddPlayerFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initialize DataBinding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.add_player_fragment,
            container,
            false
        )
        binding.buttonNext.setOnClickListener {
            fromAddPlayerFragmentToMainGameFragment()
        }

        return binding.root
    }

    private fun fromAddPlayerFragmentToMainGameFragment() {
        findNavController().navigate(AddPlayerFragmentDirections.actionAddPlayerFragmentToMainGameFragment2())
    }

}

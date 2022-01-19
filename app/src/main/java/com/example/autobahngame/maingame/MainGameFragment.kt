package com.example.autobahngame.maingame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.autobahngame.R
import com.example.autobahngame.databinding.MaingameFragmentBinding

class MainGameFragment : Fragment() {

    // DataBinding
    private lateinit var binding: MaingameFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initialize DataBinding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.maingame_fragment,
            container,
            false
        )
        binding.buttonNext.setOnClickListener {
            fromMainGameFragmentToEndGameFragment()
        }

        return binding.root
    }

    private fun fromMainGameFragmentToEndGameFragment() {
        findNavController().navigate(MainGameFragmentDirections.actionMainGameFragment2ToEndGameFragment())
    }

}
package com.example.autobahngame.nedgame

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.autobahngame.R
import com.example.autobahngame.databinding.EndgameFragmentBinding
import com.google.android.material.snackbar.Snackbar

class EndGameFragment : Fragment() {

    // DataBinding
    private lateinit var binding: EndgameFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Initialize DataBinding
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.endgame_fragment,
            container,
            false
        )
        binding.buttonEnd.setOnClickListener {
            Snackbar.make(binding.root, "Ende!", Snackbar.LENGTH_SHORT)
                .show()
        }

        return binding.root
    }
}

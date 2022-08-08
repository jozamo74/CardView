package com.example.mdtop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mdtop.databinding.FragmentCardViewBinding


class CardViewFragment : Fragment(R.layout.fragment_card_view) {


  private lateinit var binding: FragmentCardViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentCardViewBinding.bind(view)

        super.onViewCreated(view, savedInstanceState)
    }


}
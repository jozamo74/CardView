package com.example.mdtop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.mdtop.databinding.FragmentCardViewBinding
import com.example.mdtop.databinding.FragmentHomeBinding


class HomeFragment : Fragment(R.layout.fragment_home) {



    /*override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }*/

    private lateinit var binding: FragmentHomeBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding = FragmentHomeBinding.bind(view)
        super.onViewCreated(view, savedInstanceState)

        binding.btnCardView.setOnClickListener {
            Toast.makeText(context, "Pulsado carview", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.cardViewFragment2)
        }


    }

}
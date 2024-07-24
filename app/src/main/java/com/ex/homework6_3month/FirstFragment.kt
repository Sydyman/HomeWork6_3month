package com.ex.homework6_3month

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ex.homework6_3month.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var binding: FragmentFirstBinding
    private lateinit var adapter: FighterAdapter
    private val fighters: ArrayList<Fighters> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Инициализация данных
        fighters.add(Fighters("https://image-cdn.essentiallysports.com/wp-content/uploads/WhatsApp-Image-2022-08-15-at-3.39.00-PM.jpeg", "RORY"))
        fighters.add(Fighters("https://qph.cf2.quoracdn.net/main-qimg-0d02e442a2d6b647544aede9579891df-lq", "Alistair Overeem"))
        fighters.add(Fighters("https://img2.thejournal.ie/article/3000032/river/?height=400&version=3000048", "Nate Diaz"))
        fighters.add(Fighters("https://staticg.sportskeeda.com/wp-content/uploads/2015/07/macdonald-1436018004-800.jpg", "RORY"))
        fighters.add(Fighters("https://staticg.sportskeeda.com/wp-content/uploads/2015/07/macdonald-1436018004-800.jpg", "RORY"))


        adapter = FighterAdapter(fighters)


        binding.rvFighters.adapter = adapter
    }
}

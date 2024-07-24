package com.ex.homework6_3month

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.ex.homework6_3month.databinding.ItemFightersBinding

class FighterAdapter(private val fighters: ArrayList<Fighters>) : RecyclerView.Adapter<FighterAdapter.FightersHolder>() {

    class FightersHolder(item: View) : RecyclerView.ViewHolder(item) {
        private val binding = ItemFightersBinding.bind(item)

        fun bind(fighter: Fighters) = with(binding) {
            Glide.with(itemView.context)
                .load(fighter.imageId)
                .into(ivFighters)
            tvFighter.text = fighter.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FightersHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_fighters, parent, false)
        return FightersHolder(view)
    }

    override fun getItemCount(): Int {
        return fighters.size
    }

    override fun onBindViewHolder(holder: FightersHolder, position: Int) {
        holder.bind(fighters[position])
    }
}

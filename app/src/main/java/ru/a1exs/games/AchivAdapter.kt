package ru.a1exs.games

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.a1exs.games.databinding.RvAchivBinding

class AchivAdapter(private val context: Context, val list: ArrayList<Int>) :
    RecyclerView.Adapter<AchivAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.rv_achiv, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = RvAchivBinding.bind(holder.itemView)

        binding.achiv.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

}
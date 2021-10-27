package ru.a1exs.games

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.a1exs.games.databinding.VpPicsBinding

class PicAdapter(private val context: Context, private val list: ArrayList<Int>) : RecyclerView.Adapter<PicAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.vp_pics, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = VpPicsBinding.bind(holder.itemView)

        binding.pic.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
}
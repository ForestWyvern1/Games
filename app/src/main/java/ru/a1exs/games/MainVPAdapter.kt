package ru.a1exs.games

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import ru.a1exs.games.databinding.MainVpItemViewBinding

class MainVPAdapter(private val context: Context, val list: ArrayList<VpModel>) :
    RecyclerView.Adapter<MainVPAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater.from(context).inflate(R.layout.main_vp_item_view, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = MainVpItemViewBinding.bind(holder.itemView)

        binding.background.setImageDrawable(list[position].poster)
        binding.friends.text = list[position].friends + " уже играют"
        binding.gameName.text = list[position].name
        binding.description.text = list[position].descrtiption
        binding.age.text = list[position].age.toString() + "+"
        binding.genres.text = list[position].genres

        binding.button.setOnClickListener {
            val intent = Intent(context, AboutActivity::class.java)
                .putExtra("name", list[position].name)
                .putExtra("age", list[position].age)
                .putExtra("description", list[position].descrtiption)
                .putExtra("friends", list[position].friends)
                .putExtra("genres", list[position].genres)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = list.size


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}
package ru.a1exs.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import ru.a1exs.games.databinding.ActivityAboutBinding

class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityAboutBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val description = intent.getStringExtra("description")
        val age = intent.getIntExtra("age", 18)
        val friends = intent.getStringExtra("friends")
        val genres = intent.getStringExtra("genres")

        binding.name.text = name
        binding.description.text = description
        binding.age.text = "$age+"
        binding.genres.text = genres
        binding.friends.text = "$friends уже играют"

        val list = ArrayList<Int>()

        list.add(R.drawable.first_pic)
        list.add(R.drawable.second_pic)
        list.add(R.drawable.third_pic)
        list.add(R.drawable.fourth_pic)

        binding.picsViewPager.adapter = PicAdapter(this, list)

        val listAchiv = ArrayList<Int>()
        listAchiv.add(R.drawable.achiv_1)
        listAchiv.add(R.drawable.achiv_2)
        listAchiv.add(R.drawable.achiv_3)
        listAchiv.add(R.drawable.achiv_4)
        listAchiv.add(R.drawable.achiv_5)
        listAchiv.add(R.drawable.achiv_6)
        listAchiv.add(R.drawable.achiv_7)

        binding.achievments.adapter = AchivAdapter(this, listAchiv)
        binding.achievments.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)


        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }

    }
}
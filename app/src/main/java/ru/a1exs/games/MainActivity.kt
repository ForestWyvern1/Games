package ru.a1exs.games

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import ru.a1exs.games.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.black)

        val list = ArrayList<VpModel>()

        list.add(
            VpModel(
                "Ведьмак 3: Дикая Охота",
                "Ролевые игры",
                "12 друзей",
                18,
                getString(R.string.stringFirstDescription),
                getDrawable(R.drawable.game_3)!!
            )
        )

        list.add(
            VpModel(
                "Одни из нас. Часть II",
                "Action • Adventure ",
                "2 друга",
                18,
                getString(R.string.stringSecondDescription),
                getDrawable(R.drawable.game_2)!!
            )
        )

        list.add(
            VpModel(
                "Dead by Daylight ",
                "Horror • Survival • Multiplayer ",
                "5 друзей",
                18,
                getString(R.string.stringThirdDescription),
                getDrawable(R.drawable.game_1)!!
            )
        )

        binding.mainVP.registerOnPageChangeCallback(object:ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                if (position == 0){
                    binding.currentItem.setImageResource(R.drawable.item_1)
                }
                else if (position == 1){
                    binding.currentItem.setImageResource(R.drawable.item_2)
                }
                else {
                    binding.currentItem.setImageResource(R.drawable.item_3)
                }
            }
        })

        binding.mainVP.adapter = MainVPAdapter(this, list)
        binding.mainVP.orientation = ViewPager2.ORIENTATION_VERTICAL


    }
}
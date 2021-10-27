package ru.a1exs.games

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.a1exs.games.databinding.ActivityPaymentBinding

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val binding = ActivityPaymentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.backButton.setOnClickListener {
            super.onBackPressed()
        }
    }
}
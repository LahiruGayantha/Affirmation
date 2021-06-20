package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.data.DataSource
import com.example.affirmation.databinding.ActivityMainBinding
import com.example.affirmation.model.Affirmation

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Assign new adapter to recyclerView
        binding.recyclerView.adapter = ItemAdapter(this, DataSource().loadAffirmation())
        binding.recyclerView.setHasFixedSize(true)

    }


}
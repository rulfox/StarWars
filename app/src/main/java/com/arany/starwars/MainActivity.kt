package com.arany.starwars

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.arany.starwars.data.api.Resource
import com.arany.starwars.data.api.Status
import com.arany.starwars.presentation.character.CharacterSearchViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val searchViewModel: CharacterSearchViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchViewModel.searchCharacter("l").observe(this) {
            when (it.status) {
                Status.LOADING -> findViewById<TextView>(R.id.helloWorld).text = "Loading"
                Status.SUCCESS -> findViewById<TextView>(R.id.helloWorld).text = "Size ${it.data?.size}"
                Status.ERROR -> findViewById<TextView>(R.id.helloWorld).text = "Error ${it.message}"
            }
        }
    }
}
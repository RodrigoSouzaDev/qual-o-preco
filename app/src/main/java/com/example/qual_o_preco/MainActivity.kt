package com.example.qual_o_preco

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.qual_o_preco.database.AppDatabase
import com.example.qual_o_preco.databinding.ActivityMainBinding
import com.example.qual_o_preco.model.IngredienteModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var ingrediente = IngredienteModel("Açúcar","União",3.89,1000,"g")
        val database = AppDatabase.getDatabase(baseContext)
        GlobalScope.launch {
            database.IngredienteDao().insert(ingrediente)
        }
    }
}
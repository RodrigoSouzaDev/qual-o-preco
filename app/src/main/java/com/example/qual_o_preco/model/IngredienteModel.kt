package com.example.qual_o_preco.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "table_ingredientes")
class IngredienteModel (
        var nome: String ,
        var marca: String,
        var valor: Double,
        var quantidade: Int,
        var unidMedida: String
        )
{
        @PrimaryKey(autoGenerate = true)
        var id: Int = 0
}
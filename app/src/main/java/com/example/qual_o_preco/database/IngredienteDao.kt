package com.example.qual_o_preco.database

import androidx.room.*
import com.example.qual_o_preco.model.IngredienteModel
import kotlinx.coroutines.flow.Flow

@Dao
interface IngredienteDao {

    @Insert
    suspend fun insert (ingredienteModel: IngredienteModel)

    @Update
    suspend fun update (ingredienteModel: IngredienteModel)

    @Delete
    suspend fun delete (ingredienteModel: IngredienteModel)

    @Query("SELECT * FROM table_ingredientes WHERE id = :id")
    fun getIngredienteModel(id: Int): Flow<IngredienteModel>

    @Query("SELECT * FROM table_ingredientes")
    fun getAllIngredienteModel(): Flow<List<IngredienteModel>>

}
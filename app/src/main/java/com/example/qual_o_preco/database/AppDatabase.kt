package com.example.qual_o_preco.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.qual_o_preco.model.IngredienteModel

@Database(entities = [IngredienteModel::class], version = 1)
abstract class AppDatabase : RoomDatabase(){

    abstract fun IngredienteDao(): IngredienteDao

    companion object {

        private const val DATABASE_NAME: String = "Banco_de_dados"

        @Volatile
        private var INSTANCE:AppDatabase? = null

        fun getDatabase (context: Context): AppDatabase
        {
            val tempInstance = INSTANCE
            if(tempInstance != null)
            {
                return tempInstance
            }
            synchronized(this)
            {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}
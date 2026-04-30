package com.example.financeapp.data.database

import androidx.room.TypeConverter
import com.example.financeapp.data.model.ExpenseCategory

class Converters {

    @TypeConverter
    fun fromExpenseCategory(category: ExpenseCategory): String {
        return category.name
    }

    @TypeConverter
    fun toExpenseCategory(value: String): ExpenseCategory {
        return ExpenseCategory.valueOf(value)
    }
}
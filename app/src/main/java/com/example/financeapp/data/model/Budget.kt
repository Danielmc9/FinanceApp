package com.example.financeapp.data.model

import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Month
import java.time.Year

/**
 * Budget - Entidad que representa un presupuesto
 */
@Entity(tableName = "budgets")
data class Budget(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val category: ExpenseCategory,
    val monthlyLimit: Double,
    val month: Int,
    val year: Int,
    val createdAt: Long = System.currentTimeMillis()
)
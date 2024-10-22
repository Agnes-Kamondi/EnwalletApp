package com.agnes.enwallet

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.agnes.enwallet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvTransactions.layoutManager = LinearLayoutManager(this)
        displayTransactions()
    }

    fun displayTransactions() {
        val transaction1 = TransactionItem(
            title = "Salary",
            amount = "Kes 4000",
            date = "1 july 2024",
            isIncome = true
        )
        val transaction2 = TransactionItem(
            title = "Electricity",
            amount = "Kes 1500",
            date = "2 july 2024",
            isIncome = false
        )
        val transaction3 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction4 = TransactionItem(
            title = "Dividends",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = true
        )
        val transaction5 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction6 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction7 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction8 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction9 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction10 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )
        val transaction11 = TransactionItem(
            title = "Rent",
            amount = "Kes 10000",
            date = "5 july 2024",
            isIncome = false
        )

        val transactionList = listOf(transaction1, transaction2, transaction3, transaction4, transaction5, transaction6, transaction7, transaction8, transaction9, transaction10,transaction11)
        val transactionAdapter = TransactionAdapter(transactionList)
        binding.rvTransactions.adapter = transactionAdapter
    }
}

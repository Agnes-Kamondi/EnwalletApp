package com.agnes.enwallet


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdapter(var transactionList: List<TransactionItem>) :
    RecyclerView.Adapter<TransactionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.income_list_view, parent, false)
        return TransactionViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.tvTitle.text = transaction.title
        holder.tvAmount.text = transaction.amount
        holder.tvDate.text = transaction.date
        holder.ivIcon.setImageResource(transaction.imageResource)
    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}

class TransactionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
    val tvAmount = itemView.findViewById<TextView>(R.id.tvAmount)
    val tvDate = itemView.findViewById<TextView>(R.id.tvDate)
    val ivIcon = itemView.findViewById<ImageView>(R.id.ivIcon)
}

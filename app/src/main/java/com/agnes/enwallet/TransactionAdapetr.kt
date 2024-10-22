package com.agnes.enwallet


import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.agnes.enwallet.databinding.IncomeListViewBinding

class TransactionAdapter(var transactionList: List<TransactionItem>) :
    RecyclerView.Adapter<TransactionViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionViewHolder {
        var binding = IncomeListViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
       return TransactionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TransactionViewHolder, position: Int) {
        val transaction = transactionList[position]
        holder.binding.tvTitle.text = transaction.title
        holder.binding.tvAmount.text = transaction.amount
        holder.binding.tvDate.text = transaction.date
        if (transaction.isIncome){
            holder.binding.ivIcon.setImageResource(R.drawable.income_trx)
        }

        else{
            holder.binding.ivIcon.setImageResource(R.drawable.expense_trx)
        }

    }

    override fun getItemCount(): Int {
        return transactionList.size
    }
}

class TransactionViewHolder(val binding:IncomeListViewBinding):
    RecyclerView.ViewHolder(binding.root)
//package com.agnes.blogreader
//
//import android.annotation.SuppressLint
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.agnes.blogreader.databinding.BlogListViewBinding
//import com.squareup.picasso.Picasso
//
//class BlogAdapter(var blogList: List<Blog>) : RecyclerView.Adapter<BlogViewHolder>() {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BlogViewHolder {
//        var binding = BlogListViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
//        return BlogViewHolder(binding)
//    }
//
//
//    override fun getItemCount(): Int {
//        return blogList.size
//    }
//
//    @SuppressLint("SetTextI18n")
//    override fun onBindViewHolder(holder: BlogViewHolder, position: Int) {
//        val blog = blogList[position]
//        holder.binding.tvTitle.text = blog.title
//        holder.binding.tvAuthorName.text = blog.authorName
//        holder.binding.tvPublishingDate.text = blog.publishingDate
//
//
//        if (blog.summary.length > 100) {
//            holder.binding.tvSummary.text = "${blog.summary.substring(0, 100)}..."
//            holder.binding.tvSeeMore.visibility = View.VISIBLE
//            holder.binding.tvSeeMore.setOnClickListener {
//                if (holder.binding.tvSeeMore.text == "See More") {
//                    holder.binding.tvSummary.text = blog.summary
//                    holder.binding.tvSeeMore.text = "See Less"
//                } else {
//                    holder.binding.tvSummary.text = "${blog.summary.substring(0, 100)}..."
//                    holder.binding.tvSeeMore.text = "See More"
//                }
//            }
//        } else {
//            holder.binding.tvSummary.text = blog.summary
//            holder.binding.tvSeeMore.visibility = View.GONE
//        }
//
//        Picasso
//            .get()
//            .load(blog.image)
//            .resize(480,240)
//            .centerCrop()
//            .into(holder.binding.ivBlog)
//    }
//
//}
//
//class BlogViewHolder(val binding: BlogListViewBinding):
//    RecyclerView.ViewHolder(binding.root)

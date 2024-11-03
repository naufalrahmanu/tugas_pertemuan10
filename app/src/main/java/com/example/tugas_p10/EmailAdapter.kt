package com.example.tugas_p10

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emailList: MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_email, parent, false)
        return EmailViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        val email = emailList[position]
        holder.senderTextView.text = email.sender
        holder.subjectTextView.text = email.subject
        holder.dateTextView.text = email.date

        // Set click listener to open the detail activity
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, EmailDetailActivity::class.java)
            intent.putExtra("subject", email.subject)
            intent.putExtra("sender", email.sender)
            intent.putExtra("date", email.date)
            intent.putExtra("body", "Here goes the full email body text") // You can customize the body as per your data
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int = emailList.size

    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val senderTextView: TextView = itemView.findViewById(R.id.textViewSender)
        val subjectTextView: TextView = itemView.findViewById(R.id.textViewSubject)
        val dateTextView: TextView = itemView.findViewById(R.id.textViewDate)
        val profileImageView: ImageView = itemView.findViewById(R.id.imageViewProfile)
    }
}

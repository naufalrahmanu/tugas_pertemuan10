package com.example.tugas_p10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView

class EmailDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email_detail)

        val subject = intent.getStringExtra("subject")
        val sender = intent.getStringExtra("sender")
        val date = intent.getStringExtra("date")
        val body = intent.getStringExtra("body")

        val subjectTextView: TextView = findViewById(R.id.detailSubject)
        val senderTextView: TextView = findViewById(R.id.detailSender)
        val dateTextView: TextView = findViewById(R.id.detailDate)
        val bodyTextView: TextView = findViewById(R.id.detailBody)

        subjectTextView.text = subject
        senderTextView.text = sender
        dateTextView.text = date
        bodyTextView.text = body
    }
}
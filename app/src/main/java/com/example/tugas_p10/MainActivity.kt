package com.example.tugas_p10

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var emailAdapter: EmailAdapter
    private lateinit var emailList: MutableList<Email>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        emailList = mutableListOf(
            Email("fefefufu", "Pemberitahuan, sarapan gratis akan segera dimulai", "20 Oct"),
            Email("Ronaldo", "AKULAH GOAT TERBAIK SEPANJANG MASA", "20 Oct"),
            Email("Messi", "Jangan dengerin bang cr, sesat itu", "20 Oct"),
            Email("PT NGANG NGONG IND", "Pemberitahuan penerimaan kerja", "20 Oct"),
            Email("futufafa", "Pemberitahuan, makan siang gratis", "20 Oct")
        )

        emailAdapter = EmailAdapter(emailList)
        recyclerView.adapter = emailAdapter
    }
}
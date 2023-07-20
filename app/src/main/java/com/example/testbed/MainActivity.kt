package com.example.testbed

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Process
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var process_name = Process.myProcessName()
        var pid = Process.myPid()
        var tid = Process.myTid()
        val textViewProcssName = findViewById<TextView>(R.id.process_name)
        textViewProcssName.text = "Process Name: $process_name"
        val textViewProcessId = findViewById<TextView>(R.id.process_id)
        textViewProcessId.text = "Process ID: $pid"
        val textViewThreadId = findViewById<TextView>(R.id.thread_id)
        textViewThreadId.text = "Thread ID: $tid"

    }
}
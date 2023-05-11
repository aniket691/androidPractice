package com.example.androidpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.example.androidpractice.databinding.ActivityContexualMenuBinding
import com.example.androidpractice.databinding.ActivitySnackBarBinding
import com.google.android.material.snackbar.Snackbar

class SnackBarActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySnackBarBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySnackBarBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button2.setOnClickListener(View.OnClickListener { view ->
            Snackbar.make(view, "button2", Snackbar.LENGTH_SHORT).show()
        })

        binding.button3.setOnClickListener(View.OnClickListener { view ->
            Snackbar.make(view, "button3", Snackbar.LENGTH_SHORT)
                .setAction("UNDO") {
                    // Action callback
                    // Perform your desired action here
                }
                .show()
        })
        binding.button4.setOnClickListener(View.OnClickListener { view ->
            Snackbar.make(view, "button3", Snackbar.LENGTH_SHORT)
                .setActionTextColor(ContextCompat.getColor(this, R.color.colorPrimary))
                .setAction("UNDO") {
                    // Action callback
                    // Perform your desired action here
                }.show()
        })

    }
}
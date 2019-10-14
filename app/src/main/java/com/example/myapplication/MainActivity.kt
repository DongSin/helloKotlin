package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonShowName: Button = findViewById(R.id.buttonShowName)
//        buttonShowName.setOnClickListener(showName());
        buttonShowName.setOnClickListener(View.OnClickListener {
            textViewName.text = "Button clicked!";
        })
    }

//    private fun showName(): View.OnClickListener? {
//        textViewName.text = "Button clicked!";
//        return;
//    }
}

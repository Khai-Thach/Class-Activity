package edu.temple.classactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
    import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var buttonOne: Button
    lateinit var buttonTwo: Button
    lateinit var guard: CheckBox
    lateinit var text: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonOne = findViewById(R.id.button)
        buttonTwo = findViewById(R.id.button2)
        guard = findViewById(R.id.checkBox)
        text = findViewById(R.id.textView)

        buttonOne.isEnabled = guard.isChecked
        buttonTwo.isEnabled = guard.isChecked

        guard.setOnCheckedChangeListener { _, isChecked ->
            buttonOne.isEnabled = isChecked
            buttonTwo.isEnabled = isChecked
        }

        buttonOne.setOnClickListener{text.text = "Left button accessed."}
        buttonTwo.setOnClickListener{text.text = "Right button accessed."}




    }
}
package ru.borisov.trafficlaws

import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var checkBox: CheckBox
    lateinit var title: TextView
    lateinit var textLaw: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBox = findViewById(R.id.checkboxCB)
        title = findViewById(R.id.titleTV)
        textLaw = findViewById(R.id.lawsTV)
        checkBox.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                title.text = resources.getString(R.string.text_traffic_laws)
                textLaw.text = resources.getString(R.string.text_traffic_laws_list)
            } else {
                title.text = resources.getString(R.string.text_information)
                textLaw.text = ""
            }
        }
    }
}
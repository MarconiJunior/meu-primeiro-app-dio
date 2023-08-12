package br.com.igorbag.meuprimeiroappdio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        translateText(findViewById(R.id.brazil), 1)
        translateText(findViewById(R.id.eua), 2)
        translateText(findViewById(R.id.esp), 3)

    }

    private fun translateText(button: Button, number: Int) {
        val stringRes = when (number) {
            1 -> getString(R.string.text_pt)
            2 -> getString(R.string.text_en)
            3 -> getString(R.string.text_es)
            else -> getString(R.string.text_pt)
        }

        button.setOnClickListener {
            findViewById<TextView>(R.id.textTranslate).text = stringRes
        }
    }
}


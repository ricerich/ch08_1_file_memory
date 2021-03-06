package com.example.ch08_3_file_raw_folder_in_app

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnRead : Button
        var edtRaw : EditText
        btnRead = findViewById<Button>(R.id.btnRead)
        edtRaw = findViewById<EditText>(R.id.edtRaw)

        btnRead.setOnClickListener {
            var inputS = resources.openRawResource(R.raw.raw_test)
            var txt = ByteArray(inputS.available())
            inputS.read(txt)
            edtRaw.setText(txt.toString(Charsets.UTF_8))
            inputS.close()
        }
    }
}

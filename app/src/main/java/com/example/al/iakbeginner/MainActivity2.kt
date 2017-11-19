package com.example.al.iakbeginner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * Created by al on 18/11/17.
 */

class MainActivity2 : AppCompatActivity() { // ':' merupakan pengganti 'extends' pada java

    override fun onCreate(savedInstanceState: Bundle?) { // '?' penegasan bahwa bisa di jalankan walaupun nilai dari onCreate itu null
        // / onCreate merupakan fungsi yang pertama kali di jalankan ketika menjalankan suatu aplikasi

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) //

        //Menambahkan aksi kepada btn yang kita buat tadi di activity main

//        btn_ganti_text.setOnClickListener({
//            txt_test.text = "Hai, Juga!"
//        })

    }

}

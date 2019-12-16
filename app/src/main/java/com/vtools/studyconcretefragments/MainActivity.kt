package com.vtools.studyconcretefragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentManeger = supportFragmentManager
        val fragmentTransaction = fragmentManeger.beginTransaction()
        val fragmentB = FragmentB()

        fragmentTransaction.add(R.id.frame_host,fragmentB)
        fragmentTransaction.commit()

    }
}

package com.azizbek.button_navigation_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.azizbek.button_navigation_kotlin.Fragment.BlankFragment
import com.azizbek.button_navigation_kotlin.Fragment.BlankFragment2
import com.azizbek.button_navigation_kotlin.Fragment.BlankFragment3
import com.azizbek.button_navigation_kotlin.Fragment.BlankFragment4
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomnavigation.setOnNavigationItemSelectedListener { item ->

            when(item.itemId){
                R.id.item1->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment()).commit()}
                R.id.item2->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment2()).commit()}
                R.id.item3->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment3()).commit()}
                R.id.item4->{supportFragmentManager.beginTransaction().replace(R.id.linearlay,BlankFragment4()).commit()}
            }
            true
        }
    }
}
package com.example.myapplication

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*

class post_page : AppCompatActivity() {
    private lateinit var v: View

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.post_page)
        //val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        val lo : ScrollView = ScrollView(this)
        val layoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT)
    lo.layoutParams = layoutParams
        val lin : LinearLayout = LinearLayout(this)
        for (i in 1..10)
        {
      // v = findViewById<View>(R.id.pst_view)
           lin.addView(v)
        }


    }
}
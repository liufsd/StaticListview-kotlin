package com.sk.mobile.view.staticlistview.demo

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import com.sk.mobile.view.staticlistview.Item
import com.sk.mobile.view.staticlistview.StaticListView

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun showToast(message: String?) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        val staticListView: StaticListView = findViewById(R.id.demo_static_list) as StaticListView
        staticListView.config(Item("google", action = {
            showToast(it?.title)
        })
                , Item("github", action = {
            showToast(it?.title)
        })
                , Item("apple", action = {
            showToast(it?.title)
        })
                , Item("android", action = {
            showToast(it?.title)
        })
                , Item("kotlin", action = {
            showToast(it?.title)
        }))
    }
}

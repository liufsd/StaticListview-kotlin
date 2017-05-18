package com.sk.mobile.view.staticlistview.ext

import android.view.View

/**
 * Created by liupeng on 18/05/2017.
 */

fun <T : View> View.findView(id: Int): T = findViewById(id) as T
package com.sk.mobile.view.staticlistview

/**
 * Created by liupeng on 10/05/2017.
 */
data class Item(val title: String, val subTitle: String = "", val itemType: Int = 0, val action: (Item?) -> Unit)
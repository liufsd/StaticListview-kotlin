package com.sk.mobile.view.staticlistview

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.sk.mobile.view.staticlistview.R
import com.sk.mobile.view.staticlistview.ext.findView


/**
 * Created by liupeng on 10/05/2017.
 */
class StaticListView(context: Context?, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context,
        attrs, defStyleAttr) {
    constructor(context: android.content.Context?, attrs: android.util.AttributeSet?) : this(context, attrs, 0)

    private var mRecyclerView: RecyclerView
    private var mAdapter: Adapter

    init {
        View.inflate(context, R.layout.view_staticlist, this)
        mRecyclerView = findView(R.id.recyclerview)
        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        mRecyclerView.layoutManager = layoutManager
        mRecyclerView.addItemDecoration(SimpleDividerItemDecoration(context!!))
        mAdapter = Adapter()
        mRecyclerView.adapter = mAdapter
    }

    fun config(vararg params: Item) {
        mAdapter.addItems(*params)
    }
}


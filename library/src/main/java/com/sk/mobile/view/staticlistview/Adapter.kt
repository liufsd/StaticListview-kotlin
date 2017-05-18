package com.sk.mobile.view.staticlistview

import android.support.v7.widget.RecyclerView
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.sk.mobile.view.staticlistview.R
import com.sk.mobile.view.staticlistview.ext.findView


/**
 * Created by liupeng on 10/05/2017.
 */
class Adapter : RecyclerView.Adapter<Adapter.SampleHolder>() {
    private var mSampleList = mutableListOf<Item>()
    fun addItems(vararg params: Item) {
        mSampleList.addAll(params)
    }

    override fun onCreateViewHolder(parent: ViewGroup, pos: Int): SampleHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_staticlist_item, parent, false)
        return SampleHolder(view)
    }

    override fun onBindViewHolder(holder: SampleHolder, pos: Int) {
        holder.bindData(mSampleList[pos])
    }

    override fun getItemCount(): Int {
        return mSampleList.size
    }

    inner class SampleHolder(mRootView: View) : RecyclerView.ViewHolder(mRootView) {
        var mTitleView: TextView = mRootView.findView(R.id.static_list_item_title)
        var mSubTitleView: TextView = mRootView.findView(R.id.static_list_item_sub_title)
        var mItem: Item? = null

        init {
            mRootView.setOnClickListener {
                mItem?.action?.invoke(mItem)
            }
        }

        fun bindData(data: Item) {
            mItem = data
            mTitleView.text = data.title
            mSubTitleView.text = data.subTitle
            if (TextUtils.isEmpty(data.subTitle)) {
                mSubTitleView.visibility = View.GONE
            }
        }
    }
}
package com.example.mylauncher

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class AppAdapter(
    val context: Context,
    val appList: List<CustomApp>
) : BaseAdapter() {


    override fun getCount(): Int = appList.size

    override fun getItem(p0: Int): CustomApp = appList[p0]

    override fun getItemId(p0: Int): Long = p0.toLong()

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var convertView:View? = null
        if (view == null) {
           convertView = LayoutInflater.from(context).inflate(R.layout.layout_app, parent, false)

        }
        val app = appList.get(position)
        val name : TextView? = convertView?.findViewById(R.id.app_name)
        name?.text = app.appName
          return convertView!!
    }
}
package com.example.mediaalarm

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ItemAlarmAdapter(var context: Context, var arrayList: ArrayList<ItemAlarmList>) :BaseAdapter() {

    override fun getCount(): Int {
        return arrayList.size
    }

    override fun getItem(p0: Int): Any {
       return arrayList.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view:View = View.inflate(context, R.layout.alarm_card, null)

        var description:TextView = view.findViewById(R.id.description)
        var time:TextView = view.findViewById(R.id.time)

        var items:ItemAlarmList = arrayList.get(position)
        description.text = items.title
        time.text = items.detail
        return  view
    }


}
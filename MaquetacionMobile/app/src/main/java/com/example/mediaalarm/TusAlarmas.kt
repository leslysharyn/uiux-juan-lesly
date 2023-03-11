package com.example.mediaalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast
import com.example.mediaalarm.ui.MainActivity

class TusAlarmas : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var listView:ListView? = null
    private var itemAlarmAdapter:ItemAlarmAdapter? = null
    private var arrayList:ArrayList<ItemAlarmList>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tus_alarmas)

        listView= findViewById(R.id.card_list_view)
        arrayList = ArrayList()
        arrayList = SetDataItem()
        itemAlarmAdapter= ItemAlarmAdapter(applicationContext, arrayList!!)
        listView?.adapter = itemAlarmAdapter
        listView?.onItemClickListener = this
    }

    private fun SetDataItem ():ArrayList<ItemAlarmList>{

        var listItem:ArrayList<ItemAlarmList> = ArrayList()
        listItem.add(ItemAlarmList("Tomar Pastilla", "7:00am"))
        listItem.add(ItemAlarmList("Trabajo", "9:00am"))
        listItem.add(ItemAlarmList("Cita Medica", "11:00am"))
        return  listItem
    }

    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        val intent = Intent(this@TusAlarmas, MainActivity::class.java)
        startActivity(intent)
    }
}
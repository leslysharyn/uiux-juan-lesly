package com.example.mediaalarm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView

class TusAlarmas : AppCompatActivity(), AdapterView.OnItemClickListener {

    private var listView:ListView? = null
    private var itemAlarmAdapter:ItemAlarmAdapter? = null
    private var arrayList:ArrayList<ItemAlarmList>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tus_alarmas)
        val button: Button = findViewById(R.id.btagregarAlarma)
        button.setOnClickListener {
            val intent = Intent(this@TusAlarmas, CreateEditAlarma::class.java)
            startActivity(intent)
        }
        val buttonconf: Button = findViewById(R.id.configuracion)
        buttonconf.setOnClickListener {
            val intent = Intent(this@TusAlarmas, Settings::class.java)
            startActivity(intent)
        }
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
        val intent = Intent(this@TusAlarmas, AlarmActive::class.java)
        startActivity(intent)
    }
}
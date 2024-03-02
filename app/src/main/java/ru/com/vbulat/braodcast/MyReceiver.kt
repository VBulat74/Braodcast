package ru.com.vbulat.braodcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(p0 : Context?, p1 : Intent?) {

        when (p1?.action) {

            ACTION_CLICKED ->{
                val count: Int = p1.getIntExtra(EXTRA_COUNT, 0)
                Toast.makeText(
                    p0,
                    "ACTION_CLICKED ($count)",
                    Toast.LENGTH_LONG
                ).show()
            }

            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(
                    p0,
                    "ACTION_BATTERY_LOW)",
                    Toast.LENGTH_LONG
                ).show()
            }

            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = p1.getBooleanExtra("state", false)
                Toast.makeText(
                    p0,
                    "ACTION_AIRPLANE_MODE_CHANGED (${turnedOn.toString()})",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    companion object{

        const val ACTION_CLICKED = "clicked"
        const val EXTRA_COUNT = "count"
    }
}
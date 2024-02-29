package ru.com.vbulat.braodcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(p0 : Context?, p1 : Intent?) {

        when (p1?.action) {
            Intent.ACTION_BATTERY_LOW -> {
                Toast.makeText(
                    p0,
                    "ACTION_BATTERY_LOW)",
                    Toast.LENGTH_LONG
                ).show()
            }

            Intent.ACTION_AIRPLANE_MODE_CHANGED -> {
                val turnedOn = p1.getBooleanExtra("state", false)
                Toast.makeText(p0, "ACTION_AIRPLANE_MODE_CHANGED (${turnedOn.toString()})", Toast.LENGTH_LONG).show()
            }
        }
    }
}
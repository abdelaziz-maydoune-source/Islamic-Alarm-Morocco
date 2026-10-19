package com.islamicalarm.morocco

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.media.RingtoneManager
import android.widget.Toast

class AlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        Toast.makeText(context, "حان موعد التنبيه لصلاة الفجر - مواقيت وزارة الأوقاف", Toast.LENGTH_LONG).show()
        val alarmUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_ALARM)
        val mediaPlayer = MediaPlayer.create(context, alarmUri)
        mediaPlayer.start()
    }
}

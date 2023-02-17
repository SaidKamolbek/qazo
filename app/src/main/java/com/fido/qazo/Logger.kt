package com.fido.qazo

import android.util.Log

class Logger {


    companion object {
        private const val status = true
        private const val TAG = "QAZO_APP"
        fun writeInfoLog(message: String) {
            if (status) if (message.length > 2000) {
                Log.w(TAG, message)
                writeInfoLog(message.substring(2000))
            } else Log.w(TAG, message)
        }
    }
}
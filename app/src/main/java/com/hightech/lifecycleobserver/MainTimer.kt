package com.hightech.lifecycleobserver

import android.os.Handler
import timber.log.Timber

class MainTimer {

    private val handler  = Handler()
    private lateinit var runnable: Runnable

    var secondsCount = 0

    fun startTimer() {
        runnable = Runnable {
            secondsCount ++
            Timber.i("Timer is  at $secondsCount")
            handler.postDelayed(runnable, 1000)
        }
        handler.postDelayed(runnable, 1000)
    }

    fun stopTimer() {
        handler.removeCallbacks(runnable)
    }

}
package com.hightech.lifecycleobserver

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.ViewModelProviders
import timber.log.Timber

class MainActivity : AppCompatActivity(), LifecycleObserver {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainViewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        mainViewModel.person.observe(this, { name ->
            Timber.d("with set is $name")
        })

        mainViewModel.personWithPost.observe(this, { name ->
            Timber.d("with post is $name")
        })

        mainViewModel.fetchNameWithSetValue()
        mainViewModel.fetchNameWithPostValue()
    }
}
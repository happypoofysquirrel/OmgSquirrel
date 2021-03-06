package com.guyverhopkins.omgsquirrel.ui

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.guyverhopkins.omgsquirrel.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottom_navigation.setupWithNavController(Navigation.findNavController(this, R.id.my_nav_host_fragment))

        if (savedInstanceState == null) {
            bottom_navigation.selectedItemId = R.id.sounds
        }

        Log.d("OutputTest", "trest")
    }
}

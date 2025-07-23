package com.gadies.app.ui.about

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.gadies.app.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }
}

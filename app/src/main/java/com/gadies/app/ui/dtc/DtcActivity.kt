package com.gadies.app.ui.dtc

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.gadies.app.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DtcActivity : AppCompatActivity() {

    private val viewModel: DtcViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dtc)
    }
}

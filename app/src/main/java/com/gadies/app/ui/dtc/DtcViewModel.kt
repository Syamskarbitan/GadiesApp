package com.gadies.app.ui.dtc

import androidx.lifecycle.ViewModel
import com.gadies.app.data.ObdManager
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DtcViewModel @Inject constructor(
    private val obdManager: ObdManager
) : ViewModel() {

    // TODO: Expose StateFlows for UI
}

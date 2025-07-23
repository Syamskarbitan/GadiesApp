package com.gadies.app.ui.main

import androidx.lifecycle.ViewModel
import com.gadies.app.data.ConnectionRepository
import com.gadies.app.data.ObdManager
import com.gadies.app.data.PidRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DashboardViewModel @Inject constructor(
    private val connectionRepository: ConnectionRepository,
    private val obdManager: ObdManager,
    private val pidRepository: PidRepository
) : ViewModel() {

    // TODO: Expose StateFlows for UI
}

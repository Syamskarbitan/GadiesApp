package com.gadies.app.data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ObdManager @Inject constructor(
    private val connectionRepository: ConnectionRepository,
    private val pidRepository: PidRepository
) {

    fun initialize() {
        // TODO: Send ATZ, ATE0, etc.
    }

    fun requestDtc() {
        // TODO: Send Mode 03
    }

    fun clearDtc() {
        // TODO: Send Mode 04
    }

    fun requestLiveData(pid: String) {
        // TODO: Send PID command
    }
}

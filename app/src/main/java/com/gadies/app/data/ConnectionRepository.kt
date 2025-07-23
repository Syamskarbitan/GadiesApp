package com.gadies.app.data

import android.bluetooth.BluetoothDevice
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConnectionRepository @Inject constructor(
    private val bluetoothService: BluetoothService,
    private val wifiService: WifiService
) {

    fun getPairedBluetoothDevices(): Set<BluetoothDevice>? {
        return bluetoothService.getPairedDevices()
    }

    // TODO: Add methods for connecting to devices
}

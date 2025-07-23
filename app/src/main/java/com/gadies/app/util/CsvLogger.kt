package com.gadies.app.util

import android.content.Context
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.File
import java.io.FileWriter
import javax.inject.Inject

class CsvLogger @Inject constructor(
    @ApplicationContext private val context: Context
) {

    private var fileWriter: FileWriter? = null

    fun startLogging(header: String) {
        val file = File(context.getExternalFilesDir(null), "gadies_log_${System.currentTimeMillis()}.csv")
        fileWriter = FileWriter(file)
        fileWriter?.append(header)
        fileWriter?.append('\n')
    }

    fun log(data: String) {
        fileWriter?.append(data)
        fileWriter?.append('\n')
    }

    fun stopLogging() {
        fileWriter?.flush()
        fileWriter?.close()
    }
}

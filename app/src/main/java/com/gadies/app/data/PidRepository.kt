package com.gadies.app.data

import android.content.Context
import com.gadies.app.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.InputStreamReader
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PidRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val gson: Gson
) {

    private val pidList: List<PidData> by lazy {
        parsePids()
    }

    private fun parsePids(): List<PidData> {
        val inputStream = context.resources.openRawResource(R.raw.pid)
        val reader = InputStreamReader(inputStream)
        val pidType = object : TypeToken<List<PidData>>() {}.type
        return gson.fromJson(reader, pidType)
    }

    fun getAllPids(): List<PidData> {
        return pidList
    }

    fun getPidByName(name: String): PidData? {
        return pidList.find { it.name == name }
    }

    fun getPidsByCategory(category: String): List<PidData> {
        return pidList.filter { it.category == category }
    }
}

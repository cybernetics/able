/*
 * Copyright 2020 JUUL Labs, Inc.
 */

package com.juul.able.logger

import android.util.Log

private const val TAG = "Able"

class AndroidLogger : Logger {

    override fun isLoggable(priority: Int): Boolean = true

    override fun log(
        priority: Int,
        throwable: Throwable?,
        message: String
    ) {
        Log.println(priority, TAG, message)
    }
}

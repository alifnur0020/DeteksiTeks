package com.alifnur.deteksiteks.data.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ScanResult(
    val id: Int = 0,
    var textResult: String,
    val image: ByteArray
): Parcelable

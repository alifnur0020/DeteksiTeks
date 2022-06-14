package com.alifnur.deteksiteks.data.domain

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

// Class ScanResult akan digunakan untuk pemanggilan hasil
@Parcelize
data class ScanResult(
    val id: Int = 0,
    var textResult: String,
    val image: ByteArray
): Parcelable

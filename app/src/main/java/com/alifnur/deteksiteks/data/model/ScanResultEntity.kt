package com.alifnur.deteksiteks.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

// Membuat entity dengan nama scan_result
@Entity(tableName = "scan_result")
@Parcelize
data class ScanResultEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    var textResult: String,
    val image: ByteArray
): Parcelable

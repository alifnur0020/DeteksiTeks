package com.alifnur.deteksiteks.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alifnur.deteksiteks.data.model.ScanResultEntity
// Membuat database room dengan entities berada pada class ScanResultEntity
@Database(
    entities = [ScanResultEntity::class],
    version = 1,
    exportSchema = false
)
abstract class OcrDatabase : RoomDatabase() {

    abstract fun orcDao(): OcrDao
}
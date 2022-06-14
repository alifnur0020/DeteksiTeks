package com.alifnur.deteksiteks.data.local

import androidx.room.*
import com.alifnur.deteksiteks.data.model.ScanResultEntity
import kotlinx.coroutines.flow.Flow

// Membuat Dao untuk me-insert, me-update, dan menghapus data
// Dao merupakan fitur dari Room Database
@Dao
interface OcrDao {

    @Query("SELECT * FROM scan_result")
    fun getScanResults(): Flow<List<ScanResultEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertScanResult(scanResultEntity: ScanResultEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateScanResult(scanResultEntity: ScanResultEntity)

    @Delete
    suspend fun removeScanResult(scanResultEntity: ScanResultEntity)
}
package com.alifnur.deteksiteks.data.local

import com.alifnur.deteksiteks.data.model.ScanResultEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

// Class LocalDataSource akan mengambil data dari Entity
class LocalDataSource @Inject constructor(private val dao: OcrDao) {
    fun getScanResultList(): Flow<List<ScanResultEntity>> = dao.getScanResults()

    suspend fun insertScanResult(data: ScanResultEntity) = dao.insertScanResult(data)

    suspend fun updateScanResult(data: ScanResultEntity) = dao.updateScanResult(data)

    suspend fun removeScanResult(data: ScanResultEntity) = dao.removeScanResult(data)
}
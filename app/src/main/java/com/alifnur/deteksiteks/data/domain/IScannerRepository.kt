package com.alifnur.deteksiteks.data.domain

import kotlinx.coroutines.flow.Flow

// Domain interface sebagai repository scanner
interface IScannerRepository {

    fun getScanResultList(): Flow<List<ScanResult>>

    suspend fun insertScanResult(scanResult: ScanResult)

    suspend fun updateScanResult(scanResult: ScanResult)

    suspend fun removeScanResult(scanResult: ScanResult)
}
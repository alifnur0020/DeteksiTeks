package com.alifnur.deteksiteks.data.domain

import kotlinx.coroutines.flow.Flow

// Digunakan untuk membuat interface insert, update, remove
interface ScannerUseCase {

    fun getScanResultList(): Flow<List<ScanResult>>

    suspend fun insertScanResult(scanResult: ScanResult)

    suspend fun updateScanResult(scanResult: ScanResult)

    suspend fun removeScanResult(scanResult: ScanResult)
}
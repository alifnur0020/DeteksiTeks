package com.alifnur.deteksiteks.data.domain

import com.alifnur.deteksiteks.data.domain.ScanResult
import kotlinx.coroutines.flow.Flow

interface ScannerUseCase {

    fun getScanResultList(): Flow<List<ScanResult>>

    suspend fun insertScanResult(scanResult: ScanResult)

    suspend fun updateScanResult(scanResult: ScanResult)

    suspend fun removeScanResult(scanResult: ScanResult)
}
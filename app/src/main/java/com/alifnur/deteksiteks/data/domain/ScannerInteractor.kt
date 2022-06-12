package com.alifnur.deteksiteks.data.domain

import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class ScannerInteractor @Inject constructor(private val repository: IScannerRepository) :
    ScannerUseCase {
    override fun getScanResultList(): Flow<List<ScanResult>> = repository.getScanResultList()

//    override fun getScanResultItem(id: Int): Flow<ScanResult> = repository.getScanResultItem(id)

    override suspend fun insertScanResult(scanResult: ScanResult) =
        repository.insertScanResult(scanResult)

    override suspend fun updateScanResult(scanResult: ScanResult) =
        repository.updateScanResult(scanResult)

    override suspend fun removeScanResult(scanResult: ScanResult) = repository.removeScanResult(scanResult)
}
package com.alifnur.deteksiteks.data

import com.alifnur.deteksiteks.alat.DataMapper
import com.alifnur.deteksiteks.data.domain.IScannerRepository
import com.alifnur.deteksiteks.data.domain.ScanResult
import com.alifnur.deteksiteks.data.local.LocalDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ScannerRepository @Inject constructor(private val localDataSource: LocalDataSource) :
    IScannerRepository {
    override fun getScanResultList(): Flow<List<ScanResult>> {
        return localDataSource.getScanResultList().map {
            DataMapper.mapEntitiesToDomain(it)
        }

    }

//    override fun getScanResultItem(id: Int): Flow<ScanResult> {
//        return localDataSource.getScanResultItem(id).map {
//            DataMapper.mapEntityToDomain(it)
//        }
//    }

    override suspend fun insertScanResult(scanResult: ScanResult) {
        localDataSource.insertScanResult(DataMapper.mapDomainToEntity(scanResult))
    }

    override suspend fun updateScanResult(scanResult: ScanResult) {
        localDataSource.updateScanResult(DataMapper.mapDomainToEntity(scanResult))
    }

    override suspend fun removeScanResult(scanResult: ScanResult) {
        localDataSource.removeScanResult(DataMapper.mapDomainToEntity(scanResult))
    }
}
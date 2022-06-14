package com.alifnur.deteksiteks.utama

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.alifnur.deteksiteks.data.domain.ScanResult
import com.alifnur.deteksiteks.data.domain.ScannerUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

//Membuat Class ViewModel
@HiltViewModel
class MainViewModel @Inject constructor(private val scannerUseCase: ScannerUseCase) : ViewModel() {

    fun getScanHistoryList(): LiveData<List<ScanResult>> {
        return scannerUseCase.getScanResultList().asLiveData()
    }


    fun insertScanResult(scanResult: ScanResult) {
        viewModelScope.launch {
            scannerUseCase.insertScanResult(scanResult)
        }
    }

    fun updateScanResult(scanResult: ScanResult) {
        viewModelScope.launch {
            scannerUseCase.updateScanResult(scanResult)
        }
    }

    fun removeScanResult(scanResult: ScanResult) {
        viewModelScope.launch { scannerUseCase.removeScanResult(scanResult) }
    }
}


package com.alifnur.deteksiteks.utama

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.alifnur.deteksiteks.databinding.ActivityMainBinding
import com.alifnur.deteksiteks.utama.ScannerActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()
    private lateinit var mainAdapter: MainAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Memberikan program pada tombol NewScan sehingga akan pindah ke layout Scanner
        binding.apply {
            btnNewScan.setOnClickListener {
                val intent = Intent(this@MainActivity, ScannerActivity::class.java)
                startActivity(intent)
            }

            // Deklarasi class mainAdapter
            mainAdapter = MainAdapter()
            rvScanResult.layoutManager = LinearLayoutManager(this@MainActivity)
            rvScanResult.setHasFixedSize(true)
            rvScanResult.adapter = mainAdapter

            viewModel.getScanHistoryList().observe(this@MainActivity) { list ->
                if (list != null) {
                    mainAdapter.setData(list)
                    mainAdapter.notifyDataSetChanged()
                    if (list.isEmpty()) {
                        binding.labelNoData.visibility = View.VISIBLE
                    } else {
                        binding.labelNoData.visibility = View.GONE
                    }
                }
            }
        }
    }
}
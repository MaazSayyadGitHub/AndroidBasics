package com.example.androidbasics

import android.Manifest
import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.androidbasics.databinding.ActivityPermissionsBinding

class PermissionsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityPermissionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPermissionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnRequestPermissions.setOnClickListener {
            requestPermissions()
        }

    }

    private fun hasWriteExternalStoragePermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED

    private fun hasLocationForegroundPermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun hasLocationBackgroundPermission() =
        ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_BACKGROUND_LOCATION) == PackageManager.PERMISSION_GRANTED

    private fun requestPermissions(){
        // mutable bcos we want to add permissions into it later
        var permissionsToRequestList = mutableListOf<String>()

        // if permission is not granted
        if (!hasWriteExternalStoragePermission()){
            permissionsToRequestList.add(Manifest.permission.WRITE_EXTERNAL_STORAGE)
        }

        if (!hasLocationForegroundPermission()){
            permissionsToRequestList.add(Manifest.permission.ACCESS_COARSE_LOCATION)
        }

        if (!hasLocationBackgroundPermission()){
            permissionsToRequestList.add(Manifest.permission.ACCESS_BACKGROUND_LOCATION)
        }

        // if permission granted first then again declined
        // so then we will show again for rest list of permissions.
        // toTypedArray is to convert list into array.
        if (permissionsToRequestList.isNotEmpty()){
            ActivityCompat.requestPermissions(this@PermissionsActivity, permissionsToRequestList.toTypedArray(), 0)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if(requestCode == 0 && grantResults.isNotEmpty()){
            for (i in grantResults.indices){
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED){
                    Log.d("PermissionActivity", "${permissions[i]} granted.")
                }
            }
        }
    }
}
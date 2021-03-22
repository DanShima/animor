package com.danshima.animor.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.biometric.BiometricPrompt
import com.danshima.animor.MainActivity
import com.danshima.animor.R
import com.danshima.animor.util.BiometricUtil
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_login.*

@AndroidEntryPoint
class LoginActivity : AppCompatActivity(),
    BiometricAuthListener {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_login)
    showBiometricLoginOption()
  }

  fun onClickLogin(view: View) {
    navigateToMainActivity()
  }

  fun onClickBiometrics(view: View) {
    BiometricUtil.showBiometricPrompt(
        activity = this,
        listener = this,
        cryptoObject = null,
        allowDeviceCredential = true
    )
  }

  override fun onBiometricAuthenticationSuccess(result: BiometricPrompt.AuthenticationResult) {
    navigateToMainActivity()
  }

  override fun onBiometricAuthenticationError(errorCode: Int, errorMessage: String) {
    Toast.makeText(this, "Biometric login failed. Error: $errorMessage", Toast.LENGTH_SHORT)
        .show()
    BiometricUtil.launchBiometricSettings(this)
  }

  private fun navigateToMainActivity() {
    Log.d("navigate", "navigate to main")
    startActivity(Intent(this, MainActivity::class.java))
    finish()
  }

  private fun showBiometricLoginOption() {
    buttonBiometricsLogin.visibility =
        if (BiometricUtil.isBiometricEnabled(this)) View.VISIBLE
        else View.GONE
  }
}

interface BiometricAuthListener {
    fun onBiometricAuthenticationSuccess(result: BiometricPrompt.AuthenticationResult)
    fun onBiometricAuthenticationError(errorCode: Int, errorMessage: String)
}

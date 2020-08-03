package com.xyz.android.signinsignup

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.forgot_password.*

class ForgotPasswordActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgot_password)

        btnSubmit.setOnClickListener {
            if (validateEmail()) {
                Toast.makeText(this, "We just sent an email to reset your password.", Toast.LENGTH_SHORT).show()
                finish()
            } else {
                Toast.makeText(this, "Please enter a valid email", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun validateEmail(): Boolean {
        val isValid = android.util.Patterns.EMAIL_ADDRESS.matcher(etEmail.text).matches()
        return isValid
    }
}
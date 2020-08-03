package com.xyz.android.signinsignup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_in)

        btnSubmit.setOnClickListener {

        }

        tvDontHaveAccount.setOnClickListener {
            navigateToSignUpPage()
        }

        tvForgotPassword.setOnClickListener {
            navigateToForgotPasswordPage()
        }
    }

    private fun navigateToSignUpPage() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToForgotPasswordPage() {
        val intent = Intent(this, ForgotPasswordActivity::class.java)
        startActivity(intent)
    }
}
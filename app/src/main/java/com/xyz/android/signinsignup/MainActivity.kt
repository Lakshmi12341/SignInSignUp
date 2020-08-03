package com.xyz.android.signinsignup

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSinIn.setOnClickListener {
            navigateToSignInPage()
        }

        btnSinUp.setOnClickListener {
            navigateToSignUpPage()
        }
    }

    private fun navigateToSignInPage() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSignUpPage() {
        val intent = Intent(this, SignUpActivity::class.java)
        startActivity(intent)
    }
}

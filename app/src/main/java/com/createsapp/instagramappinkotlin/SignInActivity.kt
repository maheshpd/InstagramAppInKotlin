package com.createsapp.instagramappinkotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    //Database is from treandinWealth.com

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        signup_btn.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
            finish()
        }


    }
}

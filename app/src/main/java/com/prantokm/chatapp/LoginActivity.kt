package com.prantokm.chatapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun loginCreateUserBtnClicked(view: View){
        val createUserintent = Intent(this,CreateUserActivity::class.java)
        startActivity(createUserintent)
    }
    fun loginLoginBtnClicked(view: View){

    }

}
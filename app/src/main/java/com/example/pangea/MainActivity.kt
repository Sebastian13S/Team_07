package com.example.pangea

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity


import android.widget.Button
import com.facebook.AccessToken
import com.facebook.CallbackManager
import com.facebook.FacebookCallback
import com.facebook.FacebookException
import com.facebook.login.LoginManager
import com.facebook.login.LoginResult
import com.facebook.login.widget.LoginButton


class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        /*ATTENTION - START
        * This starts the activity dashboard, if you don't need a button after logging in
        * just delete the Button and use the intent and startActivity() like shown below. */
       /* val accounts: Button = findViewById(R.id.dashboard)
        accounts.setOnClickListener {
            val intent = Intent(this@MainActivity, DashboardsActivity::class.java)
            startActivity(intent)
        }*/
        /*ATTENTION - END*/

        val loginbtn = findViewById<LoginButton>(R.id.login_button_facebook);
        loginbtn.setOnClickListener {
            FacebookHandler.loginFacebook(loginbtn);
        }



    }
}


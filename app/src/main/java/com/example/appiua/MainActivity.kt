package com.example.appiua

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        Thread.sleep(100)
        setTheme(R.style.AppTheme_SplashTheme)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        click_changePassword()
        click_drawerActivity()


    }


    fun click_changePassword(){
        btnChangePassword.setOnClickListener(){
            val vChangePassword : Intent = Intent(applicationContext, ChangePasswordActivity::class.java)
            startActivity(vChangePassword)
        }
    }

    fun click_drawerActivity(){
        btnLogin.setOnClickListener(){
            val vLogin : Intent = Intent(applicationContext, DrawerActivity::class.java)
            startActivity(vLogin)
        }
    }

//    fun click_ScanQRActivity(){
//        btnLogin.setOnClickListener(){
//            val vLogin : Intent = Intent(applicationContext, ScanQRActivity::class.java)
//            startActivity(vLogin)
//        }
//    }
}
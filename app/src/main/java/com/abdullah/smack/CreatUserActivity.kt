package com.abdullah.smack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class CreatUserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_user)
    }

    fun generateUserAvatar(view: View) {}
    fun generateColorClicked(view: View) {}
    fun createUserClicked(view: View) {}
}

package com.abdullah.smack

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_creat_user.*
import java.util.*

class CreatUserActivity : AppCompatActivity() {

    var userAvatar = "profileDefault"
    var avatarColor = "[0.5, 0.5, 0.5, 1]"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creat_user)
    }

    fun generateUserAvatar(view: View) {
        val random = Random();
        val color = random.nextInt(2) // 0 to 1 // "number 2 is not included"
        val avatar = random.nextInt(28)// 0 to 27 // "number 28 is not included"

        if(color == 0) {
            userAvatar = "light$avatar"
        }else {
            userAvatar = "dark$avatar"
        }

        val resourceId = resources.getIdentifier(userAvatar, "drawable", packageName)
        createAvatarImageView.setImageResource(resourceId)
    }
    fun generateColorClicked(view: View) {
        val random = Random();
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        createAvatarImageView.setBackgroundColor(Color.rgb(r, g, b))

        val savedR = r.toDouble() / 255
        val savedG = g.toDouble() / 255
        val savedB = b.toDouble() / 255
        avatarColor = "[$savedR, $savedG, $savedB, 1]"

    }
    fun createUserClicked(view: View) {}
}

package Riveros.juddyth.alkewallet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2login_page)
    }

    fun abrirSingup_Page(view: View) {
        val intent = Intent(this, Signup_Page::class.java)
        startActivity(intent)
    }
        fun abrirHomePAge(view: View) {
            val intent = Intent(this, HomePAge::class.java)
            startActivity(intent)
    }
}

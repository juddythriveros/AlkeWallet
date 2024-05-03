package Riveros.juddyth.alkewallet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_0splash_screen)
    }

    fun abrirLoginSingupActivity(view: View) {
        val intent = Intent(this, LoginSingupActivity::class.java)
        startActivity(intent)
    }

}
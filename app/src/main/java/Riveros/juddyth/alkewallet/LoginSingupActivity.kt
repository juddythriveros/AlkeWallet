package Riveros.juddyth.alkewallet

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginSingupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1login_singup)
    }

    fun abrirLoginPage(view: View) {
        val intent = Intent(this, LoginPage::class.java)
        startActivity(intent)
    }
    fun abrirSingup_Page(view: View){
        val intent = Intent( this,Signup_Page::class.java)
        startActivity(intent)
    }
}

package Riveros.juddyth.alkewallet

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import Riveros.juddyth.alkewallet.databinding.Activity2loginPageBinding
import com.example.app.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: Activity2loginPageBinding
    private val loginViewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = Activity2loginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loginViewModel.email.observe(this, Observer { email ->
            // Actualizar la interfaz de usuario si es necesario
        })

        loginViewModel.password.observe(this, Observer { password ->
            // Actualizar la interfaz de usuario si es necesario
        })

        loginViewModel.loginResult.observe(this, Observer { result ->
            if (result) {
                Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show()
                abrirHomePage()
            } else {
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        })

        binding.btnLogin.setOnClickListener {
            val email = binding.ingmail.text.toString()
            val password = binding.ingclave.text.toString()

            loginViewModel.onEmailChanged(email)
            loginViewModel.onPasswordChanged(password)
            loginViewModel.login()
        }

        binding.txtcreaNuevaCuenta.setOnClickListener {
            abrirSignupPage()
        }

        binding.txtOlvidasteClave.setOnClickListener {
            // Navegar a la pantalla de recuperación de contraseña
        }
    }

    private fun abrirSignupPage() {
        val intent = Intent(this, Signup_Page::class.java)
        startActivity(intent)
    }

    private fun abrirHomePage() {
        val intent = Intent(this, HomePAge::class.java)
        startActivity(intent)
    }
}

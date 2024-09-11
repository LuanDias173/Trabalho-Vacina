package com.example.trabalhovacina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.trabalhovacina.NewsActivity;
import com.example.trabalhovacina.R;

public class MainActivity extends AppCompatActivity {

    private EditText loginField;
    private EditText passwordField;
    private Button loginButton;
    private Button registerButton;
    private TextView forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa os elementos da UI
        loginField = findViewById(R.id.login_field);
        passwordField = findViewById(R.id.password_field);
        loginButton = findViewById(R.id.login_button);
        registerButton = findViewById(R.id.register_button);
        forgotPassword = findViewById(R.id.forgot_password);

        // Função do botão "Entrar"
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String login = loginField.getText().toString();
                String password = passwordField.getText().toString();

                if (login.equals("joao") && password.equals("12345678")) {
                    Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login ou senha incorretos.", Toast.LENGTH_SHORT).show();
                }
            }
        });



        // Função do botão "Registrar"
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Página de registro", Toast.LENGTH_SHORT).show();
            }
        });

        // Função "Esqueci minha senha"
        forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Redefinição de senha", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.apk_setoran_hafalan_alquran;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ForgotPasswordActivity extends AppCompatActivity {

        private View emailEditText;
        private Button resetButton, loginButton;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.lupa_password);

            // Initialize views
            emailEditText = findViewById(R.id.emailAdress);
            resetButton = findViewById(R.id.password_toggle);
            loginButton = findViewById(R.id.buttonkembalilogin);

            // Set onClickListener for resetButton
            resetButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implement logic to send password reset link
                }
            });

            // Set onClickListener for loginButton
            loginButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Implement logic to navigate back to login screen
                }
            });
        }
    }


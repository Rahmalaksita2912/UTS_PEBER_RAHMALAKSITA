package com.example.apk_setoran_hafalan_alquran;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button emailPhoneButton = findViewById(R.id.editTextEmail);
        Button passwordButton = findViewById(R.id.password_toggle);
        Button loginButton = findViewById(R.id.button3);
        Button createAccountButton = findViewById(R.id.button4);

        emailPhoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle email/phone button click
                Toast.makeText(MainActivity.this, "Email/Phone Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        passwordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle password button click
                Toast.makeText(MainActivity.this, "Password Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle login button click
                Toast.makeText(MainActivity.this, "Login Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle create account button click
                Toast.makeText(MainActivity.this, "Create Account Button Clicked", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

package com.example.apk_setoran_hafalan_alquran;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button registerButton = findViewById(R.id.buttonRegister);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add your registration logic here
                // For example, you can start another activity after registration is successful
                // Intent intent = new Intent(RegisterActivity.this, AnotherActivity.class);
                // startActivity(intent);
            }
        });
    }
}
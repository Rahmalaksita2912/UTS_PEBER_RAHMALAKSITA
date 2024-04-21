package com.example.apk_setoran_hafalan_alquran;

import android.os.Bundle;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toolbar;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    private Drawerlayout drawerlayout;

    @Override
    protected void oncreate(View savedinstancestate) {
        super.onCreate(savedinstancestate);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawerlayout =findViewById(R.id.setoran);
        NavigationView navigationView =findViewById (R.id.set_layout);
        navigationView.setNavigationItemSelectedListener(toolbar);

        ActionBarDrawerToggle toggle=new action
    }
}
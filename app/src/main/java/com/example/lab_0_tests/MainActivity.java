package com.example.lab_0_tests;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    public int max(int a, int b)
    {
        return a > b ? a : b;
    }
    public int min(int a, int b)
    {
        return a > b ? b : a;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.example.mapsmartphone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void startStartScreenActivity(View v) {
        Intent intent = new Intent(this, StartScreenActivity.class);
        startActivity(intent);
    }
}
package com.supertrack.prototipo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Ingresa(View v){
        Intent siguiente = new Intent(this,MainActivity2.class);
        startActivity(siguiente);
    }
}

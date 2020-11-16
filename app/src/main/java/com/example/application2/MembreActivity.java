package com.example.application2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MembreActivity extends AppCompatActivity {

    TextView tvEquipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membre);

        TextView tvEquipe = (TextView) findViewById(R.id.tvEquipe);

        Intent intent = getIntent();
        String EquipeNom = intent.getStringExtra("nomE");
        tvEquipe.setText(EquipeNom);
    }
}
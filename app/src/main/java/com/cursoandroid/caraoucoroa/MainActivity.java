package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button buttonPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = findViewById(R.id.buttonPlay);

        buttonPlay.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ResultActivity.class);

            //passar dados para proxima tela
            int numero = new Random().nextInt(2);
            intent.putExtra("numero", numero);

            startActivity(intent);
        });
    }
}
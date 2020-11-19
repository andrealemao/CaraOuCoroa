package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    private ImageView imageResult;
    private Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        imageResult = findViewById(R.id.imageResultado);
        btnBack = findViewById(R.id.btnBack);

        //recuperar dados
        Bundle data = getIntent().getExtras();
        int numero = data.getInt("numero");

        if (numero == 0){ //cara
            imageResult.setImageResource(R.drawable.moeda_cara);
        }else { //coroa
            imageResult.setImageResource(R.drawable.moeda_coroa);
        }

        btnBack.setOnClickListener(v -> finish());
    }
}
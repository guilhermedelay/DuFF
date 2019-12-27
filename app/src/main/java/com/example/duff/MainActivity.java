package com.example.duff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView batimentos;
    EditText idade, frequencia;
    double dBatimentos, dIdade, dFrequencia;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batimentos = findViewById(R.id.batimentos);
        idade = findViewById(R.id.idade);
        frequencia = findViewById(R.id.frequencia);

    }

    public void calcularBatimentos(View view) {
        dIdade = Double.parseDouble(idade.getText().toString());
        dFrequencia = Double.parseDouble(frequencia.getText().toString());
        dBatimentos = ((220 - dIdade) * (dFrequencia/100));
        batimentos.setText(String.valueOf(dBatimentos));
    }
}

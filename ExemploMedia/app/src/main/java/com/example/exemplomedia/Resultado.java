package com.example.exemplomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {

    // Declaro os objetos que serão associados aos elementos de tela
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        // Associa os objetos aos elementos de tela
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        // Declara o objeto que receberá o gerenciador de atividades
        Intent resultado = getIntent();

        // Lẽ o parâmetro que foi passado pela tela anterior
        float media = resultado.getFloatExtra("media", 0f);

        // Define o que será apresentado ao usuário
        String situacao = null;
        if(media > 6){
            situacao = "Aprovado";
        }
        else{
            situacao = "Reprovado";
        }

        String msg = "Você foi " + situacao + " com média " + media;

        // Copia a mensagem que será mostrada ao usuário para o canto tvResultado
        tvResultado.setText(msg);
    }

    public void voltar (View view){

        Intent voltar = new Intent(this, MainActivity.class);
        startActivity(voltar);
    }
}
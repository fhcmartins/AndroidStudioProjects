package com.example.newactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Instanciando as variaveis
    private Button botao01;
    private Button botao02;
    private Button botao03;
    private Button botao04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Atribuicao para reconhecimento de comando
        botao01 = (Button)findViewById(R.id.botao01);
        botao02 = (Button)findViewById(R.id.botao02);
        botao03 = (Button)findViewById(R.id.botao03);
        botao04 = (Button)findViewById(R.id.botao04);

        //Criando as telas para cada Botão
        // Parametros OnClick
        botao01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, tela01.class));
                botao01Activity();
            }
        });

        botao02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, tela02.class));
                botao02Activity();
            }
        });

        botao03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, tela03.class));
                botao03Activity();
            }
        });

        botao04.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(MainActivity.this, tela04.class));
                botao04Activity();
            }
        });
    }

    private void botao01Activity(){
        startActivity(new Intent(MainActivity.this, tela01.class));
    }

    private void botao02Activity(){
        startActivity(new Intent(MainActivity.this, tela02.class));
    }

    private void botao03Activity(){
        startActivity(new Intent(MainActivity.this, tela03.class));
    }

    private void botao04Activity(){
        startActivity(new Intent(MainActivity.this,tela04.class));
    }
}
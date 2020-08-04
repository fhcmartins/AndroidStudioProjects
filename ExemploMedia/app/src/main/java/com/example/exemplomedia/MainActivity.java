package com.example.exemplomedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Declaração dos objetos que identificam os campos de tela
    EditText edtNota1;
    EditText edtNota2;
    EditText edtNota3;
    EditText edtNota4;
    //Button btnCalcular = (Button) findViewById(R.id.btnCalcular);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNota1 = (EditText) findViewById(R.id.edtNota1);
        edtNota2 = (EditText) findViewById(R.id.edtNota2);
        edtNota3 = (EditText) findViewById(R.id.edtNota3);
        edtNota4 = (EditText) findViewById(R.id.edtNota4);

    }

    // Ação do botão
    public void calcularMedia(View view){
        // Declara as variáveis que farão o cálculo da média
        float nota1 = Float.parseFloat(edtNota1.getText().toString());
        float nota2 = Float.parseFloat(edtNota2.getText().toString());
        float nota3 = Float.parseFloat(edtNota3.getText().toString());
        float nota4 = Float.parseFloat(edtNota4.getText().toString());

        float media = (nota1 + nota2 + nota3 + nota4) / 4; // calcula a média

        // Declara o controle Intent que ser'ausado para identificar a próxima tela
        Intent resultado = new Intent(this, Resultado.class);

        // Insere um parâmetro a ser usado na próxima tela
        resultado.putExtra("media", media);

        // Chama a próxima tela
        startActivity(resultado);
    }
}
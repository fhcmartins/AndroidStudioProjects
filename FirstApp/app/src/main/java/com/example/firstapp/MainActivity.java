package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnConfirmar;
    private Button btnLimpar;
    private EditText txtName;
    private TextView txtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnConfirmar = (Button)findViewById(R.id.btnConfirmar); //Fazendo um Casting de uma View para Button
        btnLimpar = (Button)findViewById(R.id.btnLimpar);
        txtName =  (EditText)findViewById(R.id.txtName);
        txtView = (TextView)findViewById(R.id.txtView);

        // Acoes pra os botoes
        // Duas formas

        // 1ª - Add um listener
        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtName.setText(""); //Limpa, deixa vazio
                txtView.setText(getText(R.string.txt_padrao));
            }
        });
    }

    // 2ª maneira de definir a acao tomada por um botao

    public void confirmar(View view){
        txtView.setText(txtName.getText());
    }

}
package com.example.ienergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaPrincipal extends AppCompatActivity {
    Button medicao;
    Button controleEquipamentos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_principal);

        medicao = (Button) findViewById(R.id.buttonMedicao);
        controleEquipamentos = (Button) findViewById(R.id.buttonControleEquipamento);



        medicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaPrincipal.this, TelaMedicao.class));
            }
        });

        controleEquipamentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(TelaPrincipal.this,ListaEquipamentos.class));
            }
        });



    }




}
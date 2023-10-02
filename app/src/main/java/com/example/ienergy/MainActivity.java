package com.example.ienergy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText usuario;
    EditText senha;
    Button entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usuario = (EditText) findViewById(R.id.editTextUsuario);
        senha = (EditText) findViewById(R.id.editTextSenha);
        entrar = (Button) findViewById(R.id.buttonEntrar);

    }

    @Override
    protected void onStart(){
        super.onStart();
        usuario.setText("");
        senha.setText("");

    }


    public void entrarOnClick(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = usuario.getText().toString();

        if ("admin".equals(usuarioInformado) && "admin".equals(senhaInformada)){
            startActivity(new Intent(this,TelaPrincipal.class));
        }else{
            String mensagemErro = getString(R.string.activity_main_erro_autenticacao);
            Toast toast = Toast.makeText(this,mensagemErro, Toast.LENGTH_SHORT);
            toast.show();
        }


    }
}
package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import Ferramentas.EventosBD;
import Ferramentas.Usuario;

public class trabalhinho extends AppCompatActivity {
    private EditText nome_usuario;
    private EditText senha;
    private Button bt_entrar;
    private Button bt_teste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        bt_entrar = findViewById(R.id.bt_entrar);
        //"Localiza" os botões/componentes sendo utilizados na tela em questão e insere o que foi encontrado dentro dos privates criados//

        bt_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });
        bt_teste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventosBD bd = new EventosBD(trabalhinho.this);
                bd.insereUsuario();
            }
        });
    }

    public void Login(){
        nome_usuario = findViewById(R.id.edit_usuario);
        senha = findViewById(R.id.edit_senha);
        String dadoNome = nome_usuario.getText().toString().trim();
        int dadoSenha = Integer.parseInt(senha.getText().toString().trim());
        EventosBD bd = new EventosBD(trabalhinho.this);
        Usuario usuario = bd.PesquisarUsuario(dadoNome, dadoSenha);

        if (usuario == null){
            Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT).show();
        }else{
            Intent intent = new Intent(trabalhinho.this, menu.class);
            startActivity(intent);
        }
    }
}
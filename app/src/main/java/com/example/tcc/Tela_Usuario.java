package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Tela_Usuario extends AppCompatActivity {
    private Button bt_voltar3;
    private Button bt_deslogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_usuario);
        bt_voltar3 = findViewById(R.id.bt_voltar3);
        bt_deslogar = findViewById(R.id.bt_deslogar);
        //"Localiza" os botões/componentes sendo utilizados na tela em questão e insere o que foi encontrado dentro dos privates criados//

        bt_voltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Usuario.this, menu.class);
                startActivity(intent);
                //Ao clicar no botão o intent é "ativado" e muda para a tela indicada no código//
                //Botão "bt_voltar3" faz sair da tela "Tela_Usuario" ir para a tela "menu"//
            }
        });
        bt_deslogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Tela_Usuario.this, trabalhinho.class);
                startActivity(intent);
                //Ao clicar no botão o intent é "ativado" e muda para a tela indicada no código//
                //Botão "bt_deslogar" faz sair da tela "Tela_Usuario" e ir para a tela "trabalhinho"//
            }
        });
    }
}
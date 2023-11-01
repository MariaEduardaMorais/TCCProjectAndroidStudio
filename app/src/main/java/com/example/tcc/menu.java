package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class menu extends AppCompatActivity {
    private Button bt_dados;
    private Button bt_reserva;
    private Button bt_pesquisa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        bt_dados = findViewById(R.id.bt_dados);
        bt_pesquisa = findViewById(R.id.bt_pesquisa);
        bt_reserva = findViewById(R.id.bt_reserva);
        //"Localiza" os botões/componentes sendo utilizados na tela em questão e insere o que foi encontrado dentro dos privates criados//

        bt_dados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, Tela_Usuario.class);
                startActivity(intent);
                //Ao clicar no botão o intent é ativado e muda para a tela indicada no código//
                //Botão "bt_dados" faz sair da tela "menu" e ir para a tela "Tela_Usuario"//
            }
        });
        bt_reserva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, reservar.class);
                startActivity(intent);
                //Ao clicar no botão o intent é ativado e muda para a tela indicada no código//
                //Botão "bt_reserva" faz sair da tela "menu" e ir para a tela "reservar"//
            }
        });
        bt_pesquisa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menu.this, pesquisarlivro.class);
                startActivity(intent);
                //Ao clicar no botão o intent é ativado e muda para a tela indicada no código//
                //Botão "bt_pesquisa" faz sair da tela "menu" e ir para a tela "pesquisarlivro"//
            }
        });
    }
}

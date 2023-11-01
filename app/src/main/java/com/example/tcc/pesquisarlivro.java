package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pesquisarlivro extends AppCompatActivity {
    private Button bt_pesquisar2;
    private androidx.appcompat.widget.SearchView barrapesquisa;
    private Button bt_voltar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pesquisarlivro);
        bt_voltar2 = findViewById(R.id.bt_voltar2);
        bt_pesquisar2 = findViewById(R.id.bt_pesquisar2);
        barrapesquisa = findViewById(R.id.barrapesquisa);
        //"Localiza" os botões/componentes sendo utilizados na tela em questão e insere o que foi encontrado dentro dos privates criados//

        bt_voltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pesquisarlivro.this, menu.class);
                startActivity(intent);
                //Ao clicar no botão o intent é "ativado" e muda para a tela indicada no código//
                //Botão "bt_voltar2" faz sair da tela "pesquisarlivro" ir para a tela "menu"//
            }
        });
    }
}

package com.example.tcc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class reservar extends AppCompatActivity {
    private Button bt_reservarLi;
    private androidx.appcompat.widget.SearchView barrapesquisa2;
    private Button bt_voltar1;
    private EditText editTextTextPersonName2;
    private EditText editTextDate;
    private EditText editTextDate2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reservar);
        bt_reservarLi = findViewById(R.id.bt_reservarli);
        barrapesquisa2 = findViewById(R.id.barrapesquisa2);
        bt_voltar1 = findViewById(R.id.bt_voltar1);
        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        editTextDate = findViewById(R.id.editTextDate);
        editTextDate2 = findViewById(R.id.editTextDate2);
        //"Localiza" os botões/componentes sendo utilizados na tela em questão e insere o que foi encontrado dentro dos privates criados//

        bt_voltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reservar.this, menu.class);
                startActivity(intent);
                //Ao clicar no botão o intent é "ativado" e muda para a tela indicada no código//
                //Botão "bt_voltar1" faz sair da tela "reservar" ir para a tela "menu"//
            }
        });
    }
}

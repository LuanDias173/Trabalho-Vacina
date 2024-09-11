package com.example.trabalhovacina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class WalletsActivity extends AppCompatActivity {

    private RecyclerView walletsRecyclerView;
    private ImageButton settingsButton;
    private ImageButton addButton;
    private ImageButton shareButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wallets);

        // Configurar RecyclerView
        walletsRecyclerView = findViewById(R.id.walletsRecyclerView);
        walletsRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Lista de carteiras (Exemplo)
        ArrayList<String> walletList = new ArrayList<>();
        walletList.add("Carteira da Ana - Feminino - 15 anos");
        walletList.add("Carteira do João - Masculino - 28 anos");
        walletList.add("Carteira do Marcelo - Masculino - 1 ano");

        WalletsAdapter adapter = new WalletsAdapter(walletList);
        walletsRecyclerView.setAdapter(adapter);

        // Configurar botões da barra inferior
        settingsButton = findViewById(R.id.settings_button);
        addButton = findViewById(R.id.add_button);
        shareButton = findViewById(R.id.share_button);

        // Configuração de ações para cada botão
        settingsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalletsActivity.this, "Abrir configurações", Toast.LENGTH_SHORT).show();
            }
        });

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalletsActivity.this, "Adicionar nova carteira", Toast.LENGTH_SHORT).show();
            }
        });

        shareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(WalletsActivity.this, "Compartilhar carteira", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

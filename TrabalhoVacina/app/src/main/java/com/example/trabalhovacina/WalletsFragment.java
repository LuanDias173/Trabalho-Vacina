package com.example.trabalhovacina;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WalletsFragment extends Fragment {

    private RecyclerView walletsRecyclerView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_wallets, container, false);

        // Configuração da RecyclerView
        walletsRecyclerView = view.findViewById(R.id.walletsRecyclerView);
        walletsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Lista de carteiras (Exemplo)
        ArrayList<String> walletList = new ArrayList<>();
        walletList.add("Carteira da Ana - Feminino - 15 anos");
        walletList.add("Carteira do João - Masculino - 28 anos");
        walletList.add("Carteira do Marcelo - Masculino - 1 ano");

        WalletsAdapter adapter = new WalletsAdapter(walletList);
        walletsRecyclerView.setAdapter(adapter);

        return view;
    }
}

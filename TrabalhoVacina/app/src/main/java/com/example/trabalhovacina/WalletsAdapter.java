package com.example.trabalhovacina;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class WalletsAdapter extends RecyclerView.Adapter<WalletsAdapter.WalletViewHolder> {

    private ArrayList<String> walletList;

    public WalletsAdapter(ArrayList<String> walletList) {
        this.walletList = walletList;
    }

    @NonNull
    @Override
    public WalletViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.wallet_item, parent, false);
        return new WalletViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull WalletViewHolder holder, int position) {
        holder.walletInfo.setText(walletList.get(position));
    }

    @Override
    public int getItemCount() {
        return walletList.size();
    }

    public static class WalletViewHolder extends RecyclerView.ViewHolder {
        TextView walletInfo;

        public WalletViewHolder(@NonNull View itemView) {
            super(itemView);
            walletInfo = itemView.findViewById(R.id.walletInfo);
        }
    }
}

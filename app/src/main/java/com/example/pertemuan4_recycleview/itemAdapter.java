package com.example.pertemuan4_recycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.ItemViewHolder>{
    private ArrayList<item> dataList;
    public itemAdapter(ArrayList<item> dataList) {
        this.dataList = dataList;
    }
    @NonNull
    @Override
    public itemAdapter.ItemViewHolder
    onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_vape, parent, false);
        return new ItemViewHolder(view);
    }
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.Logo.setImageResource(dataList.get(position).getLogo());
        holder.txtNamavape.setText(dataList.get(position).getNamavape());
        holder.txtmerk.setText(dataList.get(position).getMerk());
        holder.txtharga.setText(dataList.get(position).getHarga());
    }
    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size() : 0;
    }
    public class ItemViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNamavape, txtmerk, txtharga;
        private ImageView Logo;
        public ItemViewHolder(View itemView) {
            super(itemView);
            Logo = (ImageView)
                    itemView.findViewById(R.id.img_logo);
            txtNamavape = (TextView)
                    itemView.findViewById(R.id.txt_nama_vape);
            txtmerk = (TextView)
                    itemView.findViewById(R.id.txt_merk);
            txtharga = (TextView)
                    itemView.findViewById(R.id.txt_harga);
        }
    }
}

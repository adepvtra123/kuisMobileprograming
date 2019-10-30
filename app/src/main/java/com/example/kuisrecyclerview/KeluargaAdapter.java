package com.example.kuisrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class KeluargaAdapter extends RecyclerView.Adapter<KeluargaAdapter.MahasiswaViewHolder> {

    private ArrayList<Keluarga> dataList;

    public KeluargaAdapter(ArrayList<Keluarga> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public KeluargaAdapter.MahasiswaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_keluarga,parent,false);

        return new MahasiswaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaViewHolder holder, int position) {

        holder.tvNama.setText(dataList.get(position).getNama());
        holder.tvAnggota.setText(dataList.get(position).getAnggota());
        holder.tvFoto.setImageResource(dataList.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return (dataList != null) ? dataList.size ():0;
    }

    public class MahasiswaViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNama, tvAnggota;
        private ImageView tvFoto;

        public MahasiswaViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tv_nama);
            tvAnggota = itemView.findViewById(R.id.tv_anggota);
            tvFoto = itemView.findViewById(R.id.tv_foto);
        }
    }
}

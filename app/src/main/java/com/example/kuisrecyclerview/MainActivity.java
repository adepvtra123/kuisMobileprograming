package com.example.kuisrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tambahData();
        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void tambahData()
    {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Ade Putra Agus K", "Anak", R.drawable.akku));
        keluargaArrayList.add(new Keluarga("Lilik pujiati", "Ibu", R.drawable.ibuuu));
        keluargaArrayList.add(new Keluarga("Aditya irvandani", "Ayah", R.drawable.ayyah));

    }
}

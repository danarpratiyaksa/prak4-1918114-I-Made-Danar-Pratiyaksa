package com.example.pertemuan4_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private itemAdapter adapter;
    private ArrayList<item> itemArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView) findViewById(R.id.recycleview);
        adapter = new itemAdapter(itemArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        itemArrayList = new ArrayList<>();
        itemArrayList.add(new item("Hexohm", "vapezoo", "Rp.50.000.000",R.drawable.vapehexohm));
        itemArrayList.add(new item("dotmod", "vapezoo", "Rp.2.000.000",R.drawable.dotmodcrop));
        itemArrayList.add(new item("drag", "vapezoo", "Rp.700.000",R.drawable.dragvape));
        itemArrayList.add(new item("aigislegend", "aigis", "Rp.800.000",R.drawable.aigislegend));
        itemArrayList.add(new item("drugavoxy", "druga", "Rp.1.000.000",R.drawable.drugavoxy));
        itemArrayList.add(new item("vapesmok", "smok ", "Rp.1.200.000",R.drawable.vapesmokcrop));
        itemArrayList.add(new item("istiqpico", "IO ", "Rp.450.000",R.drawable.istiqpico));
    }
}
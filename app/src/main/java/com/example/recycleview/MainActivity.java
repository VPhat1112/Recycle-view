package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<item> itemList = new ArrayList<>();
        itemList.add(new item("abaida", R.mipmap.imgdog_1,"cute"));
        itemList.add(new item("Shiba", R.mipmap.imgdog_2,"cute"));
        itemList.add(new item("Adeko", R.mipmap.imgdog_3,"cute"));
        itemList.add(new item("sko", R.mipmap.imgdog_4,"cute"));

        rvItems = (RecyclerView) findViewById(R.id.rv_item);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvItems.setLayoutManager(layoutManager);
        rvItems.setHasFixedSize(true);
        rvItems.setAdapter(new RecyclerDataAdapter(this, itemList));
    }
}
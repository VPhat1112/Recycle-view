package com.example.recycleview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycleview.Category.Category;
import com.example.recycleview.Category.CategoryAdapter;
import com.example.recycleview.dog.Item;
import com.example.recycleview.dog.RecyclerDataAdapter;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvCategory;
    private CategoryAdapter categoryAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        rvCategory =  findViewById(R.id.rv_item);
        categoryAdapter = new CategoryAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvCategory.setLayoutManager(linearLayoutManager);
        categoryAdapter.setData(getListCategory());
        rvCategory.setAdapter(categoryAdapter);

    }

    @NonNull
    private List<Category> getListCategory() {
        List<Category> categoryList= new ArrayList<>();
        List<Item> itemList= new ArrayList<>();
        itemList.add(new Item("abaida", R.mipmap.imgdog_1,"cute"));
        itemList.add(new Item("Shiba", R.mipmap.imgdog_2,"cute"));
        itemList.add(new Item("Adeko", R.mipmap.imgdog_3,"cute"));
        itemList.add(new Item("sko", R.mipmap.imgdog_4,"cute"));

        itemList.add(new Item("abaida", R.mipmap.imgdog_1,"cute"));
        itemList.add(new Item("Shiba", R.mipmap.imgdog_2,"cute"));
        itemList.add(new Item("Adeko", R.mipmap.imgdog_3,"cute"));
        itemList.add(new Item("sko", R.mipmap.imgdog_4,"cute"));

        categoryList.add( new Category("Category 1",itemList));
        categoryList.add( new Category("Category 2",itemList));
        categoryList.add( new Category("Category 3",itemList));
        categoryList.add( new Category("Category 4",itemList));

        return categoryList;
    }


}
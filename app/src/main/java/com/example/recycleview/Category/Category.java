package com.example.recycleview.Category;

import com.example.recycleview.dog.Item;

import java.util.List;

public class Category {
    String NameCategory;
    private List<Item> itemList;

    public Category(String nameCategory, List<Item> itemList) {
        this.NameCategory = nameCategory;
        this.itemList = itemList;
    }

    public String getNameCategory() {
        return NameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.NameCategory = nameCategory;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}

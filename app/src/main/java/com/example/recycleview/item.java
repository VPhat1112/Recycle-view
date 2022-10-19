package com.example.recycleview;

public class item {
    private String itemName;
    private int images_pet;
    private String itemInfo;
    public item(String itemName,int images_dinner,String itemInfo){
        this.itemName=itemName;
        this.images_pet=images_dinner;
        this.itemInfo=itemInfo;

    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getImages_pet() {
        return images_pet;
    }

    public void setImages_pet(int  images_pet) {
        this.images_pet = images_pet;
    }

    public String getItemInfo() {
        return itemInfo;
    }

    public void setItemInfo(String itemInfo) {
        this.itemInfo = itemInfo;
    }
}

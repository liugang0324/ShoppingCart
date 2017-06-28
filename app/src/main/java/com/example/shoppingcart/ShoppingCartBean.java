package com.example.shoppingcart;

/**
 * Created by AYD on 2016/11/22.
 * <p>
 * 购物车
 */
public class ShoppingCartBean {

    private int id;
    private String imageUrl;
    private String shoppingName;
    private String fabric;
    private int dressSize;
    private int pantsSize;
    private double price;
    private int num;
    public boolean isChoosed;
    public boolean isCheck = false;
    private int count;

    public ShoppingCartBean() {
    }

    public ShoppingCartBean(int id, String shoppingName, String fabric, int dressSize,
                            int pantsSize, double price, int num, int count) {
        this.id = id;
        this.shoppingName = shoppingName;
        this.fabric = fabric;
        this.dressSize = dressSize;
        this.pantsSize = pantsSize;
        this.price = price;
        this.num = num;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public boolean isChoosed() {
        return isChoosed;
    }

    public void setChoosed(boolean choosed) {
        isChoosed = choosed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getShoppingName() {
        return shoppingName;
    }

    public void setShoppingName(String shoppingName) {
        this.shoppingName = shoppingName;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getDressSize() {
        return dressSize;
    }

    public void setDressSize(int dressSize) {
        this.dressSize = dressSize;
    }

    public int getPantsSize() {
        return pantsSize;
    }

    public void setPantsSize(int pantsSize) {
        this.pantsSize = pantsSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

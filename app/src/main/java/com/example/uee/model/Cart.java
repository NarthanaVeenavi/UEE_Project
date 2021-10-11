package com.example.uee.model;

public class Cart {
    private String pid, PName, price, quantity, image;

    public Cart(){

    }

    public Cart(String pid, String PName, String price, String quantity, String image) {
        this.pid = pid;
        this.PName = PName;
        this.price = price;
        this.quantity = quantity;
        this.image = image;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPName() {
        return PName;
    }

    public void setPName(String PName) {
        this.PName = PName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

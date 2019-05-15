package com.group8.yugui.domain;

import java.io.Serializable;

/**
 * Created by ZhangMh on 2018/9/13.
 */
public class Shoplist implements Serializable {
    private int shoplistID;
    private int merchandiseID;
    private String num;
    private String picture;
    private int userID;
    private String name;


    public int getShoplistID() {
        return shoplistID;
    }

    public void setShoplistID(int shoplistID) {
        this.shoplistID = shoplistID;
    }

    public int getMerchandiseID() {
        return merchandiseID;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

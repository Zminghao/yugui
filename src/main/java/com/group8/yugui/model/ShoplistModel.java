package com.group8.yugui.model;

/**
 * Created by ZhangMh on 2018/9/13.
 */
public class ShoplistModel {
    private int shoplistID;
    private int merchandiseID;
    private String num;
    private int userID;

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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}

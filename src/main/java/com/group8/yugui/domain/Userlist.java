package com.group8.yugui.domain;

import java.io.Serializable;

/**
 * Created by ZhangMh on 2018/9/13.
 */
public class Userlist implements Serializable {
    private int userID;
    private int shoplistID;

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getShoplistID() {
        return shoplistID;
    }

    public void setShoplistID(int shoplistID) {
        this.shoplistID = shoplistID;
    }
}

package com.group8.yugui.domain;

import java.io.Serializable;

/**
 * Created by ZhangMh on 2018/9/13.
 */
public class Car implements Serializable {
    private int merchandiseID;
    private String type;
    private int merchantID;
    private String merchant;
    private int usernum;

    private String category;
    private String price;
    private String picture;
    private String detail;
    private String introduce;
    private String name;
    
    public int getMerchandiseID(){
        return merchandiseID;
    }

    public void setMerchandiseID(int merchandiseID) {
        this.merchandiseID = merchandiseID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMerchantID() {
        return merchantID;
    }

    public void setMerchantID(int merchantID) {
        this.merchantID = merchantID;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public int getUsernum() {
        return usernum;
    }

    public void setUsernum(int usernum) {
        this.usernum = usernum;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getIntroduce(){
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

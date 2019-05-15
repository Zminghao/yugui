package com.group8.yugui.model;

public class TokenModel {
    private int userID;
    private String token;

    public TokenModel(int userID, String token){
        this.userID = userID;
        this.token = token;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}

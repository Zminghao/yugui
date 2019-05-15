package com.group8.yugui.data;

public class OejectModel {
    private int num;
    private Object list;

    public Object getObject() {
        return list;
    }

    public void setObject(Object list) {
        this.list = list;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setAll(int num, Object list){
        this.num = num;
        this.list = list;
    }
}

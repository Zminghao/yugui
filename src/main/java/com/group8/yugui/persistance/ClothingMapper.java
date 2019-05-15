package com.group8.yugui.persistance;

import com.group8.yugui.domain.Clothing;

import java.util.List;

public interface ClothingMapper {

    Clothing getClothing(int mrechandiseID);

    List<Clothing> getClothingList();
//
//    String getPrice(int mrechandiseID);
//
//    String getPicture(int mrechandiseID);
//
//    String getDetail(int mrechandiseID);

}

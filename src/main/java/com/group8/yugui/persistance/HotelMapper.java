package com.group8.yugui.persistance;

import com.group8.yugui.domain.Hotel;

import java.util.List;

public interface HotelMapper {

    Hotel getHotel(int mrechandiseID);

    List<Hotel> getHotelList();
//
//    String getPrice(int mrechandiseID);
//
//    String getPicture(int mrechandiseID);
//
//    String getDetail(int mrechandiseID);

}

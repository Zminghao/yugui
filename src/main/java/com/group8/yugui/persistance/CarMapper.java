package com.group8.yugui.persistance;

import com.group8.yugui.domain.Car;

import java.util.List;

public interface CarMapper {

    Car getCar(int mrechandiseID);

    List<Car> getCarList();

    String getPrice(int mrechandiseID);

    String getPicture(int mrechandiseID);

    String getDetail(int mrechandiseID);

}

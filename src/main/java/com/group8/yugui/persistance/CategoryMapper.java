package com.group8.yugui.persistance;

import com.group8.yugui.data.PriceModel;
import com.group8.yugui.data.TableModel;
import com.group8.yugui.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by ZhangMh on 2018/9/13.
 */
@Mapper
public interface CategoryMapper {
    List<Car> getCarList();

    List<Car> getCarListByType(String type);

    List<Car> getCarListByPrice(PriceModel priceModel);

    List<Car> getCarByName(String name);

    Car getCar(int merchandiseID);

    List<Clothing> getClothingList();

    List<Clothing> getClothingListBySex(String sex);

    List<Clothing> getClothingListByType(String type);

    List<Clothing> getClothingListByStyle(String style);

    List<Clothing> getClothingListByPrice(PriceModel priceModel);

    List<Clothing> getClothingByName(String name);

    Clothing getClothing(int merchandiseID);

    List<Hotel> getHotelList();

    List<Hotel> getHotelListByRank(int rank);

    List<Hotel> getHotelListByPrice(PriceModel priceModel);

    List<Hotel> getHotelListByTablenumber(TableModel tableModel);

    List<Hotel> getHotelByName(String name);

    Hotel getHotel(int merchandiseID);

    List<Person> getPersonList(Person person);

    Person getPerson(int merchandiseID);

    Detail getDetail(int merchandiseID);
}

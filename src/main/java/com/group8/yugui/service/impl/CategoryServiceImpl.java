package com.group8.yugui.service.impl;

import com.group8.yugui.data.PriceModel;
import com.group8.yugui.data.TableModel;
import com.group8.yugui.domain.*;
import com.group8.yugui.persistance.CategoryMapper;
import com.group8.yugui.service.CategotyService;
import com.sun.org.apache.bcel.internal.classfile.PMGClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by ZhangMh on 2018/9/13.
 */
@Service("CategoryService")
public class CategoryServiceImpl implements CategotyService {

    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public List<Car> getCarList(){
        return categoryMapper.getCarList();
    }

    @Override
    public List<Car> getCarListByType(String type){
        return categoryMapper.getCarListByType(type);
    }

    @Override
    public List<Car> getCarListByPrice(PriceModel priceModel){
        return categoryMapper.getCarListByPrice(priceModel);
    }

    @Override
    public List<Car> getCarByName(String name){
        return categoryMapper.getCarByName(name);
    }

    @Override
    public Car getCar(int merchandiseID){
        return categoryMapper.getCar(merchandiseID);
    }

    @Override
    public List<Clothing> getClothingList(){
        return categoryMapper.getClothingList();
    }

    @Override
    public List<Clothing> getClothingListBySex(String sex){
        return categoryMapper.getClothingListBySex(sex);
    }

    @Override
    public List<Clothing> getClothingListByType(String type){
        return categoryMapper.getClothingListByType(type);
    }

    @Override
    public List<Clothing> getClothingListByStyle(String style){
        return categoryMapper.getClothingListByStyle(style);
    }

    @Override
    public List<Clothing> getClothingByName(String name){
        return categoryMapper.getClothingByName(name);
    }

    @Override
    public List<Clothing> getClothingListByPrice(PriceModel priceModel){
        return categoryMapper.getClothingListByPrice(priceModel);
    }

    @Override
    public Clothing getClothing(int merchandiseID){
        return categoryMapper.getClothing(merchandiseID);
    }

    @Override
    public List<Hotel> getHotelList(){
        return categoryMapper.getHotelList();
    }

    @Override
    public List<Hotel> getHotelListByRank(int rank){
        return categoryMapper.getHotelListByRank(rank);
    }

    @Override
    public List<Hotel> getHotelListByPrice(PriceModel priceModel){ return categoryMapper.getHotelListByPrice(priceModel); }

    @Override
    public List<Hotel> getHotelListByTablenumber(TableModel tableModel){ return categoryMapper.getHotelListByTablenumber(tableModel); }

    @Override
    public List<Hotel> getHotelByName(String name){
        return categoryMapper.getHotelByName(name);
    }

    @Override
    public Hotel getHotel(int merchandisID){
        return categoryMapper.getHotel(merchandisID);
    }

    @Override
    public List<Person> getPersonList(Person person){
        return categoryMapper.getPersonList(person);
    }

    @Override
    public Person getPerson(int merchandiseID){
        return categoryMapper.getPerson(merchandiseID);
    }

    @Override
    public Detail getDetail(int merchandiseID){
        return categoryMapper.getDetail(merchandiseID);
    }
}

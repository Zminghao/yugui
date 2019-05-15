package com.group8.yugui.controller;

import com.group8.yugui.data.OejectModel;
import com.group8.yugui.data.PriceModel;
import com.group8.yugui.data.TableModel;
import com.group8.yugui.domain.*;
import com.group8.yugui.service.CategotyService;
import org.omg.CORBA.OMGVMCID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ZhangMh on 2018/9/13.
 */
@RestController
@CrossOrigin
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategotyService categotyService;

    @GetMapping("/detail/{merchandiseID}")
    public Detail detail(@PathVariable("merchandiseID") int merchandiseID){
        return categotyService.getDetail(merchandiseID);
    }

    @GetMapping("/{merchandiseID}/personmore")
    public Person person(@PathVariable int merchandiseID){
        return categotyService.getPerson(merchandiseID);
    }

    @GetMapping("/{merchandiseID}/person/more")
    public Person personDetail(@PathVariable int merchandiseID){
        return categotyService.getPerson(merchandiseID);
    }

    @GetMapping("/car/list/{numth}")
    public Object carList(@PathVariable("numth") int numth){
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getCarList().size()/4;
        System.out.println(num);
        if (numth > num){
            numth = num;
        }
        System.out.println(num);
        oejectModel.setAll(num, categotyService.getCarList().subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/car/type/{type}/{numth}")
    public Object carListByType(@PathVariable("type") String type, @PathVariable("numth") int numth){
        //return categotyService.getCarListByType(type);
        OejectModel oejectModel = new OejectModel();
        int max = categotyService.getCarListByType(type).size();
        int num = categotyService.getCarListByType(type).size()/4;
        if (numth > num){
            numth = num;
        }
        oejectModel.setAll(num, categotyService.getCarListByType(type).subList(4*numth, Math.min(max,4*(numth+1))));
        return oejectModel;
    }

    @PostMapping("/car/price/{numth}")
    public Object carListByPrice(@RequestBody PriceModel priceModel, @PathVariable("numth") int numth){
        OejectModel oejectModel = new OejectModel();

        int max = categotyService.getCarListByPrice(priceModel).size();
        int num = categotyService.getCarListByPrice(priceModel).size()/4;
        if(numth > num){
            numth = num;
        }
        oejectModel.setAll(num, categotyService.getCarListByPrice(priceModel).subList(4*numth, Math.min(max,4*(numth+1))));
        //return categotyService.getCarListByPrice(priceModel);
        return oejectModel;
    }

    @GetMapping("/car/name/{name}")
    public List<Car> carByName(@PathVariable("name") String name){
        return categotyService.getCarByName(name);
    }

    @GetMapping("/{merchandiseID}/carmore")
    public Car car(@PathVariable("merchandiseID") int merchandiseID){
        return categotyService.getCar(merchandiseID);
    }

    @GetMapping("/car/more/{merchandiseID}")
    public Car carDetail(@PathVariable("merchandiseID") int merchandiseID){
        return categotyService.getCar(merchandiseID);
    }

    @GetMapping("/clothing/list/{numth}")
    public Object clothingList(@PathVariable("numth") int numth){
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingList().size()/4;
        if (numth > num){
            numth = num;
        }
        oejectModel.setAll(num, categotyService.getClothingList().subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        //return categotyService.getClothingList();
        return oejectModel;
    }

    @GetMapping("/clothing/sex/{sex}/{numth}")
    public Object clothingListBySex(@PathVariable("sex") String sex, @PathVariable("numth") int numth){
        //return categotyService.getClothingListBySex(sex);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingListBySex(sex).size()/4;
        oejectModel.setAll(num, categotyService.getClothingListBySex(sex).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/clothing/type/{type}/{numth}")
    public Object clothingListByType(@PathVariable("type") String type, @PathVariable("numth") int numth){
        //return categotyService.getClothingListByType(type);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingListByType(type).size()/4;
        oejectModel.setAll(num, categotyService.getClothingListByType(type).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/clothing/style/{style}/{numth}")
    public Object clothingListByStyle(@PathVariable("style") String style, @PathVariable("numth") int numth){
        //return categotyService.getClothingListByStyle(style);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingListByStyle(style).size()/4;
        oejectModel.setAll(num, categotyService.getClothingListByStyle(style).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @PostMapping("/clothing/price/{numth}")
    public Object clothingListByPrice(@RequestBody PriceModel priceModel, @PathVariable("numth") int numth){
        //return categotyService.getClothingListByPrice(priceModel);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingListByPrice(priceModel).size()/4;
        oejectModel.setAll(num, categotyService.getClothingListByPrice(priceModel).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/clothing/name/{name}/{numth}")
    public Object clothingListByName(@PathVariable("name") String name, @PathVariable("numth") int numth){
        //return categotyService.getClothingByName(name);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getClothingByName(name).size()/4;
        oejectModel.setAll(num, categotyService.getClothingByName(name).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/{merchandiseID}/clothingmore")
    public Clothing clothing(@PathVariable int merchandiseID){
        return categotyService.getClothing(merchandiseID);
    }

    @GetMapping("/clothing/more/{merchandiseID}")
    public Clothing clothingDetail(@PathVariable int merchandiseID){ return categotyService.getClothing(merchandiseID); }

    @GetMapping("/hotel/list/{numth}")
    public Object hotelList(@PathVariable("numth") int numth){
        //return categotyService.getHotelList();
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getHotelList().size()/4;
        oejectModel.setAll(num, categotyService.getHotelList().subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/hotel/rank/{rank}/{numth}")
    public Object hotelListByRank(@PathVariable("rank") int rank, @PathVariable("numth") int numth){
        //return categotyService.getHotelListByRank(rank);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getHotelListByRank(rank).size()/4;
        oejectModel.setAll(num, categotyService.getHotelListByRank(rank).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @PostMapping("/hotel/price/{numth}")
    public Object hotelListByPrice(@RequestBody PriceModel priceModel, @PathVariable("numth") int numth){
        //return categotyService.getHotelListByPrice(priceModel);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getHotelListByPrice(priceModel).size()/4;
        oejectModel.setAll(num, categotyService.getHotelListByPrice(priceModel).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @PostMapping("/hotel/table/{numth}")
    public Object hotelListByTable(@RequestBody TableModel tableModel, @PathVariable int numth){
        //return categotyService.getHotelListByTablenumber(tableModel);
        OejectModel oejectModel = new OejectModel();
        int num = categotyService.getHotelListByTablenumber(tableModel).size()/4;
        oejectModel.setAll(num, categotyService.getHotelListByTablenumber(tableModel).subList(4*numth, Math.min(4*num+1,4*(numth+1))));
        return oejectModel;
    }

    @GetMapping("/hotel/name/{name}")
    public List<Hotel> hotelByName(@PathVariable String name){
        return categotyService.getHotelByName(name);
    }

    @GetMapping("/{merchandiseID}/hotelmore")
    public Hotel hotel(@PathVariable int merchandiseID){
        return categotyService.getHotel(merchandiseID);
    }

    @GetMapping("/hotel/more/{merchandiseID}")
    public Hotel hotelDetail(@PathVariable int merchandiseID){
        return categotyService.getHotel(merchandiseID);
    }

}

package com.group8.yugui.controller;

import com.group8.yugui.domain.Shoplist;
import com.group8.yugui.model.ShoplistModel;
import com.group8.yugui.persistance.ShoplistMapper;
import com.group8.yugui.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    private ShopService shopService;

    @GetMapping("/get/{userID}")
    public List<Shoplist> getShoplist(@PathVariable("userID") int userID){
        return shopService.getShoplist(userID);
    }

    @PostMapping("/set")
    public Boolean setShoplist(@RequestBody ShoplistModel shoplistModel){
        Shoplist shoplist = new Shoplist();
        shoplist.setMerchandiseID(shoplistModel.getMerchandiseID());
        shoplist.setNum(shoplistModel.getNum());
        shoplist.setUserID(shoplistModel.getUserID());
        shoplist.setShoplistID((int)(1+Math.random()*10));
        System.out.println(shopService.setShoplist(shoplist));
        return shopService.setShoplist(shoplist);
    }

    @GetMapping("/delete")
    public void delete(){

    }

}

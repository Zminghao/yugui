package com.group8.yugui.service.impl;

import com.group8.yugui.domain.Shoplist;
import com.group8.yugui.persistance.ShoplistMapper;
import com.group8.yugui.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ShopService")
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShoplistMapper shoplistMapper;

    @Override
    public List<Shoplist> getShoplist(int userID) {
        List<Shoplist> object;
        try {
            object = shoplistMapper.getShoplistByUserID(userID);
        } catch (Exception e){
            object = null;
        }
        //return shoplistMapper.getShoplistByUserID(userID);
        return object;
    }

    @Override
    public Boolean setShoplist(Shoplist shoplist) {
        boolean state;
        try {
            shoplistMapper.setShopByUserID(shoplist);
            state = true;
        } catch (Exception e){
            state = false;
        }
        return state;
    }
}

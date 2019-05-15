package com.group8.yugui.service;

import com.group8.yugui.domain.Shoplist;

import java.util.List;

public interface ShopService {
    List<Shoplist> getShoplist(int userID);

    Boolean setShoplist(Shoplist shoplist);
}

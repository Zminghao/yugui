package com.group8.yugui.persistance;

import com.group8.yugui.domain.Shoplist;

import java.util.List;

public interface ShoplistMapper {
    List<Shoplist> getShoplistByUserID(int userID);

    Boolean setShopByUserID(Shoplist shoplist);
}

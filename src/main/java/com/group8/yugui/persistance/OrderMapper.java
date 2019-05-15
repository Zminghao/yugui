package com.group8.yugui.persistance;

import com.group8.yugui.domain.Order;

import java.util.List;

public interface OrderMapper {
    Order getOrderById(int orderID);

    List<Order> getOrderListByUserId(String userID);

    void insertOrder(Order order);

}

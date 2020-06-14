package com.camel.camel.service;

import com.camel.camel.domain.Order;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {

    private List<Order> orderList = new ArrayList<>();

    @PostConstruct
    public void setOrderList() {
        this.orderList.add(new Order(67, "Mobile", 5000));
        this.orderList.add(new Order(87, "Book", 400));
        this.orderList.add(new Order(67, "AC", 15000));
        this.orderList.add(new Order(45, "Shoes", 4000));
    }

    public Order addOrder(Order order){
        orderList.add(order);
        return order;
    }

    public List<Order> getOrderList(){
        return orderList;
    }
}

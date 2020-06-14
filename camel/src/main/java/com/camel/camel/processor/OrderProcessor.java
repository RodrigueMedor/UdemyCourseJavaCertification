package com.camel.camel.processor;


import com.camel.camel.domain.Order;
import com.camel.camel.service.OrderService;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderProcessor implements Processor {

    @Autowired
    private OrderService orderService;

    @Override
    public void process(Exchange exchange) throws Exception {

        orderService.addOrder(exchange.getIn().getBody(Order.class));

    }
}

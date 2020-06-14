package com.camel.camel.resouces;

import com.camel.camel.domain.Order;
import com.camel.camel.processor.OrderProcessor;
import com.camel.camel.service.OrderService;
import org.apache.camel.BeanInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*router class*/
@Component
public class ApplicationResource extends RouteBuilder {

    @Autowired
    private OrderService orderService;
    @BeanInject
    private OrderProcessor orderProcessor;

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);


        rest().get("/hello-world").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(constant("Welcome to java techenique")).endRest();

        rest().get("/getOrders").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(()-> orderService.getOrderList()).endRest();

        rest().post("/addOrder").consumes(MediaType.APPLICATION_JSON_VALUE).type(Order.class).outType(Order.class).route().process(orderProcessor).endRest();

    }
}

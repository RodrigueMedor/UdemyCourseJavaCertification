package com.camel.camel.resouces;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;

@Component
public class ApplicationResource extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        restConfiguration().component("servlet").port(9090).host("localhost").bindingMode(RestBindingMode.json);


        rest().get("/hellow-world").produces(MediaType.APPLICATION_JSON_VALUE).route().setBody(constant("Welcome to java techenique"));

    }
}

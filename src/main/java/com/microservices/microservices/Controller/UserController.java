package com.microservices.microservices.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(method = RequestMethod.GET,value = "/userData")
    public String getUserDetails(){
        return "Hello from microservice";
    }

}

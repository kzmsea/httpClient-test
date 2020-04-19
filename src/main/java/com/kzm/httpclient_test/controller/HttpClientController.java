package com.kzm.httpclient_test.controller;

import com.kzm.httpclient_test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpClientController {

    @GetMapping("/doGetControllerOne")
    public String doGetControllerOne(){
        return "123";
    }

    @GetMapping("/doGetControllerTwo")
    public String doGetControllerTwo(String name,Integer age){
        return name+"-"+age;
    }

    @PostMapping("/doPostControllerOne")
    public String doPostControllerOne(){
        return "123";
    }

    @PostMapping("/doPostControllerFour")
    public String doPostControllerFour(String name,Integer age){
        return name+"-"+age;
    }

    @PostMapping("/doPostControllerTwo")
    public String doPostControllerTwo(@RequestBody User user){
        return user.toString();
    }

}

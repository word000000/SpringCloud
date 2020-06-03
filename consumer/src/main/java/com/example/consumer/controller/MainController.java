package com.example.consumer.controller;

import com.example.consumer.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author guoqi
 */
@RestController
public class MainController {

    @Autowired
    MainService mainService;

    @RequestMapping("/v1")
    public String test(){
        String name = mainService.get();
        return name;
    }
}

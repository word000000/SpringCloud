package com.example.consumer.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author guoqi
 */

@Component
@FeignClient(name = "producer")
public interface MainService {

    /**
     * 调用producer
     * @return
     */
    @RequestMapping(value="/demo/get")
    public String get();

}

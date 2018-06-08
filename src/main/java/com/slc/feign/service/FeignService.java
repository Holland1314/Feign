package com.slc.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shileichao on 2018/5/31.
 */
@FeignClient(value = "springboot-client",fallback = FeignServiceImpl.class)
public interface FeignService {

    @RequestMapping(value = "/user/findById", method = RequestMethod.GET)
//    @GetMapping("/user/findById")
    String findById(@RequestParam("id") String id);


}

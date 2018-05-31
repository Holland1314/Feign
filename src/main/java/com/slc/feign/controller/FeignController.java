package com.slc.feign.controller;

import com.slc.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shileichao on 2018/5/31.
 */
@RestController
public class FeignController {

    @Autowired
    private FeignService feignService;
   @GetMapping("/user/findById")
    public String findById(@RequestParam("id")String id){
        return feignService.findById(id);
    }



}

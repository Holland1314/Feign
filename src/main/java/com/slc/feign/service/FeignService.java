package com.slc.feign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by shileichao on 2018/5/31.
 */
@FeignClient(value = "springboot-client")
public interface FeignService {

    @GetMapping("/user/findById")
    String findById(@RequestParam("id") String id);
}

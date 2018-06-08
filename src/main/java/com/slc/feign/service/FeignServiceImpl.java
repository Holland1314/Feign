package com.slc.feign.service;

import org.springframework.stereotype.Component;

/**
 * Created by shileichao on 2018/6/8.
 */
@Component
public class FeignServiceImpl implements FeignService {

    @Override
    public String findById(String id) {
        return "调用springboot-client服务超时，调用方法findById（id）==根据id查询所有记录"+id;
    }


}

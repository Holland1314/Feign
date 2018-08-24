package com.slc.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.HashMap;
import java.util.Map;

@SpringCloudApplication
/*@SpringBootApplication
@EnableDiscoveryClient*/
@EnableFeignClients
public class FeignApplication {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();
		SpringApplication.run(FeignApplication.class, args);
	}
}

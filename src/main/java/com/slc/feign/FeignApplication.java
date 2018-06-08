package com.slc.feign;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class FeignApplication {

	public static void main(String[] args) {

		Map<String, Object> map = new HashMap<>();
		SpringApplication.run(FeignApplication.class, args);
	}
}

package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages="com.gf.service")
public class ConsumerApp {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApp.class, args);
	}
}

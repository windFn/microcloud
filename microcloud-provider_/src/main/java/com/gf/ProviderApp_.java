package com.gf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan(basePackages={"com.gf.mapper"})
public class ProviderApp_ {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApp_.class, args);
	}
}

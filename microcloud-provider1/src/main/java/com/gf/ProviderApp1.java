package com.gf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-01
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@MapperScan(basePackages={"com.gf.mapper"})
public class ProviderApp1 {
	public static void main(String[] args) {
		SpringApplication.run(ProviderApp1.class, args);
	}
}

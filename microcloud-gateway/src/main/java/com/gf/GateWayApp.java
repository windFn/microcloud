package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2021-01-04
 */
@SpringBootApplication
@EnableDiscoveryClient
public class GateWayApp {
	public static void main(String[] args) {
		SpringApplication.run(GateWayApp.class, args);
	}
}

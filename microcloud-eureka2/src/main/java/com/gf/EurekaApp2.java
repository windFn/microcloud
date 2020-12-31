package com.gf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-02
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApp2 {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApp2.class, args);
	}
}

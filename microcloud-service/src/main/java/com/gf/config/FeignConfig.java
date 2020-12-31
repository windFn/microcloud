package com.gf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import feign.auth.BasicAuthRequestInterceptor;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-30
 */
@Configuration
public class FeignConfig {
	@Bean
	public BasicAuthRequestInterceptor getBasicAuthRequestInterceptor(){
		return new BasicAuthRequestInterceptor("ganf", "123");
	}
}

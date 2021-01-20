package com.gf.filter;

import java.util.Base64;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2021-01-04
 */
@Component
public class AuthFilter implements GlobalFilter, Ordered{

	@Override
	public int getOrder() {
		return 0;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		String header = "Basic "+Base64.getEncoder().encodeToString("ganf:123".getBytes());
		ServerHttpRequest request = exchange.getRequest();
		ServerHttpRequest serverHttpRequest = request.mutate().header("authorization", header).build();
		ServerWebExchange webExchange = exchange.mutate().request(serverHttpRequest).build();
		return chain.filter(webExchange);
	}
	
}

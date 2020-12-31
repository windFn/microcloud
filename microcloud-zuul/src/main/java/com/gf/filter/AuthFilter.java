package com.gf.filter;

import java.util.Base64;

import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

/**
 * <p>Description: </p> 
 * @author ganF
 * @date 2020-12-31
 */
@Component
public class AuthFilter extends ZuulFilter{

	@Override
	public Object run() throws ZuulException {
		try {
			RequestContext context = RequestContext.getCurrentContext();
			String header = "Basic "+Base64.getEncoder().encodeToString("ganf:123".getBytes());
			context.addZuulRequestHeader("authorization",header);
		} catch (Exception e) {
		}
		return null;
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return FilterConstants.PRE_TYPE;
	}

}

package com.wallechen.scs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Configuration;

/**
 * spring-cloud-gateway-zuul1
 */
@EnableAutoConfiguration
@Configuration
@EnableZuulProxy
public class ZuulApp {
	public static void main(String[] args) {
		new SpringApplicationBuilder(ZuulApp.class).run(args);
	}
}

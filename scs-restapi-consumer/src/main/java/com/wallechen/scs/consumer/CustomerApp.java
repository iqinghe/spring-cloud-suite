package com.wallechen.scs.consumer;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * customer rest api
 */
@Configuration
@ComponentScan(basePackages = {"com.wallechen.scs"})
@EnableAutoConfiguration
@EnableFeignClients(basePackages = {"com.wallechen.scs.restservice"})
public class CustomerApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CustomerApp.class).web(true).run(args);
	}

}

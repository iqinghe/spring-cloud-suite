package com.wallechen.scs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * customer rest api
 */
@Configuration
@EnableAutoConfiguration
@EnableFeignClients(basePackages = {"com.wallechen.scs.restservice"})
@ComponentScan(basePackages = {"com.wallechen.scs"})
public class CustomerApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(CustomerApp.class).web(true).run(args);
	}

}

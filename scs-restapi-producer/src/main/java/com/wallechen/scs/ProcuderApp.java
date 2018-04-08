package com.wallechen.scs;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 服务提供方
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class ProcuderApp
{
    public static void main(String[] args) {
        new SpringApplicationBuilder(ProcuderApp.class).web(true).run(args);
    }
}

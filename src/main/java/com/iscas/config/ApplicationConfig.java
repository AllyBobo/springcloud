package com.iscas.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Created by lee on 2017/7/6.
 */
@EnableConfigServer
@SpringBootApplication
public class ApplicationConfig {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApplicationConfig.class).web(true).run(args);
    }
}
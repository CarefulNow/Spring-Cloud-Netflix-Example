package com.bazinga.dukc.eureka.server;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by bazinga on 7/1/17.
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {
    public static void main(String argc[]) {
        SpringApplication.run(EurekaServer.class, argc);
    }
}

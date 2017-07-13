package com.bazinga.dukc.webservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * Created by bazinga on 7/2/17.
 */

@EnableEurekaClient
@EnableFeignClients
@SpringBootApplication
public class DukcWebService {
    public static void main(String[] argc) {
        SpringApplication.run(DukcWebService.class, argc);
    }
}

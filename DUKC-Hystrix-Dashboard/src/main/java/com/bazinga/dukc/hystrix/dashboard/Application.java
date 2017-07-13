package com.bazinga.dukc.hystrix.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Created by bazinga on 7/13/17.
 */
@EnableHystrixDashboard
@SpringBootApplication
@EnableAutoConfiguration
public class Application {
    public static void main(String[] argc) {
        SpringApplication.run(Application.class, argc);
    }
}

package com.bazinga.dukc.hystrix.turbine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * Created by bazinga on 7/2/17.
 */

@SpringBootApplication
@EnableTurbine
public class HystrixTurbineApplication {
    public static void main(String[] argc) {
        new SpringApplicationBuilder(HystrixTurbineApplication.class).web(true).run(argc);
    }
}

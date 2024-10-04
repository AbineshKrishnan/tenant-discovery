package com.tenant.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TenantDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TenantDiscoveryApplication.class, args);
    }

}

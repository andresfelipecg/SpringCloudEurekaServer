package com.centennial.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

//Student   : Andres Cuero
//Student id: 301203787

@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEurekaServerApplication.class, args);
		 System.out.println("Eureka Server started");
	}

}

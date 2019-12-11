package com.ragnax.zapala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class RagnaxZapalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(RagnaxZapalaApplication.class, args);
	}

}

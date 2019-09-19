package com.muhtar.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class ServerDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}
}

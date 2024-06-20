package com.example.ProvaFinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.repository")
public class ProvaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProvaFinalApplication.class, args);
	}

}

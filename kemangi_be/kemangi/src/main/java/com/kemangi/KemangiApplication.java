package com.kemangi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class KemangiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KemangiApplication.class, args);
	}

}

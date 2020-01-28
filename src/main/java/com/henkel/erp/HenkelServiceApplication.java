package com.henkel.erp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.henkel.erp")
public class HenkelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HenkelServiceApplication.class, args);
	}

}

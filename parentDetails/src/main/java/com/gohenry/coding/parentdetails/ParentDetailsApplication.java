package com.gohenry.coding.parentdetails;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.gohenry.coding.parentdetails")
public class ParentDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParentDetailsApplication.class, args);
	}

}

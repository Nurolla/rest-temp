package com.springboot.resttemp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.springboot.resttemp"})
public class ResttempApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResttempApplication.class, args);
	}

}

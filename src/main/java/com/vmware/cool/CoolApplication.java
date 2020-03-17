package com.vmware.cool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.vmware.cool")
@SpringBootApplication
public class CoolApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoolApplication.class, args);
	}

}

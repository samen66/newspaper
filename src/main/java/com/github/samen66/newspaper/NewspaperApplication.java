package com.github.samen66.newspaper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

@SpringBootApplication
@ComponentScan(basePackages = {"com.github.samen66.newspaper"})
public class NewspaperApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewspaperApplication.class, args);
	}


}

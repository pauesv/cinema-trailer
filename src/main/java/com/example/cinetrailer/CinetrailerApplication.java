package com.example.cinetrailer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class CinetrailerApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CinetrailerApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(CinetrailerApplication.class, args);
	}

	@Bean
	public SpringDataDialect springDataDialect() {
		return new SpringDataDialect();
	}
}


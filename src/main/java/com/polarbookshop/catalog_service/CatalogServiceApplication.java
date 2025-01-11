package com.polarbookshop.catalog_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationProperties
public class CatalogServiceApplication {


	public static void main(String[] args) {
		SpringApplication.run(CatalogServiceApplication.class, args);
	}

}

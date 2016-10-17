package com.treehouse.springbasics.gradle.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class AppConfig {

	public static void main(String[] args) {
		/* 
		 * method to create new application context passing "this" class
		 * and args from main
		 */
		
		SpringApplication.run(AppConfig.class, args);
	}

}

package com.example;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.factory.RepositoryFactory;

@SpringBootApplication
public class DemoApplication {
	static Logger logger = Logger.getLogger(DemoApplication.class.getName());
	@Autowired
	RepositoryFactory repositoryFactory;

	public static void main(String[] args) {
		logger.info("=======DemoApplication start!!!!");
		
		SpringApplication.run(DemoApplication.class, args);
		
		logger.info("=======DemoApplication end!!!!");
	}
}

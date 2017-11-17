package com.example;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.example.factory.RepositoryFactory;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class, })
public class DemoApplication {
	static Logger logger = Logger.getLogger(DemoApplication.class);
	static RepositoryFactory repositoryFactory;

	public static void main(String[] args) {
		logger.info("=======DemoApplication start!!!!");
		SpringApplication.run(DemoApplication.class, args);
		logger.info("=======DemoApplication end!!!!");
	}
}

package com.training.com;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LoggingApplication {
	
	@Value("${spring.application.name}")
	private String AppName;
	
	  Logger logger = LoggerFactory.getLogger(LoggingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(LoggingApplication.class, args);
		
	}
	
	@GetMapping("/")
	public String getLogMessage() {
		System.out.println("App Name is: " + AppName);
		logger.info("This is logger information");
		logger.warn("This is warning message");
		logger.error("This is error message");
		logger.trace("This is a Trace warning");
		return "Check your log message";
	}

}

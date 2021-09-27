package com.tedblob.filecompression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class LogBackFileCompressionApplication {

	private static final Logger logger = LoggerFactory.getLogger(LogBackFileCompressionApplication.class);

	public static void main(String[] args) {
		logger.debug("SpringBootApplication main START");
		SpringApplication.run(LogBackFileCompressionApplication.class, args);
		logger.debug("SpringBootApplication main method END");
	}


}

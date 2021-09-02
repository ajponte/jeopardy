package com.alanjponte.jeopardy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.alanjponte.jeopardy", "org.springframework.boot"})
public class JeopardyApplication extends WebMvcAutoConfiguration {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(JeopardyApplication.class);
		logger.debug("JeopardyApplication started!");

		SpringApplication.run(JeopardyApplication.class, args);
	}
}

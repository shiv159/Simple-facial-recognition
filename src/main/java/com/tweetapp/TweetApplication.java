package com.tweetapp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableMongoAuditing
@EnableSwagger2
public class TweetApplication {

	
	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(TweetApplication.class);
		logger.debug("===========> Tweet App Starting @Shivam <===========");
		SpringApplication.run(TweetApplication.class, args);
	}
}

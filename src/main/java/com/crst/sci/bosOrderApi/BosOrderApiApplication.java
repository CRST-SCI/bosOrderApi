package com.crst.sci.bosOrderApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Rohit
 *
 */
@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class BosOrderApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BosOrderApiApplication.class, args);
	}
}

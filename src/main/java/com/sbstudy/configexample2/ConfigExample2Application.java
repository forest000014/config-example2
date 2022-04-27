package com.sbstudy.configexample2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigExample2Application {

	public static void main(String[] args) {
		SpringApplication.run(ConfigExample2Application.class, args);
	}

}

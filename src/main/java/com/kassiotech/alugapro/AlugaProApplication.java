package com.kassiotech.alugapro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude= {UserDetailsServiceAutoConfiguration.class})

public class AlugaProApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlugaProApplication.class, args);
	}

}

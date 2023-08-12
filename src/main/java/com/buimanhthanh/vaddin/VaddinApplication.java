package com.buimanhthanh.vaddin;

import com.vaadin.flow.spring.security.VaadinWebSecurity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;

@SpringBootApplication
public class VaddinApplication{

	public static void main(String[] args) {
		SpringApplication.run(VaddinApplication.class, args);
	}



}

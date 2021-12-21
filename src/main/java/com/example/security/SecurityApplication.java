package com.example.security;

import com.example.security.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityApplication {

	public static void main(String[] args) {
		Log logger = new Log();
		try{
			SpringApplication.run(SecurityApplication.class, args);
		}
		catch (Exception e)
		{
			logger.log(e.getMessage());
		}
	}

}

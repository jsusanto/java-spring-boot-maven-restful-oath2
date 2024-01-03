package com.medibank.restfuloauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

/*
Reference: https://www.baeldung.com/spring-boot-api-key-secret
What is OAuth2?
OAuth2 is the de facto standard for REST API security. 
It’s an open authentication and authorization standard that allows resource owners 
to give clients delegated access to private data via an access token.
*/

@SpringBootApplication
        (exclude = {SecurityAutoConfiguration.class, UserDetailsServiceAutoConfiguration.class})
public class Restfuloauth2Application {
        
        public static void main(String[] args) {
		SpringApplication.run(Restfuloauth2Application.class, args);
	}

}

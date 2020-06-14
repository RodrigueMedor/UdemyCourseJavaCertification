package com.example.spring.camel.api.config;

import javax.jms.ConnectionFactory;

import org.apache.camel.language.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.JmsTransactionManager;

@Configuration
public class JmsConfig {
	
	@Bean
	public JmsTransactionManager createJmsTransactionManager(final ConnectionFactory connectionFactory) {
		
	}

}

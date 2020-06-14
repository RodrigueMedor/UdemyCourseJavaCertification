package com.cameljms.cameljms.config;

import javax.jms.ConnectionFactory;

import org.apache.camel.component.jms.JmsComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.JmsTransactionManager;

@Configuration
public class JmsConfig {
	
	@Bean
	public JmsTransactionManager createJmsTransactionManager(final ConnectionFactory connectionFactory) {
		 JmsTransactionManager transactionManager =  new JmsTransactionManager();
		 transactionManager.setConnectionFactory(connectionFactory);
		 return transactionManager;
	}

	@Bean
	public JmsComponent createJmsComponent(final ConnectionFactory connectionFactory, final  JmsTransactionManager transactionManager, @Value("${max.concurrent.consumers}") final int maxConcurentConsumes){
		JmsComponent jmsComponent = JmsComponent.jmsComponentTransacted(connectionFactory, transactionManager);
		jmsComponent.setMaxConcurrentConsumers(maxConcurentConsumes);

		return jmsComponent;
	}

}

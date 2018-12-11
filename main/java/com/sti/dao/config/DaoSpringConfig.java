package com.sti.dao.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sti.dao.api.CustomerDao;
import com.sti.dao.impl.CustomerDaoImpl;

@Configuration
public class DaoSpringConfig {
	
	@Bean
	public CustomerDao customerDao() {
		return new CustomerDaoImpl();
	}

}

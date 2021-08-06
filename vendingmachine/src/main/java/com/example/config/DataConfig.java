package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

import com.example.entities.Container;
import com.example.entities.Drink;
import com.example.entities.Refill;
import com.example.entities.SaleList;


@Configuration
public class DataConfig implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
		Class[] domainTypes = {Drink.class, SaleList.class, Refill.class, Container.class};
		config.exposeIdsFor(domainTypes);
	}
	
}

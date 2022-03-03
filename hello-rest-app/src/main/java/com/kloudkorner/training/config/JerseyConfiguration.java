package com.kloudkorner.training.config;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.kloudkorner.training.controller.ClientController;
import com.kloudkorner.training.mapper.GenericExceptionMapper;

@Configuration
@ApplicationPath("/kloudkorner/v1")
public class JerseyConfiguration extends ResourceConfig {

	@PostConstruct
	public void init() {
		register(ClientController.class);
		register(GenericExceptionMapper.class);
	}
}
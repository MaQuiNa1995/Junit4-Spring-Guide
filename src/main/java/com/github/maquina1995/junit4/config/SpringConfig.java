package com.github.maquina1995.junit4.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.maquina1995.junit4.service.CalculadoraService;
import com.github.maquina1995.junit4.service.CalculadoraServiceImpl;

@Configuration
public class SpringConfig {

	@Bean
	public CalculadoraService calculadoraService() {
		return new CalculadoraServiceImpl();
	}

}

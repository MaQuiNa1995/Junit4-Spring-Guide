package es.maquina1995.configuration;

import org.springframework.context.annotation.Bean;

import es.maquina1995.calculadoraJunit.Calculadora;

public class SpringConfig {
	@Bean
	public Calculadora calculadora() {
		return new Calculadora();
	}
}

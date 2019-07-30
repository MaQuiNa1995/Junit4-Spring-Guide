package es.maquina1995.calculadora.configuration;

import org.springframework.context.annotation.Bean;

import es.maquina1995.calculadora.Calculadora;
import es.maquina1995.calculadora.CalculadoraImpl;

public class SpringConfig {
	
	@Bean
	public Calculadora calculadora() {
		return new CalculadoraImpl();
	}
}

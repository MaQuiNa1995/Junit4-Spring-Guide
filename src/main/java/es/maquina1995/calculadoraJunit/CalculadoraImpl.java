package es.maquina1995.calculadoraJunit;

public class CalculadoraImpl implements Calculadora {

	
	@Override
	public Double sumar(Double num1, Double num2) {

		return num1 + num2;

	}

	@Override
	public Double restar(Double num1, Double num2) {

		return num1 - num2;

	}

	@Override
	public Double multiplicar(Double num1, Double num2) {

		return num1 * num2;

	}

	@Override
	public Double dividir(Double dividendo, Double cociente) {

		if (dividendo == 0d || cociente == 0d) {

			throw new ArithmeticException("Ninguno de los 2 parametros puede ser cero");
		}
		return dividendo / cociente;

	}

	@Override
	public boolean comprobarNulos(Double num1, Double num2) {
		Boolean algunParametroNulo = Boolean.FALSE;
		
		if (num1 == null || num2 == null) {
			algunParametroNulo = Boolean.TRUE;
		}
		
		return algunParametroNulo;
	}
}

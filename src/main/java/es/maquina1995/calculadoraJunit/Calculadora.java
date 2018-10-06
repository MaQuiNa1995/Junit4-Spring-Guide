package es.maquina1995.calculadoraJunit;

import org.springframework.lang.NonNull;

public class Calculadora {

	public Double sumar(@NonNull Double num1, @NonNull Double num2) {

		comprobarNulos(num1, num2);
		return num1 + num2;

	}

	public Double restar(@NonNull Double num1,@NonNull Double num2) {

		comprobarNulos(num1, num2);
		return num1 - num2;

	}

	public Double multiplicar(@NonNull Double num1,@NonNull Double num2) {

		comprobarNulos(num1, num2);
		return num1 * num2;

	}

	public Double dividir(@NonNull Double dividendo,@NonNull Double cociente) {

		comprobarNulos(dividendo, cociente);
		return dividendo / cociente;
	}

	private void comprobarNulos(@NonNull Double num1,@NonNull Double num2) {
		if (num1 == null || num2 == null) {
			throw new IllegalArgumentException("Uno de los números es nulo");
		}
	}
}

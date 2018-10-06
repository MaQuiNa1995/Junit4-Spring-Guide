package es.maquina1995.calculadoraJunit;

public interface Calculadora {

	public Double sumar(Double num1, Double num2);

	public Double restar(Double num1, Double num2);

	public Double multiplicar(Double num1, Double num2);

	public Double dividir(Double dividendo, Double cociente);

	public boolean comprobarNulos(Double num1, Double num2);

}
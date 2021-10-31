package com.github.maquina1995.junit4;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.github.maquina1995.junit4.config.SpringConfig;
import com.github.maquina1995.junit4.service.CalculadoraService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class CalculadoraServiceTest {

	private static final Double RESULTADO_ESPERADO = 10.0;

	@Autowired
	private CalculadoraService sut;

	@Test
	public void sumarTest() {

		Double suma = sut.sumar(5d, 5d);
		Assert.assertEquals(RESULTADO_ESPERADO, suma);
	}

	@Test
	public void sumarFailTest() {

		Double suma = sut.sumar(6d, 5d);
		Assert.assertNotEquals(RESULTADO_ESPERADO, suma);
	}

	@Test
	public void restarTest() {

		Double resta = sut.restar(20d, 10d);
		Assert.assertEquals(RESULTADO_ESPERADO, resta);

	}

	@Test
	public void restarFailTest() {

		Double resta = sut.restar(20d, 10d);
		Assert.assertEquals(RESULTADO_ESPERADO, resta);

	}

	@Test
	public void dividirTest() {

		Double cociente = sut.dividir(20d, 2d);
		Assert.assertEquals(RESULTADO_ESPERADO, cociente);

	}

	@Test
	public void dividirFailTest() {

		Double cociente = sut.dividir(20d, 1d);
		Assert.assertNotEquals(RESULTADO_ESPERADO, cociente);

	}

	@Test(expected = ArithmeticException.class)
	public void dividirCeroTest() {
		sut.dividir(0d, 1d);
		Assert.fail("El test ha fallado porque no se ha dado la ArithmeticException");
	}

	@Test(expected = ArithmeticException.class)
	public void dividirCero2Test() {
		sut.dividir(10d, 0d);
		Assert.fail("El test ha fallado porque no se ha dado la ArithmeticException");
	}

	@Test(expected = ArithmeticException.class)
	public void dividirNulo1Test() {
		sut.dividir(null, 10d);
		Assert.fail("El test ha fallado porque no se ha dado la ArithmeticException");
	}

	@Test(expected = ArithmeticException.class)
	public void dividirNulo2Test() {
		sut.dividir(10d, null);
		Assert.fail("El test ha fallado porque no se ha dado la ArithmeticException");
	}

	@Test(expected = ArithmeticException.class)
	public void dividirNulo3Test() {
		sut.dividir(null, null);
		Assert.fail("El test ha fallado porque no se ha dado la ArithmeticException");
	}

	@Test
	public void multiplicarTest() {

		Double producto = sut.multiplicar(2d, 5d);
		Assert.assertEquals(RESULTADO_ESPERADO, producto);
	}

	@Test
	public void multiplicarFailTest() {

		Double producto = sut.multiplicar(2d, 4d);
		Assert.assertNotEquals(RESULTADO_ESPERADO, producto);

	}

	/**
	 * Ejecutado antes de cada test
	 */
	@Before
	public void before() {
		// Implementación
	}

	/**
	 * Ejecutado después de cada test
	 */
	@After
	public void after() {
		// Implementación
	}

	/**
	 * Ejecutado antes de ejecutar el 1º test
	 */
	@BeforeClass
	public static void beforeClass() {
		// Implementación
	}

	/**
	 * Ejecutado después de ejecutar el último test
	 */
	@AfterClass
	public static void afterClass() {
		// Implementación
	}

}

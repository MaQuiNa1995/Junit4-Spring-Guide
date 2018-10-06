package es.maquina1995.calculadoraJunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import es.maquina1995.configuration.SpringConfig;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { SpringConfig.class })
public class CalculadoraTest extends TestCase {

	private static final Double RESULTADO_ESPERADO = 10.0;

	@Autowired
	private Calculadora sut;

	@Test
	public void sumarTest() {
		
		Double suma = sut.sumar(5d, 5d);
		assertEquals(RESULTADO_ESPERADO, suma);
		
	}

	@Test
	public void sumarFailTest() {
		
		Double suma = sut.sumar(6d, 5d);
		assertNotSame(RESULTADO_ESPERADO, suma);
		
	}

	@Test
	public void restarTest() {
		
		Double resta = sut.restar(20d, 10d);
		assertEquals(RESULTADO_ESPERADO, resta);
		
	}

	@Test
	public void restarFailTest() {
		
		Double resta = sut.restar(20d, 10d);
		assertEquals(RESULTADO_ESPERADO, resta);
		
	}

	@Test
	public void dividirTest() {
		
		Double cociente = sut.dividir(20d, 2d);
		assertEquals(RESULTADO_ESPERADO, cociente);
		
	}

	@Test
	public void dividirFailTest() {
		
		Double cociente = sut.dividir(20d, 1d);
		assertNotSame(RESULTADO_ESPERADO, cociente);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividirCeroTest() {
		
		sut.dividir(0d, 1d);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void dividirCeroTest2() {
		
		sut.dividir(10d, 0d);
		
	}

	@Test
	public void multiplicarTest() {
		
		Double producto = sut.multiplicar(2d, 5d);
		assertEquals(RESULTADO_ESPERADO, producto);
		
	}
	
	@Test
	public void multiplicarFailTest() {
		
		Double producto = sut.multiplicar(2d, 4d);
		assertNotSame(RESULTADO_ESPERADO, producto);
		
	}

	@Test
	public void comprobarNuloTest() {
		
		Assert.assertTrue(sut.comprobarNulos(null, 2d));
		
	}
	
	@Test
	public void comprobarNuloTest2() {
		
		Assert.assertTrue(sut.comprobarNulos(2d, null));
		
	}
	
	@Test
	public void comprobarNuloTest3() {
		
		Assert.assertTrue(sut.comprobarNulos(null, null));
		
	}
	@Test
	public void comprobarNuloTest4() {
		
		Assert.assertFalse(sut.comprobarNulos(2d, 1d));
		
	}
	
	@Before
	@Override
	public void setUp() throws Exception {
		
		super.setUp();
		
	}

	@After
	@Override
	public void tearDown() throws Exception {
		
		super.tearDown();
		
	}

}

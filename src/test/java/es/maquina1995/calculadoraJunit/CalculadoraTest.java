package es.maquina1995.calculadoraJunit;

import org.junit.After;
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

	@Test
	public void sumar() {
		Double suma = sut.sumar(5d, 5d);
		assertEquals(RESULTADO_ESPERADO, suma);
	}

	@Test(expected = IllegalArgumentException.class)
	public void sumarNulo() {
		sut.sumar(null, 2d);
	}
	
	@Test
	public void restar() {
		Double resta = sut.restar(20d, 10d);
		assertEquals(RESULTADO_ESPERADO, resta);
	}
	
	@Test
	public void dividir() {
		Double cociente = sut.dividir(20d, 2d);
		assertEquals(RESULTADO_ESPERADO, cociente);
	}
	
	@Test
	public void multiplicar() {
		Double producto = sut.multiplicar(2d, 5d);
		assertEquals(RESULTADO_ESPERADO, producto);
	}

}

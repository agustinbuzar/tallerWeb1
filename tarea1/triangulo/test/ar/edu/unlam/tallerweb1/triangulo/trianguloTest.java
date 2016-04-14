package ar.edu.unlam.tallerweb1.triangulo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.Triangulo.Triangulo;

public class trianguloTest {

	@Test
	public void testArea() {
		Triangulo sacarArea = new Triangulo();
		sacarArea.calcularArea (2,3);
		
		Assert.assertTrue(3 == sacarArea.resultadoArea());
	}
	
	@Test
	public void testPerimetro() {
		Triangulo sacarPerimetro = new Triangulo();
		sacarPerimetro.calcularPerimetro (2,3,7);
		
		Assert.assertTrue(12 == sacarPerimetro.resultadoPerimetro());
	}

}

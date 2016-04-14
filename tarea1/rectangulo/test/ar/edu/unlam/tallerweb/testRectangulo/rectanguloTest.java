package ar.edu.unlam.tallerweb.testRectangulo;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.rectangulo.rectangulo;

public class rectanguloTest {

	@Test
	public void testArea() {
		rectangulo area = new rectangulo();
		area.calcularArea (8, 5);
		
		Assert.assertTrue(40 == area.resultadoArea());
		
	}
	
	@Test
	public void testPerimetro() {
		rectangulo perimetro = new rectangulo();
		perimetro.calcularPerimetro (8, 5);
		
		Assert.assertTrue(26 == perimetro.resultadoPerimetro());
		
	}

}

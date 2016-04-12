package ar.edu.unlam.tallerweb.testRectangulo;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerweb.rectangulo.Rectangulo;

public class rectanguloTest {

	@Test
	public void testArea() {
		Rectangulo area = new Rectangulo();
		area.calcularArea (8, 5);
		
		Assert.assertTrue(40 == area.resultadoArea());
		
	}
	
	@Test
	public void testPerimetro() {
		Rectangulo perimetro = new Rectangulo();
		perimetro.calcularPerimetro (8, 5);
		
		Assert.assertTrue(26 == perimetro.resultadoPerimetro());
		
	}

}

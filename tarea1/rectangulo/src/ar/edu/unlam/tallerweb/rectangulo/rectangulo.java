package ar.edu.unlam.tallerweb.rectangulo;

public class rectangulo {
	private double area;
	private double perimetro;
	
	public void calcularArea (double base, double altura){
		area = base * altura;
	}
	
	public void calcularPerimetro (double base,double altura){
		perimetro = 2*(base + altura);
	}
	
	public double resultadoArea (){
		return area;
	}
	
	public double resultadoPerimetro(){
		return perimetro;
	}
}

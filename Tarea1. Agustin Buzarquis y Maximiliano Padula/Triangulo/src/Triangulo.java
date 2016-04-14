
public class Triangulo {

	private double area;
	private double perimetro;
		
	public void calcularArea (double base, double altura){
		area = (base * altura)/2 ;
	}
		
	public void calcularPerimetro (double lado1,double lado2,double lado3){
		perimetro = lado1+lado2+lado3;
	}
		
	public double resultadoArea (){
		return area;
	}
		
	public double resultadoPerimetro(){
		return perimetro;
	}


}

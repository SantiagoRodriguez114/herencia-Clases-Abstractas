package AreaYPerimetro;

public class Triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	
	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		double s =  (this.lado1 + this.lado2 + this.lado3) / 2;

        this.area = Math.sqrt(s*(s - this.lado1)*(s - this.lado2)*(s - this.lado3));
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = this.lado1 + this.lado2 + this.lado3;
	}
	
	
}

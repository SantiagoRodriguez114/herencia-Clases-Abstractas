package AreaYPerimetro;

public abstract class Figura {
	protected double area;
	protected double perimetro;
	
	public double getArea() {
		return Math.round(area *100.0)/ 100.0;
	}
	
	public double getPerimetro() {
		return Math.round(perimetro *100.0)/ 100.0;
	}
	
	
	public abstract void calcularArea();
	
	public abstract void calcularPerimetro();
}


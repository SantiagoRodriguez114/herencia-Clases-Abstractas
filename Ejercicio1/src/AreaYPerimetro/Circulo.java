package AreaYPerimetro;

public class Circulo extends Figura{
	private double radio;

	public Circulo(double radio) {
		super();
		this.radio = radio;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = Math.PI * (Math.pow(radio, 2));	
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = 2 * this.radio * Math.PI;
	}
	
	
}


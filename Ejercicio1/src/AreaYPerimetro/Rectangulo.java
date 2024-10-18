package AreaYPerimetro;

public class Rectangulo extends Figura{
    private double ancho;
	private double alto;
	
	public Rectangulo(double ancho, double alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
	}

	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		this.area = this.alto * this.ancho;
	}

	@Override
	public void calcularPerimetro() {
		// TODO Auto-generated method stub
		this.perimetro = 2 * (this.alto + this.ancho);
	}

}

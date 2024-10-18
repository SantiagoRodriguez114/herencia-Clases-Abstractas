package AreaYPerimetro;

public class App {

    public static void main(String[] args) {
        
        Circulo circulo1 = new Circulo(5);
        circulo1.calcularArea();
        circulo1.calcularPerimetro();
        System.out.println("Área del círculo: " + circulo1.getArea());
        System.out.println("Perímetro del círculo: " + circulo1.getPerimetro());

        
        Triangulo triangulo1 = new Triangulo(3, 4, 5);
        triangulo1.calcularArea();
        triangulo1.calcularPerimetro();
        System.out.println("Area del triángulo: " + triangulo1.getArea());
        System.out.println("Perímetro del triángulo: " + triangulo1.getPerimetro());

        
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        rectangulo1.calcularArea();
        rectangulo1.calcularPerimetro();
        System.out.println("Área del rectángulo: " + rectangulo1.getArea());
        System.out.println("Perímetro del rectángulo: " + rectangulo1.getPerimetro());
    }
}



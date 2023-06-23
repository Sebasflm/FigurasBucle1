import java.util.Scanner;

public class Cuadrado extends Figura{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Punto punto4;

    public Cuadrado(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
        this.punto4 = punto4;
    }

    public double calcularArea() {
        double lado = calcularDistancia(punto1, punto2);
        return lado * lado;
    }

    public double calcularPerimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        return (lado1 + lado2) * 2;
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        double xDiff = punto2.getX() - punto1.getX();
        double yDiff = punto2.getY() - punto1.getY();
        double zDiff = punto2.getZ() - punto1.getZ();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2) + Math.pow(zDiff, 2));
    }

    public boolean esCuadrado() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto4);
        double lado4 = calcularDistancia(punto4, punto1);

        return lado1 == lado2 && lado2 == lado3 && lado3 == lado4;
    }
}

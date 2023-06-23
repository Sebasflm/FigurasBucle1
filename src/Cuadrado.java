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
        // Cálculo del área del cuadrado utilizando los puntos
        double lado = punto1.calcularDistancia(punto2);
        return lado * lado;
    }

    public double calcularPerimetro() {
        // Cálculo del perímetro del cuadrado utilizando los puntos
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        return (lado1 + lado2) * 2;
    }

    public boolean esCuadrado() {
        // Verificar si los puntos forman un cuadrado
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto4);
        double lado4 = punto4.calcularDistancia(punto1);

        return lado1 == lado2 && lado2 == lado3 && lado3 == lado4;
    }
}

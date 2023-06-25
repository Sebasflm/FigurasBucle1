public class Triangulo extends Figura{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public double calcularArea() {
        // Cálculo del área del triángulo utilizando los puntos
        double base = punto1.calcularDistancia(punto2);
        double altura = calcularAltura(base);
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        // Cálculo del perímetro del triángulo utilizando los puntos
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto2.calcularDistancia(punto3);
        double lado3 = punto3.calcularDistancia(punto1);
        return lado1 + lado2 + lado3;
    }

    public double calcularAltura(double base) {
        double lado1 = punto1.calcularDistancia(punto2);
        double lado2 = punto1.calcularDistancia(punto3);
        double lado3 = punto2.calcularDistancia(punto3);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return (2 * area) / base;
    }
}

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
        double base = calcularDistancia(punto1, punto2);
        double altura = calcularAltura(base);
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto2, punto3);
        double lado3 = calcularDistancia(punto3, punto1);
        return lado1 + lado2 + lado3;
    }

    private double calcularDistancia(Punto punto1, Punto punto2) {
        double xDiff = punto2.getX() - punto1.getX();
        double yDiff = punto2.getY() - punto1.getY();
        double zDiff = punto2.getZ() - punto1.getZ();
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2) + Math.pow(zDiff, 2));
    }

    private double calcularAltura(double base) {
        double lado1 = calcularDistancia(punto1, punto2);
        double lado2 = calcularDistancia(punto1, punto3);
        double lado3 = calcularDistancia(punto2, punto3);
        double semiperimetro = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        return (2 * area) / base;
    }
}

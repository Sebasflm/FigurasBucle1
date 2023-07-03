public class Piramide extends Triangulo {
    private double altura;

    public Piramide(Punto punto1, Punto punto2, Punto punto3, double altura) {
        super(punto1, punto2, punto3);
        this.altura = altura;
    }

    public double calcularArea() {
        // Cálculo del área de la pirámide utilizando la base del triángulo y la altura
        double areaBase = super.calcularArea();
        double perimetroBase = super.calcularPerimetro();
        double apotema = calcularApotema(perimetroBase);
        double areaLateral = perimetroBase * apotema / 2;
        return areaBase + areaLateral;
    }

    public double calcularVolumen() {
        // Cálculo del volumen de la pirámide utilizando el área de la base y la altura
        double areaBase = super.calcularArea();
        return (areaBase * altura) / 3;
    }

    private double calcularApotema(double perimetroBase) {
        double ladoBase = perimetroBase / 3; // Triángulo equilátero
        return Math.sqrt(Math.pow(ladoBase / 2, 2) - Math.pow(ladoBase / 2, 2));
    }
    public String Nombre(){
        return "Piramide";
    }
}
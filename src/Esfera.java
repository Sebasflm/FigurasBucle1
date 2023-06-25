public class Esfera extends Circulo {
    public Esfera(Punto centro, double radio) {
        super(centro, radio);
    }

    public double calcularArea() {
        // Cálculo del área de la esfera utilizando el radio
        double radio = super.calcularPerimetro();
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double calcularVolumen() {
        // Cálculo del volumen de la esfera utilizando el radio
        double radio = super.calcularPerimetro();
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }
}

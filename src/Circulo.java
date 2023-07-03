public class Circulo extends Figura{
    private Punto centro;
    private double radio;

    public Circulo(Punto centro, double radio) {
        this.centro = centro;
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    public double calcularPerimetro() {

        return 2 * Math.PI * radio;
    }
    public double calcularVolumen(){
        return 0;
    }
    public String Nombre(){
        return "Circulo";
    }
}

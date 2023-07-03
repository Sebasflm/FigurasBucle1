public class Cubo extends Cuadrado {
    public Cubo(Punto punto1, Punto punto2, Punto punto3, Punto punto4) {
        super(punto1, punto2, punto3, punto4);
    }

    public double calcularArea() {
        // Cálculo del área del cubo utilizando el área de la base
        double areaBase = super.calcularArea();
        return 6 * areaBase;
    }

    public double calcularVolumen() {
        // Cálculo del volumen del cubo utilizando el área de la base
        double areaBase = super.calcularArea();
        double lado = Math.sqrt(areaBase);
        return Math.pow(lado, 3);
    }
    public String Nombre(){
        return "Cubo";
    }
    public boolean esCubo() {
        return super.esCuadrado();
    }
}
public class Punto {

    private double x;
    private double y;
    private double z;

    public Punto(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double calcularDistancia(Punto otroPunto) {
        double Disx = otroPunto.getX() - x;
        double Disy = otroPunto.getY() - y;
        double Disz = otroPunto.getZ() - z;
        return Math.sqrt(Math.pow(Disx, 2) + Math.pow(Disy, 2) + Math.pow(Disz, 2));
    }
}

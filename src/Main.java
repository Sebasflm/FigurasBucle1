import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        System.out.println("¿Qué figura deseas calcular?");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese las coordenadas del punto 1 (x, y, z):");
                double x1 = scanner.nextDouble();
                double y1 = scanner.nextDouble();
                double z1 = scanner.nextDouble();

                System.out.println("Ingrese las coordenadas del punto 2 (x, y, z):");
                double x2 = scanner.nextDouble();
                double y2 = scanner.nextDouble();
                double z2 = scanner.nextDouble();

                System.out.println("Ingrese las coordenadas del punto 3 (x, y, z):");
                double x3 = scanner.nextDouble();
                double y3 = scanner.nextDouble();
                double z3 = scanner.nextDouble();

                Punto punto1 = new Punto(x1, y1, z1);
                Punto punto2 = new Punto(x2, y2, z2);
                Punto punto3 = new Punto(x3, y3, z3);

                Triangulo triangulo = new Triangulo(punto1, punto2, punto3);
                double areaTriangulo = triangulo.calcularArea();
                double perimetroTriangulo = triangulo.calcularPerimetro();

                System.out.println("Área del triángulo: " + areaTriangulo);
                System.out.println("Perímetro del triángulo: " + perimetroTriangulo);
                break;

            case 2:
                System.out.println("Ingrese las coordenadas del punto 1 (x, y, z):");
                double x1Cuadrado = scanner.nextDouble();
                double y1Cuadrado = scanner.nextDouble();
                double z1Cuadrado = scanner.nextDouble();

                System.out.println("Ingrese las coordenadas del punto 2 (x, y, z):");
                double x2Cuadrado = scanner.nextDouble();
                double y2Cuadrado = scanner.nextDouble();
                double z2Cuadrado = scanner.nextDouble();

                System.out.println("Ingrese las coordenadas del punto 3 (x, y, z):");
                double x3Cuadrado = scanner.nextDouble();
                double y3Cuadrado = scanner.nextDouble();
                double z3Cuadrado = scanner.nextDouble();

                System.out.println("Ingrese las coordenadas del punto 4 (x, y, z):");
                double x4Cuadrado = scanner.nextDouble();
                double y4Cuadrado = scanner.nextDouble();
                double z4Cuadrado = scanner.nextDouble();

                Punto punto1Cuadrado = new Punto(x1Cuadrado, y1Cuadrado, z1Cuadrado);
                Punto punto2Cuadrado = new Punto(x2Cuadrado, y2Cuadrado, z2Cuadrado);
                Punto punto3Cuadrado = new Punto(x3Cuadrado, y3Cuadrado, z3Cuadrado);
                Punto punto4Cuadrado = new Punto(x4Cuadrado, y4Cuadrado, z4Cuadrado);

                Cuadrado cuadrado = new Cuadrado(punto1Cuadrado, punto2Cuadrado, punto3Cuadrado, punto4Cuadrado);
                double areaCuadrado = cuadrado.calcularArea();
                double perimetroCuadrado = cuadrado.calcularPerimetro();

                if (cuadrado.esCuadrado()) {
                    System.out.println("Área del cuadrado: " + areaCuadrado);
                    System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);
                } else {
                    System.out.println("Los puntos ingresados no forman un cuadrado.");
                }
                break;

            case 3:
                System.out.println("Ingrese las coordenadas del centro del círculo (x, y, z):");
                double xCentro = scanner.nextDouble();
                double yCentro = scanner.nextDouble();
                double zCentro = scanner.nextDouble();

                System.out.println("Ingrese el radio del círculo:");
                double radio = scanner.nextDouble();

                Punto centro = new Punto(xCentro, yCentro, zCentro);

                Circulo circulo = new Circulo(centro, radio);
                double areaCirculo = circulo.calcularArea();
                double perimetroCirculo = circulo.calcularPerimetro();

                System.out.println("Área del círculo: " + areaCirculo);
                System.out.println("Perímetro del círculo: " + perimetroCirculo);
                break;

            default:
                System.out.println("Opción inválida.");
                break;
        }

        scanner.close();
    }
}

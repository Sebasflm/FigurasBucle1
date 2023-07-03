import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        List<Figura> figuras = new ArrayList<>();

        do {
            System.out.println("¿Qué figura deseas calcular?");
            System.out.println("1. Triángulo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Círculo");
            System.out.println("4. Pirámide");
            System.out.println("5. Cubo");
            System.out.println("6. Esfera");
            System.out.println("0. Salir");
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

                    figuras.add(triangulo);
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

                    System.out.println("Área del cuadrado: " + areaCuadrado);
                    System.out.println("Perímetro del cuadrado: " + perimetroCuadrado);

                    figuras.add(cuadrado);
                    break;

                case 3:
                    System.out.println("Ingrese las coordenadas del centro del círculo (x, y, z):");
                    double xCentro = scanner.nextDouble();
                    double yCentro = scanner.nextDouble();
                    double zCentro = scanner.nextDouble();
                    Punto centro = new Punto(xCentro, yCentro, zCentro);
                    System.out.println("Ingrese el radio del círculo:");
                    double radio = scanner.nextDouble();
                    Circulo circulo = new Circulo(centro, radio);
                    double areaCirculo = circulo.calcularArea();
                    double perimetroCirculo = circulo.calcularPerimetro();

                    System.out.println("Área del círculo: " + areaCirculo);
                    System.out.println("Perímetro del círculo: " + perimetroCirculo);

                    figuras.add(circulo);
                    break;

                case 4:
                    System.out.println("Ingrese las coordenadas del punto 1 (x, y, z):");
                    double x1Piramide = scanner.nextDouble();
                    double y1Piramide = scanner.nextDouble();
                    double z1Piramide = scanner.nextDouble();

                    System.out.println("Ingrese las coordenadas del punto 2 (x, y, z):");
                    double x2Piramide = scanner.nextDouble();
                    double y2Piramide = scanner.nextDouble();
                    double z2Piramide = scanner.nextDouble();

                    System.out.println("Ingrese las coordenadas del punto 3 (x, y, z):");
                    double x3Piramide = scanner.nextDouble();
                    double y3Piramide = scanner.nextDouble();
                    double z3Piramide = scanner.nextDouble();

                    Punto punto1Piramide = new Punto(x1Piramide, y1Piramide, z1Piramide);
                    Punto punto2Piramide = new Punto(x2Piramide, y2Piramide, z2Piramide);
                    Punto punto3Piramide = new Punto(x3Piramide, y3Piramide, z3Piramide);

                    Triangulo trianguloPiramide = new Triangulo(punto1Piramide, punto2Piramide, punto3Piramide);
                    double alturaPiramide = trianguloPiramide.calcularAltura(punto1Piramide.calcularDistancia(punto2Piramide));

                    Piramide piramide = new Piramide(punto1Piramide, punto2Piramide, punto3Piramide, alturaPiramide);
                    double areaPiramide = piramide.calcularArea();
                    double perimetroPiramide = piramide.calcularPerimetro();
                    double volumenPiramide = piramide.calcularVolumen();

                    System.out.println("Volumen de la pirámide: " + volumenPiramide);
                    System.out.println("Área de la base de la pirámide: " + areaPiramide);
                    System.out.println("Perímetro de la pirámide: " + perimetroPiramide);

                    figuras.add(piramide);
                    break;

                case 5:
                    System.out.println("Ingrese las coordenadas del punto 1 (x, y, z):");
                    double x1Cubo = scanner.nextDouble();
                    double y1Cubo = scanner.nextDouble();
                    double z1Cubo = scanner.nextDouble();

                    System.out.println("Ingrese las coordenadas del punto 2 (x, y, z):");
                    double x2Cubo = scanner.nextDouble();
                    double y2Cubo = scanner.nextDouble();
                    double z2Cubo = scanner.nextDouble();

                    System.out.println("Ingrese las coordenadas del punto 3 (x, y, z):");
                    double x3Cubo = scanner.nextDouble();
                    double y3Cubo = scanner.nextDouble();
                    double z3Cubo = scanner.nextDouble();

                    System.out.println("Ingrese las coordenadas del punto 4 (x, y, z):");
                    double x4Cubo = scanner.nextDouble();
                    double y4Cubo = scanner.nextDouble();
                    double z4Cubo = scanner.nextDouble();

                    Punto punto1Cubo = new Punto(x1Cubo, y1Cubo, z1Cubo);
                    Punto punto2Cubo = new Punto(x2Cubo, y2Cubo, z2Cubo);
                    Punto punto3Cubo = new Punto(x3Cubo, y3Cubo, z3Cubo);
                    Punto punto4Cubo = new Punto(x4Cubo, y4Cubo, z4Cubo);

                    Cubo cubo = new Cubo(punto1Cubo, punto2Cubo, punto3Cubo, punto4Cubo);
                    double areaCubo = cubo.calcularArea();
                    double perimetroCubo = cubo.calcularPerimetro();
                    double volumenCubo = cubo.calcularVolumen();

                    if (cubo.esCubo()) {
                        System.out.println("Área del cubo: " + areaCubo);
                        System.out.println("Perímetro del cubo: " + perimetroCubo);
                        System.out.println("Volumen del cubo: " + volumenCubo);
                    } else {
                        System.out.println("Los puntos ingresados no forman un cubo.");
                    }

                    figuras.add(cubo);
                    break;

                case 6:
                    System.out.println("Ingrese las coordenadas del centro de la esfera (x, y, z):");
                    double xCentroEsfera = scanner.nextDouble();
                    double yCentroEsfera = scanner.nextDouble();
                    double zCentroEsfera = scanner.nextDouble();

                    System.out.println("Ingrese el radio de la esfera:");
                    double radioEsfera = scanner.nextDouble();

                    Punto centroEsfera = new Punto(xCentroEsfera, yCentroEsfera, zCentroEsfera);

                    Esfera esfera = new Esfera(centroEsfera, radioEsfera);
                    double areaEsfera = esfera.calcularArea();
                    double perimetroEsfera = esfera.calcularPerimetro();
                    double volumenEsfera = esfera.calcularVolumen();

                    System.out.println("Área de la esfera: " + areaEsfera);
                    System.out.println("Perímetro de la esfera: " + perimetroEsfera);
                    System.out.println("Volumen de la esfera: " + volumenEsfera);

                    figuras.add(esfera);
                    break;
            }

        } while (opcion != 0);

        System.out.println("Resultados:");

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.Nombre());
            System.out.println("Área: " + figura.calcularArea());
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Volumen: " + figura.calcularVolumen());
            System.out.println();
        }
    }
}
package Main;

public class Main {
    public static void main(String[] args) {
        // AQUI IRÁ EL CODIGO PARA PROBAR LAS CLASES
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(5);
        Rectangulo rectangulo = new Rectangulo(5, 10);
        Triangulo triangulo = new Triangulo(2,3);

        // IMRPIMIMOS EN PANTALLA EL AREA TOTAL
        System.out.println("El area total de las figuras es: " + Figura.getArea());

    }
}
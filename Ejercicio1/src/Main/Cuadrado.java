package Main;

public class Cuadrado extends Rectangulo {

    float lado;

    public Cuadrado(float lado) {
        super(lado, lado);
        this.lado = lado;
    }

    @Override
    public float calcularArea() {
        float area = this.lado * this.lado;
        AreaFiguras += area;
        return area;
    }


}

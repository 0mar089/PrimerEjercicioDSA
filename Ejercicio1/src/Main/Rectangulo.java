package Main;

public class Rectangulo extends Figura {

    float lado1;
    float lado2;

    public Rectangulo(float lado1, float lado2) {
        super(lado1 * lado2);
        this.lado1 = lado1;
        this.lado2 = lado2;

    }

    @Override
    public float calcularArea() {
        float area = this.lado1 * this.lado2;
        AreaFiguras += area;
        return area;
    }

}

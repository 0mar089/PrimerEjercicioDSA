package Main;

public class Triangulo extends Figura {
    float base;
    float altura;

    public Triangulo(float altura, float base) {
        super((base * altura)/2);
        this.altura = altura;
        this.base = base;

    }

    @Override
    public float calcularArea(){
        float area = (this.base * this.altura)/2;
        AreaFiguras += area;
        return area;
    }
}

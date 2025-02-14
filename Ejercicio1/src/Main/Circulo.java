package Main;

public class Circulo extends Figura {

    float radio;

    public Circulo(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        AreaFiguras += (float) area;
        return (float) area;
    }
}

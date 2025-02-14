package Main;

public class Circulo extends Figura {

    float radio;

    public Circulo(float radio) {
        super((float) (Math.PI * Math.pow(radio, 2)));
        this.radio = radio;
    }

    @Override
    public float calcularArea(){
        double area = Math.PI * Math.pow(this.radio, 2);
        AreaFiguras += (float) area;
        return (float) area;
    }
}

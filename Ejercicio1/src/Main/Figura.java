package Main;

public abstract class Figura {
    static float AreaFiguras;

    public Figura(float area) {
        AreaFiguras += area;
    }

    public static float getArea() {
        return AreaFiguras;
    }

    public abstract float calcularArea();



}

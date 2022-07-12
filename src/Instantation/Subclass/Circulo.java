package Instantation.Subclass;

import Instantation.Superclass.FiguraGeometrica;

public class Circulo extends FiguraGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.name= "circulo";
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        this.area= radio*radio * PI;

        return area;
    }

    @Override
    public String toString() {
        return "radio=" + radio +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}

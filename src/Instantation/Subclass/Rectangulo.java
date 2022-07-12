package Instantation.Subclass;

import Instantation.Superclass.FiguraGeometrica;

public class Rectangulo extends FiguraGeometrica {
    private double ladoA;
    private double ladoB;

    public Rectangulo(double ladoA, double ladoB) {
        this.name= "Rectangulo";
        this.ladoA = ladoA;
        this.ladoB = ladoA;
    }

    @Override
    public double calcularArea() {
        this.area= ladoB * ladoA;
        return area;
    }

    @Override
    public boolean esIsometrico() {
        return ladoA==ladoB;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", area=" + area +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB ;
    }
}

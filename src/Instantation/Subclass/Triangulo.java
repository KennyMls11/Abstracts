package Instantation.Subclass;

import Instantation.Superclass.FiguraGeometrica;

public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;

    public Triangulo(double base, double altura, double ladoA, double ladoB) {
        this.name = "Triangulo";
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public double calcularArea() {
        this.area = (base * altura) / 2;
        return area;
    }

    @Override
    public boolean esIsometrico() {
        return base == ladoA && base == ladoB;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", area=" + area +
                ", base=" + base +
                ", altura=" + altura +
                ", ladoA=" + ladoA +
                ", ladoB=" + ladoB;
    }

}

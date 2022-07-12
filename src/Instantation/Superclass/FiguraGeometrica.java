package Instantation.Superclass;

public abstract class FiguraGeometrica {
    public static final double PI=3.1416;
    protected String name;
    protected double area;

    public abstract double calcularArea();

    //implementacion general, dejando abierta la posibilidad de q el metodo se sobreesceriba donde necesito sobre escirbir este comportamiento//
    public boolean esIsometrico(){
        return false;

    }





}

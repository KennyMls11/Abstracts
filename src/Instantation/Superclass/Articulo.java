package Instantation.Superclass;

import java.util.Date;

public abstract class Articulo {
    public static final double GANANCIA= 0.2;
    protected String Identificador;
    protected String nombre;
    protected double costo;
    protected Date fechaVencimiento;
    protected boolean canastaBasica;

    protected Articulo(String identificador, String nombre, double costo, Date fechaVencimiento, boolean canastaBasica) {
        Identificador = identificador;
        this.nombre = nombre;
        this.costo = costo;
        this.fechaVencimiento = fechaVencimiento;
        this.canastaBasica = canastaBasica;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double obtenerPrecio();
    }


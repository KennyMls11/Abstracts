package Instantation.Subclass;

import Instantation.Superclass.Articulo;
import Instantation.Superclass.ArticuloCanastaBasica;

import java.util.Date;

public class Leche extends ArticuloCanastaBasica {
    private boolean entera;

    public Leche(String identificador, String nombre, double costo,
                 Date fechaVencimiento, boolean entera) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.entera = entera;
    }

    @Override
    public double obtenerPrecio() {
        /*primero llamo al metodo del padre, calculo por defauld y  creo una variable local para almacenarlo*/
        double PrecioFinal = super.obtenerPrecio();
        if (!entera) {
            PrecioFinal = PrecioFinal + (PrecioFinal * 0.5);
        }
        return PrecioFinal;
    }
}


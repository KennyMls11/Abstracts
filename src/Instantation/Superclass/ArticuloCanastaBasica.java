package Instantation.Superclass;

import java.util.Date;

public class ArticuloCanastaBasica extends Articulo {
    public ArticuloCanastaBasica(String identificador, String nombre,
                                 double costo, Date fechaVencimiento) {
        super(identificador, nombre, costo, fechaVencimiento, true);
    }

    @Override
    public double obtenerPrecio() {
        costo= costo + (costo*GANANCIA);
        return costo;
    }
}

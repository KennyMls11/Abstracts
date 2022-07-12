package Instantation.Superclass;

import java.util.Date;

public class ArticuloCanastaNoBasica extends Articulo{

    public static final double IVA= 0.18;
    public ArticuloCanastaNoBasica(String identificador,
                                      String nombre, double costo, Date fechaVencimiento) {
        super(identificador, nombre, costo,
                fechaVencimiento, false);
    }

    @Override
    public double obtenerPrecio() {
        costo= (costo + (costo* GANANCIA))+ (costo*IVA);
        return costo;
    }
}

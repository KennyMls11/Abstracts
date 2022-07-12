package Instantation.Subclass;

import Instantation.Superclass.Articulo;
import Instantation.Superclass.ArticuloCanastaNoBasica;

import java.util.Date;

public class Vino extends ArticuloCanastaNoBasica {
    int numeroDeAños;

    public Vino(String identificador, String nombre, double costo,
                Date fechaVencimiento, int numeroDeAños) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.numeroDeAños = numeroDeAños;
    }

    @Override
    public double obtenerPrecio() {
        double PrecioFinal= super.obtenerPrecio();
        int multiplicador= calcularMultiplicador();
        return PrecioFinal + (PrecioFinal*(multiplicador/10.0));
    }

    private int calcularMultiplicador() {
        return numeroDeAños /5;
    }
}


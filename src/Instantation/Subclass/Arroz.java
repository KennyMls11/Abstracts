package Instantation.Subclass;

import Instantation.Superclass.Articulo;
import Instantation.Superclass.ArticuloCanastaBasica;

import java.util.Date;

public class Arroz extends ArticuloCanastaBasica {

    private String tipo;

    public Arroz(String identificador, String nombre, double costo, Date fechaVencimiento, String tipo) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.tipo = tipo;
    }
    /*no nesecito sobre escribir el metodo obtener perecio porq me funciona
    automaticamente el q tengo en canasta basica*/
}

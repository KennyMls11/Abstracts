package Instantation;

import Instantation.Subclass.*;
import Instantation.Superclass.Articulo;
import Instantation.Superclass.FiguraGeometrica;
import Instantation.Superclass.Producto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

    //List<FiguraGeometrica> figuraGeometricas= new ArrayList<>();
    //figuraGeometricas.add(new Circulo(20));
    //figuraGeometricas.add(new Triangulo(10,20,25,25));
    //figuraGeometricas.add (new Rectangulo(24.5,15.4));//

    //for (int i= 0; i < figuraGeometricas.size(); i++) {
    //figuraGeometricas.get(i).calcularArea();
    //System.out.println(figuraGeometricas.get(i).toString());
    public class App {
        public static final void main(String[] args) {
            Alimentos arroz = new Alimentos("Arroz", 100, "Martes");
            Alimentos aceite = new Alimentos("Aceite", 600, "Viernes");
            Alimentos zanahoria = new Alimentos("Zanahoria", 23, "Domingo");

            Juguetes buzz = new Juguetes("Buzz Lightyear", 680);
            Juguetes auto = new Juguetes("Autito", 125);
            Juguetes casa = new Juguetes("Casa de Barbies", 8500);

            Ropa buzo = new Ropa("Niño", "Buzo", 6000);
            Ropa remera = new Ropa("Mujer", "Remera", 1700);
            Ropa campera = new Ropa("Hombre", "Campera", 12000);

            Herramientas martillo = new Herramientas("Tarjeta de Credito", "Martillo", 560);
            Herramientas moladora = new Herramientas("Tarjeta de Debito", "Moladora", 2200);
            Herramientas clavo = new Herramientas("Efectivo", "Clavo", 50);

            Factura facturaABCABC = new Factura();
            facturaABCABC.agregarItem(5, arroz);
            facturaABCABC.agregarItem(1, aceite);
            facturaABCABC.agregarItem(4, zanahoria);
            facturaABCABC.agregarItem(1, buzz);
            facturaABCABC.agregarItem(9, auto);
            facturaABCABC.agregarItem(1, casa);
            facturaABCABC.agregarItem(6, buzo);
            facturaABCABC.agregarItem(4, remera);
            facturaABCABC.agregarItem(1, campera);
            facturaABCABC.agregarItem(2, martillo);
            facturaABCABC.agregarItem(1, moladora);
            facturaABCABC.agregarItem(10, clavo);

            System.out.println("Usted está comprando " + facturaABCABC.contarProductos() + " productos.");
            facturaABCABC.mostrarProductos();
            facturaABCABC.mostrarTotalDescontado();
            facturaABCABC.mostrarTotalNoDescontado();

    }

            /*
            //instancio desde el padre, el padre de array list es list/
            List<Articulo> articulos= new ArrayList<>();
            articulos.add(new Arroz("00123","Doña pepa", 1000,new Date(),"Integral"));
            articulos.add(new Leche("1234","buenisima",1000, new Date(), false));
            articulos.add(new Vino("5888", "Santa julia",1000,new Date(),15));

            for (int i=0; i < articulos.size(); i ++){
                System.out.println("El articulo: " + articulos.get(i).getNombre()+
                       "Precio final: " + articulos.get(i).obtenerPrecio() ); */
            }











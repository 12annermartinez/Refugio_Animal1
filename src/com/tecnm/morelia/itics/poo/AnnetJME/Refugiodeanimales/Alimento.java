package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;

/**
 * Esta es la clase de alimento para los animales, en donde se definen los valores con los que se se trabajaran dentro del espacio.
 * @author : AnnetMartinez
 *
 */
public class Alimento {
    private String marca;
    private double costo;
    private String especie;
    private float cantidad;
    public Alimento(String marca, double costo, String especie, float cantidad) {
        this.marca=marca;
        this.costo=costo;
        this.especie=especie;
        this.cantidad=cantidad;
    }

    /**
     * En este metodo, dentro de la clse alimento, se logran visualizar los valores que fueron ingresados dentro de tu clase.
     * @return : 4(cadenas de texto)donde se describen los atributos.
     */
    public void mostrarAlimento(){
        System.out.println("La marca de comida es: " + marca);
        System.out.println("El costo del producto es= " +costo);
        System.out.println("La comida es para la especie = " +especie);
        System.out.println("La cantidad es = " + cantidad);

    }
    void Alimentaranimal(){

    }
}

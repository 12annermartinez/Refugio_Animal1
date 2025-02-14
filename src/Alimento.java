package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
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
    public void mostrarAlimento(){
        System.out.println("La marca de comida es: " + marca);
        System.out.println("El costo del producto es= " +costo);
        System.out.println("La comida es para la especie = " +especie);
        System.out.println("La cantidad = " + cantidad);

    }
    void Alimentaranimal(){

    }
}

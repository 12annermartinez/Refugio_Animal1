package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
/**
 * Esta clase, crea el espacio, en donde se mencionan los elementos que conforman.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Espacio {
    private float tamanoedificio;
    private String direccion;
    private int nojaulas;
    private int nocuarto;
    public Espacio(float tamanoedificio, String direccion, int nojaulas, int nocuarto) {
        this.tamanoedificio = tamanoedificio;
        this.direccion = direccion;
        this.nojaulas = nojaulas;
        this.nocuarto = nocuarto;
    }

}

package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;

import java.util.Scanner;

/**
 * Esta clase, crea el tratamiento, que llevará la clase animal, en ella se mencionan medicamentos, estado del animal, y elementos necesarios.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Tratamiento {
    private String cartillavacunacion;
    private String medicacion;
    private String historial;
    private String estadosalud;
    public Tratamiento(String cartillavacunacion, String medicacion, String historial, String estadosalud){
        this.cartillavacunacion = cartillavacunacion;
        this.medicacion= medicacion;
        this.historial= historial;
        this.estadosalud= estadosalud;
    }

    public void mostrar() {
        System.out.println("su cartilla de vacunación se encuentra en estado: " + cartillavacunacion);
        System.out.println("Se encuentra en medicación de tipo : " + medicacion);
        System.out.println("su historial es:  " + historial);
        System.out.println("el estado de salud es:  " + estadosalud);
    }
    public void capturardatos() {
        Scanner sc = new Scanner(System.in);
        System.out.println("La cartilla de vacunación del animal se encuentra en estado ");
        this.cartillavacunacion = sc.next();

        System.out.println("La medicación del animal ess: ");
        this.medicacion = sc.next();

        System.out.println("número de días del animal en el refugio: );
        this.historial = sc.next();

        System.out.println("El estado de salud se categoriza como: ");
        this.estadosalud = sc.next();
    }
    void inyectaranimal(){
    }
    void crearhistorial(){
    }
    void evaluaranimal(){
    }

}

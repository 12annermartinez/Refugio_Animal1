package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
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
        System.out.println("Se encuentra en medicación de : " + medicacion);
        System.out.println("su historial es:  " + historial);
        System.out.println("el estado de salud es:  " + estadosalud);
    }
    void inyectaranimal(){
    }
    void crearhistorial(){
    }
    void evaluaranimal(){
    }

}

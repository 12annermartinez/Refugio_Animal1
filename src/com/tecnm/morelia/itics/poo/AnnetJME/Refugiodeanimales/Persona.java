package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;

import java.util.Scanner;
/**
 * Esta clase, crea a la persona, la cual interactura con clases (como Animal) y objetos.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Persona {
    private String identificacion;
    private String direccion;
    private int edad;
    private final String nombrepe;
    private float telefono;
        public Persona(String identificacion, String direccion, int edad, String nombrepe, int telefono) {
            this.identificacion = identificacion;
            this.direccion=direccion;
            this.edad = edad;
            this.nombrepe = nombrepe;
            this.telefono = telefono;
        }
        public void capturardatos() {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿cuál es su identificacióon, adoptante o trabajadoo r: ");
            this.identificacion = sc.nextLine();

            System.out.println("Su domicilio es: ");
            this.direccion = sc.nextLine();

            System.out.println("La edad del adoptante es: ");
            this.edad = sc.nextInt();

            System.out.println("El número de su telefono es: ");
            this.telefono = sc.nextFloat();
        }
    public void mostrar() {
        System.out.println("identificación es: " + identificacion);
        System.out.println("La dirección de la persona es: " + direccion);
        System.out.println("Edad de la persona es " + edad);
        System.out.println("Nombre del dueño: : " + nombrepe);
        System.out.println("teléfono: " +telefono);
    }
}


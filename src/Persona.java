package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;

import java.util.Scanner;

public class Persona {
    private final int solicitud;
    private String identificacion;
    private String registro;
    private int edad;
    private String nombrepe;
    private int telefono;
        public Persona(String identificacion, String registro, int edad, String nombrepe, int solicitud, String direccion, int telefono) {
            this.identificacion = identificacion;
            this.registro = registro;
            this.edad = edad;
            this.nombrepe = nombrepe;
            this.solicitud = solicitud;
            this.telefono = telefono;
        }
        public void mostrar() {
            System.out.println("identificación es: " + identificacion);
            System.out.println("registro es: " + registro);
            System.out.println("Edad de la persona es " + edad);
            System.out.println("Nombre del dueño: : " + nombrepe);
            System.out.println("teléfono: " +telefono);
        }
        public void capturardatos() {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿cuál es su identificación?: ");
            this.identificacion = sc.nextLine();
            System.out.println("El número de su registro es: ");
            this.registro = sc.nextLine();
            System.out.println("La edad del adoptante es: ");
            this.edad = sc.nextInt();
            System.out.println("El número de su telefono es: ");
        }

        void serAdoptado(){
        }
        void rechazarAdoptado(){

        }

}


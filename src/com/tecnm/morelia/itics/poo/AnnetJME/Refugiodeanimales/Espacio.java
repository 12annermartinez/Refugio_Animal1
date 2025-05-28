package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
import java.util.Scanner;
/**
 * Esta clase, crea el espacio, en donde se mencionan los elemeentos que conforman.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Espacio {
    private float tamanoedificio;
    private String direccion;
    private int nojaulas;
    private int nocuarto;
    private int capacidadMaxima;
    private int numeroAnimales;
    private boolean limpieza;

    public Espacio(float tamanoedificio, String direccion, int nojaulas, int nocuarto, int capacidadMaxima, boolean limpieza) {
        this.tamanoedificio = tamanoedificio;
        this.direccion = direccion;
        this.nojaulas = nojaulas;
        this.nocuarto = nocuarto;
        this.capacidadMaxima = capacidadMaxima;
        this.numeroAnimales = 0;
        this.limpieza = limpieza;
    }

    public void agregarAnimales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos animales deseas agregar?: ");
        int cantidad = sc.nextInt(); // Lee el número
        if (cantidad > 0) {
            numeroAnimales += cantidad;
            System.out.println("Se han agregado " + cantidad + " animales. Total: " + numeroAnimales);
        } else {
            System.out.println("Número inválido. Debe ser mayor a 0.");
        }
    }

    public void quitarAnimales() {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos animales deseas quitar?: ");
        int cantidad = sc.nextInt();
        if (cantidad > 0 && cantidad <= numeroAnimales) {
            numeroAnimales -= cantidad;
            System.out.println("Se han quitado " + cantidad + " animales. Total: " + numeroAnimales);
        } else if (cantidad > numeroAnimales) {
            System.out.println("No puedes quitar más animales de los que hay.");
        } else {
            System.out.println("No se elimina ningún animal");
        }
    }

    public void contarAnimales() {
        System.out.println("El número de animales en el refugio es: " + numeroAnimales);
    }

    public void limpiarEspacio() {
        Scanner sc= new Scanner(System.in);
        System.out.println("¿El refugio, fue aseado hoy? Ingrese 1 para sí, 0 para no");
        int respuesta = sc.nextInt();
        if (respuesta == 1) {
            limpieza = true;
            System.out.println("Refugio limpio.");
        } else if (respuesta == 0) {
            limpieza = false;
            System.out.println("Refugio sucio.");
        } else {
            System.out.println("Respuesta inválida. Usa 1 o 0.");
        }
        }
    }



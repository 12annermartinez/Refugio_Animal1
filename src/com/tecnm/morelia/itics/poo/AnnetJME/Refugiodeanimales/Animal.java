package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
import java.util.Scanner;
/**
 * Esta clase, crea al Animal, elemento escencial para el funcionamiento de un refugio de animales, en ella se hablan de diversos tipos de valores.
 * Se le solicitan las usuario y se muestran de igual manera.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Animal {
    private String tipo;
    private int peso;
    private String raza;
    private double tamano;
    private int edad;
    private String nombre;
    private boolean adoptado;
    private com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Color color;
        public Animal(String tipo, int peso, String raza, double tamamo, int edad, String nombre, Color color){
            this.tipo = tipo;
            this.peso = peso;
            this.raza = raza;
            this.tamano = tamamo;
            this.edad = edad;
            this.nombre = nombre;
            this.color= color;
            this.adoptado = false;
        }
    public void mostrar() {
            System.out.println("Tipo de animal: " + tipo);
            System.out.println("Peso del animal en kilogramos: " + peso);
            System.out.println("Raza del animal es: : " + raza);
            System.out.println("Longitud del animal : " + tamano);
            System.out.println("Edad: " + edad);
            System.out.println("Nombre del animal: " + nombre);
            System.out.println("Color del animal: " + color);
    }
    public void capturardatos(){
            //declarar mi clase scanner
            Scanner sc=new Scanner(System.in);
            System.out.println("Dime el tipo de animal");
            this.tipo=sc.next();

            System.out.println("Dime el peso del animal en kilogramos: ");
            this.peso=sc.nextInt();

            System.out.println("Dime la raza del animal: ");
            this.raza=sc.next();

            System.out.println("Dime el tamaño de la longitud del animal en centimetros: ");
            this.tamano=sc.nextDouble();

            System.out.println("Dime el edad: ");
            this.edad=sc.nextInt();

            System.out.println("Dime el nombre: ");
            this.nombre=sc.next();

    }
        void seradoptado() {
        }
        void seringresado() {
        }
        void serevaluad0(){
        }
    }


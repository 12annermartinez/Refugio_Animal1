package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;

import java.util.Scanner;


public class Animal {
    private String tipo;
    private int peso;
    private String raza;
    private double tamano;
    private String color;
    private int edad;
    private String nombre;
        public Animal(String tipo, int peso, String raza, double tamamo, String color, int edad, String nombre){
            this.tipo = tipo;
            this.peso = peso;
            this.raza = raza;
            this.tamano = tamamo;
            this.color = color;
            this.edad = edad;
            this.nombre = nombre;
        }
    public void mostrar() {
            System.out.println("Tipo de animal: " + tipo);
            System.out.println("Peso del animal: " + peso);
            System.out.println("Raza del animal es: : " + raza);
            System.out.println("Tamano: " + tamano);
            System.out.println("Color: " + color);
            System.out.println("Edad: " + edad);
            System.out.println("Nombre del animal: " + nombre);
    }
    public void capturardatos(){
            //declarar mi clase scanner
            Scanner sc=new Scanner(System.in);
            System.out.println("Dime el tipo de animal");
            this.tipo=sc.nextLine();
            System.out.println("Dime el peso: ");
            this.peso=sc.nextInt();
            System.out.println("Dime la raza del animal: ");
            this.raza=sc.nextLine();
            System.out.println("Dime el tamano: ");
            this.tamano=sc.nextDouble();
            System.out.println("Dime el color: ");
            this.color=sc.nextLine();
            System.out.println("Dime el edad: ");
            this.edad=sc.nextInt();
            System.out.println("Dime el nombre: ");
            this.nombre=sc.nextLine();
    }
        void seradoptado() {
        }
        void seringresado() {
        }
        void serevaluad0(){
        }
    }


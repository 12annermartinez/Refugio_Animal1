package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
import java.util.Scanner;
public class Personal extends Persona { // Esta será una clase hija de Persona, pues sigue siendo una persona;
    private String rol;
    private String turno;
    private String fechaIngreso;
    private String habilitadoMedicación;
    public Personal(String rol, String turno, String fechaIngreso, String habilitadoMedicación, String identificacion, String direccion, int edad, String nombrepe, int telefono){
        super(identificacion, direccion, edad, nombrepe, telefono);
        this.rol=rol;
        this.turno=turno;
        this.fechaIngreso=fechaIngreso;
        this.habilitadoMedicación= habilitadoMedicación;
    }
    public void capturardatos(){
        super.capturardatos();
        Scanner scanner= new Scanner(System.in);
        System.out.println("El rol del personal es: ");
        this.rol= scanner.nextLine();

        System.out.println("El turno del personal es: ");
        this.turno= scanner.nextLine();

        System.out.println("La fecha en que ingresó a rabajar es: ");
        this.fechaIngreso= scanner.nextLine();

        System.out.println("Puede medicar a un animal: ");
        this.habilitadoMedicación= scanner.nextLine();

    }
    public void mostrar(){
        super.mostrar();
        System.out.println("El puesto del personal es: "+ rol);
        System.out.println("El turno que ocupa es: "+ turno);
        System.out.println("Ingresó a trabajar desde el: "+ fechaIngreso);
    }
    public void cambiarTurno(){
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Desea cambiar el turno? si=1, no=0");
        int seleccionaT= sc.nextInt();
        sc.nextLine();
        if(seleccionaT == 1){
            System.out.println("¿A qué turno deseas cambiar??");
            String nuevoTurno= sc.nextLine().trim().toLowerCase();
            this.turno= nuevoTurno;
            System.out.println("Turno cambiado a:" +this.turno);
        }else {
            System.out.println("No se modifica el turno");
        }
    }






}

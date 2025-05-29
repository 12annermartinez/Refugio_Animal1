package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
import java.util.Scanner;
public class Adoptante extends Persona {
    private String tipoVivienda;
    private boolean poseeOtroA;
    private int numAnimalesAdo;
    private boolean estadoAprobación;
    public Adoptante(String tamanioVivienda,boolean poseeOtroA, int numAnimalesAdo, boolean estadoAprobación, String identificacion, String direccion, int edad, String nombrepe, int telefono){
        super(identificacion, direccion, edad, nombrepe, telefono);
        this.tipoVivienda= tamanioVivienda;
        this.poseeOtroA=poseeOtroA;
        this.numAnimalesAdo= numAnimalesAdo;
        this.estadoAprobación= estadoAprobación;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println("El tipo de casa del adoptante es: "+ tipoVivienda);
        System.out.println("El adoptante posee otros animales: " + poseeOtroA);
        System.out.println("El número de animales que ha adoptado es: " + numAnimalesAdo);
        System.out.println("El estado de dopción se encuentra en estado: "+ estadoAprobación);
    }
    public void evaluarAdo(){
        Scanner sc= new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        System.out.println("¿Desea adoptar un animal grande o pequeño? si es grande=1, si es pequeño=0");
        System.out.println("Su casa es de tamaño grande o pequeño, 1 para grande, 0 para chica");
        int tamanioAnimal= sc.nextInt();
        int tamanniovivienda= scan.nextInt();
        if(tamanioAnimal == 1){
            if(tamanniovivienda==1){
                System.out.println("La vviienda es adecuada para un animal grande");
            } else {
                System.out.println("No es muy recomendable un animal grande, sino pequeño");
            }
        }else if(tamanioAnimal ==0){
            System.out.println("Puede adoptar un animal pequeño sin problema");
        }else{
            System.out.println("No válido");
        }
    }
}

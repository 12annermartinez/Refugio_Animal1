package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
/**
 * Esta es la clase principal, en donde se crearon los objetos.
 * Se capturan y se muestran los datos solicitados a los usuarios.
 * @autor : AnnetMartínez
 * @version : 07/03/2025/A
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("SE MUESTRA INFROMACIÓN DEL ANIMAL EN CUESTIÓN");
        Animal animal1 = new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Animal("Perro", 25, "Husky", 1.50, 2, "Rino", Color.BLANCO );
        animal1.capturardatos();
        animal1.mostrar();
        System.out.println("SE MUESTRA INFORMACIÓN DE LA PERSONA");
        Persona persona1= new Persona("adoptante", "datos personales", 18, "Annet Martínez Espinosa", 1234, "jorge orozco #9 uruapan", 45212);
        persona1.capturardatos();
        persona1.mostrar();
        System.out.println("SE MUESTRA INFORMACIÓN DEL TRATAMIENTO DEL ANIMAL");
        Tratamiento obj3=new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Tratamiento("Vigente", "Ninguna.", "Adoptado de cachorro.","excelentes condiciones.");
        obj3.capturardatos();
        obj3.mostrar();
        System.out.println("SE MUSTRA INFORMACIÓN DE LA COMIDA");
        Alimento obj4= new Alimento("dog chow", 500.99, "Perro", 27);
        System.out.println("SE MUESTRA INFORMACIÓN DEL ESPACIO FÍSICO");
        Espacio espacio1=new Espacio(15, "Calle número 1, colonia Ejemplo #123", 23, 7, 200, false);
        espacio1.agregarAnimales();
        espacio1.quitarAnimales();
        espacio1.contarAnimales();
        espacio1.limpiarEspacio();
    }
}
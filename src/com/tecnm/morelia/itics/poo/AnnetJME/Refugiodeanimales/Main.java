package com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales;
/**
 * Esta es la clase principal, en donde se crearon los objetos.
 * Se capturan y se muestran los datos solicitados a los usuarios.
 * @autor : AnnetMartínez
 * @version : 03/03/2025/A
 */
public class Main {

    public static void main(String[] args) {
        com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Animal obj1 = new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Animal("Perro", 25, "Husky", 1.50, 2, "Rino", Color.BLANCO );
        obj1.capturardatos();
        obj1.mostrar();
        obj1.adoptado;
        com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Persona obj2= new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Persona("adoptante", "datos personales", 18, "Annet Martínez Espinosa", 1234, "jorge orozco #9 uruapan", 45212, true);
        obj2.capturardatos();
        obj2.mostrar();
        com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Tratamiento obj3=new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Tratamiento("Vigente", "Ninguna.", "Adoptado de cachorro.","excelentes condiciones.");
        obj3.capturardatos();
        obj3.mostrar();
        com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Alimento obj4= new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Alimento("dog chow", 500.99, "Perro", 27);
    }
}
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
        animal1.mostrar();;
        System.out.println("SE MUESTRA INFORMACIÓN DEL TRATAMIENTO DEL ANIMAL");
        Tratamiento obj3=new com.tecnm.morelia.itics.poo.AnnetJME.Refugiodeanimales.Tratamiento("Vigente", "Ninguna.", "Adoptado de cachorro.","excelentes condiciones.");
        obj3.capturardatos();
        obj3.mostrar();
        System.out.println("SE MUESTRA INFORMACIÓN DE LA COMIDA");
        Alimento obj4= new Alimento("dog chow", 500.99, "Perro", 27);
        obj4.mostrarAlimento();
        System.out.println("SE MUESTRA INFORMACIÓN DEL ESPACIO FÍSICO");
        Espacio espacio1=new Espacio(15, "Calle número 1, colonia Ejemplo #123", 23, 7, 200, false);
        espacio1.agregarAnimales();
        espacio1.quitarAnimales();
        espacio1.contarAnimales();
        espacio1.limpiarEspacio();
        System.out.println("SE MUESTRA INFORMACIÓN DEL PERSONAL");
        Personal emp1= new Personal("veterinario", "Noche", "29 de mayo del 2025", true, "A234BC567", "Carretera Pátzcuaro Morelia, #112233", 25, "Fulanito López", 443123456);
        emp1.capturardatos();
        emp1.mostrar();
        emp1.cambiarTurno();
        emp1.puedeMedicar();
        System.out.println("SE PRESENTA LA INFORMACIÓN DE ADOPTANTE");
        Adoptante adoptante1=new Adoptante("Departamento", true, 2, true, "A2345FG", "CALLE 123 INTERSECCION 321", 19, "SUTANITO HERNANDEZ", 4521355);
        adoptante1.capturardatos();
        adoptante1.mostrar();
        adoptante1.evaluarAdo();
    }
}
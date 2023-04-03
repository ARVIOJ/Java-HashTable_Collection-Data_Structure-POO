package main;

import java.util.Enumeration;
import java.util.Hashtable;


public class Asesoria4HashTable {

    public static void main(String[] args) {

        Persona AuxPe = new Persona("ISR06", "Israel", 50, "Grava");

        Persona AuxPersona = null;

        Hashtable<String, Persona> TablaPersonas = new Hashtable<>();

//        Persona p1 = new Persona("ARV01", "Ariel", 21, "Granzon");
//        Persona p2 = new Persona("LIZ02", "Lizet", 20, "El sause");
//        Persona p3 = new Persona("BRA03", "Brandon", 19, "Hidalgo");
//        Persona p4 = new Persona("MIG04", "Miguel", 22, "Caliza");
//        Persona p5 = new Persona("ISR05", "Israel", 35, "Grava");
//
//        Persona p6 = new Persona("ISR06", "Israel", 50, "Grava");
//
//        //con put se añaden datos a las HashTable      
//        TablaPersonas.put(p1.getRfc(), p1);
//        TablaPersonas.put(p2.getRfc(), p2);
//        TablaPersonas.put(p3.getRfc(), p3);
//        TablaPersonas.put(p4.getRfc(), p4);
//        TablaPersonas.put(p5.getRfc(), p5);
        
        
        TablaPersonas.put("ARV01", new Persona("ARV01", "Ariel", 21, "Granzon"));
        TablaPersonas.put("LIZ02", new Persona("LIZ02", "Lizet", 20, "El sause"));
        TablaPersonas.put("BRA03", new Persona("BRA03", "Brandon", 19, "Hidalgo"));
        TablaPersonas.put("MIG04", new Persona("MIG04", "Miguel", 22, "Caliza"));
        TablaPersonas.put("ISR05", new Persona("ISR05", "Israel", 35, "Grava"));

        
        //System.out.println(TablaPersonas);
        System.out.println("Imprimir tabla:");
        for (String RFC : TablaPersonas.keySet()) {
            System.out.println(TablaPersonas.get(RFC));
        }

       
        
        // ↓↓↓↓↓↓↓ ingresa una nueva persona si no existe ↓↓↓↓↓↓↓
        if (TablaPersonas.containsKey(AuxPe.getRfc()) == false) {
            TablaPersonas.put("ISR05",new Persona("ISR05", "Israel", 35, "Grava"));
            System.out.println("Ingresado correctamente");
        } else {
            System.out.println("Esta persona ya existe");
        }
        // ↑↑↑↑↑↑↑ingresa una nueva persona si no existe ↑↑↑↑↑↑↑

        
        System.out.println("Imprimir tabla:");
        for (String RFC : TablaPersonas.keySet()) {
            System.out.println(TablaPersonas.get(RFC));
        }

        
        
        // ↓↓↓↓↓↓↓ busca una persona ↓↓↓↓↓↓↓   
        String BuscarRFC = "ISR05";

        String mensaje = "DATOS DE LA PERSONA\n";
        if (TablaPersonas.containsKey(BuscarRFC) == true) {

            Persona per = TablaPersonas.get(BuscarRFC);

            mensaje += "RFC: " + per.getRfc() + "\n";
            mensaje += "Nombre: " + per.getNombre() + "\n";
            mensaje += "Edad: " + per.getEdad() + "\n";
            mensaje += "Direccion: " + per.getDireccion() + "\n";
            System.out.println(mensaje);
        } else {
            System.out.println("Esta persona no existe");
        }
        // ↑↑↑↑↑↑↑ busca una persona ↑↑↑↑↑↑↑ 

        
        
        
        
        // ↓↓↓↓↓↓↓ otra forma de Mostrar tabla persona ↓↓↓↓↓↓↓ 
        // Enumeration, elements() : Devuelve una enumeración de los valores de esta tabla hash
        //hasMoreElements: Comprueba si la enumeración tiene más elementos.
        String mensajes = "";
        Enumeration<Persona> elemento = TablaPersonas.elements();
        while (elemento.hasMoreElements()) {
            Persona persona = elemento.nextElement();
            mensajes += "RFC: " + persona.getRfc() + "  Nombre: " + persona.getNombre() + "  Edad: " + persona.getEdad() + "  Direccion: " + persona.getDireccion() + "\n";
        }
        System.out.println(mensajes);

        // ↑↑↑↑↑↑↑ otra forma de Mostrar tabla persona↑↑↑↑↑↑↑ 
        
        
        
        
        // ↓↓↓↓↓↓↓ eliminar persona ↓↓↓↓↓↓↓   
        String Buscar = "ISR06";

        if (TablaPersonas.containsKey(Buscar)) {
            TablaPersonas.remove(Buscar);
            System.out.println("Persona eliminada");
        } else {
            System.out.println("Esta persona no existe");
        }
        // ↑↑↑↑↑↑↑ Eliminar persona ↑↑↑↑↑↑↑   
        System.out.println(TablaPersonas);

        //buscar por llave
        System.out.println(TablaPersonas.containsKey("ISR05"));
        System.out.println(TablaPersonas.get("ISR05"));
              
        System.out.println(TablaPersonas.elements().toString());
        
        
        //elements()
        Enumeration enu = TablaPersonas.elements();
        System.out.println("La enumeración de valores es:");
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
        
        
        
        //keys()
        Enumeration enue = TablaPersonas.keys();
        System.out.println(" La enumeración de valores es:");
        while (enue.hasMoreElements()) {
            System.out.println(enue.nextElement());
        }
    

        
        
    }

}

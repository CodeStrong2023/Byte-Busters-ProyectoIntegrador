/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectointegradorpractica.entidades;

import java.util.Scanner;

/**
 *
 * @author dev
 */
public class Contacto {

    public static void contactanos() {

        Scanner leer2 = new Scanner(System.in);

        String nombre;
        String email;
        String telefono;
        String mensaje;
        int opcion2;

        System.out.println("\n\n************************************    CONTÁCTANOS    ************************************");
        System.out.println("* ATENCION PERSONALIZADA \n"
                + "\n* WHATSAPP \n"
                + "\n* VISITAS A OBRAS \n"
                + "\n* PAGOS INFORMADOS \n"
                + "\nNuestra informacion de contacto\n");

        String[][] contactos = new String[100][3];

        contactos[0][0] = "Brian Difilipo";
        contactos[0][1] = "2604511997";
        contactos[0][2] = "Briandifilipo@hotmail.com";
        
        contactos[1][0] = "Dalma Ponce";
        contactos[1][1] = "3834000000";
        contactos[1][2] = "dalma@hotmail.com";
        
         contactos[2][0] = "Andrés Luna";
        contactos[2][1] = "2604034760";
        contactos[2][2] = "andresluna201@hotmail.com";

//        contactos[1][0] = "Lucas Peralta";
//        contactos[1][1] = "2604591821";
//        contactos[1][2] = "lucas@hotmail.com";

//        contactos[4][0] = "Martin Ledezma";
//        contactos[4][1] = "3512333714";
//        contactos[4][2] = "martynledezma@gmail.com";
//
//        contactos[5][0] = "Bruno de la Vega";
//        contactos[5][1] = "2604628937";
//        contactos[5][2] = "Brunodelavega@hotmail.com";
//
//        contactos[6][0] = "Micaela Elsesser";
//        contactos[6][1] = "2004023589";
//        contactos[6][2] = "mikelsesser@gmail.com";
        for (int i = 0; i <= 2; i++) {
            System.out.println("Nombre: " + contactos[i][0]);
            System.out.println("WhatsApp: " + contactos[i][1]);
            System.out.println("Email: " + contactos[i][2]);
            System.out.println("");
        }

        System.out.println("¿Quiere dejarnos un mensaje?\n"
                + "Elija una opcion \n"
                + "1. Si \n"
                + "2. No");
        opcion2 = leer2.nextInt();

        if (opcion2 == 1) {
            System.out.println("Por favor, proporcione su información de contacto y mensaje:");
            // Solicita la información de contacto
            System.out.println("Nombre: ");
            nombre = leer2.nextLine();
            leer2.nextLine();

            System.out.println("Correo electrónico: ");
            email = leer2.nextLine();

            System.out.println("Número de teléfono: ");
            telefono = leer2.nextLine();

            // Solicita el mensaje
            System.out.println("Mensaje: ");
            mensaje = leer2.nextLine();
             
            System.out.println("Gracias por ponerse en contacto con nosotros. Le responderemos lo antes posible.");

        } else {
            
            System.out.println("Esperamos que te comuniques pronto");

            
        }

        System.out.println("********************************************************************************************");


    }

}

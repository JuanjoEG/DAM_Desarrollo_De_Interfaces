package Tema_10;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_10 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   DESARROLLO DE INTERFACES.                                                             *
        *******************************************************************************************
        *   TEMA 10:              DOCUMENTACIÓN DE APLICACIONES: AYUDAS.                          *
        *******************************************************************************************
        *                                                                                         *
        *  1. INTRODUCCIÓN Y CONTEXTUALIZACIÓN PRÁCTICA.                                          *
        *  2. FICHEROS DE AYUDA Y FORMATOS.                                                       *
        *  3. HERRAMIENTAS DE GENERACIÓN DE AYUDA.                                                *
        *  4. TABLAS DE CONTENIDO.                                                                *
        *  5. TIPOS DE DOCUMENTACIÓN.                                                             *
        *  6. TIPOS DE MANUALES.                                                                  *
        *  7. GENERACIÓN DE UN SISTEMA DE AYUDA CON JAVAHELP.                                     *
        *  8. FICHEROS DE APLICACIÓN JAVAHELP.                                                    *
        *  9. ESTRUCTURA DE CARPETAS Y FICHEROS EN JAVAHELP.                                      *
        * 10. INCORPORACIÓN DE LA AYUDA JAVAHELP EN ECLIPSE.                                      *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
                               
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> Recursos_10.recurso(menu); 
                    
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ¡¡¡ LA OPCIÓN NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepción es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
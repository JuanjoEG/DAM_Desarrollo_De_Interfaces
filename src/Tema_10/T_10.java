package Tema_10;

import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *   TEMA 10:              DOCUMENTACI�N DE APLICACIONES: AYUDAS.                          *
        *******************************************************************************************
        *                                                                                         *
        *  1. INTRODUCCI�N Y CONTEXTUALIZACI�N PR�CTICA.                                          *
        *  2. FICHEROS DE AYUDA Y FORMATOS.                                                       *
        *  3. HERRAMIENTAS DE GENERACI�N DE AYUDA.                                                *
        *  4. TABLAS DE CONTENIDO.                                                                *
        *  5. TIPOS DE DOCUMENTACI�N.                                                             *
        *  6. TIPOS DE MANUALES.                                                                  *
        *  7. GENERACI�N DE UN SISTEMA DE AYUDA CON JAVAHELP.                                     *
        *  8. FICHEROS DE APLICACI�N JAVAHELP.                                                    *
        *  9. ESTRUCTURA DE CARPETAS Y FICHEROS EN JAVAHELP.                                      *
        * 10. INCORPORACI�N DE LA AYUDA JAVAHELP EN ECLIPSE.                                      *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
                               
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" -> Recursos_10.recurso(menu); 
                    
                    case "0" -> {}
                    default -> {
                            meterEspacios(25);
                            System.out.println("\n  ��� LA OPCI�N NO ES CORRECTA !!!");
                            meterEspacios(15);
                            esperar(1500);
                            }
                }
            }  catch (Exception e) {
                System.out.println("Error: " + e.toString());
                System.out.println("MENSAJE " + e.getMessage());
                System.out.println("La Excepci�n es: " + e.getClass());
            }
        } while (!"0".equals(menu));
    }
}
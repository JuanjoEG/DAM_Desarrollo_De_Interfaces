package Tema_01;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_01 {
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   DESARROLLO DE INTERFACES.                                                             *
        *******************************************************************************************
        *   TEMA 1:              INTRODUCCIÓN A LA CONFECCIÓN DE INTERFACES.                      *
        *******************************************************************************************
        *                                                                                         *
        *  1. PARADIGMAS DE PROGRAMACIÓN.                                                         *
        *  2. PROGRAMACIÓN ORIENTADA A OBJETOS, EVENTOS Y COMPONENTES.                            *
        *  3. HERRAMIENTAS PROPIETARIAS Y LIBREA DE EDICIÓN DE INTERFACES.                        *
        *  4. VISUAL STUDIO, MONODEVELOP, GLADE, NETBEANS Y ECLIPSE.                              *
        *  5. INSTALACIÓN DE ECLIPSE E INSTALACIÓN DE SWING EN ECLIPSE.                           *
        *  6. LIBRERÍAS. AWT Y SWING.                                                             *
        *  7. PRIMERA CLASE CON JAVA SWING. JFRAME.                                               *
        *  8. ANÁLISIS DEL ENTORNO DE DISEÑO EN ECLIPSE.                                          *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_01.recurso(menu); 
                    
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
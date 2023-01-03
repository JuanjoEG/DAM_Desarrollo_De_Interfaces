package Tema_01;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
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
        *   TEMA 1:              INTRODUCCI�N A LA CONFECCI�N DE INTERFACES.                      *
        *******************************************************************************************
        *                                                                                         *
        *  1. PARADIGMAS DE PROGRAMACI�N.                                                         *
        *  2. PROGRAMACI�N ORIENTADA A OBJETOS, EVENTOS Y COMPONENTES.                            *
        *  3. HERRAMIENTAS PROPIETARIAS Y LIBREA DE EDICI�N DE INTERFACES.                        *
        *  4. VISUAL STUDIO, MONODEVELOP, GLADE, NETBEANS Y ECLIPSE.                              *
        *  5. INSTALACI�N DE ECLIPSE E INSTALACI�N DE SWING EN ECLIPSE.                           *
        *  6. LIBRER�AS. AWT Y SWING.                                                             *
        *  7. PRIMERA CLASE CON JAVA SWING. JFRAME.                                               *
        *  8. AN�LISIS DEL ENTORNO DE DISE�O EN ECLIPSE.                                          *
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
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_01.recurso(menu); 
                    
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
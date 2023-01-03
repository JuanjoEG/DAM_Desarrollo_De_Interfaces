package Tema_02;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_02 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        *   DESARROLLO DE INTERFACES.                                                             *
        *******************************************************************************************
        *   TEMA 02            CLASES Y COMPONENTES                                               *
        *******************************************************************************************
        *                                                                                         *
        *  1. EXPLOTACIÓN DEL ÁREA DE DISEÑO.                                                     *
        *  2. CLASES, PROPIEDADES Y MÉTODOS EN POO.                                               *
        *  3. JFRAME Y JPANEL.                                                                    *
        *  4. JDIALOG.                                                                            *
        *  5. CONEXIÓN ENTRE VENTANAS. EVENTOS.                                                   *
        *  6. COMPONENTES.                                                                        *
        *  7. LAYOUT MANAGER.                                                                     *
        *  8. ESQUEMA RESUMEN.                                                                    *
        *                                                                                         *
        *******************************************************************************************
        *  0. SALIR.                                                                              *
        *******************************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                meterEspacios(25);
                menu = teclaStr.nextLine();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8" -> Recursos_02.recurso(menu);
                    
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
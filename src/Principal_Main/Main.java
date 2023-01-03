package Principal_Main;

import java.util.Scanner;


/**
 *
 * @author Juan José Estévez González
 */
public class Main {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            meterEspacios(25);
            System.out.println("""                          
                               
        ********************************************************************
        *                       DESARROLLO DE INTERFACES                   *
        ********************************************************************
        *                                                                  *
        *  TEMA  1. INTRODUCCIÓN A LA CONFECCIÓN DE INTERFACES.            *
        *  TEMA  2. CLASES Y COMPONENTES.                                  *
        *  TEMA  3. GENERACIÓN DE INTERFACES A PARTIR DE DOCUMENTOS XML.   *
        *  TEMA  4. CREACIÓN DE COMPONENTES.                               *
        *  TEMA  5. EXPLOTACIÓN DE COMPONENTES VISUALES.                   *
        *  TEMA  6. USABILIDAD I: CONCEPTO Y NORMATIVA.                    *
        *  TEMA  7. USABILIDAD II: PAUTAS DE DISEÑO.                       *
        *  TEMA  8. CONFECCIÓN DE INFORMES I.                              *
        *  TEMA  9. CONFECCIÓN DE INFORMES II.                             *
        *  TEMA 10. DOCUMENTACIÓN DE APLICACIONES: AYUDAS.                 *
        *  TEMA 11.                                                        *
        *  TEMA 12.                                                        *
        *  TEMA 13.                                                        *
        *  TEMA 14.                                                        *
        *  TEMA 15.                                                        *
        *                                                                  *
        ********************************************************************
        *  0. SALIR.                                                       *
        ********************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                meterEspacios(25);
                switch (menu) {
                
                    case "1" -> Tema_01.T_01.main(args);
                    case "2" -> Tema_02.T_02.main(args);
                    case "3" -> Tema_03.T_03.main(args);
                    case "4" -> Tema_04.T_04.main(args);
                    case "5" -> Tema_05.T_05.main(args);
                    case "6" -> Tema_06.T_06.main(args);
                    //case "7" -> Tema_07.T_07.main(args);
                    //case "8" -> Tema_08.T_08.main(args);
                    case "9" -> Tema_09.T_09.main(args);
                    case "10" -> Tema_10.T_10.main(args);
                    //case "11" -> Tema_11.T_11.main(args);
                    //case "12" -> Tema_12.T_12.main(args);
                    //case "13" -> Tema_13.T_13.main(args);
                    //case "14" -> Tema_14.T_14.main(args);
                    //case "15" -> Tema_15.T_15.main(args);
                    
                   
                    
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
    
            
    public static void esperar(int segundos) {
        try {            
            Thread.sleep(segundos);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public static void meterEspacios(int espacios) {
    
        for (int i=0; i<espacios; i++) {
                System.out.println("");
            }
    
    }
}
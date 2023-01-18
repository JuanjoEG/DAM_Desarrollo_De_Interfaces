package Tema_12;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_12 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  OBJETIVO Y VALORACIÓN DEL PROCESO DE PRUEBA I.\n";
    public static String punto_03 ="*  PUNTO  3.  OBJETIVO Y VALORACIÓN DEL PROCESO DE PRUEBA II.\n";
    public static String punto_04 ="*  PUNTO  4.  TIPOS DE PRUEBAS I.\n";
    public static String punto_05 ="*  PUNTO  5.  TIPOS DE PRUEBAS II.\n";
    public static String punto_06 ="*  PUNTO  6.  DEPURACIÓN DEL CÓDIGO.\n";
    public static String punto_07 ="*  PUNTO  7.  PRUEBAS DE INTEGRACIÓN Y SISTEMAS.\n";
    public static String punto_08 ="*  PUNTO  8.  PRUEBAS DE REGRESIÓN Y FUNCIONALES.\n";
    public static String punto_09 ="*  PUNTO  9.  PRUEBAS DE CAPACIDAD, RENDIMIENTO, USOS DE RECURSOS Y SEGURIDAD.\n";
    public static String punto_10 ="*  PUNTO 10.  PRUEBAS MANUALES Y AUTOMÁTICAS.\n";
    public static String punto_11 ="*  PUNTO 11.  PRUEBAS DE USUARIO.\n";
    public static String punto_12 ="*  PUNTO 12.  PRUEBAS DE ACEPTACIÓN.\n";
    public static String punto_13 ="*  PUNTO 13.  FLUJO HABITUAL DE EJECUCIÓN DE PRUEBAS.\n";
    public static String punto_14 ="*  PUNTO 14.  VERSIONES ALFA Y BETA.\n";
    public static String punto_15 ="*  PUNTO 15.  ESTRATEGIA DE DISEÑO COMPLETA PARA LA CREACIÓN DE UNA APLICACIÓN.\n";
    public static String punto_16 ="*  PUNTO 16.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_12 + """
        *******************************************************************************************
        *
        """ + punto_01 + """                        
        """ + punto_02 + """
        """ + punto_03 + """                        
        """ + punto_04 + """
        """ + punto_05 + """                        
        """ + punto_06 + """
        """ + punto_07 + """                        
        """ + punto_08 + """
        """ + punto_09 + """                        
        """ + punto_10 + """
        """ + punto_11 + """
        """ + punto_12 + """                        
        """ + punto_13 + """
        """ + punto_14 + """                        
        """ + punto_15 + """
        *
        """ + punto_16 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16" -> Recursos_12.recurso(menu); 
                    
                    case "0" -> {}
                    default -> {
                            miDefault();
                            }
                }
            }  catch (Exception e) {
                miError(e);
            }
        } while (!"0".equals(menu));
    }
}
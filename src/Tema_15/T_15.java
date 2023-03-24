package Tema_15;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_15 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  DESCARGA E INSTALACIÓN DEL ENTORNO XCODE.\n";
    public static String punto_03 ="*  PUNTO  3.  PRIMEROS PASOS CON XCODE.\n";
    public static String punto_04 ="*  PUNTO  4.  CONFIGURACIÓN DE UN NUEVO PROYECTO.\n";
    public static String punto_05 ="*  PUNTO  5.  ANÁLISIS DEL ENTORNO. ZONA SUPERIOR.\n";
    public static String punto_06 ="*  PUNTO  6.  ANÁLISIS DEL ENTORNO. ZONA CENTRAL.\n";
    public static String punto_07 ="*  PUNTO  7.  CREACIÓN DE LA PRIMERA APLICACIÓN.\n";
    public static String punto_08 ="*  PUNTO  8.  PRIMEROS PASOS CON SWIFT.\n";
    public static String punto_09 ="*  PUNTO  9.  VARIABLES.\n";
    public static String punto_10 ="*  PUNTO 10.  COMENTARIOS.\n";
    public static String punto_11 ="*  PUNTO 11.  BOTONES.\n";
    public static String punto_12 ="*  PUNTO 12.  PAUTAS PARA LA CREACIÓN DE UNA INTERFAZ EN IOS.\n";
    public static String punto_13 ="*  PUNTO 13.  CRITERIOS DE DISEÑO.\n";
    public static String punto_14 ="*  PUNTO 14.  ASPECTOS IMPORTANTES DE LAS INTERFACES EN IOS.\n";
    public static String punto_15 ="*  PUNTO 15.  COLORES DEL SISTEMA.\n";
    public static String punto_16 ="*  PUNTO 16.  PROYECTO CON XCODE..\n";
    public static String punto_17 ="*  PUNTO 17.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_15 + """
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
        """ + punto_16 + """
        *
        """ + punto_17 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17" -> Recursos_15.recurso(menu); 
                    
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
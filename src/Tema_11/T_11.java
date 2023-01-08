package Tema_11;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_11 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  COMPONENTES DE UNA APLICACIÓN.\n";
    public static String punto_03 ="*  PUNTO  3.  LOS PAQUETES DE SOFTWWARE EN LINUX.\n";
    public static String punto_04 ="*  PUNTO  4.  EMPAQUETADOS DE SOFTWARE CON FORMATO DEB.\n";
    public static String punto_05 ="*  PUNTO  5.  EMPAQUETADOS DE SOFTWARE CON FORMATO TAR Y TGZ.\n";
    public static String punto_06 ="*  PUNTO  6.  EMPAQUETADOS DE SOFTWARE EN WINDOWS.\n";
    public static String punto_07 ="*  PUNTO  7.  EMPAQUETADOS DE APLICACIONES JAVA CON ECLIPSE.\n";
    public static String punto_08 ="*  PUNTO  8.  INSTALADORES Y PAQUETES AUTOINSTALABLES.\n";
    public static String punto_09 ="*  PUNTO  9.  INSTALACIÓN DE APLICACIONES DESDE UN SERVIDOR.\n";
    public static String punto_10 ="*  PUNTO 10.  CREACIÓN DE UN INSTALADOR EXE. LAUNCH4J.\n";
    public static String punto_11 ="*  PUNTO 11.  INTEGRACIÓN CON EL USUARIO.\n";
    public static String punto_12 ="*  PUNTO 12.  FICHEROS FIRMADOS DIGITALMENTE.\n";
    public static String punto_13 ="*  PUNTO 13.  FICHEROS FIRMADOS DIGITALMENTE. JARSIGNER.\n";
    public static String punto_14 ="*  PUNTO 14.  ASISTENTE PARA CREAR UN ASISTENTE DE INSTALACIÓN. INNO SETUP COMPILER.\n";
    public static String punto_15 ="*  PUNTO 15.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_11 + """
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
        *
        """ + punto_15 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" -> Recursos_11.recurso(menu); 
                    
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
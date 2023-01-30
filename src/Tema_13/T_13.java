package Tema_13;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_13 {
    
    public static String punto_01 ="*  PUNTO  1.  INTRODUCCIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  ANDROID STUDIO. CREACIÓN DEL PROYECTO.\n";
    public static String punto_03 ="*  PUNTO  3.  ANDROID STUDIO. ENTORNO DE DISEÑO Y DESARROLLO.\n";
    public static String punto_04 ="*  PUNTO  4.  TIPOS DE COMPONENTES. CONTENEDORES Y CONTENIDOS.\n";
    public static String punto_05 ="*  PUNTO  5.  TIPOS DE COMPONENTES. LA PALETA DE COMPONENTES.\n";
    public static String punto_06 ="*  PUNTO  6.  BUTTON.\n";
    public static String punto_07 ="*  PUNTO  7.  TEXTFIELD.\n";
    public static String punto_08 ="*  PUNTO  8.  TEXTVIEW.\n";
    public static String punto_09 ="*  PUNTO  9.  CHECKBOX.\n";
    public static String punto_10 ="*  PUNTO 10.  TOGGLEBUTTON.\n";
    public static String punto_11 ="*  PUNTO 11.  SPINNER.\n";
    public static String punto_12 ="*  PUNTO 12.  LAYOUTS.\n";
    public static String punto_13 ="*  PUNTO 13.  RELATIVELAYOUT.\n";
    public static String punto_14 ="*  PUNTO 14.  TABLELAYOUT.\n";
    public static String punto_15 ="*  PUNTO 15.  GRIDLAYOUT.\n";
    public static String punto_16 ="*  PUNTO 16.  LINEARLAYOUT.\n";
    public static String punto_17 ="*  PUNTO 17.  LA HERRAMIENTA APPBARLAYOUT.\n";
    public static String punto_18 ="*  PUNTO 18.  GOOGLE MAPS.\n";
    public static String punto_19 ="*  PUNTO 19.  VENTANAS EMERGENTES.\n";
    public static String punto_20 ="*  PUNTO 20.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_13 + """
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
        """ + punto_17 + """
        """ + punto_18 + """
        """ + punto_19 + """
        *
        """ + punto_20 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" -> Recursos_13.recurso(menu); 
                    
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
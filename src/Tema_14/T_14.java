package Tema_14;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_14 {
    
    public static String punto_01 ="*  PUNTO  1.  EVENTOS.\n";
    public static String punto_02 ="*  PUNTO  2.  MÉTODO Y ESCUCHADORES.\n";
    public static String punto_03 ="*  PUNTO  3.  NAVIGATION.\n";
    public static String punto_04 ="*  PUNTO  4.  CREACIÓN NAVIGATION.\n";
    public static String punto_05 ="*  PUNTO  5.  ANÁLISIS DE LA INTERFAZ.\n";
    public static String punto_06 ="*  PUNTO  6.  CREACIÓN DE UN NUEVO ESQUEMA DE PANTALLAS EN NAVIGATION.\n";
    public static String punto_07 ="*  PUNTO  7.  CREACIÓN DE CONEXIONES ENTRE PANTALLAS.\n";
    public static String punto_08 ="*  PUNTO  8.  TRANSACCIONES ENTRE PANTALLAS CON ANIMACIÓN.\n";
    public static String punto_09 ="*  PUNTO  9.  ANIMACIONES.\n";
    public static String punto_10 ="*  PUNTO 10.  EL SISTEMA DE COLOR DE MATERIAL DESIGN.\n";
    public static String punto_11 ="*  PUNTO 11.  AGREGAR UN BARRA DE APP.\n";
    public static String punto_12 ="*  PUNTO 12.  CÓDIGO DE EJEMPLO.\n";
    public static String punto_13 ="*  PUNTO 13.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_14 + """
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
        *
        """ + punto_13 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" -> Recursos_14.recurso(menu); 
                    
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
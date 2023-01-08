package Tema_01;

import static Principal_Main.Main.*;

/**
 *
 * @author Juan José Estévez González
 */
public class T_01 {
    
    public static String punto_01 ="*  PUNTO  1.  PARADIGMAS DE PROGRAMACIÓN.\n";
    public static String punto_02 ="*  PUNTO  2.  PROGRAMACIÓN ORIENTADA A OBJETOS, EVENTOS Y COMPONENTES.\n";
    public static String punto_03 ="*  PUNTO  3.  HERRAMIENTAS PROPIETARIAS Y LIBREA DE EDICIÓN DE INTERFACES.\n";
    public static String punto_04 ="*  PUNTO  4.  VISUAL STUDIO, MONODEVELOP, GLADE, NETBEANS Y ECLIPSE.\n";
    public static String punto_05 ="*  PUNTO  5.  INSTALACIÓN DE ECLIPSE E INSTALACIÓN DE SWING EN ECLIPSE.\n";
    public static String punto_06 ="*  PUNTO  6.  LIBRERÍAS. AWT Y SWING.\n";
    public static String punto_07 ="*  PUNTO  7.  PRIMERA CLASE CON JAVA SWING. JFRAME.\n";
    public static String punto_08 ="*  PUNTO  8.  ANÁLISIS DEL ENTORNO DE DISEÑO EN ECLIPSE.\n";
    public static String punto_09 ="*  PUNTO  9.  T O D O.\n";
    
    public static void main(String[] args)  {
        
        String menu="";
        do {
            meterEspacios(25);
            System.out.println("""                          
                               
        *******************************************************************************************
        """ + Principal_Main.Main.asignatura + """
        *******************************************************************************************
        """ + Principal_Main.Main.tema_01 + """
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
        *
        """ + punto_09 + """
        *
        *******************************************************************************************
        *  0. SALIR.
        *******************************************************************************************
                               
                               """);
                               
            try {
                menu = miTry();
                switch (menu) {
                    
                    case "1", "2", "3", "4", "5", "6", "7", "8", "9" -> Recursos_01.recurso(menu); 
                    
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
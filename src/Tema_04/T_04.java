package Tema_04;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_04 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 04           CREACIÓN DE COMPONENTES                                      *
        ***********************************************************************************
        *                                                                                 *
        * GENERAR *.jar DE UN PROYECTO. (DE CREACIÓN DE COMPONENTES):                     *
        *   1º- LIMPIAMOS:    PROJECT --> CLEAN                                           *
        *   2º- CONSTRUIMOS:  PROJECT --> BUILD PROJECT                                   *
        *   3º- BOTÓN DERECHO SOBRE EL PROYECTO: EXPORT --> JAR FILE --> PONER UN NOMBRE. *
        *                                                                                 *
        * INCLUIR UN COMPONENTE A UN PROYECTO:                                            *
        *   1º- BOTÓN DERECHO SOBRE EL PROYECTO: BUILD PATH --> CONFIGURE BUILD PATH.     *
        *   2º- PULSAR CLASSPATH --> ADD EXTERNAL JARS --> SELECCIONAR LOS *.jar          *
        *   3º- BOTÓN DERECHO SOBRE COMPONENTS --> ADD COMPONENT --> BUSCAR LA CLASE      *
        ***********************************************************************************
        *  0. SALIR.                                                                      *
        ***********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opción: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    
                    
                        
                        
                    
                   
                     
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
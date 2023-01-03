package Tema_04;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_04 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 04           CREACI�N DE COMPONENTES                                      *
        ***********************************************************************************
        *                                                                                 *
        * GENERAR *.jar DE UN PROYECTO. (DE CREACI�N DE COMPONENTES):                     *
        *   1�- LIMPIAMOS:    PROJECT --> CLEAN                                           *
        *   2�- CONSTRUIMOS:  PROJECT --> BUILD PROJECT                                   *
        *   3�- BOT�N DERECHO SOBRE EL PROYECTO: EXPORT --> JAR FILE --> PONER UN NOMBRE. *
        *                                                                                 *
        * INCLUIR UN COMPONENTE A UN PROYECTO:                                            *
        *   1�- BOT�N DERECHO SOBRE EL PROYECTO: BUILD PATH --> CONFIGURE BUILD PATH.     *
        *   2�- PULSAR CLASSPATH --> ADD EXTERNAL JARS --> SELECCIONAR LOS *.jar          *
        *   3�- BOT�N DERECHO SOBRE COMPONENTS --> ADD COMPONENT --> BUSCAR LA CLASE      *
        ***********************************************************************************
        *  0. SALIR.                                                                      *
        ***********************************************************************************
                               
                               """);
            try {
                System.out.print("Seleccione una opci�n: ");
                menu = teclaStr.nextLine();
                switch (menu) {
                    
                    
                        
                        
                    
                   
                     
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
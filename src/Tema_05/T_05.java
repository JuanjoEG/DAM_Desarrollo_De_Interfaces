package Tema_05;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */
public class T_05 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 05           EXPLOTACI�N DE COMPONENTES VISUALES                          *
        ***********************************************************************************
        *                                                                                 *
        * PRUEBAS UNITARIAS:                                                              *
        * INCLUIR JUnit A UN PROYECTO:                                                    *
        *   1�- BOT�N DERECHO SOBRE EL PROYECTO: BUILD PATH --> ADD LIBRARIES.            *
        *   2�- SELECCIONAR --> JUnit 5.                                                  *
        *   3�- CRAMOS UNA CLASE LLAMADA Test_XXX PARA PROVAR LOS M�TODOS DE LA CLASE XXX.*
        *   4�- LA CLASE TestXXX --> extends TestCase (import junit.framework.TestCase;)  *
        *   5�- DENTRO DE CLASE TestXXX DECLAMOS UNA INSTANCIA DE LA CLASE XXX.           *
        *   6�- LA INSTANCIAMOS DENTRO DE UN M�TODO LLAMADO prueba().                     *
        *   7�- CREAMOS UN M�TODO test...() POR CADA M�TODO DE LA CLASE XXX A PROBAR.     *
        *       EJEMPLO:                                                                  *
        *                   public class TestCalculando extends TestCase{                 *
        *                      	Calculando calculo;                                       *
        *                      	private void prueba() {		                          *
        *                      		calculo = new Calculando();                       *
        *                      	}                                                         *
        *                      	public void testSumar() {		                  *
        *                      		prueba();                                         *
        *                      		assertTrue(calculo.sumar(2, 2) == 4);             *
        *                      	}                                                         *
        *                      	public void testRestar() {		                  *
        *                      		prueba();                                         *
        *                      		assertEquals(3, calculo.restar(5, 2));            *
        *                      	}prueba();                                                *
        *                      		assertTrue(calculo.multiplicar(2, 2) == 4);       *
        *                      	}                                                         *
        *                      	public void testDividir() {		                  *
        *                      		prueba();                                         *
        *                      		assertTrue(calculo.dividir(2, 2) == 1);           *
        *                       }                                                         *
        *                   }                                                             *
        *   M�TODOS A USAR EN LAS PRUEBAS:                                                *
        *                    assertTrue() assertFalse()   assertEquals()   assertNull()   *
        *   8�- COMPROBACI�N DE ERRORES: Run As --> JUnit Test.                           *
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
package Tema_05;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */
public class T_05 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        ***********************************************************************************
        *  TEMA 05           EXPLOTACIÓN DE COMPONENTES VISUALES                          *
        ***********************************************************************************
        *                                                                                 *
        * PRUEBAS UNITARIAS:                                                              *
        * INCLUIR JUnit A UN PROYECTO:                                                    *
        *   1º- BOTÓN DERECHO SOBRE EL PROYECTO: BUILD PATH --> ADD LIBRARIES.            *
        *   2º- SELECCIONAR --> JUnit 5.                                                  *
        *   3º- CRAMOS UNA CLASE LLAMADA Test_XXX PARA PROVAR LOS MÉTODOS DE LA CLASE XXX.*
        *   4º- LA CLASE TestXXX --> extends TestCase (import junit.framework.TestCase;)  *
        *   5º- DENTRO DE CLASE TestXXX DECLAMOS UNA INSTANCIA DE LA CLASE XXX.           *
        *   6º- LA INSTANCIAMOS DENTRO DE UN MÉTODO LLAMADO prueba().                     *
        *   7º- CREAMOS UN MÉTODO test...() POR CADA MÉTODO DE LA CLASE XXX A PROBAR.     *
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
        *   MÉTODOS A USAR EN LAS PRUEBAS:                                                *
        *                    assertTrue() assertFalse()   assertEquals()   assertNull()   *
        *   8º- COMPROBACIÓN DE ERRORES: Run As --> JUnit Test.                           *
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
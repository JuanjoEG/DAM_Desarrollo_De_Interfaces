package Tema_09;

import static Principal_Main.Main.*;
import static Tema_09.T_09.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_09 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_09 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                       
        *******************************************************************************************************************************
        *  INFORME PARTIENDO DE UN XML:             FUENTE DE DATOS INTERNA                                                           *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  PARTIMOS DE UN PROYECTO JAVA EN ECLIPSE.  DENTRO DE src TENDRÁ:                                                            *
        *      - UN PAQUETE -> imagenes Y OTRO informes                                                                               *
        *      - UN FICHERO XML -> CON LOS DATOS DEL INFORME. (TENER LOCALIZADO LA RUTA DEL FICHERO)                                  *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL ADAPTADOR:       (QUE APUNTA AL FICHERO XML DONDE ESTAN LOS DATOS)                                              *
        *        PULSAMOS 'REPORT DESIGN' -> 'REOSITORY EXPLORER' -> BOTÓN DERECHO 'DATA ADAPTERS' -> CREATE DATA ADAPTER             *
        *        HAY QUE SELECCIONAR AHORA LA FUENTE DE LOS DATOS, EN ESTE CASO -> XML DOCUMENT -> NEXT                               *
        *                - PONEMOS EL NOMBRE AL ADAPTADOR                                                                             *
        *                - PONEMOS LA RUTA DEL FICHERO XML QUE TIENE LOS DATOS DEL INFORME                                            *
        *                - MARCAMOS LA CASILLA -> USE THE REPORT XPATH EXPRESSION WHEN FILLING THE REPORT -> FINISH                   *
        *                                         (UTILICE LA EXPRESIÓN XPATH AL RECORRER EL FICHERO)                                 *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL INFORME:                                                                                                        *
        *        - FILE -> NEW -> JASPER REPORT -> SELECCIONAMOS UNA PLANTILLA                                                        *
        *        - NAVEGAMOS POR NUESTRO PROYECTO JAVA Y SELECCIONAMOS LA CARPETA -> informes                                         *
        *        - LE PONEMOS UN NOMBRE AL INFORME -> NEXT                                                                            *
        *        - SELECCIONAMOS EL ADAPTADOR QUE HEMOS CREADO (QUE APUNTA AL FICHERO XML DONDE ESTAN LOS DATOS)                      *
        *        - ESCRIBIMOS UNA SENTENCIA XPATH -> LA RUTA XPATH PARA LLEGAR A LOS NODOS DESEADOS -> /personas/persona -> NEXT      *
        *        - NOS MOSTRARÁ LOS NODOS ENCONTRADOS -> PULSAMOS '>>' PARA SELECCIONAR TODOS -> NEXT                                 *
        *        - NOS DARÁ LA OPCIÓN DE AGRUPAR LOS NODOS -> NO LO HAREMOS -> FINISH                                                 *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  DISEÑAMOS EL INFORME:                                                                                                      *
        *        - DENTRO DE Fields ESTARÁN LOS NODOS QUE ARRASTRAREMOS A LA LÍNEA Detail 1                                           *
        *        - RECOLOCAR BIEN LOS ELEMENTOS DE LAS LÍNEAS Detail 1 Y Column Header                                                *
        *        - COLOCAR CABECERA, IMAGEN ...                                                                                       *
        *        - PULSAR PREVIEW -> COMPILA Y GENERA LA PREVIEW                                                                      *
        *        - EN EL ICONO DE LA DISQUETERA -> EXPORT AS PDF                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    private static String recurso_02 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_02 + """
        **********************************************************************************************************************************        
                                       
        *******************************************************************************************************************************
        *  INFORME PARTIENDO DE UN XML EN UNA PÁGINA WEB:       FUENTE DE DATOS EXTERNA                                               *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL ADAPTADOR:       (QUE APUNTA AL FICHERO XML DONDE ESTAN LOS DATOS)                                              *
        *        PULSAMOS 'REPORT DESIGN' -> 'REOSITORY EXPLORER' -> BOTÓN DERECHO 'DATA ADAPTERS' -> CREATE DATA ADAPTER             *
        *        HAY QUE SELECCIONAR AHORA LA FUENTE DE LOS DATOS, EN ESTE CASO -> XML DOCUMENT -> NEXT                               *
        *                - PONEMOS EL NOMBRE AL ADAPTADOR                                                                             *
        *                - PONEMOS LA RUTA DEL FICHERO XML -> http://feeds.bbci.co.uk/news/rss.xml?edition=int#                       *
        *                - MARCAMOS LA CASILLA -> USE THE REPORT XPATH EXPRESSION WHEN FILLING THE REPORT                             *
        *                                         (UTILICE LA EXPRESIÓN XPATH AL RECORRER EL FICHERO)                                 *
        *                - DATE PATTERN -> PATRÓN DE DISEÑO -> EEE, dd MMM yyyy HH:mm:ss z   -> FINISH                                *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL INFORME:                                                                                                        *
        *        - FILE -> NEW -> JASPER REPORT -> SELECCIONAMOS UNA PLANTILLA                                                        *
        *        - NAVEGAMOS POR NUESTRO PROYECTO JAVA Y SELECCIONAMOS LA CARPETA -> informes                                         *
        *        - LE PONEMOS UN NOMBRE AL INFORME -> NEXT                                                                            *
        *        - SELECCIONAMOS EL ADAPTADOR QUE HEMOS CREADO (QUE APUNTA AL FICHERO XML DONDE ESTAN LOS DATOS)                      *
        *        - ESCRIBIMOS UNA SENTENCIA XPATH -> LA RUTA XPATH PARA LLEGAR A LOS NODOS DESEADOS -> /rss/channel/item -> NEXT      *
        *        - NOS MOSTRARÁ LOS NODOS ENCONTRADOS -> PULSAMOS '>>' PARA SELECCIONAR TODOS -> NEXT                                 *
        *        - NOS DARÁ LA OPCIÓN DE AGRUPAR LOS NODOS -> NO LO HAREMOS -> FINISH                                                 *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  DISEÑAMOS EL INFORME:                                                                                                      *
        *        - DENTRO DE Fields ESTARÁN LOS NODOS QUE ARRASTRAREMOS A LA LÍNEA Detail 1                                           *
        *        - RECOLOCAR BIEN LOS ELEMENTOS DE LAS LÍNEAS Detail 1 Y Column Header                                                *
        *        - COLOCAR CABECERA, IMAGEN ...                                                                                       *
        *        - PULSAR PREVIEW -> COMPILA Y GENERA LA PREVIEW                                                                      *
        *        - EN EL ICONO DE LA DISQUETERA -> EXPORT AS PDF                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    private static String recurso_03 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_03 + """
        **********************************************************************************************************************************        
                                       
        *******************************************************************************************************************************
        *  INFORME PARTIENDO DE UNA BASE DE DATOS:       FUENTE DE DATOS INTERNA/EXTERNA                                              *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL ADAPTADOR:       (QUE APUNTA A LA BASE DE DATOS)                                                                *
        *        PULSAMOS 'REPORT DESIGN' -> 'REOSITORY EXPLORER' -> BOTÓN DERECHO 'DATA ADAPTERS' -> CREATE DATA ADAPTER             *
        *        HAY QUE SELECCIONAR AHORA LA FUENTE DE LOS DATOS, EN ESTE CASO -> DATABASE JDBC CONNECTION -> NEXT                   *
        *                - PONEMOS EL NOMBRE AL ADAPTADOR                                                                             *
        *                - PONEMOS JDBC DRIVER -> MySQL (com.mysql.jdbc.Driver)                                                       *
        *                - PONEMOS JDBC URL    -> jdbc:mysql://localhost/test    (test -> ES EL NOMBRE DE LA BD)                      *
        *                      ONEXIÓN INTERNA ->      localhost     --> (O SU DIRECCIÓN:127.0.0.1)                                   *
        *                     (jdbc:mysql://192.168.0.11:3306/) CONEXIÓN EXTERNA -> COLOCAR LA DIRECCIÓN IP DEL EQUIPO EXTERNO        *
        *                - PONEMOS USERNAME    -> root  (boni -> SI ES CONEXIÓN EXTERNA)                                              *
        *                - PONEMOS PASSWORD    -> polako                                                                              *
        *        EN LA PESTAÑA 'DRIVER CLASSPATH' -> 'ADD' -> BUSCAR Y SELECCIONAR EL CONECTOR MySQL -> mysql-connector-j-8.0.31.jar  *
        *        PULSAR 'TEST' -> DEBERÍA SALIR EL MENSAJE -> SUCCESSFUL         -> OK -> FINISH                                      *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  CREAMOS EL INFORME:                                                                                                        *
        *        - FILE -> NEW -> JASPER REPORT -> SELECCIONAMOS UNA PLANTILLA                                                        *
        *        - NAVEGAMOS POR NUESTRO PROYECTO JAVA Y SELECCIONAMOS LA CARPETA -> informes                                         *
        *        - LE PONEMOS UN NOMBRE AL INFORME -> NEXT                                                                            *
        *        - SELECCIONAMOS EL ADAPTADOR QUE HEMOS CREADO (QUE APUNTA A LA BASE DE DATOS)                                        *
        *        - ESCRIBIMOS UNA SENTENCIA SQL -> FILTRAMOS LOS DATOS DESEADOS -> SELECT * FROM persona -> NEXT                      *
        *                       (PODEMOS COMPLICAR TODO LO QUE NECESITEMOS LA CONSULTA SQL)                                           *
        *        - NOS MOSTRARÁ LOS CAMPOS (COLUMNAS DE LA TABLA) ENCONTRADOS -> PULSAMOS '>>' PARA SELECCIONAR TODOS -> NEXT         *
        *        - NOS DARÁ LA OPCIÓN DE AGRUPAR LOS NODOS -> NO LO HAREMOS -> FINISH                                                 *
        *                                                                                                                             *
        * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
        *  DISEÑAMOS EL INFORME:                                                                                                      *
        *        - DENTRO DE Fields ESTARÁN LOS CAMPOS QUE ARRASTRAREMOS A LA LÍNEA Detail 1                                          *
        *        - RECOLOCAR BIEN LOS ELEMENTOS DE LAS LÍNEAS Detail 1 Y Column Header                                                *
        *        - COLOCAR CABECERA, IMAGEN ...                                                                                       *
        *        - PULSAR PREVIEW -> COMPILA Y GENERA LA PREVIEW                                                                      *
        *        - EN EL ICONO DE LA DISQUETERA -> EXPORT AS PDF                                                                      *
        *                                                                                                                             *
        *******************************************************************************************************************************
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_04 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_04 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_05 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_05 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_06 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_06 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_07 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_07 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_08 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_08 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_09 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_09 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_10 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_10 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_11 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_11 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_12 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_12 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_13 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_13 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_14 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_14 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_15 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_15 + """
        **********************************************************************************************************************************
        
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;    
    
    public static void recurso(String opcion) {
        
        String menu="";
        do {
            switch (opcion) {                
                case "1" -> System.out.println(recurso_01);
                case "2" -> System.out.println(recurso_02);
                case "3" -> System.out.println(recurso_03);
                case "4" -> System.out.println(recurso_04);
                case "5" -> System.out.println(recurso_05);                
                case "6" -> System.out.println(recurso_06);
                case "7" -> System.out.println(recurso_07);
                case "8" -> System.out.println(recurso_08);
                case "9" -> System.out.println(recurso_09);
                case "10" -> System.out.println(recurso_10);
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> System.out.println(recurso_15);
                case "16" -> {
                    System.out.println(recurso_01);
                    continuar();
                    System.out.println(recurso_02);
                    continuar();
                    System.out.println(recurso_03);
                    continuar();
                    System.out.println(recurso_04);
                    continuar();
                    System.out.println(recurso_05);
                    continuar();
                    System.out.println(recurso_06);
                    continuar();
                    System.out.println(recurso_07);
                    continuar();
                    System.out.println(recurso_08);
                    continuar();
                    System.out.println(recurso_09);
                    continuar();
                    System.out.println(recurso_10);
                    continuar();
                    System.out.println(recurso_11);
                    continuar();
                    System.out.println(recurso_12);
                    continuar();
                    System.out.println(recurso_13);
                    continuar();
                    System.out.println(recurso_14);
                    continuar();
                    System.out.println(recurso_15);
                }
            }
            try {                
                menu = miTryRecursos();                
                switch (menu) {                   
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
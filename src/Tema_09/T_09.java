package Tema_09;


import static Principal_Main.Main.esperar;
import static Principal_Main.Main.meterEspacios;
import java.util.Scanner;

/**
 *
 * @author Juan José Estévez González
 */

public class T_09 {
    
    public static void main(String[] args)  {
        String menu="";
        do {
            Scanner teclaStr = new Scanner(System.in, "UTF-8");
            System.out.println("""                          
                               
        *******************************************************************************************************************************
        *  TEMA 09                                CONFECCIÓN DE INFORMES II                                                           *
        *******************************************************************************************************************************
                               
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
                               
        *******************************************************************************************************************************
        *  0. SALIR.                                                                                                                  *
        *******************************************************************************************************************************
                               
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
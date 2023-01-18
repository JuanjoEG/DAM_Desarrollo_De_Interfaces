package Tema_12;

import static Principal_Main.Main.*;
import static Tema_12.T_12.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_12 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_12 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EL EL DESARROLLO DE APLICACIONES Y SUS INTERFACES HAY QUE PRESTAR ATENCI�N A LA FASE DE PRUEBAS.
            ALGUNAS DE LAS PRUEBAS M�S IMPORTANTE SON:
                         
                    LAS DE REGRESI�N:
                            PERMITEN EVALUAR SI AL INTRODUCIR CAMBIOS PARA SOLUCIONAR ERRORES SE HAN PROVOCADO OTROS.
                         
                    LAS DE SEGURIDAD:
                            PERMITEN GARANTIZAR LA INTEGRIDAD DE LA APLICACI�N.
                         
                    LAS DE CAPACIDAD Y USO DE RECURSOS: (VOLUMEN Y ESTR�S)
                            PERMITEN EVALUAR EL COMPORTAMIENTO DE LA APLICACI�N ANTE DIFERENTES ESCENARIOS.
                         
            ES NECESARIO UNA BUENA ESTRATEGIA DE PRUEBAS.   
                         
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
        
            1.- PRUEBAS:  FASE INDISPENSABLE.
                         
            2.- OBJETIVO:  INSPECIONAR SOFTWARE DESDE TODOS LOS POSIBLES ESCENARIOS.
                         
            3.- TIPOS DE PRUEBAS:
                         
                    - FUNCIONALES:      �LO QUE HACE EL SISTEMA?    (FUNCIONES, TAREAS).
                    - NO FUNCIONALES:   �C�MO LO HACE EL SISTEMA?   (CARGA, SEGURIDAD, USABILIDAD, ETC.).
                    - ESTRUCTURALES:    MIDE LA TOTALIDAD DE LAS PRUEBAS.
                         
            4.- T�CNICAS DE PRUEBAS:
                         
                    - EST�TICAS:    (CAUSAS O DEFECTOS, NO EJECUTAN LA APLICACI�N, REVISIONES DE ESPECIFICACIONES).
                    - DIN�MICAS:    (DETECTAN FALLOS, CAJA NEGRA, CAJA BANCA, CASOS DE PRUEBA).
                    - BASADAS EN LA EXPERIENCIA:    (POCO O MUY EFECTIVAS DEPENDIENDO DEL TESTEADOR).
                         
            5.- �A QU� DISTINTOS NIVELES SE PUEDEN REALIZAR LAS PRUEBAS?
                �EN QU� FASES DEL DESARROLLO?
                         
                    - A NIVEL DE M�DULOS.
                    - A NIVEL DE FUNCIONAMIENTO GENERAL EN CUALQUIER FASE DEL PROYECTO.
                         
            6.- �QU� VENTAJAS APORTAN?
                         
                    - DETECTAR ERRORES LO ANTES POSIBLE Y CORREGIRLOS ANTES DE LA IMPLANTACI�N.
                    - VALIDAR EL SOFTWARE EN FUNCI�N DE LAS ESPECIFICACIONES.
                    - EVALUAR EL SOFTWWARE EN DISTINTOS ESCENARIOS PROBABLES.
                         
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
                
            LAS PRUEBAS SON UNA FASE INDISPENSABLE EN EL DESARROLLO DE CUALQUIER APLICACI�N, HERRAMIENTA O SISTEMA.
            NOS PERMITE INSPECCIONAR EL SOFTWARE DESARROLLADO ATENDIENDO A TODOS LOS POSIBLES ESCENARIOS QUE SE PUEDAN CONTEMPLAR.

            CASI TODOS LOS DESARROLLOS DE SOFTWARE EST�N BASADOS EN DOS GRUPOS DE PRUEBAS:

                    - LAS PRUEBAS DE CAJA NEGRA:
                            SE EVAL�A LA APLICACI�N DESDE UN PUNTO DE VISTA EXTERNO.
                            SIN PREOCUPARNOS DEL C�DIGO INTERIOR.
                            SON HABITUALES PARA PRUEBAS DE INTERFACES.

                    - LAS PRUEBAS DE CAJA BLANCA:
                            SE BASAN EN LA EVALUACI�N DEL C�DIGO INTERNO DEL SOFTWARE.

            UN BUEN DISE�O DE ESTAS PRUEBAS IMPLICA LA EVALUACI�N DE TODOS LOS POSIBLES CAMINOS
            QUE SE HAN IMPLEMENTADO EN EL DISE�O DE UN PROGRAMA.

            EL USO DE UN BUEN SISTEMA DE PRUEBAS
            APORTAN M�LTIPLES VENTAJAS COMO:

                    - PERMITEN VALIDAR EL FUNCIONAMIENTO DEL SOFTWARE EN BASE A LAS ESPECIFICACIONES DEL DISE�O.

                    - PERMITEN DETECTAR ERRORES EN EL SOFTWARE Y CORREGIRLOS ANTES DE LA IMPLANTACI�N.

                    - PERMITE EVALUAR EL SOFTWARE EN DISTINTOS ESCENARIOS PROBABLES.

            PODEMOS DIFERENCIAR ENTRE:

                    - LAS PRUEBAS A NIVEL DE M�DULOS:
                            SE REALIZAN A CADA M�DULO DEL SISTEMA POR SEPARADO.

                    - LAS PRUEBAS DE FUNCIONAMIENTO GENERAL:
                            SE REALIZAN CUANDO TODOS LOS M�DULOS DEL SISTEMA SE ENCUENTREN INTEGRADOS.
                            SE PRETENDE VALIDAR EL FUNCIONAMIENTO GLOBAL DE LA APLICACI�N ANTES DE SER ENTREGADA.

            PARA COMPLETAR TODOS LOS POSIBLES ESCENARIOS, ES RECOMENDABLE REALIZAR LA FASE DE PRUEBAS DESDE M�LTIPLES PUNTOS DE VISTA,
            PROVOCANDO ERRORES HABITUALES, O REALIZANDO PRUEBAS DE LAS ACCIONES M�S COMUNES.
                                 
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
        
            ADEM�S DE LA CLASIFICACI�N GEN�RICA DE PRUEBAS DE CAJA NEGRA Y CAJA BLANCA,
            PODEMOS DIVIDIR LAS FASES DE PRUEBAS EN DIFERENTE TIPOS ATENDIENDO
            AL TIPO DE FUNCIONALIDAD EVALUADA EN CADA CASO:
                         
                    - PRUEBAS UNITARIAS:
                            EVAL�AN FUNCIONALIDADES CONCRETAS.
                            EXAMINAN TODOS LOS CAMINOS POSIBLES IMPLEMENTADOS
                            EN EL DESARROLLO DE UN ALGORITMO, FUNCI�N O CLASE.

                    - PRUEBAS DE INTEGRACI�N:
                            SE REALIZAN TRAS LAS PRUEBAS UNITARIAS.
                            SE REALIZAN A TODA LA APLICACI�N YA TOTALMENTE INTEGRADA. 

                    - PRUEBAS DE REGRESI�N:
                            ES UNA PRUEBA MUY COM�N DE REALIZAR Y TIENE MUCHA IMPORTANCIA.
                            IMPLICA VOLVER A VERIFICAR AQUELLO QUE YA HAB�A SIDO EVALUADO PREVIAMENTE
                            Y HAB�A GENERADO ALG�N TIPO DE ERROR.
                            LA SUPERACI�N CON �XITO DE ESTA PRUEBA ES IMPRESCINDIBLE PARA VALIDAR
                            QUE LOS CAMBIOS HAN SIDO CORRECTOS.

                    - PRUEBAS DE SEGURIDAD:
                            SE CENTRAN EN LA EVALUACI�N DE ESTOS SISTEMAS DE LA APLICACI�N.
                                - SISTEMAS DE PROTECCI�N.
                                - SISTEMAS DE AUTENTICACI�N.

                    - PRUEBAS DE VOLUMEN Y DE CARGA:
                            PERMITE EVALUAR SI EL SOFTWARE PUEDE MANEJAR UNA GRAN CANTIDAD DE DATOS.
                            PERMITE EVALUAR SI EL SOFTWARE PUEDE SOPORTAR UN ACCESO MASIVO.
                            ESTAS PRUEVAS SON �TILES PARA SOFTWARE DE TIENDAS VIRTUALES.
                         
            FINALMENTE PODEMOS DIFERENCIAR ENTRE:
                         
                    - PRUEBAS MANUALES:
                            SON REALIZADAS POR UN DESARROLLADOR.
                         
                    - PRUEBAS AUTOM�TICAS:
                            UTILIZAN HERRAMIENTAS QUE PERMITEN AGILIZAR EL PROCESO DE EVALUACI�N
                        
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
        
            PRUEBAS FUNCIONALES:
                    - PRUEBAS UNITARIAS.
                    - PRUEBAS DE INTEGRACI�N.
                    - PRUEBAS DE REGRESI�N.                         
                    - PRUEBAS DE SISTEMA.
                    - PRUEBAS DE SANIDAD.
                    - PRUEBAS DE HUMO.
                    - PRUEBAS DE INTERFAZ.                    
                    - PRUEBAS DE ACEPTACI�N.
                         
            PRUEBAS NO FUNCIONALES:
                    - PRUEBAS DE SEGURIDAD.
                    - PRUEVAS DE VOLUMEN.
                    - PRUEBAS DE CARGA.
                    - PRUEBAS DE ESTR�S.
                    - PRUEBAS DE RENDIMIENTO.
                    - PRUEBAS DE COMPATIBILIDAD.
                    - PRUEBAS DE INSTALACI�N.
                    - PRUEBAS DE RECUPERACI�N.
                    - PRUEBAS DE CONFIABILIDAD.
                    - PRUEBAS DE USABILIDAD.
                    - PRUEBAS DE CONFORMIDAD.
                    - PRUEBAS DE LOCALIZACI�N.
                         
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
        
            SE CENTRA EN LA REVISI�N DEL C�DIGO PARA LA DETECCI�N DE POSIBLES ERRORES Y LA CORRECCI�N DE LOS MISMOS.
                         
            ATENDIENDO AL DESARROLLO DEL C�DIGO
            PODEMOS ENCONTRAR TRES TIPOS DE ERRORES:
                         
                    - ERRORES DE COMPILACI�N:
                            SE PRODUCEN POR UN FALLO EN LA SINTAXIS DEL LENGUAJE DE PROGRAMACI�N.
                            NO PUEDE SER INTERPRETADO POR EL COMPILADOR.
                            NOS DEVUELVE UN MENSAJE DE ERROR.
                         
                    - ERRORES DE EJECUCI�N:
                            LA SINTAXIS ES CORRECTA,
                            PERO AL EJECUTAR LA IMPLEMENTACI�N SE REALIZA
                            ALG�N TIPO DE OPERACI�N CUYO RESULTADO ES ERR�NEO.
                            NOS DEVUELVE UN MENSAJE DE ERROR.
                         
                    - ERRORES DE L�GICA:
                            LA SINTAXIS Y LA EJECUCI�N SON CORRECTAS,
                            PERO EL RESULTADO QUE NOS ARROJA NO ES EL ESPERADO. 
                            SON PRODUCIDOS POR UN FALLO EN EL DISE�O DE LA L�GICA DEL PROGRAMA.
                            SU DETECCI�N ES M�S COMPLEJA QUE LOS ANTERIORES,
                            YA QUE NO DEVUELVE NING�N MENSAJE DE ERROR.
                         
            LOS DOS PRIMEROS SON DETECTADOS DURANTE EL TIEMPO DE DESARROLLO,
            PERO PARA DETECTAR ERRORES DE L�GICA ES CLAVE EL DISE�O DE UN BUEN PROGRAMA DE PRUEBAS.
                         
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
        
            PRUEBAS DE INTEGRACI�N:
                    SE REALIZAN TRAS LAS PRUEBAS UNITARIAS.
                    LAS PRUEBAS DE INTEGRACI�N PERMITEN EVALUAR EL FUNCIONAMIENTO
                    DE TODOS LOS M�DULOS DESARROLLADOS DE MANERA CONJUNTA.
                    SON UN TIPO DE PRUEBAS DE SOFTWARE QUE PERSIGUEN DETECTAR POSIBLES NUEVOS ERRORES
                    O PROBLEMAS QUE PUEDAN SURGUIR POR HABER INTRODUCIDO MEJORAS O CAMBIOS EL EL SOFTWARE.
                    HAY QUE HACER PRUEBAS DE INTEGRACI�N AL FINALIZAR EL RESTO DE PRUEBAS.
                    PODEMOS DISTINGUIR DOS TIPOS:
                         
                            - PRUEBAS DE INTEGRACI�N ASCENDENTE:
                                    ESTAS PRUEBAS COMIENZAN CON LA EVALUACI�N DE LOS NIVELES M�S BAJOS.
                                    SE REALIZAN EN GRUPO.
                                    REQUIEREN UN CONTROLADOR QUE SE ENCARGA DE LA COORDINACI�N
                                    DE LAS SALIDAS Y ENTRADAS DE LOS CASOS DE PRUEBA.
                         
                            - PRUEBAS DE INTEGRACI�N DESCENDENTE:
                                    ESTAS PRUEBAS COMIENZAN CON LA EVALUACI�N DE LOS NIVELES M�S ALTOS.
                                    DESDE EL M�DULO PRINCIPAL HASTA LOS SUBORDINADOS.
                                    ES HABITUAL ENCONTRAR DOS TIPOS:
                                            - INTEGRACI�N EN PROFUNDIDAD.
                                            - INTEGRACI�N EN ANCHURA.
                         
            PRUEBAS DE SISTEMA:
                    SON AQUELLAS QUE EVAL�AN TODO EL SISTEMA DE FORMA CONJUNTA,
                    INTEGRANDO TODAS LAS PARTES, PERO SIN DIFERENCIAR LAS PRUEBAS ENTRE M�DULOS.
                         
            PRUEBAS DE HUMO:
                    SE USAN PARA DESCRIBIR LA VALIDACI�N DE LOS CAMBIOS EN EL SOFTWARE
                    ANTES DE QUE LOS CAMBIOS EN EL C�DIGO SE REGISTREN EN LA DOCUMENTACI�N DEL PROYECTO.
                    SU ORIGEN SE ENCUENTRA RELACIONADO CON LA FABRICACI�N DE HARWARD,
                    ANTIGUAMENTE SI DESPU�S DE REPARAR UN COMPONENTE,
                    NO DESPRENDIA HUMO, SIGNIFICA QUE EL FUNCIONAMIENTO ES CORRECTO.
                         
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
        
            PRUEBAS DE REGRESI�N:
                    ES LA NUEVA EJECUCI�N DE UN CONJUNTO DE PRUEBAS QUE YA HAB�A SIDO EJECUTADO CON ANTERIORIDAD.
                    ES PARA EVALUAR SI LAS NUEVAS MODIFICACIONES Y CAMBIOS QUE SE HAYAN REALIZADO SOBRE EL C�DIGO
                    HAN PODIDO PROVOCAR FALLOS QUE ANTES NO EXIST�AN.
                         
                    IMPLICA LA EJECUCI�N COMPLETA DE TODA LA BATER�A DE PRUEBAS,
                    O SOLO DE ALGUNAS CONCRETAS.
                         
                    NOS ENCONTRAMOS DIFERENTES TIPOS:
                         
                            - PRUEBAS DE REGRESI�N LOCALES:
                                   SE LOCALIZAN ERRORES QUE SE HAN PRODUCIDO
                                   POR LA INTRODUCCI�N DE �LTIMOS CAMBIOS Y MODIFICACIONES.
                         
                            - PRUEBAS DE REGRESI�N DESENMASCARADA O AL DESCUBIERTO:
                                   SE PRODUCE CUANDO LA INTRODUCCI�N DE CAMBIOS MUESTRA ERRORES
                                   QUE NADA TIENEN QUE VER CON LAS MODIFICACIONES REALIZADAS,
                                   PERO QUE SU INCLUSI�N LOS HA DEJADO AL DESCUBIERTO.
                         
                            - PRUEBAS DE REGRESI�N REMOTA O A DISTANCIA:
                                   RECIBEN ESTE NOMBRE LOS ERRORES PRODUCIDOS CUANDO AL REALIZAR LA INTEGRACI�N
                                   DE LAS DIFERENTES PARTES DE UN PROGRAMA, SE PRODUCEN ERRORES QUE DE FORMA 
                                   INDIVIDUAL NO OCURR�AN.
                         
                    LA SUPERACI�N CON �XITO DE ESTE TIPO DE PRUEBAS
                    ES IMPRESCINDIBLE PARA VALIDAR QUE LOS CAMBIOS HAN SIDO CORRECTOS.
                         
            PRUEBAS FUNCIONALES:
                    SE BASAN EN LA EVALUACI�N DE TODAS LAS FUNCIONALIDADES ESPECIFICADAS
                    EN LOS REQUISITOS DE DISE�O DE UNA HERRAMIENTA O APLICACI�N SOFTWARE.
                    ES ACONSEJABLE QUE EL PROCESO QUEDE DOCUMENTADO.
                         
                    TAL Y COMO SE INDICA EN LA NORMA ISO 25010,
                    SON DESEABLES CIERTAS CARACTER�STICAS RELATIVAS A LA EVALUACI�N DE LA FUNCIONALIDAD:
                         
                            - IDONEIDAD.
                            - EXACTITUD.
                            - INTEROPERABILIDAD.
                            - SEGURIDAD.
                         
            ESTE TIPO DE PRUEBAS SON LLEVADAS A CABO POR EXPERTOS CAPACES DE INTERPRETAR LOS RESULTADOS OBTENIDOS
            Y REALIZAR PROPUESTAS DE MODIFICACIONES Y CAMBIOS NECESARIOS PARA QUE LA FUNCIONALIDAD OBTENIDA
            SE ADEC�E A LAS ESPECIFICACIONES DE DISE�O.
                         
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
        
            ESTE TIPO DE PRUEBAS PERTENECEN A LAS LLAMADAS NO FUNCIONALES.
                         
                    - LAS FUNCIONALES: --> DE CAJA BLANCA.
                            SE CENTRAN EN EL COMPORTAMIENTO INTERNO DE LA APLICACI�N.

                    - LAS NO FUNCIONALES: --> DE CAJA NEGRA.
                            SE UTILIZAN PARA EVALUAR EL COMPORTAMIENTO EXTERNO DE LA APLICACI�N.
                         
            * PRUEBAS DE CAPACIDAD:
                    SE UTILIZAN PARA LA EVALUACI�N DEL SOFTWARE Y SU COMPORTAMIENTO ANTE UN AUMENTO DE PETICIONES,
                    ES DECIR, ANTE UN INCREMENTO DE LA CARGA DE TRABAJO.
                         
            * PRUEBAS DE RENDIMIENTO:
                    SE UTILIZAN PARA LA EVALUACI�N DEL TIEMPO DE RESPUESTA
                    Y LA VELOCIDAD DE PROCESAMIENTO DEL SOFTWARE.
                         
            * PRUEBAS DE ESTR�S:
                    SE UTILIZAN PARA LA EVALUACI�N DE LA CAPACIDAD DE RECUPERACI�N
                    DEL SOFTWARE ANTE UNA SOBRECARGA DE DATOS.
                         
            * PRUEBAS DE VOLUMEN:
                    SE UTILIZAN PARA LA EVALUACI�N DE LA CAPACIDAD DE PROCESAMIENTO
                    DEL SOFTWARE ANTE LA LLEGADA DE UNA CANTIDAD GRANDE DE DATOS.
                         
            * PRUEBAS DE SEGURIDAD:
                    ESTE TIPO DE PRUEBAS EST� DISE�ADAS PARA DOS CLAROS PROP�SITOS:
                            - GARANTIZAR LOS ASPECTOS RELATIVOS A LA INTEGRIDAD DE LOS DATOS.
                            - EVALUAR LOS DIFERENTES MECANISMOS DE PROTECCI�N QUE PUEDEN ESTAR
                              INVOLUCRADOS EN UNA DETERMINADA APLICACI�N SOFTWARE.
                         
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
        
            * LAS PRUEBAS MANUALES:
                    SE REALIZAN POR EL DESARROLLADOR PARA PROBAR EL C�DIGO QUE EST� IMPLEMENTANDO.
                    INTRODUCE VALORES DE ENTRADA Y EN FUNCI�N DE ESTOS, SE EVAL�A SI LA SALIDA ES LA ESPERADA.
                    NO SE UTILIZAN HERRAMIENTAS CONCRETAS,
                    EL PROPIO DESARROLLADOR LLEVA A CABO LA DEPURACI�N
                    Y PRUEBA EL C�DIGO EN BASE A LA SITUACI�N QUE SE EST� EVALUANDO.
                         
            * LAS PRUEBAS AUTOM�TICAS:
                    SI UTILIZAN HERRAMIENTAS QUE PERMITEN AGILIZAR EL PROCESO DE EVALUACI�N DE LAS APLICACIONES IMPLEMENTADAS.
                    SON ESPECIALMENTE �TILES PARA LA REALIZACI�N DE PRUEBAS DE REGRESI�N,
                    PUESTO QUE OPTIMIZAN EL PROCESO.
                         
                    ALGUNAS DE LAS HERRAMIENTAS M�S COMUNES PARA LA REALIZACI�N DE ESTE TIPO DE PRUEBAS SON:
                         
                            - JMETER:
                                    SE TRATA DE UN PROYECTO DE APACHE QUE PERMITE REALIZAR PRUEBAS DE CARGA
                                    PARA LA EVALUACI�N DEL RENDIMIENTO DE UNA DETERMINADA APLICACI�N.
                         
                            - BUGZILLA:
                                    HERRAMIENTA ONLINE UTILIZADA PARA EL SEGUIMIENTO DE ERRORES Y DEFECTOS DEL SOFTWARE Y SUS M�DULOS,
                                    A TRAV�S DE LAS DIFERENTES VERSIONES DE UNA MISMA APLICACI�N.
                         
                            - JUNIT:
                                    CONJUNTO DE LIBRER�AS EN JAVA UTILIZADAS PARA LA REALIZACI�N DE PRUEBAS UNITARIAS
                                    SOBRE LAS APLICACIONES DESARROLLADAS SOBRE ESTE LENGUAJE DE PROGRAMACI�N,
                                    COMO LAS INTERFACES.
                         
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
        
            LAS PRUEBAS DE USUARIO:
                    EN CONTRAPOSICI�N A LAS PRUEBAS POR EXPERTOS TENEMOS LAS PRUEBAS DE USUARIO.
                    SE BASAN EN EL AN�LISIS Y EVALUACI�N DE UNA HERRAMIENTA O APLICACI�N SOFTWARE
                    MEDIANTE UN GRUPO DE USUARIOS REALES QUE PUEDEN DETECTAR ERRORES
                    QUE LOS EXPERTOS NO HAN SIDO CAPACES DE ENCONTRAR.
                         
                    LOS M�TODOS DE TEST CON USUARIOS SE BASAN EN EL USO DE CUESTIONARIOS TIPO.
                    SEG�N EL 'DISE�O CENTRADO EN EL USUARIO' (DCU), LOS TEST DE USUARIO SE BASAN EN PRUEBAS
                    QUE OBSERVAN LA FORMA DE INTERACCI�N DE LOS USUARIOS CON EL PRODUCTO OBJETO DEL TEST.
                         
                    POR EJEMPLO, A UN EXPERTO LE PUEDE RESULTAR INTUITIVA
                    Y F�CIL DE APRENDER LA FORMA DE USO DE UNA DETERMINADA FUNCIONALIDAD,
                    PERO NO DEJAN DE SER EXPERTOS EN DESARROLLO.
                    DESDE EL PUNTO DE VISTA DE UN USUARIO,
                    ESTA FORMA DE ACOMETER LA ACCI�N PUEDE NO SER TAN INTUITIVA.
                         
                    ES ACONSEJABLE QUE EL N�MERO DE USUARIOS QUE PARTICIPEN EN ESTE TEST SEA DE AL MENOS QUINCE PARA PODER GARANTIZAR
                    UNA TASA DE DETECCI�N DE CERCA DEL 100%. LA ELECCI�N DE ESTOS SE DEBE BASAR EN LOS PERFILES HACIA LOS QUE EST� DIRIGIDA
                    LA APLICACI�N, NO TENDR� SENTIDO PROBAR UNA APLICACI�N PARA LA GESTI�N LOG�STICA DE UN ALMAC�N CON UN GRUPO DE
                    USUARIOS QUE NO TIENEN NINGUNA VINCULACI�N CON ESTE TIPO DE �REAS. LAS PRUEBAS SE REALIZAN DE FORMA INDIVIDUAL Y SE
                    DEBEN TENER EN CUENTA TODAS LAS OBSERVACIONES QUE SE TOMEN, DESDE LA PRIMERA TOMA DE CONTACTO HASTA LA REALIZACI�N
                    DE LA PRUEBA COMPLETA.
                         
                    ALGUNOS CRITERIOS DE DISE�O SON:
                    
                            - PRUEBAS RAZONABLES:
                         
                            - PRUEBAS ESPEC�FICAS:
                         
                            - PRUEBAS FACTIBLES:
                         
                            - TIEMPO DE REALIZACI�N RAZONABLE:                         
                         
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
        
            LAS PRUEBAS DE ACEPTACI�N:
                    SE UTILIZAN PARA COMPROBAR SI UNA APLICACI�N
                    CUMPLE CON EL FUNCIONAMIENTO CONTENIDO EN LAS ESPECIFICACIONES DE DISE�O,
                    TANTO DESDE UN PUNTO DE VISTA FUNCIONAL COMO DE RENDIMIENTO.
                            - DEBE CUMPLIR CON LA FUNCIONALIDAD DESEADA.
                            - EL TIEMPO NECESARIO PARA COMPLETAR LA FUNCIONALIDAD TIENE QUE SER ACEPTABLE.
                    
                    ALGUNAS CARACTER�STICAS SON:
                         
                            - LAS PRUEBAS DE ACEPTACI�N SON DEFINIDAS POR LOS CLIENTES:
                         
                            - SE EJECUTAN ANTES DE LA IMPLANTACI�N FINAL DE LA APLICACI�N:
                         
                            - LOS PLANES DE PRUEBAS DE ACEPTACI�N HAN DE SER CORRECTAMENTE DOCUMENTADOS:                         
                    
                         
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
        
            EL PROCESO DE EVALUACI�N Y AN�LISIS DE CUALQUIER DESARROLLO ANTES DE SER IMPLANTADO DE FORMA DEFINITIVA
            EST� CONSTITUIDO POR UNA VARIADA TIPOLOG�A DE PRUEBAS.
                         
            LA REALIZACI�N DE TODAS ESTAS ES IMPORTANTE PARA OFRECER LA MAYOR GARANT�A POSIBLE
            SOBRE EL FUNCIONAMIENTO DE UN HERRAMIENTO.
                         
            UNO DE LOS FLUJOS HABITUALES DE EJECUCI�N                           ESTIMACI�N DEL TIEMPO PARCIAL
            DE PRUEBAS EN EL DESARROLLO                                         DE REALIZACI�N DE PRUEBAS 
            DE PRODUCTOS SOFTWARE ES:                                           EN FUNCI�N DEL TIEMPO TOTAL RESERVADO A PRUEBAS:
                                    
                    1.-     UNITARIAS.                            ------------>  0 % -->  SE REALIZAN EN EL DESARROLLO.
                    2.-     INTEGRACI�N.                          ------------>  0 % -->  SE REALIZAN EN EL DESARROLLO.
                    3.-     SISTEMA.                              ------------> 25 %
                    4.-     REGRESI�N.                            ------------> 15 %
                    5.-     FUNCIONALES.                          ------------> 15 %
                    6.-     CAPACIDAD.                            ------------> 10 % ~ 20 %
                    7.-     RECURSOS.                             ------------>      -->  SE REALIZAN JUNTO CON LAS DE CAPACIDAD.
                    8.-     SEGURIDAD.                            ------------> 10 %
                    9.-     USUARIO.                              ------------> 20 %
                    10.-    ACEPTACI�N.                           ------------> 10 %
                         
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
        
            LAS PRUEBAS ALFA Y BETA SON AQUELLAS QUE PERMITEN ENCONTRAR AQUELLOS ERRORES PROPIOS EN EL CLIENTE FINAL.
                         
            EXISTEN ERRORES QUE SOLO VAN A SER DESCUBIERTOS CUANDO SE SIMULE EL FUNCIONAMIENTO HABITUAL DE LA APLICACI�N.
                         
                * VERSI�N ALFA:
                        CONSISTE EN LA PRIMERA VERSI�N DE LA APLICACI�N.
                        SER� PROBADA POR UN GRUPO DE INDIVIDUOS QUE SIMULAN SER EL CLIENTE FINAL.
                        ESTA VERSI�N A�N NO EST� PREPARADA PARA SU IMPLANTACI�N EN PRODUCCI�N,
                        DEBE SER EVALUADA PREVIAMENTE POR UN GRUPO DE EXPERTOS QUE SIMULAN SER CLIENTES.
                         
                        SE REALIZAN HABITUALMENTE DESDE LAS OFICINAS DE TRABAJO DONDE EL PRODUCTO HA SIDO DESARROLLADO,
                        PUESTO QUE A�N NO HA SIDO ENTREGADO AL CLIENTE.
                         
                * VERSI�N BETA:
                        ES UNA VERSI�N CASI DEFINITIVA DEL PRODUCTO.
                        SE TRATA DE LA PRIMERA VERSI�N QUE SER� PROBADA
                        POR LOS CLIENTES QUE HAB�AN REALIZADO EL ENCARGO DEL DESARROLLO.
                        SER� LA VERSI�N QUE EVAL�EN USUARIOS AJENOS AL DESARROLLO.
                         
                        SE REALIZAN HABITUALMENTE FUERA DE LAS OFICINAS DE TRABAJO DONDE EL PRODUCTO HA SIDO DESARROLLADO,
                        PARA EVITAR CONDICIONAMIENTOS EN EL MANEJO DE LA APLICACI�N.
                         
                        APARECEN LOS LLAMADOS 'USUARIOS BETA TESTER'
                        QUE SON LOS ENCARGADOS DE COMPROBAR QUE TODO FUNCIONA CORRESTAMENTE.
                        SI ENCUENTRAN ALG�N FALLO, SER�N LOS ENCARGADOS DE INDICARLOS ANTES DE HACER P�BLICA LA APLICACI�N. 
                         
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
        
            1.- FASE DE PLANIFICACI�N:
                    SE DEFINEN LOS CRITERIOS Y NECESIDADES B�SICAS DE LA APLICACI�N.
                         
            2.- FASE DE DISE�O:
                    SE REALIZA EL DISE�O EN BASE A LOS CRITERIOS DEFINIDOS PREVIAMENTE.
                         
            3.- FASE DE IMPLANTACI�N:
                    SE ESCRIBE Y DESARROLLA EL C�DIGO DISE�ADO EN LOS APARTADOS ANTERIORES.
                         
            4.- FASE DE EVALUACI�N:
                    FASE DE PRUEBAS PARA EVALUAR EL ESTADO DE LA APLICACI�N ANTES DE SER ENTREGADA AL CLIENTE.
                    AL CONCLUIR ESTA FASE, SER� NECESARIO REGRESAR A LA FASE ANTERIOR, EN EL CASO DE HABER APARECIDO ERRORES O CAMBIOS.
                         
            5.- FASE DE PRODUCCI�N:
                    EN ESTA FASE SE ENTREGA EL DESARROLLO A LOS USUARIOS QUE LA UTILIZAR�N PARA EL FIN QUE ESTABA DISE�ADA.
                         
            6.- FASE DE MANTENIMIENTO:
                    TRAS SER ENTREGADA LA APLICACI�N, ES POSIBLE INCORPORAR NUEVAS FUNCIONALIDADES
                    O RESOLVER CASU�STICAS QUE NO SE HAB�AN TENIDO EN CUENTA DURANTE SU DISE�O E IMPLEMENTACI�N.
                         
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
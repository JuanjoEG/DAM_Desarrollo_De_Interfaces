package Tema_12;

import static Principal_Main.Main.*;
import static Tema_12.T_12.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_12 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_12 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EL EL DESARROLLO DE APLICACIONES Y SUS INTERFACES HAY QUE PRESTAR ATENCIÓN A LA FASE DE PRUEBAS.
            ALGUNAS DE LAS PRUEBAS MÁS IMPORTANTE SON:
                         
                    LAS DE REGRESIÓN:
                            PERMITEN EVALUAR SI AL INTRODUCIR CAMBIOS PARA SOLUCIONAR ERRORES SE HAN PROVOCADO OTROS.
                         
                    LAS DE SEGURIDAD:
                            PERMITEN GARANTIZAR LA INTEGRIDAD DE LA APLICACIÓN.
                         
                    LAS DE CAPACIDAD Y USO DE RECURSOS: (VOLUMEN Y ESTRÉS)
                            PERMITEN EVALUAR EL COMPORTAMIENTO DE LA APLICACIÓN ANTE DIFERENTES ESCENARIOS.
                         
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
                         
                    - FUNCIONALES:      ¿LO QUE HACE EL SISTEMA?    (FUNCIONES, TAREAS).
                    - NO FUNCIONALES:   ¿CÓMO LO HACE EL SISTEMA?   (CARGA, SEGURIDAD, USABILIDAD, ETC.).
                    - ESTRUCTURALES:    MIDE LA TOTALIDAD DE LAS PRUEBAS.
                         
            4.- TÉCNICAS DE PRUEBAS:
                         
                    - ESTÁTICAS:    (CAUSAS O DEFECTOS, NO EJECUTAN LA APLICACIÓN, REVISIONES DE ESPECIFICACIONES).
                    - DINÁMICAS:    (DETECTAN FALLOS, CAJA NEGRA, CAJA BANCA, CASOS DE PRUEBA).
                    - BASADAS EN LA EXPERIENCIA:    (POCO O MUY EFECTIVAS DEPENDIENDO DEL TESTEADOR).
                         
            5.- ¿A QUÉ DISTINTOS NIVELES SE PUEDEN REALIZAR LAS PRUEBAS?
                ¿EN QUÉ FASES DEL DESARROLLO?
                         
                    - A NIVEL DE MÓDULOS.
                    - A NIVEL DE FUNCIONAMIENTO GENERAL EN CUALQUIER FASE DEL PROYECTO.
                         
            6.- ¿QUÉ VENTAJAS APORTAN?
                         
                    - DETECTAR ERRORES LO ANTES POSIBLE Y CORREGIRLOS ANTES DE LA IMPLANTACIÓN.
                    - VALIDAR EL SOFTWARE EN FUNCIÓN DE LAS ESPECIFICACIONES.
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
                
            LAS PRUEBAS SON UNA FASE INDISPENSABLE EN EL DESARROLLO DE CUALQUIER APLICACIÓN, HERRAMIENTA O SISTEMA.
            NOS PERMITE INSPECCIONAR EL SOFTWARE DESARROLLADO ATENDIENDO A TODOS LOS POSIBLES ESCENARIOS QUE SE PUEDAN CONTEMPLAR.

            CASI TODOS LOS DESARROLLOS DE SOFTWARE ESTÁN BASADOS EN DOS GRUPOS DE PRUEBAS:

                    - LAS PRUEBAS DE CAJA NEGRA:
                            SE EVALÚA LA APLICACIÓN DESDE UN PUNTO DE VISTA EXTERNO.
                            SIN PREOCUPARNOS DEL CÓDIGO INTERIOR.
                            SON HABITUALES PARA PRUEBAS DE INTERFACES.

                    - LAS PRUEBAS DE CAJA BLANCA:
                            SE BASAN EN LA EVALUACIÓN DEL CÓDIGO INTERNO DEL SOFTWARE.

            UN BUEN DISEÑO DE ESTAS PRUEBAS IMPLICA LA EVALUACIÓN DE TODOS LOS POSIBLES CAMINOS
            QUE SE HAN IMPLEMENTADO EN EL DISEÑO DE UN PROGRAMA.

            EL USO DE UN BUEN SISTEMA DE PRUEBAS
            APORTAN MÚLTIPLES VENTAJAS COMO:

                    - PERMITEN VALIDAR EL FUNCIONAMIENTO DEL SOFTWARE EN BASE A LAS ESPECIFICACIONES DEL DISEÑO.

                    - PERMITEN DETECTAR ERRORES EN EL SOFTWARE Y CORREGIRLOS ANTES DE LA IMPLANTACIÓN.

                    - PERMITE EVALUAR EL SOFTWARE EN DISTINTOS ESCENARIOS PROBABLES.

            PODEMOS DIFERENCIAR ENTRE:

                    - LAS PRUEBAS A NIVEL DE MÓDULOS:
                            SE REALIZAN A CADA MÓDULO DEL SISTEMA POR SEPARADO.

                    - LAS PRUEBAS DE FUNCIONAMIENTO GENERAL:
                            SE REALIZAN CUANDO TODOS LOS MÓDULOS DEL SISTEMA SE ENCUENTREN INTEGRADOS.
                            SE PRETENDE VALIDAR EL FUNCIONAMIENTO GLOBAL DE LA APLICACIÓN ANTES DE SER ENTREGADA.

            PARA COMPLETAR TODOS LOS POSIBLES ESCENARIOS, ES RECOMENDABLE REALIZAR LA FASE DE PRUEBAS DESDE MÚLTIPLES PUNTOS DE VISTA,
            PROVOCANDO ERRORES HABITUALES, O REALIZANDO PRUEBAS DE LAS ACCIONES MÁS COMUNES.
                                 
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
        
            ADEMÁS DE LA CLASIFICACIÓN GENÉRICA DE PRUEBAS DE CAJA NEGRA Y CAJA BLANCA,
            PODEMOS DIVIDIR LAS FASES DE PRUEBAS EN DIFERENTE TIPOS ATENDIENDO
            AL TIPO DE FUNCIONALIDAD EVALUADA EN CADA CASO:
                         
                    - PRUEBAS UNITARIAS:
                            EVALÚAN FUNCIONALIDADES CONCRETAS.
                            EXAMINAN TODOS LOS CAMINOS POSIBLES IMPLEMENTADOS
                            EN EL DESARROLLO DE UN ALGORITMO, FUNCIÓN O CLASE.

                    - PRUEBAS DE INTEGRACIÓN:
                            SE REALIZAN TRAS LAS PRUEBAS UNITARIAS.
                            SE REALIZAN A TODA LA APLICACIÓN YA TOTALMENTE INTEGRADA. 

                    - PRUEBAS DE REGRESIÓN:
                            ES UNA PRUEBA MUY COMÚN DE REALIZAR Y TIENE MUCHA IMPORTANCIA.
                            IMPLICA VOLVER A VERIFICAR AQUELLO QUE YA HABÍA SIDO EVALUADO PREVIAMENTE
                            Y HABÍA GENERADO ALGÚN TIPO DE ERROR.
                            LA SUPERACIÓN CON ÉXITO DE ESTA PRUEBA ES IMPRESCINDIBLE PARA VALIDAR
                            QUE LOS CAMBIOS HAN SIDO CORRECTOS.

                    - PRUEBAS DE SEGURIDAD:
                            SE CENTRAN EN LA EVALUACIÓN DE ESTOS SISTEMAS DE LA APLICACIÓN.
                                - SISTEMAS DE PROTECCIÓN.
                                - SISTEMAS DE AUTENTICACIÓN.

                    - PRUEBAS DE VOLUMEN Y DE CARGA:
                            PERMITE EVALUAR SI EL SOFTWARE PUEDE MANEJAR UNA GRAN CANTIDAD DE DATOS.
                            PERMITE EVALUAR SI EL SOFTWARE PUEDE SOPORTAR UN ACCESO MASIVO.
                            ESTAS PRUEVAS SON ÚTILES PARA SOFTWARE DE TIENDAS VIRTUALES.
                         
            FINALMENTE PODEMOS DIFERENCIAR ENTRE:
                         
                    - PRUEBAS MANUALES:
                            SON REALIZADAS POR UN DESARROLLADOR.
                         
                    - PRUEBAS AUTOMÁTICAS:
                            UTILIZAN HERRAMIENTAS QUE PERMITEN AGILIZAR EL PROCESO DE EVALUACIÓN
                        
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
                    - PRUEBAS DE INTEGRACIÓN.
                    - PRUEBAS DE REGRESIÓN.                         
                    - PRUEBAS DE SISTEMA.
                    - PRUEBAS DE SANIDAD.
                    - PRUEBAS DE HUMO.
                    - PRUEBAS DE INTERFAZ.                    
                    - PRUEBAS DE ACEPTACIÓN.
                         
            PRUEBAS NO FUNCIONALES:
                    - PRUEBAS DE SEGURIDAD.
                    - PRUEVAS DE VOLUMEN.
                    - PRUEBAS DE CARGA.
                    - PRUEBAS DE ESTRÉS.
                    - PRUEBAS DE RENDIMIENTO.
                    - PRUEBAS DE COMPATIBILIDAD.
                    - PRUEBAS DE INSTALACIÓN.
                    - PRUEBAS DE RECUPERACIÓN.
                    - PRUEBAS DE CONFIABILIDAD.
                    - PRUEBAS DE USABILIDAD.
                    - PRUEBAS DE CONFORMIDAD.
                    - PRUEBAS DE LOCALIZACIÓN.
                         
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
        
            SE CENTRA EN LA REVISIÓN DEL CÓDIGO PARA LA DETECCIÓN DE POSIBLES ERRORES Y LA CORRECCIÓN DE LOS MISMOS.
                         
            ATENDIENDO AL DESARROLLO DEL CÓDIGO
            PODEMOS ENCONTRAR TRES TIPOS DE ERRORES:
                         
                    - ERRORES DE COMPILACIÓN:
                            SE PRODUCEN POR UN FALLO EN LA SINTAXIS DEL LENGUAJE DE PROGRAMACIÓN.
                            NO PUEDE SER INTERPRETADO POR EL COMPILADOR.
                            NOS DEVUELVE UN MENSAJE DE ERROR.
                         
                    - ERRORES DE EJECUCIÓN:
                            LA SINTAXIS ES CORRECTA,
                            PERO AL EJECUTAR LA IMPLEMENTACIÓN SE REALIZA
                            ALGÚN TIPO DE OPERACIÓN CUYO RESULTADO ES ERRÓNEO.
                            NOS DEVUELVE UN MENSAJE DE ERROR.
                         
                    - ERRORES DE LÓGICA:
                            LA SINTAXIS Y LA EJECUCIÓN SON CORRECTAS,
                            PERO EL RESULTADO QUE NOS ARROJA NO ES EL ESPERADO. 
                            SON PRODUCIDOS POR UN FALLO EN EL DISEÑO DE LA LÓGICA DEL PROGRAMA.
                            SU DETECCIÓN ES MÁS COMPLEJA QUE LOS ANTERIORES,
                            YA QUE NO DEVUELVE NINGÚN MENSAJE DE ERROR.
                         
            LOS DOS PRIMEROS SON DETECTADOS DURANTE EL TIEMPO DE DESARROLLO,
            PERO PARA DETECTAR ERRORES DE LÓGICA ES CLAVE EL DISEÑO DE UN BUEN PROGRAMA DE PRUEBAS.
                         
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
        
            PRUEBAS DE INTEGRACIÓN:
                    SE REALIZAN TRAS LAS PRUEBAS UNITARIAS.
                    LAS PRUEBAS DE INTEGRACIÓN PERMITEN EVALUAR EL FUNCIONAMIENTO
                    DE TODOS LOS MÓDULOS DESARROLLADOS DE MANERA CONJUNTA.
                    SON UN TIPO DE PRUEBAS DE SOFTWARE QUE PERSIGUEN DETECTAR POSIBLES NUEVOS ERRORES
                    O PROBLEMAS QUE PUEDAN SURGUIR POR HABER INTRODUCIDO MEJORAS O CAMBIOS EL EL SOFTWARE.
                    HAY QUE HACER PRUEBAS DE INTEGRACIÓN AL FINALIZAR EL RESTO DE PRUEBAS.
                    PODEMOS DISTINGUIR DOS TIPOS:
                         
                            - PRUEBAS DE INTEGRACIÓN ASCENDENTE:
                                    ESTAS PRUEBAS COMIENZAN CON LA EVALUACIÓN DE LOS NIVELES MÁS BAJOS.
                                    SE REALIZAN EN GRUPO.
                                    REQUIEREN UN CONTROLADOR QUE SE ENCARGA DE LA COORDINACIÓN
                                    DE LAS SALIDAS Y ENTRADAS DE LOS CASOS DE PRUEBA.
                         
                            - PRUEBAS DE INTEGRACIÓN DESCENDENTE:
                                    ESTAS PRUEBAS COMIENZAN CON LA EVALUACIÓN DE LOS NIVELES MÁS ALTOS.
                                    DESDE EL MÓDULO PRINCIPAL HASTA LOS SUBORDINADOS.
                                    ES HABITUAL ENCONTRAR DOS TIPOS:
                                            - INTEGRACIÓN EN PROFUNDIDAD.
                                            - INTEGRACIÓN EN ANCHURA.
                         
            PRUEBAS DE SISTEMA:
                    SON AQUELLAS QUE EVALÚAN TODO EL SISTEMA DE FORMA CONJUNTA,
                    INTEGRANDO TODAS LAS PARTES, PERO SIN DIFERENCIAR LAS PRUEBAS ENTRE MÓDULOS.
                         
            PRUEBAS DE HUMO:
                    SE USAN PARA DESCRIBIR LA VALIDACIÓN DE LOS CAMBIOS EN EL SOFTWARE
                    ANTES DE QUE LOS CAMBIOS EN EL CÓDIGO SE REGISTREN EN LA DOCUMENTACIÓN DEL PROYECTO.
                    SU ORIGEN SE ENCUENTRA RELACIONADO CON LA FABRICACIÓN DE HARWARD,
                    ANTIGUAMENTE SI DESPUÉS DE REPARAR UN COMPONENTE,
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
        
            PRUEBAS DE REGRESIÓN:
                    ES LA NUEVA EJECUCIÓN DE UN CONJUNTO DE PRUEBAS QUE YA HABÍA SIDO EJECUTADO CON ANTERIORIDAD.
                    ES PARA EVALUAR SI LAS NUEVAS MODIFICACIONES Y CAMBIOS QUE SE HAYAN REALIZADO SOBRE EL CÓDIGO
                    HAN PODIDO PROVOCAR FALLOS QUE ANTES NO EXISTÍAN.
                         
                    IMPLICA LA EJECUCIÓN COMPLETA DE TODA LA BATERÍA DE PRUEBAS,
                    O SOLO DE ALGUNAS CONCRETAS.
                         
                    NOS ENCONTRAMOS DIFERENTES TIPOS:
                         
                            - PRUEBAS DE REGRESIÓN LOCALES:
                                   SE LOCALIZAN ERRORES QUE SE HAN PRODUCIDO
                                   POR LA INTRODUCCIÓN DE ÚLTIMOS CAMBIOS Y MODIFICACIONES.
                         
                            - PRUEBAS DE REGRESIÓN DESENMASCARADA O AL DESCUBIERTO:
                                   SE PRODUCE CUANDO LA INTRODUCCIÓN DE CAMBIOS MUESTRA ERRORES
                                   QUE NADA TIENEN QUE VER CON LAS MODIFICACIONES REALIZADAS,
                                   PERO QUE SU INCLUSIÓN LOS HA DEJADO AL DESCUBIERTO.
                         
                            - PRUEBAS DE REGRESIÓN REMOTA O A DISTANCIA:
                                   RECIBEN ESTE NOMBRE LOS ERRORES PRODUCIDOS CUANDO AL REALIZAR LA INTEGRACIÓN
                                   DE LAS DIFERENTES PARTES DE UN PROGRAMA, SE PRODUCEN ERRORES QUE DE FORMA 
                                   INDIVIDUAL NO OCURRÍAN.
                         
                    LA SUPERACIÓN CON ÉXITO DE ESTE TIPO DE PRUEBAS
                    ES IMPRESCINDIBLE PARA VALIDAR QUE LOS CAMBIOS HAN SIDO CORRECTOS.
                         
            PRUEBAS FUNCIONALES:
                    SE BASAN EN LA EVALUACIÓN DE TODAS LAS FUNCIONALIDADES ESPECIFICADAS
                    EN LOS REQUISITOS DE DISEÑO DE UNA HERRAMIENTA O APLICACIÓN SOFTWARE.
                    ES ACONSEJABLE QUE EL PROCESO QUEDE DOCUMENTADO.
                         
                    TAL Y COMO SE INDICA EN LA NORMA ISO 25010,
                    SON DESEABLES CIERTAS CARACTERÍSTICAS RELATIVAS A LA EVALUACIÓN DE LA FUNCIONALIDAD:
                         
                            - IDONEIDAD.
                            - EXACTITUD.
                            - INTEROPERABILIDAD.
                            - SEGURIDAD.
                         
            ESTE TIPO DE PRUEBAS SON LLEVADAS A CABO POR EXPERTOS CAPACES DE INTERPRETAR LOS RESULTADOS OBTENIDOS
            Y REALIZAR PROPUESTAS DE MODIFICACIONES Y CAMBIOS NECESARIOS PARA QUE LA FUNCIONALIDAD OBTENIDA
            SE ADECÚE A LAS ESPECIFICACIONES DE DISEÑO.
                         
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
                            SE CENTRAN EN EL COMPORTAMIENTO INTERNO DE LA APLICACIÓN.

                    - LAS NO FUNCIONALES: --> DE CAJA NEGRA.
                            SE UTILIZAN PARA EVALUAR EL COMPORTAMIENTO EXTERNO DE LA APLICACIÓN.
                         
            * PRUEBAS DE CAPACIDAD:
                    SE UTILIZAN PARA LA EVALUACIÓN DEL SOFTWARE Y SU COMPORTAMIENTO ANTE UN AUMENTO DE PETICIONES,
                    ES DECIR, ANTE UN INCREMENTO DE LA CARGA DE TRABAJO.
                         
            * PRUEBAS DE RENDIMIENTO:
                    SE UTILIZAN PARA LA EVALUACIÓN DEL TIEMPO DE RESPUESTA
                    Y LA VELOCIDAD DE PROCESAMIENTO DEL SOFTWARE.
                         
            * PRUEBAS DE ESTRÉS:
                    SE UTILIZAN PARA LA EVALUACIÓN DE LA CAPACIDAD DE RECUPERACIÓN
                    DEL SOFTWARE ANTE UNA SOBRECARGA DE DATOS.
                         
            * PRUEBAS DE VOLUMEN:
                    SE UTILIZAN PARA LA EVALUACIÓN DE LA CAPACIDAD DE PROCESAMIENTO
                    DEL SOFTWARE ANTE LA LLEGADA DE UNA CANTIDAD GRANDE DE DATOS.
                         
            * PRUEBAS DE SEGURIDAD:
                    ESTE TIPO DE PRUEBAS ESTÁ DISEÑADAS PARA DOS CLAROS PROPÓSITOS:
                            - GARANTIZAR LOS ASPECTOS RELATIVOS A LA INTEGRIDAD DE LOS DATOS.
                            - EVALUAR LOS DIFERENTES MECANISMOS DE PROTECCIÓN QUE PUEDEN ESTAR
                              INVOLUCRADOS EN UNA DETERMINADA APLICACIÓN SOFTWARE.
                         
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
                    SE REALIZAN POR EL DESARROLLADOR PARA PROBAR EL CÓDIGO QUE ESTÁ IMPLEMENTANDO.
                    INTRODUCE VALORES DE ENTRADA Y EN FUNCIÓN DE ESTOS, SE EVALÚA SI LA SALIDA ES LA ESPERADA.
                    NO SE UTILIZAN HERRAMIENTAS CONCRETAS,
                    EL PROPIO DESARROLLADOR LLEVA A CABO LA DEPURACIÓN
                    Y PRUEBA EL CÓDIGO EN BASE A LA SITUACIÓN QUE SE ESTÉ EVALUANDO.
                         
            * LAS PRUEBAS AUTOMÁTICAS:
                    SI UTILIZAN HERRAMIENTAS QUE PERMITEN AGILIZAR EL PROCESO DE EVALUACIÓN DE LAS APLICACIONES IMPLEMENTADAS.
                    SON ESPECIALMENTE ÚTILES PARA LA REALIZACIÓN DE PRUEBAS DE REGRESIÓN,
                    PUESTO QUE OPTIMIZAN EL PROCESO.
                         
                    ALGUNAS DE LAS HERRAMIENTAS MÁS COMUNES PARA LA REALIZACIÓN DE ESTE TIPO DE PRUEBAS SON:
                         
                            - JMETER:
                                    SE TRATA DE UN PROYECTO DE APACHE QUE PERMITE REALIZAR PRUEBAS DE CARGA
                                    PARA LA EVALUACIÓN DEL RENDIMIENTO DE UNA DETERMINADA APLICACIÓN.
                         
                            - BUGZILLA:
                                    HERRAMIENTA ONLINE UTILIZADA PARA EL SEGUIMIENTO DE ERRORES Y DEFECTOS DEL SOFTWARE Y SUS MÓDULOS,
                                    A TRAVÉS DE LAS DIFERENTES VERSIONES DE UNA MISMA APLICACIÓN.
                         
                            - JUNIT:
                                    CONJUNTO DE LIBRERÍAS EN JAVA UTILIZADAS PARA LA REALIZACIÓN DE PRUEBAS UNITARIAS
                                    SOBRE LAS APLICACIONES DESARROLLADAS SOBRE ESTE LENGUAJE DE PROGRAMACIÓN,
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
                    EN CONTRAPOSICIÓN A LAS PRUEBAS POR EXPERTOS TENEMOS LAS PRUEBAS DE USUARIO.
                    SE BASAN EN EL ANÁLISIS Y EVALUACIÓN DE UNA HERRAMIENTA O APLICACIÓN SOFTWARE
                    MEDIANTE UN GRUPO DE USUARIOS REALES QUE PUEDEN DETECTAR ERRORES
                    QUE LOS EXPERTOS NO HAN SIDO CAPACES DE ENCONTRAR.
                         
                    LOS MÉTODOS DE TEST CON USUARIOS SE BASAN EN EL USO DE CUESTIONARIOS TIPO.
                    SEGÚN EL 'DISEÑO CENTRADO EN EL USUARIO' (DCU), LOS TEST DE USUARIO SE BASAN EN PRUEBAS
                    QUE OBSERVAN LA FORMA DE INTERACCIÓN DE LOS USUARIOS CON EL PRODUCTO OBJETO DEL TEST.
                         
                    POR EJEMPLO, A UN EXPERTO LE PUEDE RESULTAR INTUITIVA
                    Y FÁCIL DE APRENDER LA FORMA DE USO DE UNA DETERMINADA FUNCIONALIDAD,
                    PERO NO DEJAN DE SER EXPERTOS EN DESARROLLO.
                    DESDE EL PUNTO DE VISTA DE UN USUARIO,
                    ESTA FORMA DE ACOMETER LA ACCIÓN PUEDE NO SER TAN INTUITIVA.
                         
                    ES ACONSEJABLE QUE EL NÚMERO DE USUARIOS QUE PARTICIPEN EN ESTE TEST SEA DE AL MENOS QUINCE PARA PODER GARANTIZAR
                    UNA TASA DE DETECCIÓN DE CERCA DEL 100%. LA ELECCIÓN DE ESTOS SE DEBE BASAR EN LOS PERFILES HACIA LOS QUE ESTÁ DIRIGIDA
                    LA APLICACIÓN, NO TENDRÁ SENTIDO PROBAR UNA APLICACIÓN PARA LA GESTIÓN LOGÍSTICA DE UN ALMACÉN CON UN GRUPO DE
                    USUARIOS QUE NO TIENEN NINGUNA VINCULACIÓN CON ESTE TIPO DE ÁREAS. LAS PRUEBAS SE REALIZAN DE FORMA INDIVIDUAL Y SE
                    DEBEN TENER EN CUENTA TODAS LAS OBSERVACIONES QUE SE TOMEN, DESDE LA PRIMERA TOMA DE CONTACTO HASTA LA REALIZACIÓN
                    DE LA PRUEBA COMPLETA.
                         
                    ALGUNOS CRITERIOS DE DISEÑO SON:
                    
                            - PRUEBAS RAZONABLES:
                         
                            - PRUEBAS ESPECÍFICAS:
                         
                            - PRUEBAS FACTIBLES:
                         
                            - TIEMPO DE REALIZACIÓN RAZONABLE:                         
                         
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
        
            LAS PRUEBAS DE ACEPTACIÓN:
                    SE UTILIZAN PARA COMPROBAR SI UNA APLICACIÓN
                    CUMPLE CON EL FUNCIONAMIENTO CONTENIDO EN LAS ESPECIFICACIONES DE DISEÑO,
                    TANTO DESDE UN PUNTO DE VISTA FUNCIONAL COMO DE RENDIMIENTO.
                            - DEBE CUMPLIR CON LA FUNCIONALIDAD DESEADA.
                            - EL TIEMPO NECESARIO PARA COMPLETAR LA FUNCIONALIDAD TIENE QUE SER ACEPTABLE.
                    
                    ALGUNAS CARACTERÍSTICAS SON:
                         
                            - LAS PRUEBAS DE ACEPTACIÓN SON DEFINIDAS POR LOS CLIENTES:
                         
                            - SE EJECUTAN ANTES DE LA IMPLANTACIÓN FINAL DE LA APLICACIÓN:
                         
                            - LOS PLANES DE PRUEBAS DE ACEPTACIÓN HAN DE SER CORRECTAMENTE DOCUMENTADOS:                         
                    
                         
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
        
            EL PROCESO DE EVALUACIÓN Y ANÁLISIS DE CUALQUIER DESARROLLO ANTES DE SER IMPLANTADO DE FORMA DEFINITIVA
            ESTÁ CONSTITUIDO POR UNA VARIADA TIPOLOGÍA DE PRUEBAS.
                         
            LA REALIZACIÓN DE TODAS ESTAS ES IMPORTANTE PARA OFRECER LA MAYOR GARANTÍA POSIBLE
            SOBRE EL FUNCIONAMIENTO DE UN HERRAMIENTO.
                         
            UNO DE LOS FLUJOS HABITUALES DE EJECUCIÓN                           ESTIMACIÓN DEL TIEMPO PARCIAL
            DE PRUEBAS EN EL DESARROLLO                                         DE REALIZACIÓN DE PRUEBAS 
            DE PRODUCTOS SOFTWARE ES:                                           EN FUNCIÓN DEL TIEMPO TOTAL RESERVADO A PRUEBAS:
                                    
                    1.-     UNITARIAS.                            ------------>  0 % -->  SE REALIZAN EN EL DESARROLLO.
                    2.-     INTEGRACIÓN.                          ------------>  0 % -->  SE REALIZAN EN EL DESARROLLO.
                    3.-     SISTEMA.                              ------------> 25 %
                    4.-     REGRESIÓN.                            ------------> 15 %
                    5.-     FUNCIONALES.                          ------------> 15 %
                    6.-     CAPACIDAD.                            ------------> 10 % ~ 20 %
                    7.-     RECURSOS.                             ------------>      -->  SE REALIZAN JUNTO CON LAS DE CAPACIDAD.
                    8.-     SEGURIDAD.                            ------------> 10 %
                    9.-     USUARIO.                              ------------> 20 %
                    10.-    ACEPTACIÓN.                           ------------> 10 %
                         
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
                         
            EXISTEN ERRORES QUE SOLO VAN A SER DESCUBIERTOS CUANDO SE SIMULE EL FUNCIONAMIENTO HABITUAL DE LA APLICACIÓN.
                         
                * VERSIÓN ALFA:
                        CONSISTE EN LA PRIMERA VERSIÓN DE LA APLICACIÓN.
                        SERÁ PROBADA POR UN GRUPO DE INDIVIDUOS QUE SIMULAN SER EL CLIENTE FINAL.
                        ESTA VERSIÓN AÚN NO ESTÁ PREPARADA PARA SU IMPLANTACIÓN EN PRODUCCIÓN,
                        DEBE SER EVALUADA PREVIAMENTE POR UN GRUPO DE EXPERTOS QUE SIMULAN SER CLIENTES.
                         
                        SE REALIZAN HABITUALMENTE DESDE LAS OFICINAS DE TRABAJO DONDE EL PRODUCTO HA SIDO DESARROLLADO,
                        PUESTO QUE AÚN NO HA SIDO ENTREGADO AL CLIENTE.
                         
                * VERSIÓN BETA:
                        ES UNA VERSIÓN CASI DEFINITIVA DEL PRODUCTO.
                        SE TRATA DE LA PRIMERA VERSIÓN QUE SERÁ PROBADA
                        POR LOS CLIENTES QUE HABÍAN REALIZADO EL ENCARGO DEL DESARROLLO.
                        SERÁ LA VERSIÓN QUE EVALÚEN USUARIOS AJENOS AL DESARROLLO.
                         
                        SE REALIZAN HABITUALMENTE FUERA DE LAS OFICINAS DE TRABAJO DONDE EL PRODUCTO HA SIDO DESARROLLADO,
                        PARA EVITAR CONDICIONAMIENTOS EN EL MANEJO DE LA APLICACIÓN.
                         
                        APARECEN LOS LLAMADOS 'USUARIOS BETA TESTER'
                        QUE SON LOS ENCARGADOS DE COMPROBAR QUE TODO FUNCIONA CORRESTAMENTE.
                        SI ENCUENTRAN ALGÚN FALLO, SERÁN LOS ENCARGADOS DE INDICARLOS ANTES DE HACER PÚBLICA LA APLICACIÓN. 
                         
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
        
            1.- FASE DE PLANIFICACIÓN:
                    SE DEFINEN LOS CRITERIOS Y NECESIDADES BÁSICAS DE LA APLICACIÓN.
                         
            2.- FASE DE DISEÑO:
                    SE REALIZA EL DISEÑO EN BASE A LOS CRITERIOS DEFINIDOS PREVIAMENTE.
                         
            3.- FASE DE IMPLANTACIÓN:
                    SE ESCRIBE Y DESARROLLA EL CÓDIGO DISEÑADO EN LOS APARTADOS ANTERIORES.
                         
            4.- FASE DE EVALUACIÓN:
                    FASE DE PRUEBAS PARA EVALUAR EL ESTADO DE LA APLICACIÓN ANTES DE SER ENTREGADA AL CLIENTE.
                    AL CONCLUIR ESTA FASE, SERÁ NECESARIO REGRESAR A LA FASE ANTERIOR, EN EL CASO DE HABER APARECIDO ERRORES O CAMBIOS.
                         
            5.- FASE DE PRODUCCIÓN:
                    EN ESTA FASE SE ENTREGA EL DESARROLLO A LOS USUARIOS QUE LA UTILIZARÁN PARA EL FIN QUE ESTABA DISEÑADA.
                         
            6.- FASE DE MANTENIMIENTO:
                    TRAS SER ENTREGADA LA APLICACIÓN, ES POSIBLE INCORPORAR NUEVAS FUNCIONALIDADES
                    O RESOLVER CASUÍSTICAS QUE NO SE HABÍAN TENIDO EN CUENTA DURANTE SU DISEÑO E IMPLEMENTACIÓN.
                         
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
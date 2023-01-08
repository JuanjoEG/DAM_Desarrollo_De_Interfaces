package Tema_10;

import static Principal_Main.Main.*;
import static Tema_10.T_10.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_10 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_10 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                         INTRODUCCI�N Y CONTEXTUALIZACI�N PR�CTICA.
                       
            DOCUMENTACI�N DE APLICACIONES SOFTWARE:
                    TODOS AQUELLOS ELEMENTOS QUE DETALLAN LAS CARACTERISTICAS DE UNA APLICACI�N,
                    Y QUE PUEDEN SER NECESARIOS PARA SU USO, MANTENIMIENTO O MODIFICACI�N.
                       
            SE TRATA DE FICHEROS DE AYUDA, MANUALES, GU�AS DE USO Y/O MONTENIMIENTO, 
            DIRIGIDAS PARA LOS USUARIOS, EQUIPOS DE SOPORTE O PARA OTROS DISE�ADORES.
                       
            PARA UN SISTEMA SOFTWARE, ES ESPECIALMENTE IMPORTANTE CONTAR CON UNA DOCUMENTACI�N COMPLETA 
            Y QUE A LA VEZSEA SENCILLA DE CONSULTAR.
            SE CONSIGUE MEJORAR LA COMPRENSI�N DE USO DE UNA APLICACI�N POR PARTE DEL USUARIO, INDEPENDIENTEMENTE DE SU PERFIL.
            SE TRATA DE UNA TAREA TAN IMPORTANTE COMO LA QUE PUEDE REALIZAR EL PROPIO C�DIGO DEL PROGRAMA.
                                       
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
                                             FICHEROS DE AYUDA Y FORMATOS.                                      

            FICHERO:
                ES UN ELEMENTO QUE CONTIENE CUALQUIER TIPO DE INFORMACI�N
                Y QUE PUEDE ESTAR RECOGIDA EN M�LTIPLES TIPOS DE FORMATOS,
                TANTO EN SOPORTE F�SICO COMO EN DIGITAL. NOS CENTRAREMOS EN EL FORMATO DIGITAL.
                       
            UN FICHERO DE AYUDA:
                ES UN DOCUMENTO QUE CONTIENE TODA LA INFORMACI�N QUE PUEDE SERVIR DE AYUDA 
                O DE MANUAL PARA LOS USUARIOS DE LA HERRAMIENTA SOBRE LA QUE SE HA DESARROLLADO.
                       
            LOS FICHEROS DE AYUDA SE COMPONENDE DOS PARTES:
                       
                    - MAPA DE FICHERO:
                            CONSTITUYE UN MAPA DE NAVEGACI�N DEL SISTEMA DE AYUDA,
                            ASOCIANDO IDENTIFICADORES PARA CADA UNO DE LOS TEMAS CONTENIDOS A LAS URL
                            DONDE SE ENCUENTRA EL CONTENIDO RELATIVO AL TEMA SELECCIONADO.
                       
                    - VISTA DE INFORMACI�N:
                            ES LA PARTE QUE SE MUESTRA AL USUARIO, HABITUALMENTE EN FORMA DE �NDICE,
                            GLOSARIO, TABLA DE CONTENIDOS E INCLUSO BUSCADOR DE TEMAS.
                       
            - FORMATOS:
                       
                    - HLP:                       
                            ACTUALMENTE EN DESUSO, SUSTITUIDO POR CHM.
                            SE TRATA DE FICHEROS UTILIZADOS PARA LA GENERACI�N DE AYUDA DE WINDOWS.
                                    - PUEDE INCLUIR TABLA DE CONTENIDO EN  .cnt
                                    - INCLUYE INFORMACI�N EXTRA EN   .gid
                                    - UTILIZA FICHEROS RTF PARA GENERAR LA AYUDA
                                    - NECESITA COMPILACI�N (POR EJEMPLO, MEDIANTE HTML Help Workshop)
                       
                    - CHM: (AYUDA HTML COMPILADO)
                            ESTE NUEVO FORMATO INCLU�A CIERTAS MEJORAS SOBRE HLP, QUED� INCLUIDO A PARTIR DE WINDOWS VISTA.
                            DESDE WINDOWS 7 SOLO APARECE EN ALGUNAS APLICACIONES.
                                    - GENERADO A PARTIR DE HLP.
                                    - UTILIZA HTML PARA GENERAR LA AYUDA.
                                    - ENLACES MEDIANTE HIPERV�NCULOS A LAS TABLAS DE CONTENIDO.
                                    - PERMITE FUSIONAR VARIOS FICHEROS DE AYUDA.
                                    - PUEDE SER CREADO A PARTIR DE HTML Help Workshop.
                       
                    - HPJ:
                            LOS FICHEROS HPJ, AL IGUAL QUE LOS ANTERIORES, UTILIZAN FICHEROS DE TIPO .cnt
                            PARA LA REPRESENTACI�NDE LA TABLA DE CONTENIDOS,
                            MIENTRAS QUE UTILIZAN FICHEROS DE TIPO .shg PARA LA REPRESENTACI�N DE GR�FICOS.
                            SON CREADOS UTILIZANDO HERRAMIENTAS DEL TIPO   Help Workshop
                       
                    - IPF: (INFORMATION PRESENTATION FACILITY)
                            SE TRATA DE FICHEROS QUE UTILIZAN IPF, UN LENGUAJE MUY SIMILAR A HTML.
                            SON UTILIZADOS SOBRE TODO PARA AYUDA EN L�NEA E HIPERTEXTO.
                       
                    - JAVAHELP:
                            TIPO DE FORMATO DE FICHERO DE AYUDA QUE SER� TRATADO EN EL DESARROLLO DE ESTE TEMA.
                            RECIBEN ESTE NOMBRE TANTO EL FORMATO DE FICHEROS DE AYUDA EN L�NEA
                            COMO EL SISTEMA QUE SE ENCARGA DE SU GENERACI�N.
                            EST�N IMPLEMENTADOS EN JAVA.
                            SE UTILIZAN PARA LA GENERACI�N DE AYUDA DE APLICACIONES DESARROLLADAS EN JAVA.
                       
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
                                            HERRAMIENTAS DE GENERACI�N DE AYUDA.
                       
            - HELP WORKSHOP:
                    ESTA HERRAMIENTA PERMITE LA CREACI�N DE FICHEROS DE AYUDA PARA WINDOWS.
                    EST� FORMADA POR:
                            - UN EDITOR DE IM�GENES.
                            - EL ADMINISTRADOR DE PROYECTOS.
                            - EL COMPILADOR.
                                    ES CLAVE PARA EL DESARROLLO DE MANUALES Y AYUDA.
                                    PERMITE REDUCIR EL TAMA�O FINAL PARA SU POSTERIOR DISTRIBUCI�N.
                    SE DESCARGA EL INSTALADOR EN:
                            https://microsoft-html-help-workshop.softonic.com/
                       
            - HELP MAKER:
                    ESTA HERRAMIENTA ES GRATUITA Y PERMITE LA CREACI�N DE FICHEROS DE AYUDA A TRAV�S DE UN EDITOR DE ARCHIVOS.
                    INCLUYE DIFERENTES OPCIONES DE PERSONALIZACI�N QUE PERMITEN DAR FORMATO AL TEXTO.
                    POSIBILITA DOCUMENTOS M�S ORGANIZADOS Y F�CILES DE LEER.
                    TODA LA INFORMACI�N QUEDA CONTENIDA EN UN �NICO FICHERO,
                    Y ES POSIBLE EXPORTAR TODA LA AYUDA EN UN SOLO DOCUMENTO PDF.
                       
            - SHALOM HELP MAKER:
                    ESTA HERRAMIENTA ES GRATUITA Y PERMITE LA CREACI�N DE FICHEROS DE AYUDA PARA APLICACIONES.
                    PERMITE LA CREACI�N DE FICHEROS DE AYUDA A TRAV�S DE UN EDITOR DE TEXTO QUE RESULTA SENCILLO DE UTILIZAR.
                    ADEM�S DE LAS CARACTER�STICAS PROPIAS DEL EDITOR DE TEXTO,
                            - PERMITE LA CREACI�N DE �NDICES.
                            - CONTENIDOS ENLAZADOS A OTRAS P�GINAS.
                            - LINKS EXTERNOS.
                            - CREACI�N DE IM�GENES QUE ENRIQUECEN EL CONTENIDO FINAL.
    
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
                                                    TABLAS DE CONTENIDO.
                       
            UNA TABLA DE CONTENIDO PERMITE REFLEJAR LA ESTRUCTURA Y CONTENIDO DE UN DOCUMENTO.
            SE ENCUENTRA ESQUEMATIZADA EN VARIOS NIVELES DE ELEMENTOS ENTRE LOS QUE SE DISTINGUEN T�TULOS Y SUBT�TULOS.
            AUNQUE EL DISE�O DEPENDER� DEL DESARROLLADOR Y DE OTROS MUCHOS FACTORES,
            LAS CARACTER�STICAS T�PICAS SON:
                       
                    - PUEDEN MOSTRAR EL N�MERO DE P�GINA O NO, EN FUNCI�N DEL DISE�O.
                       
                    - CASI SIEMPRE INCLUYE UN ENLACE DIRECTO EN CADA UNO DE LOS T�TULOS O SUBT�TULOS,
                      POR LO QUE APARECE COMPUESTA, YA QUE APUNTA AL CONTENIDO DE CADA UNO DE ESOS T�TULOS.
                       
                    - SE SIT�AN AL INICIO DE CUALQUIER DOCUMENTO, COMO DE UN �NDICE DE LIBRO SE TRATARA.
                       
                    - SU ELABORACI�N NO ES TRIVIAL, 
                      REQUIERE DE UN PROCESO DE AN�LISIS COMPLETO DE LA DOCUMENTACI�N QUE SE VA A EXPONER,
                      AS� COMO DE LOS T�TULOS Y SUBT�TULOS QUE A CONTINUACI�N RECOGEN.
                       
                    - NO DEBE DUPLICARSE LA INFORMACI�N.
                       
                    - LOS T�TULOS DEBEN SER LO SUFICIENTEMENTE CLAROS
                      PARA QUE UN USUARIO NO NECESITE DE OTRO DOCUMENTO
                      PARA ENTENDER C�MO FUNCIONA EL MANUAL DE AYUDA.
                       
            LAS PAUTAS DE DISE�O DE UNA BUENA TABLA DE CONTENIDOS SON:
                       
                    - 1. SELECCI�N DE LOS TEMAS Y SUBTEMAS QUE APARECER�N EN LA TABLA.
                    - 2. NUMERACI�N DE LOS TEMAS Y SUBTEMAS EN FUNCI�N DEL PATR�N DE NUMERACI�N ESCOGIDO.
                    - 3. CREACI�N DE LA TABLA DE CONTENIDO A�ADIENDO LOS ENLACES OPORTUNOS.
                    - 4. CONSTANTE REVISI�N DE LA TABLA PARA ACTUALIZAR Y MODIFICAR LA INFORMACI�N.
                         
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
                                                  TIPOS DE DOCUMENTACI�N.
                       
            - DOCUMENTACI�N DE PRUEBAS:
                    LA FINALIDAD DE DOCUMENTAR LAS PRUEBAS REALIZADAS SOBRE UN PROGRAMA
                    ES FUNDAMENTAL PARA DETECTAR Y CORREGIR POSIBLES ERRORES.
                    LAS DIVIDEREMOS EN DOS TIPOS:
                            - DOCUMENTACI�N DE ENTRADA:
                                    EN LA QUE SE ESPECIFICAN LOS ESCENARIOS DE PRUEBA
                                    Y SE DETALLAN LOS PROCEDIMIENTOS DE LAS PRUEBAS.
                            - DOCUMENTACI�N DE SALIDA:
                                    SE TRATA DE INFORMES DE LOS RESULTADOS DE APLICAR PRUEBAS,
                                    DEFINIDAS EN LA DOCUMENTACI�N DE ENTRADA.
                       
            - DOCUMENTACI�N TECNICA:
                    PERTENECE A ESTE GRUPO --> GU�AS, HOJAS DE ESPECIFICACIONES, MANUALES, ETC...
                    LAS DIVIDEREMOS EN DOS TIPOS:
                            - DOCUMENTACI�N INTERNA:
                                    SE TRATA DE LOS COMENTARIOS INCLUIDOS POR EL DESARROLLADOR EN EL C�DIGO,
                                    DEBEN DESCRIBIR DISTINTOS ASPECTOS SOBRE ESE C�DIGO.
                                    ES IMPORTANTE REALIZAR UN PROGRAMA ORDENADO Y CLARO.
                                    EL C�DIGO DE POR S�, DEBE SER CLARO, Y COMO A�ADIDO IMPRESCINDIBLE,
                                    LOS COMENTARIOS AYUDAR�N A ENTENDER A�N MEJOR EL C�DIGO.
                                    DEBE TENERSE EN CUENTA:
                                            - COMIENZO DE M�DULOS.
                                            - VARIABLES, CONSTANTES, PROCEDIMIENTOS Y FUNCIONES.
                                            - COMENTARIOS INTRODUCTORIOS SOBRE BLOQUES DE C�DIGO, FUNCIONES O M�DULOS.
                                            - NO COMENTAR LO OBVIO, EVITAR EL EXESO DE COMENTARIOS.
                            - DOCUMENTACI�N EXTERNA:
                                    SE TRATA DE UN MANUAL T�CNICO ORIENTADO A PROGRAMADORES
                                    PARA FACILITAR EL MANTENIMIENTO Y DESARROLLO DE LA APLICACI�N EN UN FUTURO.
                         
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
                                                          TIPOS DE MANUALES.
                       
            - MANUAL O GU�A DE USUARIO:
                    CONTIENE LA INFORMACI�N NECESARIA PARA FACILITAR AL USUARIO LA COMPRENSI�N Y UTILIZACI�N DEL PROGRAMA.
                    DEBE SER UN DOCUMENTO AMIGABLE Y CLARO PARA EL USUARIO.
                    ES ACONSEJABLE EL USO DE IM�GENES Y GR�FICOS, TEXTOS CLAROS Y CONCISOS, EJEMPLOS ILUSTRATIVOS, ETC...
                    SE DESARROLLA EN DIFERENTES �MBITOS:
                            - FORMACI�N DEL USUARIO.
                            - GU�A DE CONSULTA ANTE DUDAS.
                            - AYUDA PARA DETECTAR Y CORREGIR ERRORES.
                            - ETC...
                       
            - GU�A R�PIDA Y GU�A DE REFERENCIA:
                    LA APLICACI�N PUEDE COMPLEMENTARSE CON ESTAS GU�AS:
                    - GU�A R�PIDA:
                            PUEDE ORIENTARSE A USUARIOS Y/O ENCARGADOS DE MANTENIMIENTO.
                            UNA MISMA APLICACI�N PUEDE TENER VARIAS GU�AS R�PIDAS EN FUNCI�N DE LA COMPLEJIDAD.
                            PROPORCIONA INFORMACI�N MUY CONCRETA SOBRE
                            DIVERSOS PROCEDIMIENTOS QUE PUEDE REALIZAR UNA APLICACI�N.
                            EN APLICACIONES MUY SENCILLAS PUEDE CONSTITUIR POR S� MISMA UN MANUAL.
                       
            - GU�A DE REFERENCIA:
                    SUELEN DESARROLLARSE PARA USUARIOS CON CIERTO CONOCIMIENTO Y EXPERIENCIA EN EL USO DE LA APLICACI�N.
                    SUELEN CONTENER INFORMACI�N ASOCIADA A ASPECTOS M�S TECNICOS:
                            - RELACI�N DE MENSAJES DE ERROR Y SU POSIBLE ORIGEN.
                            - TIPOS DE DATOS DE ENTRADA PERMITIDOS EN LA APLICACI�N.
                            - COMANDOS ACEPTADOS.
                            - ETC...
                       
            - MANUAL Y GU�A DE EXPLOTACI�N:
                    CONTIENEN LA INFORMACI�N NECESARIA PARA PONER EN USO LA APLICACI�N.
                    EST�N ORIENTADOS A LA INSTALACI�N, CONFIGURACI�N Y PUESTA EN MARCHA DE LA APLICACI�N.
                    SEG�N LA COMPLEJIDAD DEL DOCUMENTO TENEMOS LA OPCI�N DE DIVIDIRLO EN:
                            - MANUAL DE INSTALACI�N.
                            - MANUAL DE CONFIGURACI�N.
                    EST� LIGADO AL CONTECTO DONDE SE REALIZA LA INSTALACI�N:
                            - TIPO DE ORGANIZACI�N.
                            - REQUERIMIENTOS.
                            - N�MERO DE USUARIOS.
                            - ETC...
                       
            - MANUALES VISUALES: CREACI�N.
                    - ANALIZAR LAS NECESIDADES DEL P�BLICO HACIA EL QUE VA DIRIGIDO.
                    - HAY QUE SER CLARO Y CONCISO.
                    - ANALIZAR OTROS CONTENIDOS SIMILARES QUE YA EST�N PUBLICADOS.
                    - GUIONIZAR EL V�DEO ANTES DE SER GRABADO. NO BASTA CON DAR A GRABAR.
                         
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
                                     GENERACI�N DE UN SISTEMA DE AYUDA CON JAVAHELP.
                       
            JavaHelp ES UNA APLICACI�N QUE PERMITE LA CREACI�N DE SISTEMAS DE AYUDA
            PARA SER INTEGRADAS POSTERIORMENTE EN UNA APLICACI�N.
            EST� ORIENTADA AL USO DE APLICACIONES DESARROLLADAS CON LENGUAJE DE PROGRAMACI�N JAVA.
            LA HERRAMIENTA PERMITE LA CREACI�N DE DOCUMENTOS DE AYUDA MUY COMPLETOS QUE INCLUYE
                    - TABLAS DE CONTENIDOS.
                    - MOTOR DE B�SQUEDA.
                    - GLOSARIO.
                    - SECCI�N DE FAVORITOS.
                    - ETC...
                       
            PARA CREAR UN SISTEMA DE AYUDA CON JavaHelp, SE DEBEN DE SEGUIR LOS PASOS:
                       
                    - 1. SE HA DE DAR FORMA A LA AYUDA. IMPLICA:
                            - ESPECIFICAR LA ORGANIZACI�N.
                            - DISE�AR LOS TEMAS QUE VAN A TOMAR LA AYUDA.
                       
                    - 2. DESCARGAR E INSTALAR JavaHelp.
                            - DIVERSOS REPOSITORIOS.
                            - DESDE LA P�GINA DE SUN.
                       
                    - 3. CREACI�N DE FICHEROS DE JavaHelp NECESARIOS.
                            - EN FUNCI�N DE LA ORGANIZACI�N DE LA AYUDA DETERMINADA.
                       
                    - 4. SE CONSTRUYE UN FICHERO JAR.
                            - QUE INCLUYA TODOS LOS FICHEROS DE AYUDA.
                            - QUE PERMITA MEJORAR SU DISTRIBUCI�N.
                       
                    - 5. SE A�ADE LA AYUDA A LA APLICACI�N.
                            - EN FUNCI�N DE LA ORGANIZACI�N DE LA AYUDA DETERMINADA.
                         
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
                                                FICHEROS DE APLICACI�N JAVAHELP.
                       
            LA HERRAMIENTA JavaHelp REQUIERE EL USO FRECUENTE DE DIFERENTES FICHEROS DE VARIOS TIPOS
            PARA EL DISE�O DE CADA UNA DE LAS PARTES QUE FORMAN LA AYUDA FINAL.
                       
        ************************************************************************************************************************
        *          FICHERO             *  TIPO  *                             DESCRIPCI�N                                      *
        ************************************************************************************************************************
                       
        ************************************************************************************************************************
        *           �NDICE             * .xml   *   INCLUYE LA DISTRIBUCI�N DEL SISTEMA DE AYUDA.                              *
        *                              *        *                                                                              *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *            MAP               * .jhm   *   ASOCIA ELEMENTOS DEL FICHERO HTML CON UN IDENTIFICADOR.                    *
        *                              *        *             (IM�GENES, FICHEROS HTML, ETC...)                                *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *          HELPSET             *  .hs   *   CONTIENE LA INFORMACI�N NECESARIA PARA                                     *
        *                              *        *   QUE EL SISTEMA DE AYUDA SE EJECUTE.                                        *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *        TEMAS O TOPICS        * .html  *   PARA CREARLOS SE PUEDE UTILIZAR CUALQUIER HERRAMIENTA PARA GENERAR HTML.   *
        *                              *        *   CONTIENE LA INFORMACI�N DE AYUDA COMO TAL, UN HTML POR CADA TEMA.          *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *   BASE DE DATOS DE B�SQUEDA  *        *   PARA GENERARSE SE DEBE UTILIZAR LA HERRAMIENTA --> JHINDEXER               *
        *                              *        *                                                                              *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *     TABLA DE CONTENIDOS      * .xml   *   INCLUYE EL CONTENIDO DE LA AYUDA Y SU DISTRIBUCI�N.                        *
        *                              *        *                                                                              *
        ************************************************************************************************************************
                         
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
                                              ESTRUCTURA DE CARPETAS Y FICHEROS EN JAVAHELP.
                       
            EN NUESTRA APLICACI�N JAVA TENDREMOS LAS CARPETAS:
                       
                    - /bin
                        EjemploJavaHelp.jar
                        javahelp-2.0.02.jar                                    --> LIBRER�AS QUE VAMOS A NECESITAR.
                       
                    - /help
                        Help_set.hs                                            --> SE LLEVA A CABO LA VINCULACI�N DE TODOS LOS FICHEROS.
                        Indice.xml                                             --> ES EL MODELADO DEL �NDICE DEL SISTEMA DE AYUDA.
                        Map_file.jhm                                           --> MAPEO E IDENTIFICADOR DE TODAS LAS P�GINAS.
                        Toc.xml                                                --> MAPEO DE LA TABLA DE CONTENIDOS.
                       
                            - /help/html                                       --> EL CONTENIDO DE LA AYUDA.
                                main.html
                                principal.html
                                secundaria.html
                                Tema01.html
                                Tema02.html

                            - /help/JavaHelpSearch
                                DOCS                                           --> ELEMENTOS QUE SE CREAN DE FORMA AUTOM�TICA.
                                DOCS.TAB
                                OFFSETS
                                POSITIONS
                                SCHEMA
                                TMAP
                    
                    - /src
                        - /chuidiang
                            - /ejemplos
                                    PruebaJavaHelp.java                        --> FICHERO JAVA
                       
        -----------------------------------------------------------------------------------------------------------------------
                       
            Map_file.jhm:
                    ESTE ARCHIVO SE ENCARGA DE MAPEAR CADA UNO DE LOS HTML DE AYUDA CREADOS INDICANDO:
                            - SU RUTA.
                            - SU IDENTIFICADOR.
                       
            Toc.xml:
                    ESTE ARCHIVO RECOGE LA TABLA DE CONTENIDOS Y SU �NDICE.
                    LA ESTRUCTURA SE BASA EN 'tocitems'
                    PARA INDICAR CADA UNO DE LOS ELEMENTOS EN LOS QUE SE ORGANIZA LA TABLA.
                       
            Indice.xml:
                    ES UN FICHERO QUE RECOGE LA TABLA DEL �NDICE.
                    LA ESTRUCTURA SE BASA EN 'indexitems'
                    PARA INDICAR CADA UNO DE LOS ELEMENTOS EN LOS QUE SE ORGANIZA EL �NDICE.
                       
            Help_set.hs:
                    ESTE FICHERO DE CONFIGURACI�N CONTIENE A LOS ANTERIORES.
                    EN �L SE DESCRIBEN LAS SECCIONES RELATIVAS A LAS VISTAS.
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
                                         INCORPORACI�N DE LA AYUDA JAVAHELP EN ECLIPSE.
                       
            - SE DEBEN DE INSTALAR LOS PAQUETES DE JavaHelp EN EL ENTORNO DE DESARROLLO.
                    - import java.net.*;   PERMITE REPRESENTAR URL, UNA RUTA DEL FICHERO.
                    - import javax.help.*; PERMITE UTILIZAR LOS FICHEROS QUE HEMOS CREADO DESDE UNA APLICACI�N JAVA.
                                           INCLUYE LAS CLASES:
                       
                      - CLASE HelpSet:                        POSIBILITA USAR LOS FICHEROS DEL SISTEMA DE AYUDA.
                                    PRINCIPALES M�TODOS:
                       
                                    -  findHelpSet:           DEVUELVE LA URL DEL FICHERO 'Help_set.hs'.
                                    -  createHelpBroker:      CREA UN OBJETO 'HelpBroker' ASOCIADO AL 'HelpSet'.
                       
                      - CLASE HelpBroker:                     PERMITE VISUALIZAR EL CONTENIDO DE LA AYUDA DESDE LA APLICACI�N.
                                    PRINCIPALES M�TODOS:
                       
                                    - enableHelpKey:          PERMITE HABILITAR LA TECLA DE AYUDA.
                                    - enableHelpOnButton:     PRODUCE QUE SE DESPLIEGUE LA AYUDA AL PULSAR UN ELEMENTO.
                                    - enableHelp:             HACE REFERENCIA AL TEMA O TOPIC QUE SE DEBE VISUALIZAR 
                                                              AL PULSAR UNA TECLA DE AYUDA SOBRE UN COMPONENTE DETERMINADO.
               
            /**
            * Hace que el item del menu y la pulsacion de F1 visualicen la ayuda.
            */
            private void ponLaAyuda() {
                try {
                    // Carga el fichero de ayuda
                    File fichero = new File(?../help/help_set.hs?);
                    URL hsURL = fichero.toURI().toURL();
                    // Crea el HelpSet y el HelpBroker
                    HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);

                    HelpBroker hb = helpset.createHelpBroker();
                    // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
                    // principal y secundaria.
                    hb.enableHelpOnButton(itemAyuda, ?aplicacion?, helpset);
                    hb.enableHelpKey(principal.getContentPane(), ?ventana_principal?, helpset);
                    hb.enableHelpKey(secundaria.getContentPane(), ?ventana_secundaria?, helpset);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
                         
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
                case "11" -> {
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
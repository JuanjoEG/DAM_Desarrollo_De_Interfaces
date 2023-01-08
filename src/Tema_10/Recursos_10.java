package Tema_10;

import static Principal_Main.Main.*;
import static Tema_10.T_10.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_10 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_10 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                         INTRODUCCIÓN Y CONTEXTUALIZACIÓN PRÁCTICA.
                       
            DOCUMENTACIÓN DE APLICACIONES SOFTWARE:
                    TODOS AQUELLOS ELEMENTOS QUE DETALLAN LAS CARACTERISTICAS DE UNA APLICACIÓN,
                    Y QUE PUEDEN SER NECESARIOS PARA SU USO, MANTENIMIENTO O MODIFICACIÓN.
                       
            SE TRATA DE FICHEROS DE AYUDA, MANUALES, GUÍAS DE USO Y/O MONTENIMIENTO, 
            DIRIGIDAS PARA LOS USUARIOS, EQUIPOS DE SOPORTE O PARA OTROS DISEÑADORES.
                       
            PARA UN SISTEMA SOFTWARE, ES ESPECIALMENTE IMPORTANTE CONTAR CON UNA DOCUMENTACIÓN COMPLETA 
            Y QUE A LA VEZSEA SENCILLA DE CONSULTAR.
            SE CONSIGUE MEJORAR LA COMPRENSIÓN DE USO DE UNA APLICACIÓN POR PARTE DEL USUARIO, INDEPENDIENTEMENTE DE SU PERFIL.
            SE TRATA DE UNA TAREA TAN IMPORTANTE COMO LA QUE PUEDE REALIZAR EL PROPIO CÓDIGO DEL PROGRAMA.
                                       
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
                ES UN ELEMENTO QUE CONTIENE CUALQUIER TIPO DE INFORMACIÓN
                Y QUE PUEDE ESTAR RECOGIDA EN MÚLTIPLES TIPOS DE FORMATOS,
                TANTO EN SOPORTE FÍSICO COMO EN DIGITAL. NOS CENTRAREMOS EN EL FORMATO DIGITAL.
                       
            UN FICHERO DE AYUDA:
                ES UN DOCUMENTO QUE CONTIENE TODA LA INFORMACIÓN QUE PUEDE SERVIR DE AYUDA 
                O DE MANUAL PARA LOS USUARIOS DE LA HERRAMIENTA SOBRE LA QUE SE HA DESARROLLADO.
                       
            LOS FICHEROS DE AYUDA SE COMPONENDE DOS PARTES:
                       
                    - MAPA DE FICHERO:
                            CONSTITUYE UN MAPA DE NAVEGACIÓN DEL SISTEMA DE AYUDA,
                            ASOCIANDO IDENTIFICADORES PARA CADA UNO DE LOS TEMAS CONTENIDOS A LAS URL
                            DONDE SE ENCUENTRA EL CONTENIDO RELATIVO AL TEMA SELECCIONADO.
                       
                    - VISTA DE INFORMACIÓN:
                            ES LA PARTE QUE SE MUESTRA AL USUARIO, HABITUALMENTE EN FORMA DE ÍNDICE,
                            GLOSARIO, TABLA DE CONTENIDOS E INCLUSO BUSCADOR DE TEMAS.
                       
            - FORMATOS:
                       
                    - HLP:                       
                            ACTUALMENTE EN DESUSO, SUSTITUIDO POR CHM.
                            SE TRATA DE FICHEROS UTILIZADOS PARA LA GENERACIÓN DE AYUDA DE WINDOWS.
                                    - PUEDE INCLUIR TABLA DE CONTENIDO EN  .cnt
                                    - INCLUYE INFORMACIÓN EXTRA EN   .gid
                                    - UTILIZA FICHEROS RTF PARA GENERAR LA AYUDA
                                    - NECESITA COMPILACIÓN (POR EJEMPLO, MEDIANTE HTML Help Workshop)
                       
                    - CHM: (AYUDA HTML COMPILADO)
                            ESTE NUEVO FORMATO INCLUÍA CIERTAS MEJORAS SOBRE HLP, QUEDÓ INCLUIDO A PARTIR DE WINDOWS VISTA.
                            DESDE WINDOWS 7 SOLO APARECE EN ALGUNAS APLICACIONES.
                                    - GENERADO A PARTIR DE HLP.
                                    - UTILIZA HTML PARA GENERAR LA AYUDA.
                                    - ENLACES MEDIANTE HIPERVÍNCULOS A LAS TABLAS DE CONTENIDO.
                                    - PERMITE FUSIONAR VARIOS FICHEROS DE AYUDA.
                                    - PUEDE SER CREADO A PARTIR DE HTML Help Workshop.
                       
                    - HPJ:
                            LOS FICHEROS HPJ, AL IGUAL QUE LOS ANTERIORES, UTILIZAN FICHEROS DE TIPO .cnt
                            PARA LA REPRESENTACIÓNDE LA TABLA DE CONTENIDOS,
                            MIENTRAS QUE UTILIZAN FICHEROS DE TIPO .shg PARA LA REPRESENTACIÓN DE GRÁFICOS.
                            SON CREADOS UTILIZANDO HERRAMIENTAS DEL TIPO   Help Workshop
                       
                    - IPF: (INFORMATION PRESENTATION FACILITY)
                            SE TRATA DE FICHEROS QUE UTILIZAN IPF, UN LENGUAJE MUY SIMILAR A HTML.
                            SON UTILIZADOS SOBRE TODO PARA AYUDA EN LÍNEA E HIPERTEXTO.
                       
                    - JAVAHELP:
                            TIPO DE FORMATO DE FICHERO DE AYUDA QUE SERÁ TRATADO EN EL DESARROLLO DE ESTE TEMA.
                            RECIBEN ESTE NOMBRE TANTO EL FORMATO DE FICHEROS DE AYUDA EN LÍNEA
                            COMO EL SISTEMA QUE SE ENCARGA DE SU GENERACIÓN.
                            ESTÁN IMPLEMENTADOS EN JAVA.
                            SE UTILIZAN PARA LA GENERACIÓN DE AYUDA DE APLICACIONES DESARROLLADAS EN JAVA.
                       
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
                                            HERRAMIENTAS DE GENERACIÓN DE AYUDA.
                       
            - HELP WORKSHOP:
                    ESTA HERRAMIENTA PERMITE LA CREACIÓN DE FICHEROS DE AYUDA PARA WINDOWS.
                    ESTÁ FORMADA POR:
                            - UN EDITOR DE IMÁGENES.
                            - EL ADMINISTRADOR DE PROYECTOS.
                            - EL COMPILADOR.
                                    ES CLAVE PARA EL DESARROLLO DE MANUALES Y AYUDA.
                                    PERMITE REDUCIR EL TAMAÑO FINAL PARA SU POSTERIOR DISTRIBUCIÓN.
                    SE DESCARGA EL INSTALADOR EN:
                            https://microsoft-html-help-workshop.softonic.com/
                       
            - HELP MAKER:
                    ESTA HERRAMIENTA ES GRATUITA Y PERMITE LA CREACIÓN DE FICHEROS DE AYUDA A TRAVÉS DE UN EDITOR DE ARCHIVOS.
                    INCLUYE DIFERENTES OPCIONES DE PERSONALIZACIÓN QUE PERMITEN DAR FORMATO AL TEXTO.
                    POSIBILITA DOCUMENTOS MÁS ORGANIZADOS Y FÁCILES DE LEER.
                    TODA LA INFORMACIÓN QUEDA CONTENIDA EN UN ÚNICO FICHERO,
                    Y ES POSIBLE EXPORTAR TODA LA AYUDA EN UN SOLO DOCUMENTO PDF.
                       
            - SHALOM HELP MAKER:
                    ESTA HERRAMIENTA ES GRATUITA Y PERMITE LA CREACIÓN DE FICHEROS DE AYUDA PARA APLICACIONES.
                    PERMITE LA CREACIÓN DE FICHEROS DE AYUDA A TRAVÉS DE UN EDITOR DE TEXTO QUE RESULTA SENCILLO DE UTILIZAR.
                    ADEMÁS DE LAS CARACTERÍSTICAS PROPIAS DEL EDITOR DE TEXTO,
                            - PERMITE LA CREACIÓN DE ÍNDICES.
                            - CONTENIDOS ENLAZADOS A OTRAS PÁGINAS.
                            - LINKS EXTERNOS.
                            - CREACIÓN DE IMÁGENES QUE ENRIQUECEN EL CONTENIDO FINAL.
    
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
            SE ENCUENTRA ESQUEMATIZADA EN VARIOS NIVELES DE ELEMENTOS ENTRE LOS QUE SE DISTINGUEN TÍTULOS Y SUBTÍTULOS.
            AUNQUE EL DISEÑO DEPENDERÁ DEL DESARROLLADOR Y DE OTROS MUCHOS FACTORES,
            LAS CARACTERÍSTICAS TÍPICAS SON:
                       
                    - PUEDEN MOSTRAR EL NÚMERO DE PÁGINA O NO, EN FUNCIÓN DEL DISEÑO.
                       
                    - CASI SIEMPRE INCLUYE UN ENLACE DIRECTO EN CADA UNO DE LOS TÍTULOS O SUBTÍTULOS,
                      POR LO QUE APARECE COMPUESTA, YA QUE APUNTA AL CONTENIDO DE CADA UNO DE ESOS TÍTULOS.
                       
                    - SE SITÚAN AL INICIO DE CUALQUIER DOCUMENTO, COMO DE UN ÍNDICE DE LIBRO SE TRATARA.
                       
                    - SU ELABORACIÓN NO ES TRIVIAL, 
                      REQUIERE DE UN PROCESO DE ANÁLISIS COMPLETO DE LA DOCUMENTACIÓN QUE SE VA A EXPONER,
                      ASÍ COMO DE LOS TÍTULOS Y SUBTÍTULOS QUE A CONTINUACIÓN RECOGEN.
                       
                    - NO DEBE DUPLICARSE LA INFORMACIÓN.
                       
                    - LOS TÍTULOS DEBEN SER LO SUFICIENTEMENTE CLAROS
                      PARA QUE UN USUARIO NO NECESITE DE OTRO DOCUMENTO
                      PARA ENTENDER CÓMO FUNCIONA EL MANUAL DE AYUDA.
                       
            LAS PAUTAS DE DISEÑO DE UNA BUENA TABLA DE CONTENIDOS SON:
                       
                    - 1. SELECCIÓN DE LOS TEMAS Y SUBTEMAS QUE APARECERÁN EN LA TABLA.
                    - 2. NUMERACIÓN DE LOS TEMAS Y SUBTEMAS EN FUNCIÓN DEL PATRÓN DE NUMERACIÓN ESCOGIDO.
                    - 3. CREACIÓN DE LA TABLA DE CONTENIDO AÑADIENDO LOS ENLACES OPORTUNOS.
                    - 4. CONSTANTE REVISIÓN DE LA TABLA PARA ACTUALIZAR Y MODIFICAR LA INFORMACIÓN.
                         
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
                                                  TIPOS DE DOCUMENTACIÓN.
                       
            - DOCUMENTACIÓN DE PRUEBAS:
                    LA FINALIDAD DE DOCUMENTAR LAS PRUEBAS REALIZADAS SOBRE UN PROGRAMA
                    ES FUNDAMENTAL PARA DETECTAR Y CORREGIR POSIBLES ERRORES.
                    LAS DIVIDEREMOS EN DOS TIPOS:
                            - DOCUMENTACIÓN DE ENTRADA:
                                    EN LA QUE SE ESPECIFICAN LOS ESCENARIOS DE PRUEBA
                                    Y SE DETALLAN LOS PROCEDIMIENTOS DE LAS PRUEBAS.
                            - DOCUMENTACIÓN DE SALIDA:
                                    SE TRATA DE INFORMES DE LOS RESULTADOS DE APLICAR PRUEBAS,
                                    DEFINIDAS EN LA DOCUMENTACIÓN DE ENTRADA.
                       
            - DOCUMENTACIÓN TECNICA:
                    PERTENECE A ESTE GRUPO --> GUÍAS, HOJAS DE ESPECIFICACIONES, MANUALES, ETC...
                    LAS DIVIDEREMOS EN DOS TIPOS:
                            - DOCUMENTACIÓN INTERNA:
                                    SE TRATA DE LOS COMENTARIOS INCLUIDOS POR EL DESARROLLADOR EN EL CÓDIGO,
                                    DEBEN DESCRIBIR DISTINTOS ASPECTOS SOBRE ESE CÓDIGO.
                                    ES IMPORTANTE REALIZAR UN PROGRAMA ORDENADO Y CLARO.
                                    EL CÓDIGO DE POR SÍ, DEBE SER CLARO, Y COMO AÑADIDO IMPRESCINDIBLE,
                                    LOS COMENTARIOS AYUDARÁN A ENTENDER AÚN MEJOR EL CÓDIGO.
                                    DEBE TENERSE EN CUENTA:
                                            - COMIENZO DE MÓDULOS.
                                            - VARIABLES, CONSTANTES, PROCEDIMIENTOS Y FUNCIONES.
                                            - COMENTARIOS INTRODUCTORIOS SOBRE BLOQUES DE CÓDIGO, FUNCIONES O MÓDULOS.
                                            - NO COMENTAR LO OBVIO, EVITAR EL EXESO DE COMENTARIOS.
                            - DOCUMENTACIÓN EXTERNA:
                                    SE TRATA DE UN MANUAL TÉCNICO ORIENTADO A PROGRAMADORES
                                    PARA FACILITAR EL MANTENIMIENTO Y DESARROLLO DE LA APLICACIÓN EN UN FUTURO.
                         
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
                       
            - MANUAL O GUÍA DE USUARIO:
                    CONTIENE LA INFORMACIÓN NECESARIA PARA FACILITAR AL USUARIO LA COMPRENSIÓN Y UTILIZACIÓN DEL PROGRAMA.
                    DEBE SER UN DOCUMENTO AMIGABLE Y CLARO PARA EL USUARIO.
                    ES ACONSEJABLE EL USO DE IMÁGENES Y GRÁFICOS, TEXTOS CLAROS Y CONCISOS, EJEMPLOS ILUSTRATIVOS, ETC...
                    SE DESARROLLA EN DIFERENTES ÁMBITOS:
                            - FORMACIÓN DEL USUARIO.
                            - GUÍA DE CONSULTA ANTE DUDAS.
                            - AYUDA PARA DETECTAR Y CORREGIR ERRORES.
                            - ETC...
                       
            - GUÍA RÁPIDA Y GUÍA DE REFERENCIA:
                    LA APLICACIÓN PUEDE COMPLEMENTARSE CON ESTAS GUÍAS:
                    - GUÍA RÁPIDA:
                            PUEDE ORIENTARSE A USUARIOS Y/O ENCARGADOS DE MANTENIMIENTO.
                            UNA MISMA APLICACIÓN PUEDE TENER VARIAS GUÍAS RÁPIDAS EN FUNCIÓN DE LA COMPLEJIDAD.
                            PROPORCIONA INFORMACIÓN MUY CONCRETA SOBRE
                            DIVERSOS PROCEDIMIENTOS QUE PUEDE REALIZAR UNA APLICACIÓN.
                            EN APLICACIONES MUY SENCILLAS PUEDE CONSTITUIR POR SÍ MISMA UN MANUAL.
                       
            - GUÍA DE REFERENCIA:
                    SUELEN DESARROLLARSE PARA USUARIOS CON CIERTO CONOCIMIENTO Y EXPERIENCIA EN EL USO DE LA APLICACIÓN.
                    SUELEN CONTENER INFORMACIÓN ASOCIADA A ASPECTOS MÁS TECNICOS:
                            - RELACIÓN DE MENSAJES DE ERROR Y SU POSIBLE ORIGEN.
                            - TIPOS DE DATOS DE ENTRADA PERMITIDOS EN LA APLICACIÓN.
                            - COMANDOS ACEPTADOS.
                            - ETC...
                       
            - MANUAL Y GUÍA DE EXPLOTACIÓN:
                    CONTIENEN LA INFORMACIÓN NECESARIA PARA PONER EN USO LA APLICACIÓN.
                    ESTÁN ORIENTADOS A LA INSTALACIÓN, CONFIGURACIÓN Y PUESTA EN MARCHA DE LA APLICACIÓN.
                    SEGÚN LA COMPLEJIDAD DEL DOCUMENTO TENEMOS LA OPCIÓN DE DIVIDIRLO EN:
                            - MANUAL DE INSTALACIÓN.
                            - MANUAL DE CONFIGURACIÓN.
                    ESTÁ LIGADO AL CONTECTO DONDE SE REALIZA LA INSTALACIÓN:
                            - TIPO DE ORGANIZACIÓN.
                            - REQUERIMIENTOS.
                            - NÚMERO DE USUARIOS.
                            - ETC...
                       
            - MANUALES VISUALES: CREACIÓN.
                    - ANALIZAR LAS NECESIDADES DEL PÚBLICO HACIA EL QUE VA DIRIGIDO.
                    - HAY QUE SER CLARO Y CONCISO.
                    - ANALIZAR OTROS CONTENIDOS SIMILARES QUE YA ESTÉN PUBLICADOS.
                    - GUIONIZAR EL VÍDEO ANTES DE SER GRABADO. NO BASTA CON DAR A GRABAR.
                         
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
                                     GENERACIÓN DE UN SISTEMA DE AYUDA CON JAVAHELP.
                       
            JavaHelp ES UNA APLICACIÓN QUE PERMITE LA CREACIÓN DE SISTEMAS DE AYUDA
            PARA SER INTEGRADAS POSTERIORMENTE EN UNA APLICACIÓN.
            ESTÁ ORIENTADA AL USO DE APLICACIONES DESARROLLADAS CON LENGUAJE DE PROGRAMACIÓN JAVA.
            LA HERRAMIENTA PERMITE LA CREACIÓN DE DOCUMENTOS DE AYUDA MUY COMPLETOS QUE INCLUYE
                    - TABLAS DE CONTENIDOS.
                    - MOTOR DE BÚSQUEDA.
                    - GLOSARIO.
                    - SECCIÓN DE FAVORITOS.
                    - ETC...
                       
            PARA CREAR UN SISTEMA DE AYUDA CON JavaHelp, SE DEBEN DE SEGUIR LOS PASOS:
                       
                    - 1. SE HA DE DAR FORMA A LA AYUDA. IMPLICA:
                            - ESPECIFICAR LA ORGANIZACIÓN.
                            - DISEÑAR LOS TEMAS QUE VAN A TOMAR LA AYUDA.
                       
                    - 2. DESCARGAR E INSTALAR JavaHelp.
                            - DIVERSOS REPOSITORIOS.
                            - DESDE LA PÁGINA DE SUN.
                       
                    - 3. CREACIÓN DE FICHEROS DE JavaHelp NECESARIOS.
                            - EN FUNCIÓN DE LA ORGANIZACIÓN DE LA AYUDA DETERMINADA.
                       
                    - 4. SE CONSTRUYE UN FICHERO JAR.
                            - QUE INCLUYA TODOS LOS FICHEROS DE AYUDA.
                            - QUE PERMITA MEJORAR SU DISTRIBUCIÓN.
                       
                    - 5. SE AÑADE LA AYUDA A LA APLICACIÓN.
                            - EN FUNCIÓN DE LA ORGANIZACIÓN DE LA AYUDA DETERMINADA.
                         
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
                                                FICHEROS DE APLICACIÓN JAVAHELP.
                       
            LA HERRAMIENTA JavaHelp REQUIERE EL USO FRECUENTE DE DIFERENTES FICHEROS DE VARIOS TIPOS
            PARA EL DISEÑO DE CADA UNA DE LAS PARTES QUE FORMAN LA AYUDA FINAL.
                       
        ************************************************************************************************************************
        *          FICHERO             *  TIPO  *                             DESCRIPCIÓN                                      *
        ************************************************************************************************************************
                       
        ************************************************************************************************************************
        *           ÍNDICE             * .xml   *   INCLUYE LA DISTRIBUCIÓN DEL SISTEMA DE AYUDA.                              *
        *                              *        *                                                                              *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *            MAP               * .jhm   *   ASOCIA ELEMENTOS DEL FICHERO HTML CON UN IDENTIFICADOR.                    *
        *                              *        *             (IMÁGENES, FICHEROS HTML, ETC...)                                *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *          HELPSET             *  .hs   *   CONTIENE LA INFORMACIÓN NECESARIA PARA                                     *
        *                              *        *   QUE EL SISTEMA DE AYUDA SE EJECUTE.                                        *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *        TEMAS O TOPICS        * .html  *   PARA CREARLOS SE PUEDE UTILIZAR CUALQUIER HERRAMIENTA PARA GENERAR HTML.   *
        *                              *        *   CONTIENE LA INFORMACIÓN DE AYUDA COMO TAL, UN HTML POR CADA TEMA.          *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *   BASE DE DATOS DE BÚSQUEDA  *        *   PARA GENERARSE SE DEBE UTILIZAR LA HERRAMIENTA --> JHINDEXER               *
        *                              *        *                                                                              *
        *------------------------------*--------*------------------------------------------------------------------------------*
        *     TABLA DE CONTENIDOS      * .xml   *   INCLUYE EL CONTENIDO DE LA AYUDA Y SU DISTRIBUCIÓN.                        *
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
                       
            EN NUESTRA APLICACIÓN JAVA TENDREMOS LAS CARPETAS:
                       
                    - /bin
                        EjemploJavaHelp.jar
                        javahelp-2.0.02.jar                                    --> LIBRERÍAS QUE VAMOS A NECESITAR.
                       
                    - /help
                        Help_set.hs                                            --> SE LLEVA A CABO LA VINCULACIÓN DE TODOS LOS FICHEROS.
                        Indice.xml                                             --> ES EL MODELADO DEL ÍNDICE DEL SISTEMA DE AYUDA.
                        Map_file.jhm                                           --> MAPEO E IDENTIFICADOR DE TODAS LAS PÁGINAS.
                        Toc.xml                                                --> MAPEO DE LA TABLA DE CONTENIDOS.
                       
                            - /help/html                                       --> EL CONTENIDO DE LA AYUDA.
                                main.html
                                principal.html
                                secundaria.html
                                Tema01.html
                                Tema02.html

                            - /help/JavaHelpSearch
                                DOCS                                           --> ELEMENTOS QUE SE CREAN DE FORMA AUTOMÁTICA.
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
                    ESTE ARCHIVO RECOGE LA TABLA DE CONTENIDOS Y SU ÍNDICE.
                    LA ESTRUCTURA SE BASA EN 'tocitems'
                    PARA INDICAR CADA UNO DE LOS ELEMENTOS EN LOS QUE SE ORGANIZA LA TABLA.
                       
            Indice.xml:
                    ES UN FICHERO QUE RECOGE LA TABLA DEL ÍNDICE.
                    LA ESTRUCTURA SE BASA EN 'indexitems'
                    PARA INDICAR CADA UNO DE LOS ELEMENTOS EN LOS QUE SE ORGANIZA EL ÍNDICE.
                       
            Help_set.hs:
                    ESTE FICHERO DE CONFIGURACIÓN CONTIENE A LOS ANTERIORES.
                    EN ÉL SE DESCRIBEN LAS SECCIONES RELATIVAS A LAS VISTAS.
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
                                         INCORPORACIÓN DE LA AYUDA JAVAHELP EN ECLIPSE.
                       
            - SE DEBEN DE INSTALAR LOS PAQUETES DE JavaHelp EN EL ENTORNO DE DESARROLLO.
                    - import java.net.*;   PERMITE REPRESENTAR URL, UNA RUTA DEL FICHERO.
                    - import javax.help.*; PERMITE UTILIZAR LOS FICHEROS QUE HEMOS CREADO DESDE UNA APLICACIÓN JAVA.
                                           INCLUYE LAS CLASES:
                       
                      - CLASE HelpSet:                        POSIBILITA USAR LOS FICHEROS DEL SISTEMA DE AYUDA.
                                    PRINCIPALES MÉTODOS:
                       
                                    -  findHelpSet:           DEVUELVE LA URL DEL FICHERO 'Help_set.hs'.
                                    -  createHelpBroker:      CREA UN OBJETO 'HelpBroker' ASOCIADO AL 'HelpSet'.
                       
                      - CLASE HelpBroker:                     PERMITE VISUALIZAR EL CONTENIDO DE LA AYUDA DESDE LA APLICACIÓN.
                                    PRINCIPALES MÉTODOS:
                       
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
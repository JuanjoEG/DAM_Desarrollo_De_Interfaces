package Tema_11;

import static Principal_Main.Main.*;
import static Tema_11.T_11.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_11 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_11 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                     
            OBJETIVOS:

                    1.- EMPAQUETAR APLICACIONES Y COMPONENTES DE MANERA ADECUADA.
                    2.- PREPARAR INSTALACIÓN Y ASISTENTE DE INSTALACIÓN ADECUADAMENTE.
                    3.- PERSONALIZAR ASISTENTE DE INSTALACIÓN.
                   
            HASTA EL MOMENTO HEMOS IMPLEMENTADO APLICACIONES Y COMPONENTES EN IDE, ENTORNOS DE DESARROLLO.
            TODA APLICACIÓN, CUANDO EL PROCESO DE DESARROLLO CONCLUYE, NECESITA SER USADA POR EL RESTO DEL MUNDO.
            SERÁ NECESARIO TENER EN CUENTA:
                    - VA A REQUERIR DE UN PROCESO DE INSTALACIÓN.
                      QUE DEPENDERÁ DEL SISTEMA OPERATIVO DONDE SE USE O DEL TIPO DE FICHERO DE INALACIÓN QUE DISEÑEMOS.
                    - SERÁ NECESARIA UNA CORRECTA DISTRIBUCIÓN DE LA APLICACIÓN. PARA ELLO ESTÁN LOS PAQUETES DE SOFTWARE.
                      DENTRO DE LOS PAQUETES SE RECOGE TODO EL CONTENIDO REQUERIDO PARA UNA CORRECTA EJECUCIÓN DE LA APLICACIÓN.
                    - HAY QUE TENER EN CUENTA EL TIPO DE CLIENTES FINALES A LA QUE VA DESTINADA NUESTRA APLICACIÓN.
            
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
        
            LOS SISTEMAS DE GESTIÓN DE PAQUETES DE SOFTWARE PERMITEN AUTOMATIZAR LOS PROCESOS
            RELATIVOS A:
                    - LA INSTALACIÓN.
                    - CONFIGURACIÓN.
                    - BORRADO.
                DE LOS PAQUETES SOFTWARE EN UN DETERMINADO SISTEMA.
                         
            EN LOS PAQUETES SE INCLUYEN TODOS LOS COMPONENTES DE DISEÑO DE UNA APLICACIÓN SOFTWARE.
            CONTENDRÁ TODA LA INFORMACIÓN NECESARIA PARA LA EJECUCIÓN DE UNA APLICACIÓN.
            NO SOLO CONTIENEN CÓDIGO QUE MODELA EL PROGRAMA, SINO QUE ESTÁ FORMADO POR TODO LO NECESARIO PARA
            DESPLEGAR Y QUE ESTA FUNCIONE.
                         
            LOS COMPONENTES PRINCIPALES SON:
                    - LOS FICHEROS EJECUTABLES DE LA APLICACIÓN.
                    - LAS CARPETAS DE ELEMENTOS MULTIMEDIA USADOS EN EL CÓDIGO DE LA APLICACIÓN.
                    - LAS BIBLIOTECAS Y LIBRERÍAS NECESARIAS.
                         
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
        
            EN LINUX EXISTEN VARIOS FORMATOS QUE PERMITEN EMPAQUETAR Y DISTRIBUIR APLICACIONES.
            ALGUNOS TIPOS DE PAQUETES REQUIEREN DE OPERACIONES A TRAVÉS DE LÍNEA DE COMANDOS PARA SU CREACIÓN.
                         
                ALGUNOS FORMATOS SON:
                         
                    - TAR:  PAQUETES SIN CONPRESIÓN.
                         
                    - TGZ:  ESPECÍFICO DE UNIX. SON PAQUETES TAR CON COMPRESIÓN A TRAVÉS DE GUNZIP, Gzip.
                         
                    - RPM:  FORMATO QUE GENERA LA HERRAMIENTA Red Hat PACKAGE MANAGE.
                            SON PAQUETES PARA LAS DISTRIBUCIONES LINUX BASADAS EN Red Hat:
                                    - Red Hat Enterprise Linux.
                                    - Fedora Linux open source.
                                    - CentOS.
                                    - Rocky Linux.
                                    - CloudLinux.
                                    - AlmaLinux.
                                    - Oracle Linux.
                                    - Asianux.
                                    - AsteriskNOW.
                                    - Elastix.
                                    ... ... ... ...
                         
                    - DEB:  FORMATO QUE PUEDE SER INSTALADO DIRECTAMENTE, NO NECESITAN UNA EXTRACCIÓN PREVIA.
                            SON PAQUETES PARA LAS DISTRIBUCIONES LINUX BASADAS EN Debian:
                                    - Ubuntu.
                                    - Kubunt.
                                    - Linux Mint.
                                    - Deepin.
                                    - SteamOS.
                                    - MX Linux.
                                    - PureOS.
                                    - Kali Linux.
                                    - Devuan.
                                    - Knoppix.
                                    - Raspbian.
                                    - AntiX.
                                    - Parrot OS.
                                    - AV Linux.
                                    ... ... ... ...
                         
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
        
            FORMATO DEB:
                         
                EL EMPAQUETADO CON FORMATO DEB ES UNO DE LOS MÁS UTILIZADOS EN LINUX.
                PASOS A SEGUIR:

                        1.- NECESITAMOS DISPONER DEL PROGRAMA QUE PERMITE LA CREACIÓN DE PAQUETES.
                            INSTALACIÓN DE Checkinstall:

                            sudo apt-get install checkinstall

                        2.- DESDE LA CARPETA CON TODOS LOS FICHEROS DEL PROYECTO EJECUTAMOS:

                            ./configure
                            make
                            checkinstall

                        3.- SE ABRIRÁ UN ASISTENTE PARA DEFINIR CIERTOS PARÁMETROS.
                            TRAS COMPLETAR LA CONFIGURACIÓN YA TENEMOS EL    paquete.deb            
                         
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
                         
            FORMATO TAR:

                SINTAXIS DE LOS COMANDOS:

                        tar [OPCIONES] [ORIGEN] [DESTINO]

                LAS OPCIONES SIGNIFICAN:

                        c   CREAR ARCHIVO.
                        x   EXTRAER ARCHIVO.
                        t   LISTAR LOS CONTENIDOS DE UN ARCHIVO.
                        v   VER UN REPORTE DE LAS ACCIONES A MEDIDA QUE SE VAN REALIZANDO.
                        f   EMPAQUETAR CONTENIDOS DE ARCHIVOS.
                        z   PARA COMPRIMIR A LA VEZ QUE SE EMPAQUETA.

                PARA CREAR EL PAQUETE TAR:                      --->                    tar -cvf archivo.tar

                PARA EXTRAER EL CONTENIDO:                      --->                    tar -xvf archivo.tar

            FORMATO TGZ O TAR.GZ:

                PRIMERO CREAREMOS EL PAQUETE TAR.

                DESPUÉS COMPRIMIMOS EL TAR:                     --->                    gzip archivo.tar

                EN UN SOLO PASO HACIENDO
                QUE TAR LLAME INTERNAMENTE A GunZIP, Gzip.      --->                    tar -czvf archivo.tar.gz RUTA_COMPRIMIR

                PARA EXTRAER EL CONTENIDO:                      --->                    tar -xzvf archivo.tar.gz RUTA_COMPRIMIR

            ESTE MISMO PROCESO PODEMOS REALIZARLO PARA ARCHIVOS: 
                        .tar
                        .tar.gz
                        .tgz
                                                                                        tar -czf archivo.tar RUTA_COMPRIMIR
                                                                                        tar -xzf archivo.tgz
                         
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
        
            EN WINDOWS PODEMOS ENCONTRAR VARIAS OPCIONES DE EMPAQUETADO DEL SOFTWARE:
                         
                    - EXE:
                            - PERMITEN LA INSTALACIÓN DE RUTAS PERSONALIZADAS.
                            - INCORPORAR SERVICIOS DE IDIOMAS.
                            - RECIBIR AYUDA DURANTE LA INSTALACIÓN.
                            - SELECCIÓN DE COMPONENTES A INSTALAR.
                         
                    - MSI:    -->  MICROFOFT SILENT INSTALLER.
                            - INSTALACIÓN DESATENDIDA.
                            - INTERFAZ GRÁFIZA BÁSICA QUE INSTALA O DESISTALA EL PROGRAMA SIN EXTRAS NI OPCIONES.
                            - CONJUNTO DE ARCHIVOS COMPRIMIDOS QUE CONTIENEN LOS DATOS DEL PROGRAMA.
                            - CONFIGURAR MEDIANTE ASISTENTE LOS PARÁMETROS DE LA INSTALACIÓN.
                            - POSIBILIDAD DE SOBREESCRIBIR LOS ARCHIVOS Y DETECTAR SI FALTA ALGÚN COMPONENTE.
                         
                    - MSIX:
                            - ES UNA VERSIÓN DE MSI MÁS MODERNA CON UNA MEJOR EXPERIENCIA DE USO.
                            - MÁS INFO: https://learn.microsoft.com/es-es/windows/msix/overview
                            
                    - APPX:
                            - SE UTILIZA PARA EMPAQUETAR APLICACIONES UNIVERSALES DE WINDOWS.
                            - SIMPLES, DIRECTOS Y CON POCAS OPCIONES.
                         
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
        
            LAS APLICACIONES JAVA A TRAVÉS DE LOS IDE PERMITEN LA CREACIÓN DE FICHEROS   --->   .jar
                         
            ANTES DE CREAR UN PAQUETE ES IMPRESCINDIBLE CREAR ANTES EL FICHERO .jar.
                         
            PARA GENERAR UN .jar EN ECLIPSE:
                         
                    1.- EL PROYECTO TIENE QUE MANTENER UNA EXTRUCTURA TIPO DE CARPETAS Y ARCHIVOS.
                         
                    2.- BOTÓN DERECHO SOBRE EL PROYECTO  -->  EXPORT...
                         
                    3.- SELECCIONAMOS  -->  JAVA / JAR FILE  --> NEXT.
                         
                    4.- SELECCIONAMOS TODO LO QUE DEPENDE DEL PROYECTO DESPLEGANDO LAS CARPETAS Y VIENDO LOS FICHEROS.
                        
                        JAR FILE  -->  BROWSE...  -->  SAVE AS: --> LE DAMOS UN NOMBRE A NUESTRO .jar
                                                         WHERE: --> SELECCIONAMOS LA RUTA DONDE ALOJAR EL FICHERO RESULTANTE.
                        SAVE   -->  FINISH
                         
                    5.- EN LA VENTANA 'JAR Manifest Specification' EN EL 'Main Class' INDICAMOS EL ARCHIVO DE ENTRADA AL PROGRAMA.
                         
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
        
            REALIZAN TODO EL PROCESO NECESARIO PARA DESPLEGAR UNA APLICACIÓN.
            REALIZAN SOBRE LOS ARCHIVOS LAS OPERACIONES NECESARIAS PARA LA INSTALACIÓN.
                         
            EJEMPLOS DE INSTALADORES:
                    - InstallBuilder.
                    - Windows Installer.
                    - MSI Studio.
                         
            ALGORITMO COMÚN A LOS INSTALADORES:
                    1.- COMPRUEBAN SOFTWARE Y HARDWARE DEL EQUIPO.
                    2.- COMPRUEBAN AUTENTICIDAD DEL SOFTWARE.
                    3.- CONSTRUYEN EL ESQUEMA DE DIRECTORIOS NECESARIOS PARA EL DESPLIEGUE.
                    4.- SE AÑADEN LOS FICHEROS DEL PAQUETE DE INSTALACIÓN.
                    5.- SE COMPILAN LAS LIBRERÍAS NECESARIAS.
                    6.- SE DEFINEN LAS VARIABLES DE ENTORNO.
                         
            WINDOWS:
                         
                    EXE:
                            - BINARIO EJECUTABLE.
                            - PERMITE AL USUARIO SELECCIONAR LAS RUTAS DE INSTALACIÓN.
                            - PERMITE ESCOGER LOS COMPONENTES A INSTALAR.
                         
                    MSI:
                            - NO PERMITE ESCOGER OPCIONES DE CONFIGURACIÓN.
                            - REALIZA LA INSTALACIÓN DE FORMA PREDETERMINADA.
                         
            LINUX:
                    - INSTALACIÓN MEDIANTE COMANDOS QUE PERMITE INSTALAR, DESINTALAR Y ACTUALIZAR.
                    - PAQUETES .deb O .rpm
                         
                    * INSTALAR UN PAQUETE DEB:                  -->         dpkg -i paquete.deb
                         
                    * DESINSTALAR UN PAQUETE:                   -->         sudo apt-get remove paquete.extensión
                         
                    * ELIMINAR TODOS LOS ARCHIVOS
                      DESCARGADOS CON LA APLICACIÓN INSTALADA:  -->         sudo apt-get clean paquete.extensión
                         
                    * ELIMINAR LOS ARCHIVOS DE CONFIGURACIÓN
                      DEL PAQUETE INSTALADO:                    -->         sudo apt-get purge paquete.extensión
                         
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
                         
            LA DISTRIBUCIÓN DE APLICACIONES PUEDE REALIZARSE DESDE UN SERVIDOR WEB.
            PARA REALIZAR ESTE TIPO DE INSTALACIÓN, UNA DE LAS HERRAMIENTAS ES   --->   AptUrl
              
            PARA HABILITAR UN HIPERVÍNCULO DE DESCARGA DESDE UNA PÁGINA WEB:     --->   <a href=?apt:nombrePaquete?> Texto enlace </a>
                         
            SEGÚN EL TIPO DE INSTALADOR DESCARGADO, LA INSTALACIÓN SE REALIZA DIFERENTE:
                         
                    - EXE:  EL INSTALADOR PERMITE EJECUTAR EL PROPIO FICHERO.
                         
                    - ISO:  SERÁ NECESARIO USAR UN DISPOSITIVO EXTERNO PARA MONTAR LA IMAGEN ISO Y DESPUÉS INSTALAR EL SOFTWARE.
                         
                    - DEB:  SERÁ NECESARIO DISPONER DE UN GESTOR DE PAQUETES COMO   -->  dpkg
                         
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
        
            EXISTEN MULTITUD DE APLICACIONES PARA CREAR ESTE TIPO DE FICHEROS, USAREMOS   ---> Launch4j
                         
                        https://launch4j.sourceforge.net/
            
            Launch4j ES MULTIPLATAFORMA Y PERMITE EMPAQUETAR APLICACIONES COMPATIBLES PARA WINDOWS, LINUX Y MACOS.
                         
                1.- CREAR UNA CARPETA NUEVA PARA ALMACENAR EL RESULTADO DE NOMBRE  -->  OutPut
                2.- TENER ACCESO A LA CARPETA DE LOS FICHEROS DEL PROYECTO. .jar, LIBRERÍAS, ICONO, IMAGEN DE INICIO, ETC...
                3.- ABRIMOS Launch4j:
                        - INDICAMOS LA RUTA DE LA CARPETA OutPut.
                        - INDICAMOS EL NOMBRE QUE TENDRÁ EL FICHERO       -->   .exe
                4.- EN EL CAMPO JAR:  -->  SELECCIONAMOS NUESTRO FICHERO  -->   .jar
                5.- EN EL CAMPO ICON: -->  SELECCIONAMOS NUESTRO FICHERO  -->   .ico
                6.- DESDE LA PESTAÑA 'HEADER' SELECCIONAMOS 'GUI' PARA USAR LA INTERFAZ GRÁFICA DEL USUARIO.
                    LA OPCIÓN 'CONSOLE' SERÍA PARA USAR LA LÍNEA DE COMANDOS PARA LA EJECUCIÓN DE LA APLICACIÓN.
                7.- DESDE LA PESTAÑA 'JRE' SELECCIONAMOS LA VERSIÓN DE LA APLICACIÓN.
                8.- DESDE LA PESTAÑA 'SPLASH' SELECCIONAMOS 'ENABLE SPLASH SCREEN' --> HABILITAR PANTALLA DE PRESENTACIÓN.
                    Y SELECCIONAMOS NUESTRO FICHERO DE IMAGEN QUE SE MOSTRARÁ CUANDO COMIENCE LA EJECUCIÓN.
                9.- SELECCIONAMOS EL BOTÓN 'CONSTRUCCIÓN DE LA APLICACIÓN'.                         
                         
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
        
            PAUTAS QUE SE DEBEN TENER EN CUENTA EN EL DISEÑO DE LOS ASISTENTES DE INSTALACIÓN:
                         
                1.- SI LA APLICACIÓN SE HA DESARROLLADO PARA VARIOS IDIOMAS, SE MUESTRA UN MENÚ PARA LA ELECCIÓN DEL IDIOMA DESEADO.
                2.- EL ASISTENTE MOSTRARÁ LA LICENCIA DE USO DE LA APLICACIÓN.
                3.- SE MODELA UN MENÚ PARA QUE EL USUARIO SELECCIONES TODAS O ALGUNAS HERRAMIENTAS CONTENIDAS EN EL PAQUETE.
                4.- SE SELECCIONA LA RUTA DE INSTALACIÓN, POR DEFECTO O SELECCIONADA POR EL USUARIO.
                5.- AL INICIAR EL PROCESO DE INSTALACIÓN PUEDE ESTAR ACOMPAÑADO POR UN INDICADOR DEL PORCENTAJE INSTALADO.
                6.- NOTIFICAR AL USUARIO AL CONCLUIR EL PROCESO. ES POSIBLE QUE SOLICITE EL REINICIO DEL SISTEMA OPERATIVO.
                    EL USUARIO DECIDE SI REINICIA AHORA O MÁS TARDE.
                    DEL MISMO MODO, TAMBIÉN DECIDE SI INICIAR LA EJECUCIÓN TRAS LA FINALIZACIÓN DEL PROCESO.
                         
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
        
            https://firmaelectronica.gob.es/Home/Ciudadanos/Firma-Electronica.html
                         
            FIRMA ELECTRÓNICA:
                - CONJUNTO DE DATOS QUE ACOMPAÑAN A UN DOCUMENTO ELECTÓNICO.
                - PERMITE IDENTIFICAR EL FIRMANTE DE FORMA INEQUÍVOCA.
                - ASEGURA LA INTEGRIDAD DEL DOCUMENTO FIRMADO.
                         
            HERRAMIENTAS:
                - AutoFirma  PARA LA FIRMA DE FICHEROS PDF.
                - Ksi Secure PARA LA FIRMA DE CUALQUIER TIPO DE ARCHIVO.
                         
            FIRMA DIGITAL SOBRE LOS FICHEROS .jar:
                - PERMITE VERIFICAR LA AUTENTICIDAD DEL SOFTWARE DESCARGADO.
                - AL VERIFICAR LA AUTENTICIDAD DEL SOFTWARE SE LE PERMITIRÁ ACCEDER A CIERTOS RECURSOS DEL SISTEMA.
                  EN EL CASO DEL MÓVIL, SE PODRÁN OPTAR POR ACCEDER A LA CÁMARA, LOS CONTACTOS, ETC...
                         
            ALGUNAS CARACTERÍSTICAS DE LA FIRMA DIGITAL SON:
                         
                - TODA FIRMA DIGITAL QUEDA CONSTITUIDA POR UNA:
                        - CLAVE PRIVADA: ES CONOCIDA SOLO POR EL USUARIO DE LA FIRMA, Y SE USA PARA FIRMAR UN FICHERO.
                        - CLAVE PÚBLICA: SE NECESITA PARA CORROBORAR EN EL DESTINO QUE ESTA FIRMA ES AUTÉNTICA.
                         
                - PARA VERIFICAR QUE LAS FIRMAS CORRESPONDEN REALMENTE CON QUIEN DICE SER,
                  SE ENVÍA DE FORMA ADICIONAL UN CERTIFICADO EN EL QUE EL USUARIO AFIRMA SER EL DUEÑO DE LA CLAVE PÚBLICA.
                  ESTE TIPO DE CERTIFICADO SON EMITIDOS POR UNA ENTIDAD DE CONFIANZA.
                  POR EJEMPLO: EL CERTIFICADO DIGITAL DE LA FÁBRICA DE MONEDA Y TIMBRE.
                        https://www.sede.fnmt.gob.es/certificados/persona-fisica
                         
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
        
            PARA REALIZAR LA FIRMA DE FICHEROS .jar USAREMOS LA HERRAMIENTA   --->   JarSigner
                         
                TENEMOS QUE TENER EN CUENTA:
                         
                    - KEYSTORE:  ALMACÉN DE CLAVES QUE PUEDE CONTENER MUCHAS FIRMAS.
                    - CLAVE:     O ALIAS, IDENTIFICA EN EL KEYSTORE UNA FIRMA.
                    - .SF:       FICHERO DE FIRMA.
                    - .DSA:      FICHERO DEL BLOQUE DE FIRMAS.
                         
                *************************************************************************************************************
                *   OPCIONES JARSIGNET   *                               DESCRIPCIÓN                                        *
                *************************************************************************************************************
                *        KEYSTORE        *   INDICA EL FICHERO KEYSTORE QUE SE VA A UTILIZAR EN CADA CASO, SI NO SE         *
                *    <NOMBRE_ALMACEN>    *   INDICA, UTILIZA EL ALMACÉN POR DEFECTO. LA CONTRASEÑA DEL KEYSTORE ES          *
                *                        *   SOLICITADA A CONTINUACIÓN EN UNA NUEVA LÍNEA POR COMANDO.                      *
                *************************************************************************************************************
                *    STOREPASS PASSWORD  *   EN ESTE CASO, PERMITE AÑADIR LA CONTRASEÑA DEL KEYSTORE EN LA MISMA            *
                *                        *   LÍNEA DE COMANDOS EN LA QUE SE AÑADE EL RESTO DE LA INSTRUCCIÓN.               *
                *************************************************************************************************************
                *   KEYPASS PASSWWWORD   *   PERMITE AÑADIR LA CONTRASEÑA DEL ALIAS EN LA MISMA LÍNEA DE                    *
                *                        *   COMANDOS EN LA QUE SE AÑADE EL RESTO DE LA INSTRUCCIÓN.                        *
                *************************************************************************************************************
                *      SIGFILE FILE      *   PERMITE ESPECIFICAR EL NOMBRE DE LOS FICHEROS .DSA Y .SF,                      *
                *                        *   DE LO CONTRARIO, SE CREA UTILIZANDO EL ALIAS.                                  *
                *************************************************************************************************************
                *     SIGNEDJAR FILE     *   PERMITE ESPECIFICAR EL NOMBRE DEL FICHERO .jar FIRMADO. SI NO SE INDICA, SE    *
                *                        *   UTILIZA EL MISMO NOMBRE QUE EL JAR SIN FIRMAR, QUEDANDO SOBRESCRITO.           *
                *************************************************************************************************************
                         
            EL PROCESO DE FIRMA UTILIZA EL COMANDO:
                         
                        arsigner <opciones> jar-file alias
                         
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
        
                        https://jrsoftware.org/isdl.php
                         
            TRAS LA CREACIÓN DEL INSTALADOR .EXE:
                         
                1.- INCLUIMOS .EXE LO INCLUIMOS EN LA MISMA CARPETA DONDE ESTÁN TODOS LOS ARCHIVOS DE NUESTRO PROYECTO.
                2.- EJECUTAMOS Inno Setup Compiler Y SELECCIONAMOS FILE --> NEWWW --> NEXT.
                    COLOCAMOS NOMBRE, VERSIÓN, ETC...
                3.- SELECCIONAMOS 'PROGRAM FILES FOLDER' --> NEXT.
                4.- SELECCIONAMOS LA RUTA DEL .EXE
                    ADD FOLDER --> LA RUTA DE LA CARPETA.  --> NEST.
                5.- PERMITE DEFINIR LA INCLUSIÓN DE IMÁGENES E ICONOS.
                6.- SELECCIONA LICENCIA E IDIOMA.
                7.- COMPILER SETTING --> RUTA EN QUE SE ALMACENARÁ EL EJECUTABLE.
                    ICONO DEL ASISTENTE. NEXT --> FINISH.
                    ¿COMPILAR? --> RESPONDEMOS NO.
                         
            TRAS LA CREACIÓN DEL FICHERO, AL EJECUTARLO SE INICIA EL ASISTENTE DE INSTALACIÓN DE LA APLICACIÓN.
                         
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
                case "15" -> {
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
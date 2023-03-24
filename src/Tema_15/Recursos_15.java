package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_15 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_15 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            A LO LARGO DE ESTE MÓDULO,
            VAMOS A ANALIZAR AMPLIAMENTE EL DISEÑO DE INTERFACES PARA APLICACIONES.
                         
            EN LOS TEMAS ANTERIORES,
            NOS HEMOS CENTRADO EN EL DESARROLLO DE INTERFACES PARA APLICACIONES MÓVILES,
            COMENZADO POR EL CASO DEL SISTEMA OPERATIVO Android.
                         
            PERO SIN DUDA,
            EN LA ACTUALIDAD,
            UNO DE LOS SISTEMAS OPERATIVOS Y DISPOSITIVOS MÁS IMPORTANTES
            HACIA LOS QUE PODEMOS DIRIGIR NUESTRO DESARROLLO PROFESIONAL SON LOS RELATIVOS A Apple,
            EN CONCRETO, HABLAMOS DEL SISTEMA OPERATIVO iOS.
                         
            EN ESTE TEMA,
            VAMOS A SENTAR LAS BASES DE ESTE TIPO DE DESARROLLOS,
            ANALIZANDO EL ENTORNO DE DESARROLLO Xcode
            Y EL LENGUAJE DE PROGRAMACIÓN PROPIO DE Apple, Swift,
            QUE, AUNQUE YA LO CONOZCAMOS DE OTROS MÓDULOS,
            INCIDIREMOS EN ASPECTOS CLAVE PARA EL DESARROLLO DE INTERFACES.
                         
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
        
            EN ESTE ÚLTIMO CAPÍTULO,
            NOS VAMOS A INICIAR EL DESARROLLO PARA iOS,
            EL SISTEMA OPERATIVO DE LOS DISPOSITIVOS MÓVILES DE Apple.
                
            SE LLEVARÁ A CABO UNA REVISIÓN DE LOS ASPECTOS CLAVE
            RELATIVOS A LA CONSTRUCCIÓN DEL ENTORNO NECESARIO DE DESARROLLO,
            SE CREARÁ UNA PRIMERA APLICACIÓN, Y, FINALMENTE,
            ANALIZAREMOS ALGUNAS PAUTAS PARA EL DISEÑO DE LA INTERFAZ DE USUARIO PARA LAS APLICACIONES iOS.
                         
            EN PRIMER LUGAR,
            DESDE EL SIGUIENTE ENLACE
                         
                    https://developer.apple.com/
                         
            SE ACCEDE A LA WEB DE DESARROLLO DE Apple EN LA QUE SE ENCUENTRA TODA LA INFORMACIÓN OFICIAL NECESARIA.
                         
            LA HERRAMIENTA ESENCIAL QUE SE NECESITA PARA DESARROLLAR EN ESTE SISTEMA OPERATIVO ES Xcode,
            EL ENTORNO DE DESARROLLO INTEGRADO (IDE) QUE NOS PROPORCIONA Apple.
                         
            DESDE ESTE IDE ES POSIBLE:
                        
                    - DISEÑAR LA INTERFAZ GRÁFICA.
                    - IMPLEMENTAR LA APLICACIÓN.
                    - PROBARLA DE FORMA ADECUADA.
                    - PUBLICARLA EN LA APP STORE.
                         
            GRACIAS A SUS CARACTERÍSTICAS, RESULTA UN ENTORNO DE DESARROLLO EXCELENTE,
            PUESTO QUE DESDE UNA ÚNICA HERRAMIENTA SERÁ POSIBLE ABORDAR TODO EL CICLO DE VIDA DE UNA APLICACIÓN.
                         
            ADEMÁS DE Xcode,
            TAMBIÉN SERÁ NECESARIO CONOCER EL LENGUAJE DE PROGRAMACIÓN
            UTILIZADO PARA EL DESARROLLO DE LAS APLICACIONES EN iOS, Swift.
                         
            POR LO TANTO,
            EN PRIMER LUGAR, NOS DISPONDREMOS A REALIZA LA DESCARGA DE Xcode DESDE LA APP Store.
            ES IMPRESCINDIBLE TENER UN EQUIPO CON macOS X
            PARA PODER REALIZAR EL DESARROLLO DE UNA APLICACIÓN PARA iOS.
                         
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
        
            TRAS REALIZAR LA INSTALACIÓN DE Xcode EN NUESTRO EQUIPO,
            INICIAMOS LA APLICACIÓN Y,
            EN LA PANTALLA DE INICIO, NOS APARECEN VARIAS OPCIONES:
                    - ABRIR UN PROYECTO ANTERIOR.
                    - CREAR UN playground.
                            PERMITE EL DESARROLLADOR IMPLEMENTAR CIERTOS BLOQUES DE CÓDIGO
                            QUE NO SON APLICACIONES COMO TAL.
                    - CREAR UN NUEVO PROYECTO EN XCODE.
                            ES DECIR, CREAR UNA APLICACIÓN.
                    - DESCARGAR UN PROYECTO ALMACENADO EN UN REPOSITORIO. 
                         
            PARA CREAR UN NUEVO PROYECTO DESDE CERO, SELECCIONAMOS 'Create a new Xcode project'. 
                         
            A CONTINUACIÓN,
            LA HERRAMIENTA PERMITE CONFIGURAR VARIOS ASPECTOS DEL DESARROLLO
                    - COMO EL SISTEMA OPERATIVO QUE SE VA A UTILIZAR (iOS, watchOS, tvOS, macOS).
                    - O LA PLANTILLA DE DISEÑO PARA LA APLICACIÓN.
                         
            COMO SE PUEDE DEDUCIR,
            XCODE PERMITE EL DESARROLLO DE APLICACIONES PARA TODOS LOS SISTEMAS OPERATIVOS DE Apple,
            PARA CADA UNO DE LOS DISPOSITIVOS DE LA MARCA.
                         
            TRAS LA SELECCIÓN DEL SISTEMA OPERATIVO (EN NUESTRO CASO iOS) 
            PARA EL DESARROLLO DE APLICACIONES MÓVILES 
            Y UNA DE LAS PLANTILLAS (PLANTILLA EN BLANCO CON UNA SOLA PANTALLA), SE PULSA EL BOTÓN Next.
                         
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
        
            A CONTINUACIÓN,
            APARECE LA VENTANA DE CONFIGURACIÓN DEL PROYECTO EN LA QUE INDICAREMOS EL NOMBRE DEL MISMO.
            EN LA LISTA DE VALORES Team, ES POSIBLE SELECCIONAR UNA CUENTA DE DESARROLLADOR
            NECESARIA PARA PODER PUBLICAR EN LA App Store LAS APLICACIONES IMPLEMENTADAS.
                         
            OTRO DE LOS DATOS CLAVE QUE SE INDICAN EN LA VENTANA DE CONFIGURACIÓN ES Language,
            DONDE SE SELECCIONARÁ Swift, EL LENGUAJE MÁS MODERNO Y POTENTE PARA EL DESARROLLO EN Apple.
            Objetive-C ES EL PRIMER LENGUAJE QUE SE UTILIZÓ.
                         
            FINALMENTE, SERÁ NECESARIO DEFINIR LA INTERFAZ DE USUARIO (User Interface),
            QUE PUEDE TOMAR LOS SIGUIENTES VALORES EN FUNCIÓN DEL TIPO DE APLICACIÓN DESARROLLADA:
                         
                    - Storyboard:
                            TIPO DE INTERFAZ UTILIZADA HASTA 2019.
                         
                    - SwitfUI:
                            NUEVA LIBRERÍA QUE INCLUYE MEJORAS PARA EL DESARROLLO DE LAS INTERFACES WEB,
                            Y ES LA MÁS UTILIZADA EN LA ACTUALIDAD PARA NUEVOS DESARROLLOS.
                         
            TRAS PULSAR EL BOTÓN Next,
            SELECCIONAMOS EL DIRECTORIO EN EL QUE VA A ESTAR UBICADO EL PROYECTO Y,
            FINALMENTE, SE PULSA Create. 
                  
            POR DEFECTO, SE CREARÁ UN NUEVO 'HOLA MUNDO'.
                         
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
        
            ¿QUÉ NOS PERMITE EL ENTORNO DE DISEÑO?
            ESTE ENTORNO DE DISEÑO PERMITE LA CREACIÓN DE APLICACIONES DE FORMA SENCILLA,
            ANALIZAMOS CADA UNO DE LOS APARTADOS DE ESTA HERRAMIENTA.
                         
            EN PRIMER LUGAR,
            TENEMOS LA ZONA DE LA HERRAMIENTA QUE PERMITE EJECUTAR Y DETENER LA APLICACIÓN,
            ASÍ COMO EL NOMBRE DEL PROYECTO Y EL TIPO DE SIMULADOR ESCOGIDO PARA PROBAR LA APLICACIÓN QUE SE ESTÁ DESARROLLANDO.
                         
            EN ESTE ÚLTIMO MENÚ,
            MEDIANTE UNA LISTA DE VALORES, TAMBIÉN ES POSIBLE ESCOGER UN DISPOSITIVO FÍSICO PARA PROBAR LA APLICACIÓN.
                         
            EN LA BARRA SUPERIOR DE LA HERRAMIENTA, SE INDICA EL ESTADO ACTUAL DE LA APLICACIÓN,
            POR EJEMPLO, Running HelloWorldCode on iPhone 11,
            ES DECIR, NOS INDICA QUE SE ESTÁ EJECUTANDO EL PROYECTO DE NOMBRE HelloWorldCode EN UN SIMULADOR DE TIPO iPhone 11.
                         
            FINALMENTE, EN LA PARTE SUPERIOR, PODEMOS OBSERVAR UN MENÚ CON TRES BOTONES:                        
                         
            ESTE MENÚ ES UNO DE LOS MÁS IMPORTANTES, 
            PUESTO QUE SERÁ EL QUE NOS PERMITA SELECCIONAR NUEVOS COMPONENTES
            PARA SER COLOCADOS SOBRE LA INTERFAZ DE LA APLICACIÓN.
                         
                    BOTÓN PRIMERO:
                            EL ACCESO A LA PALETA DE COMPONENTES SE REALIZA A TRAVÉS DEL BOTÓN CON EL SÍMBOLO '+'.
                            ES EL BOTÓN DE LIBRERÍA.
                            LA VENTANA DE SELECCIÓN DE ELEMENTOS QUEDA DISTRIBUIDA EN VARIOS TIPOS:
                                        * COMPONENTES GRÁFICOS.
                                        * BLOQUES DE CÓDIGO.
                                        * IMÁGENES.
                                        * PALETA DE COLORES CONFIGURADOS PARA EL PROYECTO.
                         
                    BOTÓN SEGUNDO:
                            EL SEGUNDO BOTÓN NOS PERMITE COMPARAR EL CÓDIGO DESARROLLADO
                            CON VERSIONES PREVIAS QUE EL DESARROLLADOR HUBIESE SUBIDO A ALGÚN REPOSITORIO.
                         
                    TERCER BOTÓN:
                            FINALMENTE, EL RESTO DE OPCIONES DE ESTE MENÚ PERMITEN PERSONALIZAR LA VISTA DE LA INTERFAZ,
                            AL IGUAL QUE OCURRÍA CON ANDROID STUDIO A TRAVÉS DEL BOTÓN Split.
                         
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
        
            EN LA ZONA CENTRAL SE MUESTRA LA INTERFAZ DE LA APLICACIÓN Xcode
            QUE ESTÁ ESTRUCTURADA EN TRES GRANDES ZONAS DE ACCIÓN.
                         
                    * ZONA IZQUIERDA:
                            EN ESTA ZONA, ENCONTRAMOS UN COMPLETO CATÁLOGO DE FUNCIONALIDADES,
                            COMO SON: 
                                    - EL ACCESO A LOS REPOSITORIOS.
                                    - UN BUSCADOR.
                                    - LA ZONA EN LA QUE SE MUESTRAN ADVERTENCIAS.
                                    - ANÁLISIS DE RENDIMIENTO.
                                    - BREAKPOINTS O PUNTOS DE RUPTURA
                                    - ETC.
                            UNA DE LAS FUNCIONES MÁS IMPORTANTES DE ESTA ZONA ES Navigator,
                            ACCESIBLE A TRAVÉS DEL ICONO DE CARPETA,
                            DONDE SE MUESTRAN LOS FICHEROS Y DIRECTORIOS DE LOS QUE QUEDA COMPUESTO CADA PROYECTO.
                            SI PULSAMOS SOBRE EL ARCHIVO PRINCIPAL DE NUESTRO PROYECTO
                            (QUE APARECE EN PRIMER LUGAR),
                            SE MUESTRA LA CONFIGURACIÓN PRINCIPAL DEL PROYECTO
                            DONDE APARECEN ALGUNOS DE LOS DATOS PRINCIPALES DEL MISMO.
                         
                    * ZONA DE DESARROLLO:
                            ES LA ZONA CENTRAL DE LA INTERFAZ DE LA HERRAMIENTA Y NOS MUESTRA EL CÓDIGO DE IMPLEMENTACIÓN.
                            CUANDO SE SELECCIONA UN FICHERO DE UN PROYECTO EN DESARROLLO,
                            ESTA ZONA QUEDA SUBDIVIDIDA EN DOS PARTES:
                                    - UNA PARTE PARA EL CÓDIGO 
                                    - OTRA LLAMADA Preview.
                            EN ESTA ÚLTIMA, AL PULSAR EL BOTÓN Resume,
                            SE MUESTRA UNA PREVISUALIZACIÓN DE LA APLICACIÓN,
                            TOMANDO COMO REFERENCIA EL SIMULADOR PREVIAMENTE SELECCIONADO. 
                         
                    * ZONA DERECHA:
                            COMO OCURRE EN OTROS ENTORNOS DE DESARROLLO,
                            ESTA ZONA SOLO SE ACTIVA CUANDO ALGÚN ELEMENTO ESTÁ SELECCIONADO.
                            EN FUNCIÓN DEL ELEMENTO DEL DISEÑO ESCOGIDO, SE MUESTRA UN MENÚ U OTRO,
                            PERMITIENDO MODIFICAR LAS CARACTERÍSTICAS DE LOS ATRIBUTOS.
                            POR EJEMPLO, SI SE SELECCIONA UNA ETIQUETA DE TEXTO,
                            SERÁ POSIBLE MODIFICAR EL STRING QUE SE MUESTRA, LA FUENTE, O EL TAMAÑO.  
                         
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
            
            EN PRIMER LUGAR,
            PARA LA CREACIÓN DEL CÓDIGO DE LA APLICACIÓN, DEBEMOS ACCEDER AL FICHERO ContentView.swift.
                         
            PARA LA CREACIÓN DE UNA PRIMERA APLICACIÓN, EL CÓDIGO UTILIZADO ES EL SIGUIENTE:
                         
            SE AÑADE LA SIGUIENTE INSTRUCCIÓN QUE PERMITE IMPORTAR LA LIBRERÍA SwiftUI.
                         
                    import SwiftUI
                         
            LA FUNCIÓN ContentView DEFINE EL CONTENIDO DE LA PANTALLA.
            EN ESTE CASO, SE INCLUYE UN COMPONENTE DE TEXTO CON EL CONTENIDO 'HOLA MUNDO'.
                         
                    struct ContentView: View {
                    var body: some View {
                    
                    Text ("Hola Mundo")
                    
                    }
                    
                    } 
                         
            FINALMENTE, ES NECESARIO INTRODUCIR EL SIGUIENTE FRAGMENTO DE CÓDIGO
            PARA QUE SE GENERE LA PREVISUALIZACIÓN QUE APARECE A LA DERECHA DE LA PANTALLA EN EL IDE.
                         
                    struct ContentView_Previews: PreviewProvider {
                    static var previews: some View {
                    
                    ContentView()
                    
                    }
                    
                    }
                         
            POR ÚLTIMO,
            PARA AÑADIR ALGUNO DE LOS ELEMENTOS Y COMPONENTES DEL MENÚ LIBRERÍA,
            ACCESIBLE A TRAVÉS DEL BOTÓN '+' QUE APARECE EN EL MENÚ SUPERIOR EN LA DERECHA,
            BASTA CON SELECCIONAR UNO Y COLOCARLO EN LA POSICIÓN DESEADA EN LA INTERFAZ GRÁFICA O EN LA ZONA DE IMPLEMENTACIÓN.
                         
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
                         
            Swift ES EL LENGUAJE DE PROGRAMACIÓN DE Apple PARA CREAR APLICACIONES PARA SUS DISPOSITIVOS (iOS, watchOS, ...).
            EN ESTOS APARTADOS, VEREMOS ALGUNOS DE LOS PUNTOS CLAVES DE DESARROLLO DE ESTE LENGUAJE QUE,
            AL IGUAL QUE EN EL RESTO DE LENGUAJES, PRESENTA SU PROPIA SINTAXIS Y REGLAS.
            
            ¿QUÉ ES UNA VARIABLE?
                        UNA VARIABLE ES UN ELEMENTO UTILIZADO PARA ALMACENAR UN VALOR
                        QUE PODRÁ SER MODIFICADO A LO LARGO DE LA EJECUCIÓN,
                        ES DECIR, PODRÁ TOMAR OTROS VALORES.
                         
            PERO SE DEBE TENER PRESENTE QUE SI EN PRIMER LUGAR SE CREA UNA VARIABLE
            CON UNA CADENA DE TEXTO Y LUEGO SE MODIFICA SU VALOR A UN ENTERO,
            EL SISTEMA NOS DEVOLVERÁ UN ERROR,
            PUESTO QUE LA VARIABLE SERÁ DEL TIPO QUE SE DECLARÓ LA PRIMERA VEZ,
            Y YA NO SERÁ POSIBLE CAMBIAR EL TIPO DE DATO INTERNO.
            POR TANTO, SERÁ NECESARIO CREAR UNA NUEVA VARIABLE.

            
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
                                 
            * PARA CREAR VARIABLES SE UTILIZA LA PALABRA  -->  var 

            * A CONTINUACIÓN,SE INDICA EL NOMBRE EL NOMBRE DE LA MISMA.
                    PARA LA CONSTRUCCIÓN DEL NOMBRE,
                    CADA VEZ ES MÁS COMÚN OBSERVAR CIERTAS CONVENCIONES SOBRE CÓMO DEBEN SER DEFINIDOS LOS NOMBRES.
                    UNO DE LOS MÁS UTILIZADOS ES CamelCast.
                    ESTE INDICA QUE SE TIENE QUE DIFERENCIAR CADA UNA DE LAS PALABRAS CON UNA LETRA MAYÚSCULA,
                    EMPEZANDO SIEMPRE CON UNA LETRA MINÚSCULA.
                    POR EJEMPLO, UN NOMBRE VÁLIDO SERÍA   -->  primeraVariable

            * A CONTINUACIÓN, SE INDICA EL VALOR DE DICHA VARIABLE. 

                    var primeraVariable = "Hola Mundo"

            AHORA BIEN,
            LA CREACIÓN DE LAS INSTANCIAS EN Swift SE REALIZA A TRAVÉS DE  -->  struct
            QUE EQUIVALENTE A UNA class DE JavaScript.
            POR EJEMPLO,
            SI QUEREMOS DEFINIR UN NUEVO OBJETO QUE CONTIENE UNA CADENA DE TEXTO,
            QUEDARÍA DE LA FORMA:

                    struct nuevoDato {
                        var primeraVariable: String
                    }

            PARA LA POSTERIOR INSTANCIACIÓN DE UN OBJETO DE LA CLASE nuevoDato, SE UTILIZARÁ:

                    var nuevoDato1 = nuevoDato(primeraVariable :"Hola")

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
        
            EL USO DE COMENTARIOS EN PROGRAMACIÓN NO ES UN HECHO TRIVIAL,
            ES CLAVE PARA CONSTRUIR PROGRAMAS QUE RESULTEN MÁS FÁCILES DE MANTENER EN EL FUTURO.
                         
            /* */   ESTOS PERMITEN INSERTAR ENTRE LOS VALORES DE APERTURA Y CIERRE
                    TODAS LAS LÍNEAS DE COMENTARIOS QUE SEAN NECESARIAS.
                    ESTE TIPO DE DELIMITADORES SON ÚTILES
                    CUANDO EXISTEN VARIAS LÍNEAS DE COMENTARIOS
                    O SE QUIERE COMENTAR ALGÚN FRAGMENTO DE CÓDIGO.
                         
            //      ESTE TIPO DE DELIMITADORES SE UTILIZAN,
                    HABITUALMENTE, PARA COMENTAR UNA LÍNEA COMPLETA.
                         
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
        
            ¿QUÉ SON LOS BOTONES?
                    LOS BOTONES SON ELEMENTOS MUY IMPORTANTES EN EL DESARROLLO DE INTERFACES,
                    YA QUE PERMITEN AL USUARIO TENER UNA INTERACCIÓN DIRECTA CON LA APLICACIÓN.
                         
                    PARA AÑADIR UNO DE ESTOS ELEMENTOS,
                    BASTA CON INTRODUCIR EL SIGUIENTE FRAGMENTO DE CÓDIGO
                    O SELECCIONARLO DE LA PALETA DE COMPONENTES.
                         
                    Button(action: signIn) {
                        Text("Sign In")
                    }
                         
            ¿DE QUÉ OTRA MANERA SE PUEDE DESPLEGAR LA LIBRERÍA?
                    TAMBIÉN ES POSIBLE DESPLEGAR LA LIBRERÍA A TRAVÉS DEL BOTÓN '+'
                    Y DESDE COMPONENTES GRÁFICOS, SELECCIONAR EL ELEMENTO, EN ESTE CASO, UN Button. 
                         
                    SI PULSAMOS SOBRE ÉL Y LO ARRASTRAMOS HASTA LA ZONA DE DESARROLLO,
                    SE AÑADE EL CÓDIGO QUE APARECE DENTRO DEL CUADRO.
                         
                    EN Action SE INDICA QUÉ VA A HACER EL BOTÓN CUANDO ESTE SEA PULSADO,
                    Y EN Content, EL TEXTO QUE APARECERÁ EN EL BOTÓN.
                         
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
        
            DE NADA SIRVE QUE EL FUNCIONAMIENTO INTERNO DE UNA APLICACIÓN SEA EXTRAORDINARIO,
            SI EL DISEÑO TANTO EN ASPECTO COMO INTERACCIÓN DE LA INTERFAZ DE LA APLICACIÓN NO ES BUENO. 
                         
            EL DESARROLLO DE LAS INTERFACES PARA APLICACIONES EN iOS 
            SE CARACTERIZA POR PRESENTAR DISEÑOS LIMPIOS Y MINIMALISTAS 
            QUE INCLUYEN TODO LO NECESARIO, PERO SIN SOBRECARGAR LA INTERFAZ.
                         
            LAS CARACTERÍSTICAS DE DISEÑO QUE DIFERENCIA ESTE SISTEMA DE OTRAS PLATAFORMAS SON:
                         
                    * CLARIDAD:
                            IMPLICA QUE EL TEXTO CONTENIDO EN LA APLICACIÓN DEBE SER LEGIBLE EN TODOS LOS TAMAÑOS,
                            LOS ICONOS DEBEN SER PRECISOS, ES DECIR, NO UTILIZAN IMÁGENES RECARGADAS.
                            ADEMÁS, LA DISTRIBUCIÓN EN EL ESPACIO DE LOS COMPONENTES,
                            LA PALETA DE COLOR SELECCIONADA, LAS FUENTES Y LOS GRÁFICOS, ENTRE OTROS,
                            RESALTAN EL CONTENIDO IMPORTANTE DE LA APLICACIÓN Y APORTAR INTERACTIVIDAD AL USUARIO.
                         
                    * ADAPTACIÓN AL CONTENIDO:
                            LA NAVEGACIÓN EN LA APLICACIÓN DEBE REALIZARSE TRAVÉS DE UN MOVIMIENTO FLUIDO
                            QUE PERMITE A LOS USUARIOS COMPRENDER E INTERACTUAR CON EL SISTEMA CON MOVIMIENTOS NATURALES.
                            POR OTRO LADO, EL CONTENIDO DEBE OCUPAR TODA LA PANTALLA DEL DISPOSITIVO.
                         
                    * PROFUNDIDAD:
                            LA APLICACIÓN SE IMPLEMENTA A TRAVÉS DE VARIAS CAPAS VISUALES
                            CUYA TRANSICIÓN ENTRE CAPAS APORTA SENSACIÓN DE MOVIMIENTO SOBRE LA JERARQUÍA DE LA APLICACIÓN,
                            NAVEGANDO 'EN PROFUNDIDAD' POR EL DISEÑO.
                         
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
        
            EN CUANTO A LOS CRITERIOS DE DISEÑO ESTABLECIDOS POR Apple 
            PARA EL DISEÑO DE LAS APLICACIONES Y GARANTIZAR DE ESTA FORMA 
            EL IMPACTO DE SUS DESARROLLOS EN EL MERCADO, SON: 
                         
                    1.- INTEGRIDAD ESTÉTICA.
                         
                    2.- CONSISTENCIA.
                         
                    3.- MANIPULACIÓN DIRECTA.
                         
                    4.- RETROALIMENTACIÓN.
                         
                    5.- METÁFORAS.
                         
                    6.- CONTROL DE USUARIO.
                         
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
        
            EL NUEVO SISTEMA OPERATIVO iOS 14 
            TRAE NOVEDADES MUY IMPORTANTES RESPECTO AL DISEÑO DE INTERFACES MÓVILES.
                         
            DESDE SEPTIEMBRE DE 2020 EL DISEÑO DE LA PANTALLA DE INICIO,
            LOS MAPAS Y MENSAJES HAN SUFRIDO UN REDISEÑO. 
                         
            A PARTIR DE ESTA NUEVA VERSIÓN LA PANTALLA DE INICIO
            PUEDE PERSONALIZARSE CON UN MAYOR GRADO DE DETALLE, 
            SE PODRÁN AGRUPAR LAS APLICACIONES DE DISTINTAS PANTALLAS, O PAGINAR EN APP LIBRARY.
                         
            EN LA PARTE SUPERIOR IZQUIERDA ESTARÁ UNA AGRUPACIÓN DE SUGERENCIAS 
            Y EN LA PARTE SUPERIOR DERECHA ESTARÁN LAS DE USO MÁS RECIENTE. 
                         
            ADEMÁS, CUALQUIER APLICACIÓN PODRÁ OCUPAR MÁS ESPACIO EN LA PANTALLA
            MEDIANTE LA CREACIÓN DE WIDGETS DEL TAMAÑO DESEADO POR EL USUARIO. 
                         
            Y POR ÚLTIMO OTRA DE LAS NOVEDADES MÁS IMPORTANTES 
            Y QUE SE DEBERÁ DE TENER EN CUENTA A LA HORA DE DISEÑAR INTERFACES PARA IOS 14,
            ES QUE DESDE AHORA SE PUEDE UTILIZAR EL MODO 'Picture in picture',
            ES DECIR, LA POSIBILIDAD DE TENER ABIERTA UNA PANTALLA,
            POR EJEMPLO, REPRODUCIR UN VIDEO, MIENTRAS QUE SE ESTÁ UTILIZANDO OTRA APLICACIÓN.
                         
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
        
            ¿CÓMO SON LOS COLORES EN iOS?
                    iOS PROPORCIONA UNA GAMA DE COLORES QUE SE ADAPTAN AL DISEÑO
                    GARANTIZANDO ASPECTOS CLAVES RELATIVOS A LA ACCESIBILIDAD,
                    COMO SON EL AUMENTO DEL CONTRASTE Y LA DISMINUCIÓN DE LA TRANSPARENCIA.
                    LA ELECCIÓN DE COLOR DE iOS PERMITE QUE ESTOS ASEGUREN LA SATISFACCIÓN EN EL USUARIO,
                    TANTO CUANDO SON MOSTRADOS DE FORMA INDIVIDUAL COMO COMBINÁNDOLOS.
                         
            EL CUIDADO DISEÑO EN LAS INTERFACES DE LAS APLICACIONES DE Apple 
            QUE GARANTIZAN LA USABILIDAD DE LA MISMA SON UNA DE SUS CARACTERÍSTICAS DE IDENTIDAD.
            POR ELLO, DESDE EL SITIO OFICIAL, INDICAN LOS SIGUIENTES PILARES CLAVE PARA LA ELECCIÓN DEL COLOR:
                         
                    - USAR EL COLOR CON PRUDENCIA:
                            ES ACONSEJABLE UTILIZARLO SOLO PARA RESALTAR DETERMINADOS ELEMENTOS
                            SOBRE LOS QUE QUEREMOS LLAMAR LA ATENCIÓN DEL USUARIO.
                         
                    - UTILIZAR COLORES COMPLEMENTARIOS EN EL DISEÑO COMPLETO DE LA APLICACIÓN:
                            ES DECIR, LOS COLORES ESCOGIDOS DEBEN FUNCIONAR BIEN DE FORMA INDEPENDIENTE Y COMBINADOS.
                         
                    - SELECCIONAR UNA PALETA DE COLORES CONCRETA Y LIMITADA:
                            ADEMÁS, ES ACONSEJABLE QUE ESTA SELECCIÓN VAYA EN CONSONANCIA CON EL DISEÑO DEL LAGO DE LA APLICACIÓN.
                         
                    - ESCOGER UN COLOR CARACTERÍSTICO PARA TODA LA APLICACIÓN:
                            AUNQUE SE SELECCIONE MÁS DE UN COLOR PARA EL DISEÑO DE LA APLICACIÓN,
                            ES CONVENIENTE QUE SIEMPRE EXISTA UNO PRINCIPAL QUE IDENTIFIQUE A LA APLICACIÓN.
                            POR EJEMPLO, LA APP DEL BBVA BASA SU PALETA DE COLOR EN EL AZUL,
                            O LA APLICACIÓN GENERAL NOTES, ESCOGE EL COLOR AMARILLO COMO CENTRAL.
                         
                    - PROPORCIONAR DOS COLORES PARA GARANTIZAR QUE LA APLICACIÓN SE VEA BIEN:
                            EN EL ENTORNO OSCURO Y EL CLARO:
                            QUE SON LOS DOS MODOS DISPONIBLES EN iOS.
                         
            LOS DISPOSITIVOS IOS PERMITEN SELECCIONAR DOS TIPOS DE INTERFACES:
                         
                    - UNA OSCURA.
                    - OTRA CLARA.
                         
            POR LO TANTO, EN FUNCIÓN DE CUAL SE SELECCIONE, SERÁ CONVENIENTE ESCOGER UNOS COLORES U OTROS.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_16 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_16 + """
        **********************************************************************************************************************************
        
            Text ("Soy tu primera aplicación").padding();
            
            import SwiftUI
            
            struct ContentView: View {
                var body: some View {
                    Text("Soy tu primera aplicación")
                        .padding()
                }
            }
            
            struct ContentView_Previews: PreviewProvider {
                static var previews: some View {
                    ContentView()
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
                case "11" -> System.out.println(recurso_11);
                case "12" -> System.out.println(recurso_12);
                case "13" -> System.out.println(recurso_13);
                case "14" -> System.out.println(recurso_14);
                case "15" -> System.out.println(recurso_15);
                case "16" -> System.out.println(recurso_16);
                case "17" -> {
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
                    continuar();
                    System.out.println(recurso_16);
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
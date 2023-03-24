package Tema_15;

import static Principal_Main.Main.*;
import static Tema_15.T_15.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_15 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_15 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            A LO LARGO DE ESTE M�DULO,
            VAMOS A ANALIZAR AMPLIAMENTE EL DISE�O DE INTERFACES PARA APLICACIONES.
                         
            EN LOS TEMAS ANTERIORES,
            NOS HEMOS CENTRADO EN EL DESARROLLO DE INTERFACES PARA APLICACIONES M�VILES,
            COMENZADO POR EL CASO DEL SISTEMA OPERATIVO Android.
                         
            PERO SIN DUDA,
            EN LA ACTUALIDAD,
            UNO DE LOS SISTEMAS OPERATIVOS Y DISPOSITIVOS M�S IMPORTANTES
            HACIA LOS QUE PODEMOS DIRIGIR NUESTRO DESARROLLO PROFESIONAL SON LOS RELATIVOS A Apple,
            EN CONCRETO, HABLAMOS DEL SISTEMA OPERATIVO iOS.
                         
            EN ESTE TEMA,
            VAMOS A SENTAR LAS BASES DE ESTE TIPO DE DESARROLLOS,
            ANALIZANDO EL ENTORNO DE DESARROLLO Xcode
            Y EL LENGUAJE DE PROGRAMACI�N PROPIO DE Apple, Swift,
            QUE, AUNQUE YA LO CONOZCAMOS DE OTROS M�DULOS,
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
        
            EN ESTE �LTIMO CAP�TULO,
            NOS VAMOS A INICIAR EL DESARROLLO PARA iOS,
            EL SISTEMA OPERATIVO DE LOS DISPOSITIVOS M�VILES DE Apple.
                
            SE LLEVAR� A CABO UNA REVISI�N DE LOS ASPECTOS CLAVE
            RELATIVOS A LA CONSTRUCCI�N DEL ENTORNO NECESARIO DE DESARROLLO,
            SE CREAR� UNA PRIMERA APLICACI�N, Y, FINALMENTE,
            ANALIZAREMOS ALGUNAS PAUTAS PARA EL DISE�O DE LA INTERFAZ DE USUARIO PARA LAS APLICACIONES iOS.
                         
            EN PRIMER LUGAR,
            DESDE EL SIGUIENTE ENLACE
                         
                    https://developer.apple.com/
                         
            SE ACCEDE A LA WEB DE DESARROLLO DE Apple EN LA QUE SE ENCUENTRA TODA LA INFORMACI�N OFICIAL NECESARIA.
                         
            LA HERRAMIENTA ESENCIAL QUE SE NECESITA PARA DESARROLLAR EN ESTE SISTEMA OPERATIVO ES Xcode,
            EL ENTORNO DE DESARROLLO INTEGRADO (IDE) QUE NOS PROPORCIONA Apple.
                         
            DESDE ESTE IDE ES POSIBLE:
                        
                    - DISE�AR LA INTERFAZ GR�FICA.
                    - IMPLEMENTAR LA APLICACI�N.
                    - PROBARLA DE FORMA ADECUADA.
                    - PUBLICARLA EN LA APP STORE.
                         
            GRACIAS A SUS CARACTER�STICAS, RESULTA UN ENTORNO DE DESARROLLO EXCELENTE,
            PUESTO QUE DESDE UNA �NICA HERRAMIENTA SER� POSIBLE ABORDAR TODO EL CICLO DE VIDA DE UNA APLICACI�N.
                         
            ADEM�S DE Xcode,
            TAMBI�N SER� NECESARIO CONOCER EL LENGUAJE DE PROGRAMACI�N
            UTILIZADO PARA EL DESARROLLO DE LAS APLICACIONES EN iOS, Swift.
                         
            POR LO TANTO,
            EN PRIMER LUGAR, NOS DISPONDREMOS A REALIZA LA DESCARGA DE Xcode DESDE LA APP Store.
            ES IMPRESCINDIBLE TENER UN EQUIPO CON macOS X
            PARA PODER REALIZAR EL DESARROLLO DE UNA APLICACI�N PARA iOS.
                         
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
        
            TRAS REALIZAR LA INSTALACI�N DE Xcode EN NUESTRO EQUIPO,
            INICIAMOS LA APLICACI�N Y,
            EN LA PANTALLA DE INICIO, NOS APARECEN VARIAS OPCIONES:
                    - ABRIR UN PROYECTO ANTERIOR.
                    - CREAR UN playground.
                            PERMITE EL DESARROLLADOR IMPLEMENTAR CIERTOS BLOQUES DE C�DIGO
                            QUE NO SON APLICACIONES COMO TAL.
                    - CREAR UN NUEVO PROYECTO EN XCODE.
                            ES DECIR, CREAR UNA APLICACI�N.
                    - DESCARGAR UN PROYECTO ALMACENADO EN UN REPOSITORIO. 
                         
            PARA CREAR UN NUEVO PROYECTO DESDE CERO, SELECCIONAMOS 'Create a new Xcode project'. 
                         
            A CONTINUACI�N,
            LA HERRAMIENTA PERMITE CONFIGURAR VARIOS ASPECTOS DEL DESARROLLO
                    - COMO EL SISTEMA OPERATIVO QUE SE VA A UTILIZAR (iOS, watchOS, tvOS, macOS).
                    - O LA PLANTILLA DE DISE�O PARA LA APLICACI�N.
                         
            COMO SE PUEDE DEDUCIR,
            XCODE PERMITE EL DESARROLLO DE APLICACIONES PARA TODOS LOS SISTEMAS OPERATIVOS DE Apple,
            PARA CADA UNO DE LOS DISPOSITIVOS DE LA MARCA.
                         
            TRAS LA SELECCI�N DEL SISTEMA OPERATIVO (EN NUESTRO CASO iOS) 
            PARA EL DESARROLLO DE APLICACIONES M�VILES 
            Y UNA DE LAS PLANTILLAS (PLANTILLA EN BLANCO CON UNA SOLA PANTALLA), SE PULSA EL BOT�N Next.
                         
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
        
            A CONTINUACI�N,
            APARECE LA VENTANA DE CONFIGURACI�N DEL PROYECTO EN LA QUE INDICAREMOS EL NOMBRE DEL MISMO.
            EN LA LISTA DE VALORES Team, ES POSIBLE SELECCIONAR UNA CUENTA DE DESARROLLADOR
            NECESARIA PARA PODER PUBLICAR EN LA App Store LAS APLICACIONES IMPLEMENTADAS.
                         
            OTRO DE LOS DATOS CLAVE QUE SE INDICAN EN LA VENTANA DE CONFIGURACI�N ES Language,
            DONDE SE SELECCIONAR� Swift, EL LENGUAJE M�S MODERNO Y POTENTE PARA EL DESARROLLO EN Apple.
            Objetive-C ES EL PRIMER LENGUAJE QUE SE UTILIZ�.
                         
            FINALMENTE, SER� NECESARIO DEFINIR LA INTERFAZ DE USUARIO (User Interface),
            QUE PUEDE TOMAR LOS SIGUIENTES VALORES EN FUNCI�N DEL TIPO DE APLICACI�N DESARROLLADA:
                         
                    - Storyboard:
                            TIPO DE INTERFAZ UTILIZADA HASTA 2019.
                         
                    - SwitfUI:
                            NUEVA LIBRER�A QUE INCLUYE MEJORAS PARA EL DESARROLLO DE LAS INTERFACES WEB,
                            Y ES LA M�S UTILIZADA EN LA ACTUALIDAD PARA NUEVOS DESARROLLOS.
                         
            TRAS PULSAR EL BOT�N Next,
            SELECCIONAMOS EL DIRECTORIO EN EL QUE VA A ESTAR UBICADO EL PROYECTO Y,
            FINALMENTE, SE PULSA Create. 
                  
            POR DEFECTO, SE CREAR� UN NUEVO 'HOLA MUNDO'.
                         
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
        
            �QU� NOS PERMITE EL ENTORNO DE DISE�O?
            ESTE ENTORNO DE DISE�O PERMITE LA CREACI�N DE APLICACIONES DE FORMA SENCILLA,
            ANALIZAMOS CADA UNO DE LOS APARTADOS DE ESTA HERRAMIENTA.
                         
            EN PRIMER LUGAR,
            TENEMOS LA ZONA DE LA HERRAMIENTA QUE PERMITE EJECUTAR Y DETENER LA APLICACI�N,
            AS� COMO EL NOMBRE DEL PROYECTO Y EL TIPO DE SIMULADOR ESCOGIDO PARA PROBAR LA APLICACI�N QUE SE EST� DESARROLLANDO.
                         
            EN ESTE �LTIMO MEN�,
            MEDIANTE UNA LISTA DE VALORES, TAMBI�N ES POSIBLE ESCOGER UN DISPOSITIVO F�SICO PARA PROBAR LA APLICACI�N.
                         
            EN LA BARRA SUPERIOR DE LA HERRAMIENTA, SE INDICA EL ESTADO ACTUAL DE LA APLICACI�N,
            POR EJEMPLO, Running HelloWorldCode on iPhone 11,
            ES DECIR, NOS INDICA QUE SE EST� EJECUTANDO EL PROYECTO DE NOMBRE HelloWorldCode EN UN SIMULADOR DE TIPO iPhone 11.
                         
            FINALMENTE, EN LA PARTE SUPERIOR, PODEMOS OBSERVAR UN MEN� CON TRES BOTONES:                        
                         
            ESTE MEN� ES UNO DE LOS M�S IMPORTANTES, 
            PUESTO QUE SER� EL QUE NOS PERMITA SELECCIONAR NUEVOS COMPONENTES
            PARA SER COLOCADOS SOBRE LA INTERFAZ DE LA APLICACI�N.
                         
                    BOT�N PRIMERO:
                            EL ACCESO A LA PALETA DE COMPONENTES SE REALIZA A TRAV�S DEL BOT�N CON EL S�MBOLO '+'.
                            ES EL BOT�N DE LIBRER�A.
                            LA VENTANA DE SELECCI�N DE ELEMENTOS QUEDA DISTRIBUIDA EN VARIOS TIPOS:
                                        * COMPONENTES GR�FICOS.
                                        * BLOQUES DE C�DIGO.
                                        * IM�GENES.
                                        * PALETA DE COLORES CONFIGURADOS PARA EL PROYECTO.
                         
                    BOT�N SEGUNDO:
                            EL SEGUNDO BOT�N NOS PERMITE COMPARAR EL C�DIGO DESARROLLADO
                            CON VERSIONES PREVIAS QUE EL DESARROLLADOR HUBIESE SUBIDO A ALG�N REPOSITORIO.
                         
                    TERCER BOT�N:
                            FINALMENTE, EL RESTO DE OPCIONES DE ESTE MEN� PERMITEN PERSONALIZAR LA VISTA DE LA INTERFAZ,
                            AL IGUAL QUE OCURR�A CON ANDROID STUDIO A TRAV�S DEL BOT�N Split.
                         
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
        
            EN LA ZONA CENTRAL SE MUESTRA LA INTERFAZ DE LA APLICACI�N Xcode
            QUE EST� ESTRUCTURADA EN TRES GRANDES ZONAS DE ACCI�N.
                         
                    * ZONA IZQUIERDA:
                            EN ESTA ZONA, ENCONTRAMOS UN COMPLETO CAT�LOGO DE FUNCIONALIDADES,
                            COMO SON: 
                                    - EL ACCESO A LOS REPOSITORIOS.
                                    - UN BUSCADOR.
                                    - LA ZONA EN LA QUE SE MUESTRAN ADVERTENCIAS.
                                    - AN�LISIS DE RENDIMIENTO.
                                    - BREAKPOINTS O PUNTOS DE RUPTURA
                                    - ETC.
                            UNA DE LAS FUNCIONES M�S IMPORTANTES DE ESTA ZONA ES Navigator,
                            ACCESIBLE A TRAV�S DEL ICONO DE CARPETA,
                            DONDE SE MUESTRAN LOS FICHEROS Y DIRECTORIOS DE LOS QUE QUEDA COMPUESTO CADA PROYECTO.
                            SI PULSAMOS SOBRE EL ARCHIVO PRINCIPAL DE NUESTRO PROYECTO
                            (QUE APARECE EN PRIMER LUGAR),
                            SE MUESTRA LA CONFIGURACI�N PRINCIPAL DEL PROYECTO
                            DONDE APARECEN ALGUNOS DE LOS DATOS PRINCIPALES DEL MISMO.
                         
                    * ZONA DE DESARROLLO:
                            ES LA ZONA CENTRAL DE LA INTERFAZ DE LA HERRAMIENTA Y NOS MUESTRA EL C�DIGO DE IMPLEMENTACI�N.
                            CUANDO SE SELECCIONA UN FICHERO DE UN PROYECTO EN DESARROLLO,
                            ESTA ZONA QUEDA SUBDIVIDIDA EN DOS PARTES:
                                    - UNA PARTE PARA EL C�DIGO 
                                    - OTRA LLAMADA Preview.
                            EN ESTA �LTIMA, AL PULSAR EL BOT�N Resume,
                            SE MUESTRA UNA PREVISUALIZACI�N DE LA APLICACI�N,
                            TOMANDO COMO REFERENCIA EL SIMULADOR PREVIAMENTE SELECCIONADO. 
                         
                    * ZONA DERECHA:
                            COMO OCURRE EN OTROS ENTORNOS DE DESARROLLO,
                            ESTA ZONA SOLO SE ACTIVA CUANDO ALG�N ELEMENTO EST� SELECCIONADO.
                            EN FUNCI�N DEL ELEMENTO DEL DISE�O ESCOGIDO, SE MUESTRA UN MEN� U OTRO,
                            PERMITIENDO MODIFICAR LAS CARACTER�STICAS DE LOS ATRIBUTOS.
                            POR EJEMPLO, SI SE SELECCIONA UNA ETIQUETA DE TEXTO,
                            SER� POSIBLE MODIFICAR EL STRING QUE SE MUESTRA, LA FUENTE, O EL TAMA�O.  
                         
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
            PARA LA CREACI�N DEL C�DIGO DE LA APLICACI�N, DEBEMOS ACCEDER AL FICHERO ContentView.swift.
                         
            PARA LA CREACI�N DE UNA PRIMERA APLICACI�N, EL C�DIGO UTILIZADO ES EL SIGUIENTE:
                         
            SE A�ADE LA SIGUIENTE INSTRUCCI�N QUE PERMITE IMPORTAR LA LIBRER�A SwiftUI.
                         
                    import SwiftUI
                         
            LA FUNCI�N ContentView DEFINE EL CONTENIDO DE LA PANTALLA.
            EN ESTE CASO, SE INCLUYE UN COMPONENTE DE TEXTO CON EL CONTENIDO 'HOLA MUNDO'.
                         
                    struct ContentView: View {
                    var body: some View {
                    
                    Text ("Hola Mundo")
                    
                    }
                    
                    } 
                         
            FINALMENTE, ES NECESARIO INTRODUCIR EL SIGUIENTE FRAGMENTO DE C�DIGO
            PARA QUE SE GENERE LA PREVISUALIZACI�N QUE APARECE A LA DERECHA DE LA PANTALLA EN EL IDE.
                         
                    struct ContentView_Previews: PreviewProvider {
                    static var previews: some View {
                    
                    ContentView()
                    
                    }
                    
                    }
                         
            POR �LTIMO,
            PARA A�ADIR ALGUNO DE LOS ELEMENTOS Y COMPONENTES DEL MEN� LIBRER�A,
            ACCESIBLE A TRAV�S DEL BOT�N '+' QUE APARECE EN EL MEN� SUPERIOR EN LA DERECHA,
            BASTA CON SELECCIONAR UNO Y COLOCARLO EN LA POSICI�N DESEADA EN LA INTERFAZ GR�FICA O EN LA ZONA DE IMPLEMENTACI�N.
                         
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
                         
            Swift ES EL LENGUAJE DE PROGRAMACI�N DE Apple PARA CREAR APLICACIONES PARA SUS DISPOSITIVOS (iOS, watchOS, ...).
            EN ESTOS APARTADOS, VEREMOS ALGUNOS DE LOS PUNTOS CLAVES DE DESARROLLO DE ESTE LENGUAJE QUE,
            AL IGUAL QUE EN EL RESTO DE LENGUAJES, PRESENTA SU PROPIA SINTAXIS Y REGLAS.
            
            �QU� ES UNA VARIABLE?
                        UNA VARIABLE ES UN ELEMENTO UTILIZADO PARA ALMACENAR UN VALOR
                        QUE PODR� SER MODIFICADO A LO LARGO DE LA EJECUCI�N,
                        ES DECIR, PODR� TOMAR OTROS VALORES.
                         
            PERO SE DEBE TENER PRESENTE QUE SI EN PRIMER LUGAR SE CREA UNA VARIABLE
            CON UNA CADENA DE TEXTO Y LUEGO SE MODIFICA SU VALOR A UN ENTERO,
            EL SISTEMA NOS DEVOLVER� UN ERROR,
            PUESTO QUE LA VARIABLE SER� DEL TIPO QUE SE DECLAR� LA PRIMERA VEZ,
            Y YA NO SER� POSIBLE CAMBIAR EL TIPO DE DATO INTERNO.
            POR TANTO, SER� NECESARIO CREAR UNA NUEVA VARIABLE.

            
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

            * A CONTINUACI�N,SE INDICA EL NOMBRE EL NOMBRE DE LA MISMA.
                    PARA LA CONSTRUCCI�N DEL NOMBRE,
                    CADA VEZ ES M�S COM�N OBSERVAR CIERTAS CONVENCIONES SOBRE C�MO DEBEN SER DEFINIDOS LOS NOMBRES.
                    UNO DE LOS M�S UTILIZADOS ES CamelCast.
                    ESTE INDICA QUE SE TIENE QUE DIFERENCIAR CADA UNA DE LAS PALABRAS CON UNA LETRA MAY�SCULA,
                    EMPEZANDO SIEMPRE CON UNA LETRA MIN�SCULA.
                    POR EJEMPLO, UN NOMBRE V�LIDO SER�A   -->  primeraVariable

            * A CONTINUACI�N, SE INDICA EL VALOR DE DICHA VARIABLE. 

                    var primeraVariable = "Hola Mundo"

            AHORA BIEN,
            LA CREACI�N DE LAS INSTANCIAS EN Swift SE REALIZA A TRAV�S DE  -->  struct
            QUE EQUIVALENTE A UNA class DE JavaScript.
            POR EJEMPLO,
            SI QUEREMOS DEFINIR UN NUEVO OBJETO QUE CONTIENE UNA CADENA DE TEXTO,
            QUEDAR�A DE LA FORMA:

                    struct nuevoDato {
                        var primeraVariable: String
                    }

            PARA LA POSTERIOR INSTANCIACI�N DE UN OBJETO DE LA CLASE nuevoDato, SE UTILIZAR�:

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
        
            EL USO DE COMENTARIOS EN PROGRAMACI�N NO ES UN HECHO TRIVIAL,
            ES CLAVE PARA CONSTRUIR PROGRAMAS QUE RESULTEN M�S F�CILES DE MANTENER EN EL FUTURO.
                         
            /* */   ESTOS PERMITEN INSERTAR ENTRE LOS VALORES DE APERTURA Y CIERRE
                    TODAS LAS L�NEAS DE COMENTARIOS QUE SEAN NECESARIAS.
                    ESTE TIPO DE DELIMITADORES SON �TILES
                    CUANDO EXISTEN VARIAS L�NEAS DE COMENTARIOS
                    O SE QUIERE COMENTAR ALG�N FRAGMENTO DE C�DIGO.
                         
            //      ESTE TIPO DE DELIMITADORES SE UTILIZAN,
                    HABITUALMENTE, PARA COMENTAR UNA L�NEA COMPLETA.
                         
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
        
            �QU� SON LOS BOTONES?
                    LOS BOTONES SON ELEMENTOS MUY IMPORTANTES EN EL DESARROLLO DE INTERFACES,
                    YA QUE PERMITEN AL USUARIO TENER UNA INTERACCI�N DIRECTA CON LA APLICACI�N.
                         
                    PARA A�ADIR UNO DE ESTOS ELEMENTOS,
                    BASTA CON INTRODUCIR EL SIGUIENTE FRAGMENTO DE C�DIGO
                    O SELECCIONARLO DE LA PALETA DE COMPONENTES.
                         
                    Button(action: signIn) {
                        Text("Sign In")
                    }
                         
            �DE QU� OTRA MANERA SE PUEDE DESPLEGAR LA LIBRER�A?
                    TAMBI�N ES POSIBLE DESPLEGAR LA LIBRER�A A TRAV�S DEL BOT�N '+'
                    Y DESDE COMPONENTES GR�FICOS, SELECCIONAR EL ELEMENTO, EN ESTE CASO, UN Button. 
                         
                    SI PULSAMOS SOBRE �L Y LO ARRASTRAMOS HASTA LA ZONA DE DESARROLLO,
                    SE A�ADE EL C�DIGO QUE APARECE DENTRO DEL CUADRO.
                         
                    EN Action SE INDICA QU� VA A HACER EL BOT�N CUANDO ESTE SEA PULSADO,
                    Y EN Content, EL TEXTO QUE APARECER� EN EL BOT�N.
                         
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
        
            DE NADA SIRVE QUE EL FUNCIONAMIENTO INTERNO DE UNA APLICACI�N SEA EXTRAORDINARIO,
            SI EL DISE�O TANTO EN ASPECTO COMO INTERACCI�N DE LA INTERFAZ DE LA APLICACI�N NO ES BUENO. 
                         
            EL DESARROLLO DE LAS INTERFACES PARA APLICACIONES EN iOS 
            SE CARACTERIZA POR PRESENTAR DISE�OS LIMPIOS Y MINIMALISTAS 
            QUE INCLUYEN TODO LO NECESARIO, PERO SIN SOBRECARGAR LA INTERFAZ.
                         
            LAS CARACTER�STICAS DE DISE�O QUE DIFERENCIA ESTE SISTEMA DE OTRAS PLATAFORMAS SON:
                         
                    * CLARIDAD:
                            IMPLICA QUE EL TEXTO CONTENIDO EN LA APLICACI�N DEBE SER LEGIBLE EN TODOS LOS TAMA�OS,
                            LOS ICONOS DEBEN SER PRECISOS, ES DECIR, NO UTILIZAN IM�GENES RECARGADAS.
                            ADEM�S, LA DISTRIBUCI�N EN EL ESPACIO DE LOS COMPONENTES,
                            LA PALETA DE COLOR SELECCIONADA, LAS FUENTES Y LOS GR�FICOS, ENTRE OTROS,
                            RESALTAN EL CONTENIDO IMPORTANTE DE LA APLICACI�N Y APORTAR INTERACTIVIDAD AL USUARIO.
                         
                    * ADAPTACI�N AL CONTENIDO:
                            LA NAVEGACI�N EN LA APLICACI�N DEBE REALIZARSE TRAV�S DE UN MOVIMIENTO FLUIDO
                            QUE PERMITE A LOS USUARIOS COMPRENDER E INTERACTUAR CON EL SISTEMA CON MOVIMIENTOS NATURALES.
                            POR OTRO LADO, EL CONTENIDO DEBE OCUPAR TODA LA PANTALLA DEL DISPOSITIVO.
                         
                    * PROFUNDIDAD:
                            LA APLICACI�N SE IMPLEMENTA A TRAV�S DE VARIAS CAPAS VISUALES
                            CUYA TRANSICI�N ENTRE CAPAS APORTA SENSACI�N DE MOVIMIENTO SOBRE LA JERARQU�A DE LA APLICACI�N,
                            NAVEGANDO 'EN PROFUNDIDAD' POR EL DISE�O.
                         
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
        
            EN CUANTO A LOS CRITERIOS DE DISE�O ESTABLECIDOS POR Apple 
            PARA EL DISE�O DE LAS APLICACIONES Y GARANTIZAR DE ESTA FORMA 
            EL IMPACTO DE SUS DESARROLLOS EN EL MERCADO, SON: 
                         
                    1.- INTEGRIDAD EST�TICA.
                         
                    2.- CONSISTENCIA.
                         
                    3.- MANIPULACI�N DIRECTA.
                         
                    4.- RETROALIMENTACI�N.
                         
                    5.- MET�FORAS.
                         
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
            TRAE NOVEDADES MUY IMPORTANTES RESPECTO AL DISE�O DE INTERFACES M�VILES.
                         
            DESDE SEPTIEMBRE DE 2020 EL DISE�O DE LA PANTALLA DE INICIO,
            LOS MAPAS Y MENSAJES HAN SUFRIDO UN REDISE�O. 
                         
            A PARTIR DE ESTA NUEVA VERSI�N LA PANTALLA DE INICIO
            PUEDE PERSONALIZARSE CON UN MAYOR GRADO DE DETALLE, 
            SE PODR�N AGRUPAR LAS APLICACIONES DE DISTINTAS PANTALLAS, O PAGINAR EN APP LIBRARY.
                         
            EN LA PARTE SUPERIOR IZQUIERDA ESTAR� UNA AGRUPACI�N DE SUGERENCIAS 
            Y EN LA PARTE SUPERIOR DERECHA ESTAR�N LAS DE USO M�S RECIENTE. 
                         
            ADEM�S, CUALQUIER APLICACI�N PODR� OCUPAR M�S ESPACIO EN LA PANTALLA
            MEDIANTE LA CREACI�N DE WIDGETS DEL TAMA�O DESEADO POR EL USUARIO. 
                         
            Y POR �LTIMO OTRA DE LAS NOVEDADES M�S IMPORTANTES 
            Y QUE SE DEBER� DE TENER EN CUENTA A LA HORA DE DISE�AR INTERFACES PARA IOS 14,
            ES QUE DESDE AHORA SE PUEDE UTILIZAR EL MODO 'Picture in picture',
            ES DECIR, LA POSIBILIDAD DE TENER ABIERTA UNA PANTALLA,
            POR EJEMPLO, REPRODUCIR UN VIDEO, MIENTRAS QUE SE EST� UTILIZANDO OTRA APLICACI�N.
                         
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
        
            �C�MO SON LOS COLORES EN iOS?
                    iOS PROPORCIONA UNA GAMA DE COLORES QUE SE ADAPTAN AL DISE�O
                    GARANTIZANDO ASPECTOS CLAVES RELATIVOS A LA ACCESIBILIDAD,
                    COMO SON EL AUMENTO DEL CONTRASTE Y LA DISMINUCI�N DE LA TRANSPARENCIA.
                    LA ELECCI�N DE COLOR DE iOS PERMITE QUE ESTOS ASEGUREN LA SATISFACCI�N EN EL USUARIO,
                    TANTO CUANDO SON MOSTRADOS DE FORMA INDIVIDUAL COMO COMBIN�NDOLOS.
                         
            EL CUIDADO DISE�O EN LAS INTERFACES DE LAS APLICACIONES DE Apple 
            QUE GARANTIZAN LA USABILIDAD DE LA MISMA SON UNA DE SUS CARACTER�STICAS DE IDENTIDAD.
            POR ELLO, DESDE EL SITIO OFICIAL, INDICAN LOS SIGUIENTES PILARES CLAVE PARA LA ELECCI�N DEL COLOR:
                         
                    - USAR EL COLOR CON PRUDENCIA:
                            ES ACONSEJABLE UTILIZARLO SOLO PARA RESALTAR DETERMINADOS ELEMENTOS
                            SOBRE LOS QUE QUEREMOS LLAMAR LA ATENCI�N DEL USUARIO.
                         
                    - UTILIZAR COLORES COMPLEMENTARIOS EN EL DISE�O COMPLETO DE LA APLICACI�N:
                            ES DECIR, LOS COLORES ESCOGIDOS DEBEN FUNCIONAR BIEN DE FORMA INDEPENDIENTE Y COMBINADOS.
                         
                    - SELECCIONAR UNA PALETA DE COLORES CONCRETA Y LIMITADA:
                            ADEM�S, ES ACONSEJABLE QUE ESTA SELECCI�N VAYA EN CONSONANCIA CON EL DISE�O DEL LAGO DE LA APLICACI�N.
                         
                    - ESCOGER UN COLOR CARACTER�STICO PARA TODA LA APLICACI�N:
                            AUNQUE SE SELECCIONE M�S DE UN COLOR PARA EL DISE�O DE LA APLICACI�N,
                            ES CONVENIENTE QUE SIEMPRE EXISTA UNO PRINCIPAL QUE IDENTIFIQUE A LA APLICACI�N.
                            POR EJEMPLO, LA APP DEL BBVA BASA SU PALETA DE COLOR EN EL AZUL,
                            O LA APLICACI�N GENERAL NOTES, ESCOGE EL COLOR AMARILLO COMO CENTRAL.
                         
                    - PROPORCIONAR DOS COLORES PARA GARANTIZAR QUE LA APLICACI�N SE VEA BIEN:
                            EN EL ENTORNO OSCURO Y EL CLARO:
                            QUE SON LOS DOS MODOS DISPONIBLES EN iOS.
                         
            LOS DISPOSITIVOS IOS PERMITEN SELECCIONAR DOS TIPOS DE INTERFACES:
                         
                    - UNA OSCURA.
                    - OTRA CLARA.
                         
            POR LO TANTO, EN FUNCI�N DE CUAL SE SELECCIONE, SER� CONVENIENTE ESCOGER UNOS COLORES U OTROS.
                         
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
        
            Text ("Soy tu primera aplicaci�n").padding();
            
            import SwiftUI
            
            struct ContentView: View {
                var body: some View {
                    Text("Soy tu primera aplicaci�n")
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
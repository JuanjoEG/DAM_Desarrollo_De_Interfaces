package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_14 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_14 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            HASTA AHORA,
            HEMOS ANALIZADO ASPECTOS PROPIOS DEL DISE�O DE LA INTERFAZ EN CUANTO AL ASPECTO.
                         
            AL IGUAL QUE OCURRE EN EL CASO DE LAS INTERFACES DE APLICACIONES DE OTRO TIPO DE PROYECTOS,
            LA IMPLEMENTACI�N RELATIVA A LA DETECCI�N DE EVENTOS SON DETERMINANTES PARA GARANTIZAR
            EL CORRECTO FUNCIONAMIENTO DE UNA INTERFAZ Y,
            POR TANTO, LA SATISFACCI�N DE UN USUARIO SOBRE UNA APLICACI�N.
                         
            DE NADA SIRVE QUE EL FUNCIONAMIENTO INTERNO DE UNA APLICACI�N SEA EXTRAORDINARIO
            SI EL DISE�O TANTO EN ASPECTO COMO EN INTERACCI�N CON LA INTERFAZ DE LA APLICACI�N NO ES �PTIMO.
                         
            LA OCURRENCIA Y POSTERIOR TRATAMIENTO DE UN EVENTO SE BASA EN LA DETECCI�N DEL MISMO,
            HABITUALMENTE, ACONTECIDA POR LA PULSACI�N DEL USUARIO SOBRE UNO DE LOS ELEMENTOS MOSTRADOS EN LA PANTALLA DEL DISPOSITIVO.
                         
            LA IMPLEMENTACI�N PARA LA DETECCI�N DE EVENTOS SE SUSTENTA EN LOS SIGUIENTES PASOS,
            UTILIZANDO COMO EJEMPLO LA DETECCI�N DE LA PULSACI�N DE UN BOT�N COMO EVENTO:
                         
                    1.- setOnClickListener:
                         
                            EN PRIMER LUGAR, ES NECESARIO IMPLEMENTAR EL M�TODO       -->  setOnClickListener
                            QUE RECIBE POR PAR�METRO UNA NUEVA INSTANCIA DEL OBJETO   -->  ClickListener.
                            ESTE M�TODO QUEDA ASOCIADO AL ELEMENTO SOBRE EL QUE SE FOCALIZA LA ESCUCHA,
                            POR EJEMPLO, UN BOT�N.
                         
                    2.- IMPLEMENTACI�N DEL M�TODO:
                         
                            A CONTINUACI�N, SE IMPLEMENTA EL C�DIGO QUE VA A SER EJECUTADO CUANDO SE DETECTA EL EVENTO.
                            PARA ELLO, SE CREA UN NUEVO M�TODO QUE SER� LANZADO ANTE LA OCURRENCIA DEL EVENTO.
                         
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
            
            PARA IMPLEMENTAR EL C�DIGO DE EVENTOS:
                         
                    * EN PRIMER LUGAR, SE DEBE INCLUIR UN ELEMENTO DE ESCUCHA
                      VINCULADO AL M�TODO QUE VA A TRATAR LA ACCI�N REALIZADA.
                      POR EJEMPLO, SI EL EVENTO QUE SE DESEA TRATAR ES RELATIVO A HACER CLIC SOBRE UN ELEMENTO,
                      NECESITAREMOS UTILIZAR:
                            - EL ESCUCHADOR -->  OnClickListener.
                            - Y SU M�TODO   -->  onClick.
                      DE ESTA FORMA, CUANDO SE DETECTA LA PULSACI�N,
                      SE EJECUTAR� EL C�DIGO CONTENIDO EN EL M�TODO  -->  onClick().
                         
                            private OnClickListener Listener1 = new OnClickListener() {
                                public void onClick(View v) {
                                  ...
                                }
                            };
                         
                            protected void onCreate(Bundle savedValues) {
                                ...
                                Button button = (Button)findViewById(R.id.corky);
                                button.setOnClickListener(Listener1);
                                ...
                            }
                         
            EN LA SIGUIENTE TABLA,
            SE EXPONEN ALGUNOS DE LOS M�TODOS DE DETECCI�N DE EVENTOS M�S COMUNES,
            Y EL ELEMENTO ESCUCHADOR ASOCIADO:
                         
            ***************************************************************************************************************************
            *      M�TODO      *                             DESCRIPCI�N                                   *         EVENTO           *
            ***************************************************************************************************************************
            *  onClick()       *  ESTE M�TODO SE INVOCA CUANDO                                             *  onClickListener         *
            *                  *  SE PULSA SOBRE UN ELEMENTO DE LA INTERFAZ.                               *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onLongClick()   *  SE INVOCA CUANDO SE MANTIENE                                             *  onLongClickListener     *
            *                  *  PULSADO UN ELEMENTO DE LA INTERFAZ.                                      *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onFocusChange() *  SE INVOCA CUANDO EL USUARIO SE COLOCA                                    *  OnFocusChangeListener   *
            *                  *  SOBRE EL ELEMENTO DONDE EST� REALIZANDO LA ESCUCHA.                      *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onTouch()       *  ELEMENTOS 'EXTRA' QUE PERMITEN PERSONALIZAR LA INTERFAZ                  *  OnTouchListener         *
            *                  *  DE DESARROLLO (CALENDARIOS, BARRAS DE PROGRESO, ETC.).                   *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onKey()         *  ESTE M�TODO SE INVOCA CUANDO SE PULSA SOBRE UN BOT�N F�SICO Y EL FOCO    *  OnKeyListener           *
            *                  *  EST� SITUADO SOBRE UN ELEMENTO QUE IMPLEMENTA ESTE M�TODO EN SU ESCUCHA. *                          *
            ***************************************************************************************************************************
                         
            COMO SE PUEDE VER EN LA TABLA ,
            EXISTEN MULTITUD DE M�TODOS PARA EL TRATAMIENTO DE EVENTOS
            Y SON ESPEC�FICOS DE CADA CASO CONCRETO.
                         
            ASIMISMO, CADA UNO DE ESTOS M�TODOS PRESENTAR� SU PROPIO ESCUCHADOR.
                         
            https://developer.android.com/guide/topics/ui/ui-events?hl=es-419
                         
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
        
            �QU� ES NAVIGATION?
                         
                    SE TRATA DE UN COMPONENTE QUE PERMITE IMPLEMENTAR CUALQUIER TIPO DE DISE�O DE NAVEGACI�N A TRAV�S UNA APLICACI�N,
                    APORTANDO UN ALTO GRADO DE PERSONALIZACI�N AL DISE�O DE LA INTERFAZ.
                         
                    ES DECIR, ESTE COMPONENTE SE UTILIZA PARA
                    DISE�AR LA SECUENCIA DE PASOS EN LA NAVEGACI�N ENTRE PANTALLAS DE UNA MISMA APLICACI�N.
                         
                            - EL FUNCIONAMIENTO SE BASA EN INDICARLE A NavController
                              LA RUTA CONCRETA A LA QUE SE DESEA IR,
                              DE LAS RECOGIDAS EN EL GR�FICO DE NAVEGACI�N U OTRO DESTINO CONCRETO.
                         
                            - ESTE DESTINO SER� MOSTRADO EN EL CONTENEDOR LLAMADO NavHost.
                         
                    LA IMPLEMENTACI�N DE ESTE COMPONENTE EST� BASADA EN TRES ELEMENTOS:
                         
                            - GR�FICO DE NAVEGACI�N:
                                    ES EL C�DIGO XML EN EL CUAL QUEDA REFLEJADA TODA LA INFORMACI�N DE NAVEGACI�N.
                         
                            - NavHost:
                                    CONTENEDOR VAC�O UTILIZADO PARA COLOCAR LOS DESTINOS HACIA LOS QUE APUNTA EL GR�FICO DE NAVEGACI�N.
                                    ESTE ELEMENTO PERMITE QUE LOS DESTINOS VAYAN MODIFIC�NDOSE
                                    SEG�N EL USUARIO NAVEGUE A TRAV�S DE LA APLICACI�N.
                         
                            - NavController:
                                    ESTE ELEMENTO SE ENCARGA DE LA ADMINISTRACI�N DE LA NAVEGACI�N DEL NavHost.
                         
                    PARA LA IMPLEMENTACI�N DE NAVIGATION,
                    SER� NECESARIO A�ADIR EL SIGUIENTE C�DIGO DE DEPENDENCIAS EN EL FICHERO build.gradle:
                    
                            dependencies {
                            def nav_version = "2.3.0"
                            implementation ?androidx.navigation:navigation-fragment:$nav_version"
                            implementation ?androidx.navigation:navigation-ui:$nav_version"

                            implementation ?androidx.navigation:navigation-fragment-ktx:$nav_version"
                            implementation ?androidx.navigation:navigation-ui-ktx:$nav_version"

                            implementation ?androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

                            androidTestImplementation ?androidx.navigation:navigation-testing:$nav_version"
                            }
                         
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
        
            UN GR�FICO DE NAVEGACI�N:
            ES UNA REPRESENTACI�N VISUAL DEL CONJUNTO DE 'PANTALLAS'
            QUE FORMAN UNA APLICACI�N
            Y DE LAS ACCIONES ASOCIADAS A LA OCURRENCIA DE CADA UNA DE ESAS PANTALLAS,
            QUE QUEDAN REPRESENTADAS CON UNA FLECHA.
                         
            AHORA BIEN, 
            �C�MO SE A�ADE UN GR�FICO DE NAVEGACI�N?
                         
            LA CREACI�N DE UN NUEVO GR�FICO DE NAVEGACI�N SE LLEVA A CABO UBIC�NDONOS EN LA CARPETA res.
                         
            A CONTINUACI�N, SE PULSA CON EL BOT�N DERECHO SOBRE ESTA CAPETA
            Y SE SELECCIONA LA OPCI�N   --->   New   --->   Android Resource File.
                         
            FINALMENTE, SE INTRODUCE EN LA CAJA DE TEXTO File name 'nav_graph' Y PULSAMOS OK.
                         
            TRAS LA CREACI�N,
            SE ABRE POR DEFECTO EL FICHERO nav_graph.xml DE LA CARPETA values,
            
            PERO PARA PODER ACCEDER AL EDITOR QUE SE ANALIZAR� EN EL SIGUIENTE APARTADO,
            SE DEBE LOCALIZAR EL FICHERO nav_graph DE LA CARPETA Navigation Y EJECUTARLO,
                         
            ES DECIR, HACER DOBLE CLIC SOBRE �L PARA QUE SE ABRA EL GR�FICO DE NAVEGACI�N:
                         
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
        
            TRAS LA CREACI�N DEL GR�FICO DE NAVEGACI�N, SE ACCEDE AL EDITOR DE NAVIGATION.
                         
            LA INTERFAZ QUEDA DIVIDIDA EN TRES SECCIONES CLARAMENTE DIFERENCIADAS:
                         
                    - PANEL DE DESTINOS: ZONA IZQUIERDA.
                            SIMILAR A LOS EXPLORADORES DE PROYECTOS
                            EN LOS QUE APARECEN TODOS LOS FICHEROS QUE FORMAN PARTE DE UNA MISMA CARPETA.
                            EN ESTE CASO, SE MUESTRAN TODOS LOS DESTINOS ACCESIBLES.
                         
                    - GRAPH EDITOR: ZONA CENTRAL.
                            ES LA ZONA EN LA QUE SE REALIZA LA REPRESENTACI�N VISUAL,
                            BIEN EN FORMA DE C�DIGO (XML) DESDE LA PESTA�A Text,
                            O BIEN DE FORMA VISUAL DESDE LA PESTA�A Design.
                         
                    - ATRIBUTOS: ZONA DERECHA.
                            SE RECOGEN TODOS LOS ATRIBUTOS DEL ELEMENTO QUE SE EST� ANALIZANDO EN CADA MOMENTO.
                         
            EN ESTE CASO,
            TAMBI�N SER� POSIBLE PERSONALIZAR LA VISTA DE ANDROID STUDIO,
            CONMUTANDO ENTRE LAS DIFERENTES OPCIONES QUE APARECEN EN LA PARTE SUPERIOR DERECHA DE LA HERRAMIENTA. 
                         
            EN FUNCI�N DE LAS PANTALLAS QUE SE CREEN
            Y DE LAS RELACIONES ENTRE LAS MISMAS DE FORMA GR�FICA,
            SE CREAR� EL C�DIGO XML ASOCIADO.
                         
            PARA ACCEDER A ESTE C�DIGO, SE SELECCIONA LA OPCI�N Code.
                         
            LOS PRINCIPALES ELEMENTOS QUE SE OBSERVAN EN EL C�DIGO GENERADO SON:
                         
                    - navigation:
                            ES EL ELEMENTO PRINCIPAL DE UN FICHERO XML
                            BAJO EL QUE APARECEN EL RESTO DE ELEMENTOS (PANTALLAS COMO FRAGMENT Y RELACIONES COMO ACTION). 
                         
                    - fragment:
                            REPRESENTA CADA UNA DE LAS PANTALLAS COLOCADAS EN EL EDITOR.
                         
                    - action:
                            INDICA EL FLUJO DE RELACIONES QUE EXISTEN ENTRE LAS PANTALLAS.
                         
            EN EL SIGUIENTE C�DIGO, SE MUESTRA UNA PRIMERA PANTALLA Y LA RELACI�N DE ESTA CON LA SEGUNDA.
                         
                            <fragment
                                android:id="@+id/FirstFragment"         
                                android:name="com.example.myapplication.FirstFragment"
                                android:label="@string/first_fragment_label"
                                tools:layout="@layout/fragment_first">
                                <action
                                android:id="@+id/action_FirstFragment_to_SecondFragment"
                                app:destination="@id/SecondFragment" 
                            />
                            </fragment>
                         
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
        
            CUANDO SE CREA UN NUEVO GR�FICO DE NAVEGACI�N,
            ESTE APARECE CONFIGURADO POR DEFECTO COMO SE MUESTRA EN LA FIGURA DEL APARTADO ANTERIOR.
            HABITUALMENTE CON DOS ELEMENTOS DE TIPO fragment Y LA RELACI�N QUE UNE A AMBOS.
                         
            AHORA BIEN, UN DESARROLLADOR PODR� MODIFICAR ESTE ESQUEMA TODO LO NECESARIO,
            CREANDO AS� UNA INTERFAZ PROPIA DE LA APLICACI�N
            Y MEJORANDO LA EXPERIENCIA DE NAVEGACI�N DE LOS USUARIOS DE LA MISMA. 
                         
            PARA A�ADIR NUEVAS PANTALLAS, ES POSIBLE HACERLO:
                         
                    1.- A TRAV�S DEL C�DIGO XML:
                            BASTAR� CON INSERTAR EL SIGUIENTE C�DIGO
                            DONDE SE INDICA EL NOMBRE DE LA NUEVA PANTALLA.
                         
                                    <fragment
                                        android:id="@+id/ThirdFragment"
                                        android:name="com.example.myapplication.SecondFragment"    
                                    </fragment>
                         
                    2.- A TRAV�S DEL EDITOR GR�FICO:
                            UNA VEZ SELECCIONADO EL TIPO DE PANTALLA DE ENTRE LAS QUE SE MUESTRAN,
                            SE PULSA EL BOT�N CON UN RECT�NGULO Y UN S�MBOLO + DE COLOR VERDE.
                            EN ESTE SEGUNDO CASO, EL C�DIGO XML GENERADO SOLO INCLUYE UN ATRIBUTO ID.     
                         
                                    <fragment android:id="@+id/placeholder" />
                         
                    PARA A�ADIR UN NOMBRE ESPEC�FICO, BASTA CON A�ADIR EL ATRIBUTO name.
                         
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
        
            COMO SE HA VISTO ANTERIORMENTE,
            LAS PANTALLAS QUEDAN CONECTADAS MEDIANTE RELACIONES,
            ES DECIR, LA ACCI�N EFECTUADA SOBRE UNA DETERMINADA INTERFAZ
            TIENE COMO RESULTADO UNA NUEVA,
            YA SEA DE TIPO ESPEC�FICO O GENERAL (COMO EL REGRESO A LA PANTALLA DE INICIO).
                         
            POR LO TANTO,
            LAS ACCIONES REPRESENTAN LAS RUTAS QUE SE VAN A SEGUIR
            EN LA APLICACI�N PRODUCTO DE LA ACCI�N DEL USUARIO SOBRE LA MISMA.
                         
            A CONTINUACI�N, SE INDICAN VARIAS FORMAS PARA CREAR ESTAS CONEXIONES,
            AHORA BIEN, DEBEMOS RECORDAR QUE SE EST� CREANDO LA CONEXI�N,
            PERO EL C�DIGO QUE IMPLEMENTA LA ACCI�N DEL CAMBIO DE UNA PANTALLA A LA OTRA
            SE REALIZA A TRAV�S DE LOS FICHEROS .java:
                         
                    1.- LA PRIMERA OPCI�N CONSISTE EN SELECCIONAR EL PUNTO QUE APARECE EN EL BORDE DE LA PANTALLA
                        Y ARRASTRAR LA FLECHA HASTA EL DESTINO.
                        ESTA OPCI�N RESULTA ADECUADA CUANDO EL N�MERO DE PANTALLAS
                        ES RELATIVAMENTE PEQUE�O Y QUEDAN TODAS A LA VISTA.
                         
                    2.- LA SEGUNDA OPCI�N ES PULSANDO CON EL BOT�N DERECHO
                        SOBRE LA PANTALLA ORIGEN QUE VA A SER CONECTADA 
                        Y SE SELECCIONA Add Action.
                        EN EL MEN�, SE INDICA EL NOMBRE DE LA CONEXI�N 
                        Y Destination MUESTRA EN UNA LISTA DE VALORES TODOS LOS POSIBLES DESTINOS. 
                         
                    3.- CUALQUIERA DE LAS DOS OPCIONES TIENE COMO RESULTADO
                        LA CONEXI�N DE PANTALLA ThirdFragment CON SecondFragment:
                         
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
        
            EL MANEJO DE Navigation REQUIERE DE PR�CTICA, POR LO QUE SE ACONSEJA VISITAR EL SITIO OFICIAL
                    https://developer.android.com/
            DE DESARROLLO DE ANDROID PARA SEGUIR AMPLIANDO Y ACTUALIZANDO EL CONTENIDO SOBRE SUS COMPONENTES
            Y EL RESTO DE LOS UTILIZADOS POR ANDROID.
                         
            PARA CONCLUIR ESTE BLOQUE,
            VEREMOS ALGUNAS PROPIEDADES INTERESANTES QUE DOTAN DE CIERTA ANIMACI�N A LA TRANSICI�N ENTRE PANTALLAS:
                         
                    - app:enterAnim
                            ANIMACI�N ASOCIADA A LA ENTRADA EN UNA PANTALLA.
                         
                    - app:exitAnim
                            ANIMACI�N ASOCIADA A LA SALIDA DE UNA PANTALLA.
                         
                    - app:popEnterAnim
                            ANIMACI�N ASOCIADA A LA ENTRADA EN UNA PANTALLA A TRAV�S DE UNA ACCI�N EMERGENTE.
                         
                    - app:popExitAnim
                            ANIMACI�N ASOCIADA A LA SALIDA DE UNA PANTALLA A TRAV�S DE UNA ACCI�N EMERGENTE.
                         
            PARA INDICAR EL TIPO DE ANIMACI�N QUE VA A PRESENTAR CADA RELACI�N,
            SE DEBE SELECCIONAR Y, A CONTINUACI�N, EN EL MEN� ATRIBUTOS,
            ESCOGER LA ACCI�N SOBRE LA QUE SE VA A INDICAR UN NUEVO TIPO DE ANIMACI�N PARA,
            DESPU�S, PULSAR EL BOT�N QUE APARECE A LA DERECHA.
                         
            EN EL CUADRO DE DI�LOGO QUE APARECER�,
            SE DEBE SELECCIONAR EL TIPO DE ANIMACI�N QUE VA A PRESENTAR LA ACCI�N.
                         
            DESDE LA PESTA�A DE Text, SE ACTUALIZAR� AUTOM�TICAMENTE EL C�DIGO A�ADIENDO LOS NUEVOS ATRIBUTOS:
                         
                            <action
                                android:id="@+id/secondFragment"
                                app:destination="@id/SecondFragment"
                                app:enterAnim="@anim/nav_default_exit_anim" 
                            />
                         
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
        
            LAS ANIMACIONES, AL IGUAL QUE OCURRE CON EL DISE�O WEB,
            APORTAN UN ALTO GRADO DE DINAMISMO A LA FUNCIONALIDAD DE LA APLICACI�N Y,
            ADEM�S, PERMITEN INFORMAR AL USUARIO DEL ESTADO DE LA PETICI�N,
            POR EJEMPLO, PARA INDICAR QUE UNA PETICI�N SE EST� PROCESANDO
            O QUE SE EST� AUTENTICANDO A UN USUARIO EN LA APLICACI�N.
                         
            EN PRIMER LUGAR, ES NECESARIO CREAR LA ANIMACI�N, Y PARA ELLO SE UTILIZA AnimationDrawable,
            EN CONCRETO, SE IMPLEMENTA UTILIZANDO UN ELEMENTO animation-list,
            QUE PERMITE CARGAR TODOS LOS FOTOGRAMAS QUE FORMAR�N PARTE DE LA ANIMACI�N. 
                         
                            <animation-list xmlns:android="http://schemas.android.com/apk/res/android" android:oneshot="false">
                                <item android:drawable="@drawable/rocket_thrust1" android:duration="200" />
                                <item android:drawable="@drawable/rocket_thrust2" android:duration="200" />
                                <item android:drawable="@drawable/rocket_thrust3" android:duration="200" />
                            </animation-list>
                         
            EL ATRIBUTO oneshot PERMITE INDICAR SI LA ANIMACI�N SE REPRODUCE UNA SOLA VEZ (true) O DE FORMA INDEFINIDA (false). 
                         
            LOS C�DIGOS DE CREACI�N DE ANIMACIONES SE COLOCAN EN LA RUTA res/drawable/.
            PARA SER UTILIZADOS, SER�N LLAMADOS DESDE EL C�DIGO JAVA CORRESPONDIENTE.
                         
                            AnimationDrawable rocketAnimation;
                            public void onCreate(Bundle savedInstanceState) {
                                super.onCreate(savedInstanceState);
                                setContentView(R.layout.main);
                                ImageView rocketImage = (ImageView) findViewById(R.id.rocket_image);
                                rocketImage.setBackgroundResource(R.drawable.rocket_thrust);
                                rocketAnimation = (AnimationDrawable) rocketImage.getBackground();
                                rocketImage.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        rocketAnimation.start();
                                    }
                                });
                            }
                         
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
        
            PARA CREAR UNA MARCA DE SE�A DE IDENTIDAD ES IMPORTANTE TENER UN SISTEMA DE COLOR QUE LO IDENTIFIQUE.
            CON EL SISTEMA DE COLOR DE Material Design SE PUEDEN UTILIZAR PALETAS DE COLORES PARA LA CREACI�N DE TEMAS DE COLOR,
            AS� COMO HERRAMIENTAS ESPEC�FICAS PARA LA SELECCI�N DEL COLOR ADECUADO. 
                         
            EL SISTEMA DE COLOR DE Material Design PERMITE APLICAR COLOR A LA INTERFAZ DE USUARIO DE UNA MANERA MUY INTUITIVA.
            LA CLAVE DE ESTE SISTEMA CONSISTE EN SELECCIONAR UN COLOR PRIMARIO Y UNO SECUNDARIO PARA REPRESENTAR LA MARCA.
            ADEM�S, EXISTEN VARIANTES OSCURAS O CLARAS QUE SE PUEDEN APLICAR SOBRE EL COLOR SELECCIONADO. 
                         
            LOS TEMAS DE COLOR EST�N DISE�ADOS PARA PRESENTAR UN ASPECTO ARM�NICO, SIN GRANDES EXCENTRICIDADES,
            GARANTIZANDO QUE EL TEXTO SEA ACCESIBLE Y SE PUEDA DISTINGUIR ELEMENTOS Y SUPERFICIES DE LA INTERFAZ DE USUARIO ENTRE S�.
                         
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
                         
            UNO DE LOS ELEMENTOS PRESENTES HABITUALMENTE EN CUALQUIER APLICACI�N ES LA BARRA DE ACCIONES O BARRA DE APP.
            EN EL CAP�TULO ANTERIOR YA SE EXPUSO C�MO COLOCAR UN ELEMENTO DE ESTE TIPO SOBRE LA INTERFAZ,
            PERO AHORA ANALIZAREMOS EN PROFUNDIDAD SU COMPORTAMIENTO Y LA PERSONALIZACI�N POSIBLE DE LA MISMA.
                         
            LAS BARRAS DE ACCIONES TIENEN UN ESPACIO LIMITADO,
            POR LO QUE SOLO SE PODR�N COLOCAR ALGUNOS ACCESOS R�PIDOS.
                         
            LA ELECCI�N DE ESTOS RESULTAR� CLAVE PARA MEJORAR LA EXPERIENCIA DE NAVEGACI�N DEL USUARIO. 
                         
            PARA INCORPORAR NUEVOS BOTONES A ESTA BARRA,
            SE DEBE CREAR UN NUEVO ARCHIVO EN LA RUTA res/menu 
            A CONTINUACI�N, CREAR UN NUEVO ELEMENTO �TEM
            PARA CADA UNO DE LOS COMPONENTES QUE SE QUIERAN INCLUIR EN LA BARRA. 
                         
            SE DEBE PRESTAR ESPECIAL ATENCI�N AL ATRIBUTO showAsAction,
            PUESTO QUE INDICA C�MO QUEDAR�A EL ICONO DE ACCI�N REPRESENTADO:
                         
                    - ifRoom:
                            QUEDA REPRESENTADA CON UN ICONO SI HAY ESPACIO SUFICIENTE Y EN EL MEN� AMPLIADO SI NO LO HAY. 
                         
                    - never:
                            POR EL CONTRARIO, SI SE INDICA DIRECTAMENTE EL VALOR never,
                            SOLO SER� MOSTRADO EL ELEMENTO EN EL MEN� AMPLIADO (SE ACCEDE A TRAV�S DE LOS TRES PUNTOS EN VERTICAL).
                         
            EN EL SIGUIENTE C�DIGO, ES POSIBLE VER UN ELEMENTO CON CADA UNO DE LOS VALORES INDICADOS. 
                         
                            <menu xmlns:android="http://schemas.android.com/apk/res/android"
                                xmlns:app="http://schemas.android.com/apk/res-auto"
                                xmlns:tools="http://schemas.android.com/tools"
                                tools:context="com.example.myapplication.MainActivity">
                                <item
                                    android:id="@+id/action_settings"
                                    android:orderInCategory="100"
                                    android:title="@string/action_settings"
                                    app:showAsAction=?never"
                                />
                            </menu>
                         
            LOS ELEMENTOS COLOCADOS EN LA BARRA PRESENTAR�N UNA ACCI�N ASOCIADA A TRAV�S DE EVENTOS.
                         
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
                         
                        <?xml version="1.0" encoding="utf-8"?>
                        <navigation
                            xmlns:android=?http://schemas.android.com/apk/res/android"
                            xmlns:app="http://schemas.android.com/apk/res-auto"
                            xmlns:tools="http://schemas.android.com/tools"
                            android:id="@+id/nav_graph"
                            app:startDestination="@id/FirstFragment">
                            <fragment
                                android:id="@+id/FirstFragment"
                                android:name="com.example.myapplication.FirstFragment"
                                android:label="@string/first_fragment_label"
                                tools:layout="@layout/fragment_first">
                                <action
                                    android:id="@+id/action_FirstFragment_to_SecondFragment"
                                    app:destination="@id/SecondFragment" />
                            </fragment>
                            <fragment
                                android:id="@+id/SecondFragment"
                                android:name="com.example.myapplication.SecondFragment"
                                android:label="@string/second_fragment_label"
                                tools:layout="@layout/fragment_second">
                                <action
                                    ndroid:id="@+id/action_SecondFragment_to_FirstFragment"
                                    pp:destination="@id/FirstFragment" />
                            </fragment>
                        </navigation>
        
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
                case "13" -> {
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
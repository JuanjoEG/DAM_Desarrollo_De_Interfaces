package Tema_14;

import static Principal_Main.Main.*;
import static Tema_14.T_14.*;

/**
 *
 * @author Juan José Estévez González
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
            HEMOS ANALIZADO ASPECTOS PROPIOS DEL DISEÑO DE LA INTERFAZ EN CUANTO AL ASPECTO.
                         
            AL IGUAL QUE OCURRE EN EL CASO DE LAS INTERFACES DE APLICACIONES DE OTRO TIPO DE PROYECTOS,
            LA IMPLEMENTACIÓN RELATIVA A LA DETECCIÓN DE EVENTOS SON DETERMINANTES PARA GARANTIZAR
            EL CORRECTO FUNCIONAMIENTO DE UNA INTERFAZ Y,
            POR TANTO, LA SATISFACCIÓN DE UN USUARIO SOBRE UNA APLICACIÓN.
                         
            DE NADA SIRVE QUE EL FUNCIONAMIENTO INTERNO DE UNA APLICACIÓN SEA EXTRAORDINARIO
            SI EL DISEÑO TANTO EN ASPECTO COMO EN INTERACCIÓN CON LA INTERFAZ DE LA APLICACIÓN NO ES ÓPTIMO.
                         
            LA OCURRENCIA Y POSTERIOR TRATAMIENTO DE UN EVENTO SE BASA EN LA DETECCIÓN DEL MISMO,
            HABITUALMENTE, ACONTECIDA POR LA PULSACIÓN DEL USUARIO SOBRE UNO DE LOS ELEMENTOS MOSTRADOS EN LA PANTALLA DEL DISPOSITIVO.
                         
            LA IMPLEMENTACIÓN PARA LA DETECCIÓN DE EVENTOS SE SUSTENTA EN LOS SIGUIENTES PASOS,
            UTILIZANDO COMO EJEMPLO LA DETECCIÓN DE LA PULSACIÓN DE UN BOTÓN COMO EVENTO:
                         
                    1.- setOnClickListener:
                         
                            EN PRIMER LUGAR, ES NECESARIO IMPLEMENTAR EL MÉTODO       -->  setOnClickListener
                            QUE RECIBE POR PARÁMETRO UNA NUEVA INSTANCIA DEL OBJETO   -->  ClickListener.
                            ESTE MÉTODO QUEDA ASOCIADO AL ELEMENTO SOBRE EL QUE SE FOCALIZA LA ESCUCHA,
                            POR EJEMPLO, UN BOTÓN.
                         
                    2.- IMPLEMENTACIÓN DEL MÉTODO:
                         
                            A CONTINUACIÓN, SE IMPLEMENTA EL CÓDIGO QUE VA A SER EJECUTADO CUANDO SE DETECTA EL EVENTO.
                            PARA ELLO, SE CREA UN NUEVO MÉTODO QUE SERÁ LANZADO ANTE LA OCURRENCIA DEL EVENTO.
                         
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
            
            PARA IMPLEMENTAR EL CÓDIGO DE EVENTOS:
                         
                    * EN PRIMER LUGAR, SE DEBE INCLUIR UN ELEMENTO DE ESCUCHA
                      VINCULADO AL MÉTODO QUE VA A TRATAR LA ACCIÓN REALIZADA.
                      POR EJEMPLO, SI EL EVENTO QUE SE DESEA TRATAR ES RELATIVO A HACER CLIC SOBRE UN ELEMENTO,
                      NECESITAREMOS UTILIZAR:
                            - EL ESCUCHADOR -->  OnClickListener.
                            - Y SU MÉTODO   -->  onClick.
                      DE ESTA FORMA, CUANDO SE DETECTA LA PULSACIÓN,
                      SE EJECUTARÁ EL CÓDIGO CONTENIDO EN EL MÉTODO  -->  onClick().
                         
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
            SE EXPONEN ALGUNOS DE LOS MÉTODOS DE DETECCIÓN DE EVENTOS MÁS COMUNES,
            Y EL ELEMENTO ESCUCHADOR ASOCIADO:
                         
            ***************************************************************************************************************************
            *      MÉTODO      *                             DESCRIPCIÓN                                   *         EVENTO           *
            ***************************************************************************************************************************
            *  onClick()       *  ESTE MÉTODO SE INVOCA CUANDO                                             *  onClickListener         *
            *                  *  SE PULSA SOBRE UN ELEMENTO DE LA INTERFAZ.                               *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onLongClick()   *  SE INVOCA CUANDO SE MANTIENE                                             *  onLongClickListener     *
            *                  *  PULSADO UN ELEMENTO DE LA INTERFAZ.                                      *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onFocusChange() *  SE INVOCA CUANDO EL USUARIO SE COLOCA                                    *  OnFocusChangeListener   *
            *                  *  SOBRE EL ELEMENTO DONDE ESTÁ REALIZANDO LA ESCUCHA.                      *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onTouch()       *  ELEMENTOS 'EXTRA' QUE PERMITEN PERSONALIZAR LA INTERFAZ                  *  OnTouchListener         *
            *                  *  DE DESARROLLO (CALENDARIOS, BARRAS DE PROGRESO, ETC.).                   *                          *
            *------------------*---------------------------------------------------------------------------*--------------------------*
            *  onKey()         *  ESTE MÉTODO SE INVOCA CUANDO SE PULSA SOBRE UN BOTÓN FÍSICO Y EL FOCO    *  OnKeyListener           *
            *                  *  ESTÁ SITUADO SOBRE UN ELEMENTO QUE IMPLEMENTA ESTE MÉTODO EN SU ESCUCHA. *                          *
            ***************************************************************************************************************************
                         
            COMO SE PUEDE VER EN LA TABLA ,
            EXISTEN MULTITUD DE MÉTODOS PARA EL TRATAMIENTO DE EVENTOS
            Y SON ESPECÍFICOS DE CADA CASO CONCRETO.
                         
            ASIMISMO, CADA UNO DE ESTOS MÉTODOS PRESENTARÁ SU PROPIO ESCUCHADOR.
                         
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
        
            ¿QUÉ ES NAVIGATION?
                         
                    SE TRATA DE UN COMPONENTE QUE PERMITE IMPLEMENTAR CUALQUIER TIPO DE DISEÑO DE NAVEGACIÓN A TRAVÉS UNA APLICACIÓN,
                    APORTANDO UN ALTO GRADO DE PERSONALIZACIÓN AL DISEÑO DE LA INTERFAZ.
                         
                    ES DECIR, ESTE COMPONENTE SE UTILIZA PARA
                    DISEÑAR LA SECUENCIA DE PASOS EN LA NAVEGACIÓN ENTRE PANTALLAS DE UNA MISMA APLICACIÓN.
                         
                            - EL FUNCIONAMIENTO SE BASA EN INDICARLE A NavController
                              LA RUTA CONCRETA A LA QUE SE DESEA IR,
                              DE LAS RECOGIDAS EN EL GRÁFICO DE NAVEGACIÓN U OTRO DESTINO CONCRETO.
                         
                            - ESTE DESTINO SERÁ MOSTRADO EN EL CONTENEDOR LLAMADO NavHost.
                         
                    LA IMPLEMENTACIÓN DE ESTE COMPONENTE ESTÁ BASADA EN TRES ELEMENTOS:
                         
                            - GRÁFICO DE NAVEGACIÓN:
                                    ES EL CÓDIGO XML EN EL CUAL QUEDA REFLEJADA TODA LA INFORMACIÓN DE NAVEGACIÓN.
                         
                            - NavHost:
                                    CONTENEDOR VACÍO UTILIZADO PARA COLOCAR LOS DESTINOS HACIA LOS QUE APUNTA EL GRÁFICO DE NAVEGACIÓN.
                                    ESTE ELEMENTO PERMITE QUE LOS DESTINOS VAYAN MODIFICÁNDOSE
                                    SEGÚN EL USUARIO NAVEGUE A TRAVÉS DE LA APLICACIÓN.
                         
                            - NavController:
                                    ESTE ELEMENTO SE ENCARGA DE LA ADMINISTRACIÓN DE LA NAVEGACIÓN DEL NavHost.
                         
                    PARA LA IMPLEMENTACIÓN DE NAVIGATION,
                    SERÁ NECESARIO AÑADIR EL SIGUIENTE CÓDIGO DE DEPENDENCIAS EN EL FICHERO build.gradle:
                    
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
        
            UN GRÁFICO DE NAVEGACIÓN:
            ES UNA REPRESENTACIÓN VISUAL DEL CONJUNTO DE 'PANTALLAS'
            QUE FORMAN UNA APLICACIÓN
            Y DE LAS ACCIONES ASOCIADAS A LA OCURRENCIA DE CADA UNA DE ESAS PANTALLAS,
            QUE QUEDAN REPRESENTADAS CON UNA FLECHA.
                         
            AHORA BIEN, 
            ¿CÓMO SE AÑADE UN GRÁFICO DE NAVEGACIÓN?
                         
            LA CREACIÓN DE UN NUEVO GRÁFICO DE NAVEGACIÓN SE LLEVA A CABO UBICÁNDONOS EN LA CARPETA res.
                         
            A CONTINUACIÓN, SE PULSA CON EL BOTÓN DERECHO SOBRE ESTA CAPETA
            Y SE SELECCIONA LA OPCIÓN   --->   New   --->   Android Resource File.
                         
            FINALMENTE, SE INTRODUCE EN LA CAJA DE TEXTO File name 'nav_graph' Y PULSAMOS OK.
                         
            TRAS LA CREACIÓN,
            SE ABRE POR DEFECTO EL FICHERO nav_graph.xml DE LA CARPETA values,
            
            PERO PARA PODER ACCEDER AL EDITOR QUE SE ANALIZARÁ EN EL SIGUIENTE APARTADO,
            SE DEBE LOCALIZAR EL FICHERO nav_graph DE LA CARPETA Navigation Y EJECUTARLO,
                         
            ES DECIR, HACER DOBLE CLIC SOBRE ÉL PARA QUE SE ABRA EL GRÁFICO DE NAVEGACIÓN:
                         
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
        
            TRAS LA CREACIÓN DEL GRÁFICO DE NAVEGACIÓN, SE ACCEDE AL EDITOR DE NAVIGATION.
                         
            LA INTERFAZ QUEDA DIVIDIDA EN TRES SECCIONES CLARAMENTE DIFERENCIADAS:
                         
                    - PANEL DE DESTINOS: ZONA IZQUIERDA.
                            SIMILAR A LOS EXPLORADORES DE PROYECTOS
                            EN LOS QUE APARECEN TODOS LOS FICHEROS QUE FORMAN PARTE DE UNA MISMA CARPETA.
                            EN ESTE CASO, SE MUESTRAN TODOS LOS DESTINOS ACCESIBLES.
                         
                    - GRAPH EDITOR: ZONA CENTRAL.
                            ES LA ZONA EN LA QUE SE REALIZA LA REPRESENTACIÓN VISUAL,
                            BIEN EN FORMA DE CÓDIGO (XML) DESDE LA PESTAÑA Text,
                            O BIEN DE FORMA VISUAL DESDE LA PESTAÑA Design.
                         
                    - ATRIBUTOS: ZONA DERECHA.
                            SE RECOGEN TODOS LOS ATRIBUTOS DEL ELEMENTO QUE SE ESTÁ ANALIZANDO EN CADA MOMENTO.
                         
            EN ESTE CASO,
            TAMBIÉN SERÁ POSIBLE PERSONALIZAR LA VISTA DE ANDROID STUDIO,
            CONMUTANDO ENTRE LAS DIFERENTES OPCIONES QUE APARECEN EN LA PARTE SUPERIOR DERECHA DE LA HERRAMIENTA. 
                         
            EN FUNCIÓN DE LAS PANTALLAS QUE SE CREEN
            Y DE LAS RELACIONES ENTRE LAS MISMAS DE FORMA GRÁFICA,
            SE CREARÁ EL CÓDIGO XML ASOCIADO.
                         
            PARA ACCEDER A ESTE CÓDIGO, SE SELECCIONA LA OPCIÓN Code.
                         
            LOS PRINCIPALES ELEMENTOS QUE SE OBSERVAN EN EL CÓDIGO GENERADO SON:
                         
                    - navigation:
                            ES EL ELEMENTO PRINCIPAL DE UN FICHERO XML
                            BAJO EL QUE APARECEN EL RESTO DE ELEMENTOS (PANTALLAS COMO FRAGMENT Y RELACIONES COMO ACTION). 
                         
                    - fragment:
                            REPRESENTA CADA UNA DE LAS PANTALLAS COLOCADAS EN EL EDITOR.
                         
                    - action:
                            INDICA EL FLUJO DE RELACIONES QUE EXISTEN ENTRE LAS PANTALLAS.
                         
            EN EL SIGUIENTE CÓDIGO, SE MUESTRA UNA PRIMERA PANTALLA Y LA RELACIÓN DE ESTA CON LA SEGUNDA.
                         
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
        
            CUANDO SE CREA UN NUEVO GRÁFICO DE NAVEGACIÓN,
            ESTE APARECE CONFIGURADO POR DEFECTO COMO SE MUESTRA EN LA FIGURA DEL APARTADO ANTERIOR.
            HABITUALMENTE CON DOS ELEMENTOS DE TIPO fragment Y LA RELACIÓN QUE UNE A AMBOS.
                         
            AHORA BIEN, UN DESARROLLADOR PODRÁ MODIFICAR ESTE ESQUEMA TODO LO NECESARIO,
            CREANDO ASÍ UNA INTERFAZ PROPIA DE LA APLICACIÓN
            Y MEJORANDO LA EXPERIENCIA DE NAVEGACIÓN DE LOS USUARIOS DE LA MISMA. 
                         
            PARA AÑADIR NUEVAS PANTALLAS, ES POSIBLE HACERLO:
                         
                    1.- A TRAVÉS DEL CÓDIGO XML:
                            BASTARÁ CON INSERTAR EL SIGUIENTE CÓDIGO
                            DONDE SE INDICA EL NOMBRE DE LA NUEVA PANTALLA.
                         
                                    <fragment
                                        android:id="@+id/ThirdFragment"
                                        android:name="com.example.myapplication.SecondFragment"    
                                    </fragment>
                         
                    2.- A TRAVÉS DEL EDITOR GRÁFICO:
                            UNA VEZ SELECCIONADO EL TIPO DE PANTALLA DE ENTRE LAS QUE SE MUESTRAN,
                            SE PULSA EL BOTÓN CON UN RECTÁNGULO Y UN SÍMBOLO + DE COLOR VERDE.
                            EN ESTE SEGUNDO CASO, EL CÓDIGO XML GENERADO SOLO INCLUYE UN ATRIBUTO ID.     
                         
                                    <fragment android:id="@+id/placeholder" />
                         
                    PARA AÑADIR UN NOMBRE ESPECÍFICO, BASTA CON AÑADIR EL ATRIBUTO name.
                         
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
            ES DECIR, LA ACCIÓN EFECTUADA SOBRE UNA DETERMINADA INTERFAZ
            TIENE COMO RESULTADO UNA NUEVA,
            YA SEA DE TIPO ESPECÍFICO O GENERAL (COMO EL REGRESO A LA PANTALLA DE INICIO).
                         
            POR LO TANTO,
            LAS ACCIONES REPRESENTAN LAS RUTAS QUE SE VAN A SEGUIR
            EN LA APLICACIÓN PRODUCTO DE LA ACCIÓN DEL USUARIO SOBRE LA MISMA.
                         
            A CONTINUACIÓN, SE INDICAN VARIAS FORMAS PARA CREAR ESTAS CONEXIONES,
            AHORA BIEN, DEBEMOS RECORDAR QUE SE ESTÁ CREANDO LA CONEXIÓN,
            PERO EL CÓDIGO QUE IMPLEMENTA LA ACCIÓN DEL CAMBIO DE UNA PANTALLA A LA OTRA
            SE REALIZA A TRAVÉS DE LOS FICHEROS .java:
                         
                    1.- LA PRIMERA OPCIÓN CONSISTE EN SELECCIONAR EL PUNTO QUE APARECE EN EL BORDE DE LA PANTALLA
                        Y ARRASTRAR LA FLECHA HASTA EL DESTINO.
                        ESTA OPCIÓN RESULTA ADECUADA CUANDO EL NÚMERO DE PANTALLAS
                        ES RELATIVAMENTE PEQUEÑO Y QUEDAN TODAS A LA VISTA.
                         
                    2.- LA SEGUNDA OPCIÓN ES PULSANDO CON EL BOTÓN DERECHO
                        SOBRE LA PANTALLA ORIGEN QUE VA A SER CONECTADA 
                        Y SE SELECCIONA Add Action.
                        EN EL MENÚ, SE INDICA EL NOMBRE DE LA CONEXIÓN 
                        Y Destination MUESTRA EN UNA LISTA DE VALORES TODOS LOS POSIBLES DESTINOS. 
                         
                    3.- CUALQUIERA DE LAS DOS OPCIONES TIENE COMO RESULTADO
                        LA CONEXIÓN DE PANTALLA ThirdFragment CON SecondFragment:
                         
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
        
            EL MANEJO DE Navigation REQUIERE DE PRÁCTICA, POR LO QUE SE ACONSEJA VISITAR EL SITIO OFICIAL
                    https://developer.android.com/
            DE DESARROLLO DE ANDROID PARA SEGUIR AMPLIANDO Y ACTUALIZANDO EL CONTENIDO SOBRE SUS COMPONENTES
            Y EL RESTO DE LOS UTILIZADOS POR ANDROID.
                         
            PARA CONCLUIR ESTE BLOQUE,
            VEREMOS ALGUNAS PROPIEDADES INTERESANTES QUE DOTAN DE CIERTA ANIMACIÓN A LA TRANSICIÓN ENTRE PANTALLAS:
                         
                    - app:enterAnim
                            ANIMACIÓN ASOCIADA A LA ENTRADA EN UNA PANTALLA.
                         
                    - app:exitAnim
                            ANIMACIÓN ASOCIADA A LA SALIDA DE UNA PANTALLA.
                         
                    - app:popEnterAnim
                            ANIMACIÓN ASOCIADA A LA ENTRADA EN UNA PANTALLA A TRAVÉS DE UNA ACCIÓN EMERGENTE.
                         
                    - app:popExitAnim
                            ANIMACIÓN ASOCIADA A LA SALIDA DE UNA PANTALLA A TRAVÉS DE UNA ACCIÓN EMERGENTE.
                         
            PARA INDICAR EL TIPO DE ANIMACIÓN QUE VA A PRESENTAR CADA RELACIÓN,
            SE DEBE SELECCIONAR Y, A CONTINUACIÓN, EN EL MENÚ ATRIBUTOS,
            ESCOGER LA ACCIÓN SOBRE LA QUE SE VA A INDICAR UN NUEVO TIPO DE ANIMACIÓN PARA,
            DESPUÉS, PULSAR EL BOTÓN QUE APARECE A LA DERECHA.
                         
            EN EL CUADRO DE DIÁLOGO QUE APARECERÁ,
            SE DEBE SELECCIONAR EL TIPO DE ANIMACIÓN QUE VA A PRESENTAR LA ACCIÓN.
                         
            DESDE LA PESTAÑA DE Text, SE ACTUALIZARÁ AUTOMÁTICAMENTE EL CÓDIGO AÑADIENDO LOS NUEVOS ATRIBUTOS:
                         
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
        
            LAS ANIMACIONES, AL IGUAL QUE OCURRE CON EL DISEÑO WEB,
            APORTAN UN ALTO GRADO DE DINAMISMO A LA FUNCIONALIDAD DE LA APLICACIÓN Y,
            ADEMÁS, PERMITEN INFORMAR AL USUARIO DEL ESTADO DE LA PETICIÓN,
            POR EJEMPLO, PARA INDICAR QUE UNA PETICIÓN SE ESTÁ PROCESANDO
            O QUE SE ESTÁ AUTENTICANDO A UN USUARIO EN LA APLICACIÓN.
                         
            EN PRIMER LUGAR, ES NECESARIO CREAR LA ANIMACIÓN, Y PARA ELLO SE UTILIZA AnimationDrawable,
            EN CONCRETO, SE IMPLEMENTA UTILIZANDO UN ELEMENTO animation-list,
            QUE PERMITE CARGAR TODOS LOS FOTOGRAMAS QUE FORMARÁN PARTE DE LA ANIMACIÓN. 
                         
                            <animation-list xmlns:android="http://schemas.android.com/apk/res/android" android:oneshot="false">
                                <item android:drawable="@drawable/rocket_thrust1" android:duration="200" />
                                <item android:drawable="@drawable/rocket_thrust2" android:duration="200" />
                                <item android:drawable="@drawable/rocket_thrust3" android:duration="200" />
                            </animation-list>
                         
            EL ATRIBUTO oneshot PERMITE INDICAR SI LA ANIMACIÓN SE REPRODUCE UNA SOLA VEZ (true) O DE FORMA INDEFINIDA (false). 
                         
            LOS CÓDIGOS DE CREACIÓN DE ANIMACIONES SE COLOCAN EN LA RUTA res/drawable/.
            PARA SER UTILIZADOS, SERÁN LLAMADOS DESDE EL CÓDIGO JAVA CORRESPONDIENTE.
                         
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
        
            PARA CREAR UNA MARCA DE SEÑA DE IDENTIDAD ES IMPORTANTE TENER UN SISTEMA DE COLOR QUE LO IDENTIFIQUE.
            CON EL SISTEMA DE COLOR DE Material Design SE PUEDEN UTILIZAR PALETAS DE COLORES PARA LA CREACIÓN DE TEMAS DE COLOR,
            ASÍ COMO HERRAMIENTAS ESPECÍFICAS PARA LA SELECCIÓN DEL COLOR ADECUADO. 
                         
            EL SISTEMA DE COLOR DE Material Design PERMITE APLICAR COLOR A LA INTERFAZ DE USUARIO DE UNA MANERA MUY INTUITIVA.
            LA CLAVE DE ESTE SISTEMA CONSISTE EN SELECCIONAR UN COLOR PRIMARIO Y UNO SECUNDARIO PARA REPRESENTAR LA MARCA.
            ADEMÁS, EXISTEN VARIANTES OSCURAS O CLARAS QUE SE PUEDEN APLICAR SOBRE EL COLOR SELECCIONADO. 
                         
            LOS TEMAS DE COLOR ESTÁN DISEÑADOS PARA PRESENTAR UN ASPECTO ARMÓNICO, SIN GRANDES EXCENTRICIDADES,
            GARANTIZANDO QUE EL TEXTO SEA ACCESIBLE Y SE PUEDA DISTINGUIR ELEMENTOS Y SUPERFICIES DE LA INTERFAZ DE USUARIO ENTRE SÍ.
                         
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
                         
            UNO DE LOS ELEMENTOS PRESENTES HABITUALMENTE EN CUALQUIER APLICACIÓN ES LA BARRA DE ACCIONES O BARRA DE APP.
            EN EL CAPÍTULO ANTERIOR YA SE EXPUSO CÓMO COLOCAR UN ELEMENTO DE ESTE TIPO SOBRE LA INTERFAZ,
            PERO AHORA ANALIZAREMOS EN PROFUNDIDAD SU COMPORTAMIENTO Y LA PERSONALIZACIÓN POSIBLE DE LA MISMA.
                         
            LAS BARRAS DE ACCIONES TIENEN UN ESPACIO LIMITADO,
            POR LO QUE SOLO SE PODRÁN COLOCAR ALGUNOS ACCESOS RÁPIDOS.
                         
            LA ELECCIÓN DE ESTOS RESULTARÁ CLAVE PARA MEJORAR LA EXPERIENCIA DE NAVEGACIÓN DEL USUARIO. 
                         
            PARA INCORPORAR NUEVOS BOTONES A ESTA BARRA,
            SE DEBE CREAR UN NUEVO ARCHIVO EN LA RUTA res/menu 
            A CONTINUACIÓN, CREAR UN NUEVO ELEMENTO ÍTEM
            PARA CADA UNO DE LOS COMPONENTES QUE SE QUIERAN INCLUIR EN LA BARRA. 
                         
            SE DEBE PRESTAR ESPECIAL ATENCIÓN AL ATRIBUTO showAsAction,
            PUESTO QUE INDICA CÓMO QUEDARÍA EL ICONO DE ACCIÓN REPRESENTADO:
                         
                    - ifRoom:
                            QUEDA REPRESENTADA CON UN ICONO SI HAY ESPACIO SUFICIENTE Y EN EL MENÚ AMPLIADO SI NO LO HAY. 
                         
                    - never:
                            POR EL CONTRARIO, SI SE INDICA DIRECTAMENTE EL VALOR never,
                            SOLO SERÁ MOSTRADO EL ELEMENTO EN EL MENÚ AMPLIADO (SE ACCEDE A TRAVÉS DE LOS TRES PUNTOS EN VERTICAL).
                         
            EN EL SIGUIENTE CÓDIGO, ES POSIBLE VER UN ELEMENTO CON CADA UNO DE LOS VALORES INDICADOS. 
                         
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
                         
            LOS ELEMENTOS COLOCADOS EN LA BARRA PRESENTARÁN UNA ACCIÓN ASOCIADA A TRAVÉS DE EVENTOS.
                         
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
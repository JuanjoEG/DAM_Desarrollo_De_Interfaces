package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_13 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_13 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN LA ACTUALIDAD EXISTEN DIFERENTES TECNOLOG�AS PARA EL DESARROLLO DE APLICACIONES M�VILES.
            VAMOS A ANALIZAR EL CASO DE Android Y DE iOS.
            
            EL SITEMA OPERATIVO iOS: (25% CUOTA DEL MERCADO MUNDIAL)
                    ES EL QUE USAN LOS DISPOSITIVOS iPhone O iPad DE LA MARCA Apple,
                    AUNQUE PUEDE SER ADAPTADO A OTROS DISPOSITIVOS
                    Y SUS RESPECTIVOS SISTEMAS OPERATIVOS, WatchOS o Mac OS X, ENTRE OTROS.
                         
            EL SITEMA OPERATIVO Android: (70% CUOTA DEL MERCADO MUNDIAL)
                    EL DISE�O DE INTERFACES DE USUARIO CENTRADA EN EL DESARROLLO DE UNA APLICACI�N M�VIL EN Android
                    SE BASA EN UN CONJUNTO DE OBJETOS CONTENEDORES Y DE OBJETOS CONTENIDOS.
                    LA COMBINACI�N DE ESTOS ELEMENTOS LO QUE PERMITIR� LA CONSECUCI�N DE CUALQUIER TIPO DE INTERFAZ.
                         
            EL CRECIMIENTO EXPONENCIAL DEL USO DE LOS DISPOSITIVOS M�VILES HA LLEVADO AL P�DIUM DE DESCARGAS
            AQUELLAS APLICACIONES DESARROLLADAS EN Android CON UN DISE�O M�S SENCILLO Y AMIGABLE.
            DESDE LA APLICACI�N M�S ELEMENTAL HASTA EL DISE�O M�S SOFISTICADO TIENEN EN COM�N EL USO DE
            CONTENEDORES Y OBJETOS ANIDADOS.
            
                         
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
        
            Android Studio ES EL ENTORNO DE DESARROLLO INTEGRADO OFICIAL CREADO PARA LA PLATAFORMA Android.
                         
                1.- REALIZAMOS LA DESCARGA DESDE SU P�GINA WEB OFICIAL.
                        https://developer.android.com/studio
                         
                2.- INICIA LA INSTALACI�N.
                         
                3.- ESCOGER LAS DIFERENTES OPCIONES Y LA CONCESIONES DE PERMISOS.
                    PULSAR --> FINISH.
                         
            CREACI�N DE UN PROYECTO:
                    --> START A NEW ANDROID STUDIO PROYET --> FILE --> NEW PROYECT.
                    - SELECCIONAMOS LA PLANTILLA DE DISE�O INICIAL. SELECT A PROJECT TEMPLATE.
                    - SE REALIZA LA CONFIGURAC�N DEL PROYECTO.
                         
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
        
            CUANDO SE ACCEDE POR PRIMERA VEZ A UN PROYECTO
            SE MUESTRA POR DEFECTO EL FICHERO --> MainActivity.kt
            
            ACCEDEREMOS AL FICHERO --> APP --> RES --> LAYOUT -->  activity_main.xml
                         
            DISPONDREMOS DE LA VISTA DE DISE�O --> DESIGN
            DE LA VISTA DEL C�DIGO ASOCIADO    --> CODE
            DE LA VISTA COMBINADA              --> SPLIT
                         
            EL ENTORNO DE DISE�O SE DIVIDE EN TRES ZONAS:
                         
                    - EXPLORADOR:         A LA IZQUIERDA.
                    - ZONA DE DESARROLLO: EN EL CENTRO.
                    - ZONA DE DISE�O:     A LA DERECHA.
                         
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
        
            EL DISE�O DE INTERFACES DE USUARIO CENTRADA EN EL DESARROLLO DE UNA APLICACI�N M�VIL EN Android,
            ES UN CONJUNTO DE OBJETOS CONTENEDORES Y DE OBJETOS CONTENIDOS.
            LA COMBINACI�N DE ESTOS ELEMENTOS LO QUE PERMITIR� LA CONSECUCI�N DE CUALQUIER TIPO DE INTERFAZ.
                         
                    * ViewGroup:
                            ESTOS OBJETOS SON LOS CONTENEDORES QUE PERMITEN CONTROLAR LA POSICI�N Y DISTRIBUCI�N
                            DEL RESTO DE ELEMENTOS UTILIZADOS PARA LA CONSTRUCCI�N DE LA INTERFAZ DE USUARIO DE LA APLICACI�N.
                            SE TRATA DEL ELEMENTO CLAVE PARA LOGRAR CUALQUIER TIPO DE DISE�O.
                            UN ELEMENTO ViewGroup PODR� CONTENER OTROS ELEMENTOS ViewGroup Y COMPONENTES SIMPLES DE TIPO View.
                         
                    * View:
                            RECIBEN ESTE NOMBRE LOS COMPONENTES DE LA INTERFAZ DE USUARIO QUE IMPLEMENTAN UNA FUNCI�N CONCRETA
                            SOBRE EL DISE�O GLOBAL DE LA APLICACI�N.
                            LOS ELEMENTOS View NO PUEDEN CONTENER NADA, ES DECIR,
                            NO PUEDEN CONTENER EN SU INTERIOR OTROS ELEMENTOS.
                            LOS ELEMENTOS View PUEDEN SER:
                         
                                    - CAJAS DE TEXTO.
                                    - BOTONES.
                                    - LIENZOS EN BLANCO.
                                    - ETC.
                         
            UNO DE LOS ELEMENTOS CLAVE PARA EL DESARROLLO DE INTERFACES EN Android SON LOS  -->  layout.
            ESTE ELEMENTO PERMITE LA ADAPTACI�N AL ESQUEMA DE DISTRIBUCI�N QUE VAN A SEGUIR LOS COMPONENTES
            DENTRO DE UN DETERMINADO CONTENEDOR, POR LO TANTO, SE TRATA DE UN ELEMENTO TIPO ViewGroup.
            LOS layout PERMITEN DEFINIR:
                         
                    - POSICI�N DE LOS ELEMENTOS.
                    - DIMENSI�N DE LOS ELEMENTOS.
                    - DISTRIBUCI�N DE LOS ELEMENTOS.
                         
            SIN LOS layout, LOS ELEMENTOS OCUPAR�AN TODO EL CONTENEDOR.
            EL USO DE layout NOS PERMITE MODIFICAR EL TAMA�O DE LOS COMPONENTES Y SU POSICI�N DE FORMA AUTOM�TICA.
                         
            UN LAYOUT DEFINE LA ESTRUCTURA VISUAL DE UNA INTERFAZ DE USUARIO.
            EN ANDROID SE PROPORCIONA MEDIANTE LENGUAJE XML CLASES Y SUBCLASES QUE SON MUY �TILES,
            COMO LOS  -->  widgets O LOS layouts.
                         
            ESTOS �LTIMOS SIRVEN PARA CONTROLAR LA POSICI�N DE LOS DIFERENTES widgets SECUNDARIOS QUE SE PUEDAN ENCONTRAR EN EL DISE�O.
            ADEM�S, SIRVEN PARA ASEGURAR QUE LAS DIMENSIONES DEL widget PRINCIPAL SON LAS CORRECTAS
            Y QUE CUMPLE LAS RESTRICCIONES ESPECIFICADAS.
                         
            SI SE CREA UN layout SIN UN widget PRINCIPAL,
            EN CUANTO EL layout SE ADJUNTE A UN widget CON setLayout(),
            SE ESTABLECER� EL TAMA�O DE ESE widget PRINCIPAL.
                         
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
        
            LA PALETA DE COMPONENTES SE ENCUENTRA DISPONIBLE DESDE LA ISLA DE DISE�O Design,
            DESPLEGANDO LA PESTA�A Palette.
            EXISTEN DIENTES TIPOS DE COMPONENTES, ORGANIZADOS GRUPOS:
                         
                    * Common:
                            EN ESTE BLOQUE, APARECEN LOS COMPONENTES CUYO USO ES M�S HABITUAL, COMO CAJAS DE TEXTO O BOTONES.
                         
                    * Text:
                            ELEMENTOS QUE PERMITEN A�ADIR A LA INTERFAZ CADENAS DE TEXTO TALES COMO N�MEROS DE TEL�FONO, FECHAS, ETC.
                         
                    * Buttons:
                            ELEMENTOS DE TIPO BOT�N O UN COMPARTIMENTO SIMILAR (checkbox, togglebutton, radiobutton, ETC.).
                         
                    * Widgets:
                            ELEMENTOS 'EXTRA' QUE PERMITEN PERSONALIZAR LA INTERFAZ DE DESARROLLO (CALENDARIOS, BARRAS DE PROGRESO, ETC.).
                         
                    * Layouts:
                            ELEMENTOS EXTREMADAMENTE IMPORTANTES EN EL DESARROLLO DE INTERFACES,
                            PUESTO QUE PERMITEN DEFINIR LA POSICI�N DEL RESTO DE ELEMENTOS, SU DIMENSI�N Y LA DISTRIBUCI�N DE ESTOS.
                         
                    * Containers:
                            AUNQUE SIMILARES A LOS layouts, ESTOS SON UN TIPO DE View 
                            UTILIZADO PARA REALIZAR CIERTAS DISTRIBUCIONES DIN�MICAS.
                         
                    * Google:
                            ELEMENTOS RELATIVOS A GOOGLE, COMO MAPAS O ANUNCIOS.
                          
            CADA UNO DE LOS ELEMENTOS CONTENIDOS EN ESTOS BLOQUES PERMITE ALTERAR EL VALOR DE SUS ATRIBUTOS.
            PARA ELLO, TRAS COLOCAR UN ELEMENTO EN LA ZONA DE DISE�O, 
            SER� POSIBLE CONSULTAR SUS ATRIBUTOS DESPLEGANDO LA PESTA�A QUE APARECE EN LA DERECHA Y PONE ATTRIBUTES.
                        
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
                 
            * Button:
                         
                SE TRATA DE ELEMENTOS DE TIPO BOT�N.
                ESTOS PUEDEN APARECER EN FORMA DE BOTONES DE TEXTO, IMAGEN O ICONO.
                SUELEN PRESENTAR UNA ACCI�N ASOCIADA AL SER PULSADOS.
                         
                EL C�DIGO DE CREACI�N QUE SE GENERA AL COLOCAR UN ELEMENTO DE ESTE TIPO SOBRE EL LIENZO DE DISE�O ES EL SIGUIENTE:
                         
                <Button
                    android:id="@+id/button"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="@string/button_text" 
                />
                         
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
        
            * TextField:
                         
                LOS ELEMENTOS Multiline Text PERMITEN AL USUARIO INTRODUCIR CUALQUIER TIPO DE TEXTO DE UNA L�NEA O M�S EN UNA CAJA.
                SUELE UTILIZARSE BASTANTE EN EL DISE�O DE FORMULARIOS.
                LA ETIQUETA UTILIZADA PARA LA CREACI�N DE ESTE TIPO DE ELEMENTOS ES  -->  <EditText>.
                         
                <EditText
                    android:id="@+id/editTextTextMultiLine"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:ems="10"
                    android:gravity="start|top"
                    android:inputType="textMultiLine"
                />
                         
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
                         
            * TextView:
        
                ESTE ELEMENTO PERMITE MOSTRAR UN MENSAJE EN FORMA DE CADENA DE TEXTO O SIMILAR A UN USUARIO.
                SE TRATA DE UNA ETIQUETA DE TEXTO.

                <TextView
                    android:id="@+id/textView"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="TextView" 
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
                         
            * CheckBox:
        
                ESTE TIPO DE ELEMENTOS PERMITEN A LOS USUARIOS SELECCIONAR UNA O M�S OPCIONES
                DE ENTRE LAS QUE SON MOSTRADAS POR LA APLICACI�N.
                LOS ELEMENTOS checkBox SE ENCUENTRAN EN LA Palette DENTRO DEL GRUPO DENOMINADO Buttons.
                         
                LA SINTAXIS DE CADA UNO DE LOS ELEMENTOS QUE FORMAN UN GRUPO DE checkBox ES LA SIGUIENTE:

                <CheckBox
                    android:id="@+id/checkBox"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="CheckBox1"
                    android:onClick="onCheckClicked"
                 />
                         
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
        
            * ToggleButton:
                         
                LOS ELEMENTOS DE TIPO ToggleButton TAMBI�N SE ENCUENTRAN LOCALIZADOS EN LA CARPETA DE TIPO Button.
                ESTE TIPO DE ELEMENTOS PERMITE AL USUARIO CONMUTAR ENTRE DOS ESTADOS.
                         
                <ToggleButton
                    android:id="@+id/toggleButton"
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:checked="true"
                    android:textOff="@string/text_off"
                    android:textOn="@string/text_on" 
                />
                         
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
        
            * Spinner:
                         
                ESTE ELEMENTO ES UTILIZADO PARA MODELAR LOS MEN�S DESPLEGABLES EN UNA APLICACI�N CON Android.
                SE ENCUENTRA DISPONIBLE EN LA CARPETA DE ELEMENTOS Containers.
                         
                <Spinner
                    android:id="@+id/spinner2"
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                 />
                         
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
        
            * Layout:
                         
                    EN EL MEN� DE Layout DE LA PALETA DE ELEMENTOS, PODEMOS OBSERVAR QUE EXISTEN M�LTIPLES OPCIONES.
                    PARA A�ADIR AL DISE�O UNA DE ELLAS, 
                    BASTA CON SELECCIONAR LA QUE M�S SE ADEC�A A LAS ESPECIFICACIONES DEL DESARROLLO
                    Y COLOCARLA EN EL VISOR DEL LIENZO CENTRAL.
                         
                    EXISTEN DIFERENTES OPCIONES: 
                            - RELATIVELAYOUT.
                            - LINEARLAYOUT.
                            - GRIDLAYOUT.
                            - TABLELAYOUT
                            - ETC.
                         
                    CUANDO UN ELEMENTO VA A SER INSERTADO EN UN LAYOUT,
                    ES NECESARIO PRESTAR ATENCI�N A LOS ATRIBUTOS CARACTER�STICOS DEL DISE�O DE ESTAS CAPAS:
                         
                    * android:layout_width:
                            DETERMINA EL VALOR DEL ANCHO DEL ELEMENTO.
                         
                    * android:layout_height:
                            DETERMINA EL VALOR DE LA ALTURA DEL ELEMENTO.
                         
                    * android:layout_gravity:
                            DETERMINA LA POSICI�N EN LA QUE DEBE SITUARSE UN ELEMENTO DENTRO DEL CONTENEDOR EN EL QUE SE ENCUENTRA.
                         
                    * android:layout_margin: -->  top,  left,  right, ETC.
                            ETERMINA LA DISTANCIA CON RESPECTO A LOS M�RGENES  DEL CONTENEDOR Y LA ALINEACI�N.
                         
                    LOS ATRIBUTOS QUE DETERMINAN LAS DIMENSIONES DEL ANCHO Y ALTO DE UN ELEMENTO
                    PUEDEN TOMAR DOS VALORES A TRAV�S DEL MEN� DE ATRIBUTOS (Attributes):
                         
                            * match_parent:
                                    SE ASIGNA COMO DIMENSI�N EL TAMA�O COMPLETO DEL ELEMENTO PADRE.
                         
                            * wrap_content:
                                    SE UTILIZA PARA INDICAR QUE LA DIMENSI�N DEL ELEMENTO SE AJUSTA AL CONTENIDO DEL MISMO.
            
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
        
            * RelativeLayout:

                    LA DISTRIBUCI�N DE ELEMENTOS RelativeLayout PERMITE COLOCAR LOS ELEMENTOS DE MANERA RELATIVA
                    AL ELEMENTO CONTENEDOR PADRE. 
                    ESTE LAYOUT ES EL QUE PERMITE MAYOR LIBERTAD EN CUANTO A LA DISTRIBUCI�N DE LOS ELEMENTOS.
                         
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
        
            * TableLayout:
                         
                    EN LA DISTRIBUCI�N DE TIPO TableLayout,
                    LOS ELEMENTOS QUEDAN DISTRIBUIDOS EN FORMA DE TABLA,
                    POR LO QUE SE INDICAR�N LAS FILAS Y LAS COLUMNAS QUE LO COMPONEN.
                    LAS FILAS PARA SER DEFINIDAS UTILIZAN UN OBJETO DE TIPO  -->  TableRow.
                         
                    SE TRATA DE UNA DE LAS DISTRIBUCIONES M�S UTILIZADAS,
                    PUESTO QUE DE UNA FORMA RELATIVAMENTE SENCILLA 
                    PERMITE REALIZAR UNA DISTRIBUCI�N DE LOS ELEMENTOS DE LA APLICACI�N
                    QUE FACILITA LA NAVEGACI�N DEL USUARIO POR LA INTERFAZ.
                         
                    POR EJEMPLO,
                    EN EL C�DIGO DE CREACI�N DE ESTE TIPO DE DISTRIBUCI�N QUE SE MUESTRA A CONTINUACI�N,
                    SE ESTAR�A CREANDO UNA TABLA CON TRES FILAS:
                         
                    <TableLayout
                        android:layout_width="match_parent"
                        android:layout_height="match_parent">
                        <TableRow
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"/>
                        <TableRow
                            android:layout_width="match_parent"
                            android:layout_height="match_parent" />
                        <TableRow
                            android:layout_width="match_parent"
                            android:layout_height="match_parent" />
                    </TableLayout>    
                         
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
                         
            * GridLayout:
                         
                    LA DISTRIBUCI�N GridLayout CREA UNA REJILLA FORMADA POR UN CONJUNTO DE L�NEAS VERTICALES Y HORIZONTALES
                    EN CUYOS 'HUECOS' SE COLOCAR�N LOS ELEMENTOS.
                    LA POSICI�N DE INSERCI�N QUEDA REFERENCIADA A TRAV�S DE UN �NDICE.
                         
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
                         
            * LinearLayout:
                         
                    LA DISTRIBUCI�N LinearLayout PERMITE ALINEAR LOS ELEMENTOS UNO TRAS OTRO
                    EN UNA DIRECCI�N CONCRETA (VERTICAL U HORIZONTAL).
                    LAS DIMENSIONES DE CADA UNO DE LOS ELEMENTOS SER�N DETERMINADAS 
                    UTILIZANDO LAS PROPIEDADES DESTINADAS A TAL FIN (layout_height Y layout_width).
                    
                    EN EL MEN� Layouts,
                    ES POSIBLE ENCONTRAR DOS ELEMENTOS DE TIPO lineal,
                    EL PRIMERO DE TIPO HORIZONTAL,
                    Y OTRO DE TIPO VERTICAL
                    DONDE LA DISTRIBUCI�N SE HACE EN FORMA DE FILAS.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_17 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_17 + """
        **********************************************************************************************************************************
                         
            * AppBarLayout:
                      
                    UNA HERRAMIENTA CLAVE PARA LA PROGRAMACI�N Y PERSONALIZACI�N DE CUALQUIER APLICACI�N DE DESARROLLO
                    PARA UN DISPOSITIVO M�VIL COMO Android ES AppBarLayout.
                         
                    AL CREAR UN NUEVO PROYECTO,
                    UNA DE LAS PLANTILLAS EXISTENTES PERMITE CREAR UN PROYECTO CON UNA AppBarLayout INCLUIDA.
                         
                    SE TRATA DE UNA BARRA QUE SE ENCUENTRA NORMALMENTE EN LA PARTE SUPERIOR DE LAS APLICACIONES EN Android,
                    Y QUE SUELE CONTENER ELEMENTOS TALES COMO:
                            - EL NOMBRE DE LA PLICACI�N.
                            - EL ACCESO A LA CONFIGURACI�N, REPRESENTADO CON TRES PUNTOS VERTICALES.
                            - UNA CAJA DE BUSQUEDA.
                            - ETC.
                         
                    CUANDO SE DESEA INSERTAR ELEMENTOS DE TIPO Widgets 
                    LA ETIQUETA INICIAL DE INSERCI�N SER� DISTINTA
                    SIENDO NECESARIO INDICAR LA RUTA EXACTA DE ACCESO AL ELEMENTO.
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_18 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_18 + """
        **********************************************************************************************************************************
                         
            * Google Maps:
                      
                    EN ESTE EJERCICIO,
                    SE PIDE IMPLEMENTAR UNA PANTALLA DE APLICACI�N QUE CONTENGA UN MAPA DE ACTIVIDAD DE GOOGLE MAPS,
                    INDICANDO EL C�DIGO NECESARIO EN XML PARA EL DESARROLLO DE LA MISMA.
                         
                    AL CREAR UN NUEVO PROYECTO,
                    UNA DE LAS PLANTILLAS EXISTENTES PERMITE CREAR UNA VERSI�N PREVIA DE ESTE TIPO DE ACCIONES DE FORMA DIRECTA.
                         
                    PERO SI QUEREMOS CREARLO DESDE CERO, ES DECIR, EN UN DOCUMENTO EN BLANCO,
                    DEBEMOS TENER CLARO QUE EL COMPONENTE ESENCIAL SER� MapView,
                    QUE EST� SITUADO EN LA CARPETA DE LA PALETA LLAMADA Google.
                         
                    EL C�DIGO QUE PERMITE CREAR UNA PANTALLA PARA INCORPORAR ELEMENTOS
                    DE ACTIVIDAD A TRAV�S DE Google Maps ES EL SIGUIENTE:
                         
                        <?xml version="1.0" encoding="utf-8"?>
                        <fragment
                            xmlns:android="http://schemas.android.com/apk/res/android"
                            xmlns:map="http://schemas.android.com/apk/res-auto"
                            xmlns:tools="http://schemas.android.com/tools"
                            android:id="@+id/map"    android:name="com.google.android.gms.maps.SupportMapFragment"
                            android:layout_width="match_parent"
                            android:layout_height="match_parent"
                            tools:context=".MapsActivity" 
                        />
                         
        **********************************************************************************************************************************
        *  0. SALIR.
        ************************************************************************************************************************
                               
                               """;
    private static String recurso_19 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_19 + """
        **********************************************************************************************************************************
                         
            * VENTANAS EMERGENTES:
                      
                    EL USO DE VENTANAS EMERGENTES EN EL DESARROLLO DE INTERFACES M�VILES
                    PUEDE RESULTAR UN ELEMENTO ESENCIAL PARA MANTENER UNA COMUNICACI�N ACTIVA CON LOS USUARIOS,
                    Y, POR TANTO, MEJORAR LA INTERACCI�N Y AUMENTAR EL NIVEL DE SATISFACCI�N DE LOS CLIENTES DE UNA APLICACI�N.
                         
                    POR ESTA RAZ�N, EN ESTE CASO PR�CTICO,
                    SE PIDE DISE�AR EL C�DIGO ANDROID NECESARIO PARA PRODUCIR UNA VENTANA EMERGENTE DE ESTE TIPO.
                         
                    EL CUADRO DE DI�LOGO MOSTRAR� DOS OPCIONES YES O NO.
                         
                    EL RESULTADO FINAL DE IMPLEMENTAR EL C�DIGO
                    ES UNA INTERFAZ EN LA QUE APARECE UN CUADRO DE DI�LOGO:
                         
                    AlertDialog.Builder builder = new AlertDialog.Builder(this);
                    builder.setMessage("Are you sure you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                MyActivity.this.finish();
                            }
                        })
                        .setNegativeButton("No", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                    AlertDialog alert = builder.create();
                         
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
                case "17" -> System.out.println(recurso_17);
                case "18" -> System.out.println(recurso_18);
                case "19" -> System.out.println(recurso_19);
                case "20" -> {
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
                    continuar();
                    System.out.println(recurso_17);
                    continuar();
                    System.out.println(recurso_18);
                    continuar();
                    System.out.println(recurso_19);
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
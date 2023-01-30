package Tema_13;

import static Principal_Main.Main.*;
import static Tema_13.T_13.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_13 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_13 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
        
            EN LA ACTUALIDAD EXISTEN DIFERENTES TECNOLOGÍAS PARA EL DESARROLLO DE APLICACIONES MÓVILES.
            VAMOS A ANALIZAR EL CASO DE Android Y DE iOS.
            
            EL SITEMA OPERATIVO iOS: (25% CUOTA DEL MERCADO MUNDIAL)
                    ES EL QUE USAN LOS DISPOSITIVOS iPhone O iPad DE LA MARCA Apple,
                    AUNQUE PUEDE SER ADAPTADO A OTROS DISPOSITIVOS
                    Y SUS RESPECTIVOS SISTEMAS OPERATIVOS, WatchOS o Mac OS X, ENTRE OTROS.
                         
            EL SITEMA OPERATIVO Android: (70% CUOTA DEL MERCADO MUNDIAL)
                    EL DISEÑO DE INTERFACES DE USUARIO CENTRADA EN EL DESARROLLO DE UNA APLICACIÓN MÓVIL EN Android
                    SE BASA EN UN CONJUNTO DE OBJETOS CONTENEDORES Y DE OBJETOS CONTENIDOS.
                    LA COMBINACIÓN DE ESTOS ELEMENTOS LO QUE PERMITIRÁ LA CONSECUCIÓN DE CUALQUIER TIPO DE INTERFAZ.
                         
            EL CRECIMIENTO EXPONENCIAL DEL USO DE LOS DISPOSITIVOS MÓVILES HA LLEVADO AL PÓDIUM DE DESCARGAS
            AQUELLAS APLICACIONES DESARROLLADAS EN Android CON UN DISEÑO MÁS SENCILLO Y AMIGABLE.
            DESDE LA APLICACIÓN MÁS ELEMENTAL HASTA EL DISEÑO MÁS SOFISTICADO TIENEN EN COMÚN EL USO DE
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
                         
                1.- REALIZAMOS LA DESCARGA DESDE SU PÁGINA WEB OFICIAL.
                        https://developer.android.com/studio
                         
                2.- INICIA LA INSTALACIÓN.
                         
                3.- ESCOGER LAS DIFERENTES OPCIONES Y LA CONCESIONES DE PERMISOS.
                    PULSAR --> FINISH.
                         
            CREACIÓN DE UN PROYECTO:
                    --> START A NEW ANDROID STUDIO PROYET --> FILE --> NEW PROYECT.
                    - SELECCIONAMOS LA PLANTILLA DE DISEÑO INICIAL. SELECT A PROJECT TEMPLATE.
                    - SE REALIZA LA CONFIGURACÓN DEL PROYECTO.
                         
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
                         
            DISPONDREMOS DE LA VISTA DE DISEÑO --> DESIGN
            DE LA VISTA DEL CÓDIGO ASOCIADO    --> CODE
            DE LA VISTA COMBINADA              --> SPLIT
                         
            EL ENTORNO DE DISEÑO SE DIVIDE EN TRES ZONAS:
                         
                    - EXPLORADOR:         A LA IZQUIERDA.
                    - ZONA DE DESARROLLO: EN EL CENTRO.
                    - ZONA DE DISEÑO:     A LA DERECHA.
                         
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
        
            EL DISEÑO DE INTERFACES DE USUARIO CENTRADA EN EL DESARROLLO DE UNA APLICACIÓN MÓVIL EN Android,
            ES UN CONJUNTO DE OBJETOS CONTENEDORES Y DE OBJETOS CONTENIDOS.
            LA COMBINACIÓN DE ESTOS ELEMENTOS LO QUE PERMITIRÁ LA CONSECUCIÓN DE CUALQUIER TIPO DE INTERFAZ.
                         
                    * ViewGroup:
                            ESTOS OBJETOS SON LOS CONTENEDORES QUE PERMITEN CONTROLAR LA POSICIÓN Y DISTRIBUCIÓN
                            DEL RESTO DE ELEMENTOS UTILIZADOS PARA LA CONSTRUCCIÓN DE LA INTERFAZ DE USUARIO DE LA APLICACIÓN.
                            SE TRATA DEL ELEMENTO CLAVE PARA LOGRAR CUALQUIER TIPO DE DISEÑO.
                            UN ELEMENTO ViewGroup PODRÁ CONTENER OTROS ELEMENTOS ViewGroup Y COMPONENTES SIMPLES DE TIPO View.
                         
                    * View:
                            RECIBEN ESTE NOMBRE LOS COMPONENTES DE LA INTERFAZ DE USUARIO QUE IMPLEMENTAN UNA FUNCIÓN CONCRETA
                            SOBRE EL DISEÑO GLOBAL DE LA APLICACIÓN.
                            LOS ELEMENTOS View NO PUEDEN CONTENER NADA, ES DECIR,
                            NO PUEDEN CONTENER EN SU INTERIOR OTROS ELEMENTOS.
                            LOS ELEMENTOS View PUEDEN SER:
                         
                                    - CAJAS DE TEXTO.
                                    - BOTONES.
                                    - LIENZOS EN BLANCO.
                                    - ETC.
                         
            UNO DE LOS ELEMENTOS CLAVE PARA EL DESARROLLO DE INTERFACES EN Android SON LOS  -->  layout.
            ESTE ELEMENTO PERMITE LA ADAPTACIÓN AL ESQUEMA DE DISTRIBUCIÓN QUE VAN A SEGUIR LOS COMPONENTES
            DENTRO DE UN DETERMINADO CONTENEDOR, POR LO TANTO, SE TRATA DE UN ELEMENTO TIPO ViewGroup.
            LOS layout PERMITEN DEFINIR:
                         
                    - POSICIÓN DE LOS ELEMENTOS.
                    - DIMENSIÓN DE LOS ELEMENTOS.
                    - DISTRIBUCIÓN DE LOS ELEMENTOS.
                         
            SIN LOS layout, LOS ELEMENTOS OCUPARÍAN TODO EL CONTENEDOR.
            EL USO DE layout NOS PERMITE MODIFICAR EL TAMAÑO DE LOS COMPONENTES Y SU POSICIÓN DE FORMA AUTOMÁTICA.
                         
            UN LAYOUT DEFINE LA ESTRUCTURA VISUAL DE UNA INTERFAZ DE USUARIO.
            EN ANDROID SE PROPORCIONA MEDIANTE LENGUAJE XML CLASES Y SUBCLASES QUE SON MUY ÚTILES,
            COMO LOS  -->  widgets O LOS layouts.
                         
            ESTOS ÚLTIMOS SIRVEN PARA CONTROLAR LA POSICIÓN DE LOS DIFERENTES widgets SECUNDARIOS QUE SE PUEDAN ENCONTRAR EN EL DISEÑO.
            ADEMÁS, SIRVEN PARA ASEGURAR QUE LAS DIMENSIONES DEL widget PRINCIPAL SON LAS CORRECTAS
            Y QUE CUMPLE LAS RESTRICCIONES ESPECIFICADAS.
                         
            SI SE CREA UN layout SIN UN widget PRINCIPAL,
            EN CUANTO EL layout SE ADJUNTE A UN widget CON setLayout(),
            SE ESTABLECERÁ EL TAMAÑO DE ESE widget PRINCIPAL.
                         
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
        
            LA PALETA DE COMPONENTES SE ENCUENTRA DISPONIBLE DESDE LA ISLA DE DISEÑO Design,
            DESPLEGANDO LA PESTAÑA Palette.
            EXISTEN DIENTES TIPOS DE COMPONENTES, ORGANIZADOS GRUPOS:
                         
                    * Common:
                            EN ESTE BLOQUE, APARECEN LOS COMPONENTES CUYO USO ES MÁS HABITUAL, COMO CAJAS DE TEXTO O BOTONES.
                         
                    * Text:
                            ELEMENTOS QUE PERMITEN AÑADIR A LA INTERFAZ CADENAS DE TEXTO TALES COMO NÚMEROS DE TELÉFONO, FECHAS, ETC.
                         
                    * Buttons:
                            ELEMENTOS DE TIPO BOTÓN O UN COMPARTIMENTO SIMILAR (checkbox, togglebutton, radiobutton, ETC.).
                         
                    * Widgets:
                            ELEMENTOS 'EXTRA' QUE PERMITEN PERSONALIZAR LA INTERFAZ DE DESARROLLO (CALENDARIOS, BARRAS DE PROGRESO, ETC.).
                         
                    * Layouts:
                            ELEMENTOS EXTREMADAMENTE IMPORTANTES EN EL DESARROLLO DE INTERFACES,
                            PUESTO QUE PERMITEN DEFINIR LA POSICIÓN DEL RESTO DE ELEMENTOS, SU DIMENSIÓN Y LA DISTRIBUCIÓN DE ESTOS.
                         
                    * Containers:
                            AUNQUE SIMILARES A LOS layouts, ESTOS SON UN TIPO DE View 
                            UTILIZADO PARA REALIZAR CIERTAS DISTRIBUCIONES DINÁMICAS.
                         
                    * Google:
                            ELEMENTOS RELATIVOS A GOOGLE, COMO MAPAS O ANUNCIOS.
                          
            CADA UNO DE LOS ELEMENTOS CONTENIDOS EN ESTOS BLOQUES PERMITE ALTERAR EL VALOR DE SUS ATRIBUTOS.
            PARA ELLO, TRAS COLOCAR UN ELEMENTO EN LA ZONA DE DISEÑO, 
            SERÁ POSIBLE CONSULTAR SUS ATRIBUTOS DESPLEGANDO LA PESTAÑA QUE APARECE EN LA DERECHA Y PONE ATTRIBUTES.
                        
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
                         
                SE TRATA DE ELEMENTOS DE TIPO BOTÓN.
                ESTOS PUEDEN APARECER EN FORMA DE BOTONES DE TEXTO, IMAGEN O ICONO.
                SUELEN PRESENTAR UNA ACCIÓN ASOCIADA AL SER PULSADOS.
                         
                EL CÓDIGO DE CREACIÓN QUE SE GENERA AL COLOCAR UN ELEMENTO DE ESTE TIPO SOBRE EL LIENZO DE DISEÑO ES EL SIGUIENTE:
                         
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
                         
                LOS ELEMENTOS Multiline Text PERMITEN AL USUARIO INTRODUCIR CUALQUIER TIPO DE TEXTO DE UNA LÍNEA O MÁS EN UNA CAJA.
                SUELE UTILIZARSE BASTANTE EN EL DISEÑO DE FORMULARIOS.
                LA ETIQUETA UTILIZADA PARA LA CREACIÓN DE ESTE TIPO DE ELEMENTOS ES  -->  <EditText>.
                         
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
        
                ESTE TIPO DE ELEMENTOS PERMITEN A LOS USUARIOS SELECCIONAR UNA O MÁS OPCIONES
                DE ENTRE LAS QUE SON MOSTRADAS POR LA APLICACIÓN.
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
                         
                LOS ELEMENTOS DE TIPO ToggleButton TAMBIÉN SE ENCUENTRAN LOCALIZADOS EN LA CARPETA DE TIPO Button.
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
                         
                ESTE ELEMENTO ES UTILIZADO PARA MODELAR LOS MENÚS DESPLEGABLES EN UNA APLICACIÓN CON Android.
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
                         
                    EN EL MENÚ DE Layout DE LA PALETA DE ELEMENTOS, PODEMOS OBSERVAR QUE EXISTEN MÚLTIPLES OPCIONES.
                    PARA AÑADIR AL DISEÑO UNA DE ELLAS, 
                    BASTA CON SELECCIONAR LA QUE MÁS SE ADECÚA A LAS ESPECIFICACIONES DEL DESARROLLO
                    Y COLOCARLA EN EL VISOR DEL LIENZO CENTRAL.
                         
                    EXISTEN DIFERENTES OPCIONES: 
                            - RELATIVELAYOUT.
                            - LINEARLAYOUT.
                            - GRIDLAYOUT.
                            - TABLELAYOUT
                            - ETC.
                         
                    CUANDO UN ELEMENTO VA A SER INSERTADO EN UN LAYOUT,
                    ES NECESARIO PRESTAR ATENCIÓN A LOS ATRIBUTOS CARACTERÍSTICOS DEL DISEÑO DE ESTAS CAPAS:
                         
                    * android:layout_width:
                            DETERMINA EL VALOR DEL ANCHO DEL ELEMENTO.
                         
                    * android:layout_height:
                            DETERMINA EL VALOR DE LA ALTURA DEL ELEMENTO.
                         
                    * android:layout_gravity:
                            DETERMINA LA POSICIÓN EN LA QUE DEBE SITUARSE UN ELEMENTO DENTRO DEL CONTENEDOR EN EL QUE SE ENCUENTRA.
                         
                    * android:layout_margin: -->  top,  left,  right, ETC.
                            ETERMINA LA DISTANCIA CON RESPECTO A LOS MÁRGENES  DEL CONTENEDOR Y LA ALINEACIÓN.
                         
                    LOS ATRIBUTOS QUE DETERMINAN LAS DIMENSIONES DEL ANCHO Y ALTO DE UN ELEMENTO
                    PUEDEN TOMAR DOS VALORES A TRAVÉS DEL MENÚ DE ATRIBUTOS (Attributes):
                         
                            * match_parent:
                                    SE ASIGNA COMO DIMENSIÓN EL TAMAÑO COMPLETO DEL ELEMENTO PADRE.
                         
                            * wrap_content:
                                    SE UTILIZA PARA INDICAR QUE LA DIMENSIÓN DEL ELEMENTO SE AJUSTA AL CONTENIDO DEL MISMO.
            
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

                    LA DISTRIBUCIÓN DE ELEMENTOS RelativeLayout PERMITE COLOCAR LOS ELEMENTOS DE MANERA RELATIVA
                    AL ELEMENTO CONTENEDOR PADRE. 
                    ESTE LAYOUT ES EL QUE PERMITE MAYOR LIBERTAD EN CUANTO A LA DISTRIBUCIÓN DE LOS ELEMENTOS.
                         
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
                         
                    EN LA DISTRIBUCIÓN DE TIPO TableLayout,
                    LOS ELEMENTOS QUEDAN DISTRIBUIDOS EN FORMA DE TABLA,
                    POR LO QUE SE INDICARÁN LAS FILAS Y LAS COLUMNAS QUE LO COMPONEN.
                    LAS FILAS PARA SER DEFINIDAS UTILIZAN UN OBJETO DE TIPO  -->  TableRow.
                         
                    SE TRATA DE UNA DE LAS DISTRIBUCIONES MÁS UTILIZADAS,
                    PUESTO QUE DE UNA FORMA RELATIVAMENTE SENCILLA 
                    PERMITE REALIZAR UNA DISTRIBUCIÓN DE LOS ELEMENTOS DE LA APLICACIÓN
                    QUE FACILITA LA NAVEGACIÓN DEL USUARIO POR LA INTERFAZ.
                         
                    POR EJEMPLO,
                    EN EL CÓDIGO DE CREACIÓN DE ESTE TIPO DE DISTRIBUCIÓN QUE SE MUESTRA A CONTINUACIÓN,
                    SE ESTARÍA CREANDO UNA TABLA CON TRES FILAS:
                         
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
                         
                    LA DISTRIBUCIÓN GridLayout CREA UNA REJILLA FORMADA POR UN CONJUNTO DE LÍNEAS VERTICALES Y HORIZONTALES
                    EN CUYOS 'HUECOS' SE COLOCARÁN LOS ELEMENTOS.
                    LA POSICIÓN DE INSERCIÓN QUEDA REFERENCIADA A TRAVÉS DE UN ÍNDICE.
                         
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
                         
                    LA DISTRIBUCIÓN LinearLayout PERMITE ALINEAR LOS ELEMENTOS UNO TRAS OTRO
                    EN UNA DIRECCIÓN CONCRETA (VERTICAL U HORIZONTAL).
                    LAS DIMENSIONES DE CADA UNO DE LOS ELEMENTOS SERÁN DETERMINADAS 
                    UTILIZANDO LAS PROPIEDADES DESTINADAS A TAL FIN (layout_height Y layout_width).
                    
                    EN EL MENÚ Layouts,
                    ES POSIBLE ENCONTRAR DOS ELEMENTOS DE TIPO lineal,
                    EL PRIMERO DE TIPO HORIZONTAL,
                    Y OTRO DE TIPO VERTICAL
                    DONDE LA DISTRIBUCIÓN SE HACE EN FORMA DE FILAS.
                         
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
                      
                    UNA HERRAMIENTA CLAVE PARA LA PROGRAMACIÓN Y PERSONALIZACIÓN DE CUALQUIER APLICACIÓN DE DESARROLLO
                    PARA UN DISPOSITIVO MÓVIL COMO Android ES AppBarLayout.
                         
                    AL CREAR UN NUEVO PROYECTO,
                    UNA DE LAS PLANTILLAS EXISTENTES PERMITE CREAR UN PROYECTO CON UNA AppBarLayout INCLUIDA.
                         
                    SE TRATA DE UNA BARRA QUE SE ENCUENTRA NORMALMENTE EN LA PARTE SUPERIOR DE LAS APLICACIONES EN Android,
                    Y QUE SUELE CONTENER ELEMENTOS TALES COMO:
                            - EL NOMBRE DE LA PLICACIÓN.
                            - EL ACCESO A LA CONFIGURACIÓN, REPRESENTADO CON TRES PUNTOS VERTICALES.
                            - UNA CAJA DE BUSQUEDA.
                            - ETC.
                         
                    CUANDO SE DESEA INSERTAR ELEMENTOS DE TIPO Widgets 
                    LA ETIQUETA INICIAL DE INSERCIÓN SERÁ DISTINTA
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
                    SE PIDE IMPLEMENTAR UNA PANTALLA DE APLICACIÓN QUE CONTENGA UN MAPA DE ACTIVIDAD DE GOOGLE MAPS,
                    INDICANDO EL CÓDIGO NECESARIO EN XML PARA EL DESARROLLO DE LA MISMA.
                         
                    AL CREAR UN NUEVO PROYECTO,
                    UNA DE LAS PLANTILLAS EXISTENTES PERMITE CREAR UNA VERSIÓN PREVIA DE ESTE TIPO DE ACCIONES DE FORMA DIRECTA.
                         
                    PERO SI QUEREMOS CREARLO DESDE CERO, ES DECIR, EN UN DOCUMENTO EN BLANCO,
                    DEBEMOS TENER CLARO QUE EL COMPONENTE ESENCIAL SERÁ MapView,
                    QUE ESTÁ SITUADO EN LA CARPETA DE LA PALETA LLAMADA Google.
                         
                    EL CÓDIGO QUE PERMITE CREAR UNA PANTALLA PARA INCORPORAR ELEMENTOS
                    DE ACTIVIDAD A TRAVÉS DE Google Maps ES EL SIGUIENTE:
                         
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
                      
                    EL USO DE VENTANAS EMERGENTES EN EL DESARROLLO DE INTERFACES MÓVILES
                    PUEDE RESULTAR UN ELEMENTO ESENCIAL PARA MANTENER UNA COMUNICACIÓN ACTIVA CON LOS USUARIOS,
                    Y, POR TANTO, MEJORAR LA INTERACCIÓN Y AUMENTAR EL NIVEL DE SATISFACCIÓN DE LOS CLIENTES DE UNA APLICACIÓN.
                         
                    POR ESTA RAZÓN, EN ESTE CASO PRÁCTICO,
                    SE PIDE DISEÑAR EL CÓDIGO ANDROID NECESARIO PARA PRODUCIR UNA VENTANA EMERGENTE DE ESTE TIPO.
                         
                    EL CUADRO DE DIÁLOGO MOSTRARÁ DOS OPCIONES YES O NO.
                         
                    EL RESULTADO FINAL DE IMPLEMENTAR EL CÓDIGO
                    ES UNA INTERFAZ EN LA QUE APARECE UN CUADRO DE DIÁLOGO:
                         
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
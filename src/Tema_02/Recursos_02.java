package Tema_02;

import static Principal_Main.Main.*;
import static Tema_02.T_02.*;

/**
 *
 * @author Juan José Estévez González
 */

public class Recursos_02 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_02 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                        EXPLOTACIÓN DEL ÁREA DE DISEÑO. 
                       
            - ZONA DE DISEÑO:
                    - SOBRE LA QUE SE SITUAN LOS COMPONENTES DE LA INTERFAZ.
                       
            - PALETTE:
                    - SE ENCUENTRAN TODOS LOS ELEMENTOS PARA IMPLEMENTAR LA INTERFAZ.
                       
            - COMPONENTS:
                    - MAPA DE NAVEGACIÓN QUE MUESTRA UN RESUMEN DE TODOS LOS ELEMENTOS.
                       
            - PROPIEDADES:
                    - MUESTRA TODAS LAS PROPIEDADES DEL ELEMENTO SELECCIONADO.
                       
            - INSERTAR ELEMENTO:
                    - EN LA PALETA DE COMPONENTES, SE PINCHA SOBRE EL ELEMENTO Y SE ARRASTRA HASTA LA ZONA DE DISEÑO.
                       
            - ELIMINAR ELEMENTOS:
                    - DESPUÉS DE SELECCIONARLO PULSAR CON EL BOTÓN DERECHO Y SELECCIONAR BORRAR, DELETE.
               
                                       
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
                                            CLASES, PROPIEDADES Y MÉTODOS EN POO.
                       
            - CLASES:
                UNA CLASE REPRESENTA UN CONJUNTO DE OBJETOS QUE SE COMPARTEN UNA MISMA ESTRUCTURA 'ATRIBUTOS'
                Y COMPORTAMIENTO ' MÉTODOS'.
                A PARTIR DE UNA CLASE SE PODRÁN INSTANCIAR TANTOS OBJETOS COMO SE QUIERAN. SE UTILIZAN CONSTRUCTORES.
                       
            - LOS CONSTRUCTORES:
                    DEBEN DECLARARSE COMO PÚBLICOS.
                    SON LOS ENCARGADOS DE INICIALIZAR LOS OBJETOS DE LA CLASE.
                    LOS CONSTRUCTORES SE LLAMAN IGUAL QUE LA CLASE.
                    LOS CONSTRUCTORES NO DEVOLVERÁN NINGÚN TIPO DE DATO.
                    A LOS CONSTRUCTORES SE LES LLAMA CON EL OPERADOR new.
                    PUEDEN RECIBIR O NO ARGUMENTOS.
                    EL CONSTRUCTOR POR DEFECTO NO RECIBE NINGÚN PARÁMETRO.
                       
            - MÉTODOS:
                    DEFINEN EL COMPORTAMIENTO DE UN OBJETO.
                    TODA ACCIÓN QUE SE QUIERA REALIZAR CON UN OBJETO TIENE QUE ESTAR DEFINIDA EN UN MÉTODO.
                    PUEDEN RECIBIR O NO ARGUMENTOS.
                    PODRÁN DEVOLVER ALGÚN VALOR.
                    PODRÁN MODIFICAR LOS ATRIBUTOS DE LA CLASE.
                       
            - ATRIBUTOS:
                    LOS ATRIBUTOS SON SIEMPRE PRIVADOS.  
                    SON LAS PROPIEDADES INDIVIDUALES DE LOS OBJETOS.
                    LOS ATRIBUTOS DEFINEN LAS CARACTERÍSTICAS DEL OBJETO.
                    SE PODRÁN MODIFICAR A TRAVÉS DE MÉTODOS CREADOS PARA ELLO.
                                       
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
                                            JFRAME Y JPANEL.
                       
            - UNA DE LAS CLASES MÁS IMPORTANTES DEL PAQUETE SWING ES:  -->  JFrame
                                             
                    JFrame SE ENCARGA DE CREAR LAS VENTANAS SOBRE LAS QUE SE DISEÑAN EL RESTO DE ELEMENTOS.
                    EL USO DE JFrame CONLLEVARÁ LA APARICIÓN DE LA VISTA DE DISEÑO:  -->  Desing.

                    DENTRO DE UN JFrame PODREMOS ENCONTRAR MÚLTIPLES JPanel:
                       
                            JFrame   -->  DEFINE UNA VENTANA COMPLETA.            (FOTOGRAMA)
                            JPanel   -->  ES SOLO UN CONTENEDOR DE COMPONENTES.   (PANEL)

                            USAREMOS JFrame  -->  PANTALLA PRINCIPAL DE UNA APLICACIÓN.
                            USAREMOS JDialog -->  PANTALLAS SECUNDÁRIAS.

                    PARA INSTANCIAR UN JFrame TENEMOS VÁRIOS CONSTRUCTORES:
                               POR DEFECTO COMO      jframe()
                               CON PARÁMETROS COMO   jframe(String nombreVentana)

                    OTROS MÉTODOS ESTABLECEN LAS DIMENSIONES DE LA VENTANA Y SU VISIVILIDAD.
                       
            - OTRA DE LAS CLASES MÁS IMPORTANTES DEL PAQUETE SWING ES:  -->  JPanel
                                       
                    ES UN BLOQUE 'INVISIBLE' QUE SE SITÚA SOBRE UNA VENTANA.
                    ES UN CONTENEDOR DE COMPONENTES SOBRE EL QUE VAMOS A UBICAR TODOS LOS ELEMENTOS.
                    GRACIAS A LOS PANELES PODEMOS TENER MÁS ORGANIZADA LA INTERFAZ GRÁFICA.
                    LA DISTRIBUCIÓN DE ESTOS PANELES CONSTITUYE UN SISTEMA DE CAPAS O LAYOUT.
                       
            -> DESDE File -> NEW -> OTHER -> JPanel (DENTRO DE WINDOWSBUILDER Y SWING DESIGNER) -> NEXT.
                       
                       //Crea un JPanel
                       JPanel panelSecundario = new JPanel();
                       //Se coloca dentro de otro JPanel principal
                       panel.add(panelPpal);
                       //Crea una etiqueta 
                       JLabel jlabel1 = new JLabel(?hola?);
                       //La coloca dentro del JPanel secundario
                       panelSecundario.add(jlabel1);
                       
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
                                                     JDIALOG.
                       
            LAS APLICACIONES QUE SOLO UTILICEN UNA PANTALLA IMPLEMENTARÁN SU INTERFÁZSOLO CON UN ELEMENTO  -->  JFrame.
            LAS APLICACIONES QUE UTILICEN MÁS DE UNA VENTANA USARÁN: 
                       
                                USAREMOS JFrame  -->  PANTALLA PRINCIPAL DE UNA APLICACIÓN.
                                USAREMOS JDialog -->  PANTALLAS SECUNDÁRIAS.
                       
                JDialog PERMITE TENER UN ELEMENTO PADRE. 
                PERMITE TENER UN ELEMENTO PRINCIPAL A PARTIR DEL CUAL SE ACCEDE A LA VENTANA SECUNDARIA JDialog.
                LAS VENTANAS JDialog SIEMPRE QUEDARÁN SITUADAS POR ENCIMA DE SUS PADRES, YA SEAN DE TIPO  --> JDialog O JFrame.
                       
            - JDialog MODALES Y NO MODALES:
                       
                    - LOS DIÁLOGOS MODALES SON AQUELLOS QUE NO PERMITEN QUE OTRAS VENTANAS DE DIÁLOGO SE ABRAN 
                      HASTA QUE LA QUE SE ENCUENTRA ABIERTA SE HAYA CERRADO.
                      JDialog ventanaSec = new JDialog(f, "Dialog", true); 

                    - LOS DIÁLOGOS NO MODALES SON AQUELLOS QUE PERMITEN QUE HAYA TANTOS JDialog ABIERTOS COMO SE DESEE.
                      JDialog ventanaSec = new JDialog(f, "Dialog", false); 
                    
            -> DESDE File -> NEW -> OTHER -> JDialog (DENTRO DE WINDOWSBUILDER Y SWING DESIGNER) -> NEXT.
                       
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
                                            CONEXIÓN ENTRE VENTANAS. EVENTOS.
               
            - PRIMERO TENEMOS QUE CREAR TODAS LAS VENTANAS, Y SUS BOTONES, INVOLUCRADAS EN LA CONEXIÓN.
              EL PASO DE UNA VENTANA A OTRA SE PRODUCE TRAS LA OCURRENCIA DE UN EVENTO. (PULSACIÓN DE UN BOTÓN).
                       
              HACIEND DOBLE CLIC SOBRE EL BOTÓN SE GENERARA EL CÓDIGO DEL EVENTO ESCUCHADOR ASOCIADO.
              DENTRO PONDREMOS LA INSTANCIACIÓN DE LA NUEVA VENTANA.
              PENDREMOS QUE PONER LAS VENTANAS VISIBLES CON     -->  ___.setVisible(true);
              PARA HACER QUE SE CIERRE LA VENTANA PRINCIPAL Y MANTIENE ABIERTA LA SECUNDARIA  -->  dispose();
                       
                    JButton btnNewButton = new JButton(?Púlsame?);
                    btnNewButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                        }
                    });
                    panel.add(btnNewButton);
                                       
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
                                                           COMPONENTES.
               
            EXISTE UN GRAN NÚMERO DE COMPONENTES.
            SON LOS ELEMENTOS QUE SE SITÚAN EN LA VENTANA, DIRECTAMENTE SOBRE EL JFrame, JDialog O JPanel.
            ALGUNAS PROPIEDADES TIENEN EL MISMO NOMBRE, PERO REALIZAN FUNCIONES DISTINTAS SEGÚN EL ELEMENTO AL QUE SE APLIQUE.
                       
            - JButon:
                    NECESITA: -->  import javax.swing E import java.awt.event
                    PERMITE CREAR UN OBJETODE TIPO BOTÓN DENTRO DE LA INTERFAZ GRÁFICA EN JAVA.
                       
                        background            -> EL COLOR DE FONDO DEL BOTÓN. SE MUESTRA SOLO SI ES OPACO.
                        enabled               -> true/false DETERMINA SI EL BOTÓN ESTÁ ACTIVO.
                        font                  -> FUENTE DEL TIPO DE LETRA.
                        foreground            -> COLOR DEL TEXTO.
                        horizontalAlignment   -> ALINEACIÓN HORIZONTAL DEL TEXTO CON RESPECTO AL BOTÓN.
                        verticalAlignment     -> ALINEACIÓN VERTICAL DEL TEXTO CON RESPECTO AL BOTÓN.
                        text                  -> TEXTO QUE APARECE DENTRO DEL BOTÓN.
                        icon                  -> CARGA IMAGEN COMO FONDO DEL BOTÓN.
                       
                                JButton btnNewButton = new JButton(?Pulsa aquí?);
                                panel.add(btnNewButton);
                                btnNewButton.setFont(new Font(?Kohinoor Telugu?, Font.
                                BOLD, 13));
                                btnNewButton.setForeground(Color.RED);
                       
            - JLabel:
                    ES UN ELEMENTO CONTENEDOR DE TEXTO, IMÁGENES O ICONOS.

                        background            -> EL COLOR DE LA ETIQUETA SI ESTÁ DESHABILITADA.
                        enabled               -> HABILITA LA ETIQUETA.
                        font                  -> FUENTE DEL TIPO DE LETRA Y TAMAÑO.
                        foreground            -> COLOR DEL TEXTO SI LA ETIQUETA ESTÁ HABILITADA.
                        horizontalAlignment   -> ALINEACIÓN HORIZONTAL DEL TEXTO CON RESPECTO A LA CAJA DE LA ETIQUETA.
                        verticalAlignment     -> ALINEACIÓN VERTICAL DEL TEXTO CON RESPECTO A LA CAJA DE LA ETIQUETA.
                        text                  -> TEXTO QUE APARECE DENTRO DE LA ETIQUETA.
                        icon                  -> PERMITA CARGA UNA IMAGEN.
                       
            - JTextField:
                    SE UTILIZA COMO CONTENEDOR DE UNA LÍNEA DE TEXTO,
                    EL TAMAÑO QUEDA DEFINIDO POE EL VALOR DEL ATRIBUTO   --->   'columns'
                    NO SE TRATA DE UN VALOR EXACTO EN CUANTO A NÚMERO DE CARACTERES,
                    SINO QUE ESTÁ DEFINIENDO SU ANCHO,
                    EN FUNCUIÓN DEL CARÁCTER QUE SE ESCRIBA LA CAPACIDAD VARIARÁ.
                       
                        background            -> EL COLOR DE FONDO DE LA CAJA DE TEXTO.
                        columns               -> TAMAÑO DE LA CAJA DE TEXTO.
                        enabled               -> HABILITA EL CAMPO DE TEXTO.
                        editable              -> PERMITE AL USUARIO MODIFICAR EL CONTENIDO.
                        font                  -> FUENTE DEL TIPO DE LETRA Y TAMAÑO.
                        foreground            -> COLOR DEL TEXTO.
                        thorizontalAlignment  -> ALINEACIÓN HORIZONTAL DEL TEXTO.
                        text                  -> TEXTO QUE APARECE AL INICIO EN LA CAJA.
                       
            - JCheckBox: (CASILLA O CHECKBOX)
                    SON ELEMENTOS QUE SE PRESENTAN JUNTO A UNA PEQUEÑA CAJA CUADRADA
                    Y QUE PUEDEN SER MARCADOS POR EL USUARIO.
                    PRESENTAN UNAS PROPIEDADES SIMILARES A LOS CASOS ANTERIORES,
                    AÑADIENDO ALGUNOS NUEVOS ATRIBUTOS COMO   --->   'selected'
                    EL CUÁL PUEDE SER DE VALOR                --->   'true'  O  'false'.
                    EL PRIMERO INDICARÁ QUE LA CASILLA SE MUESTRE MARCADA POR DEFECTO Y SI ES 'false', APARECERÁ SIN MARCAR.
                       
            - JRadioButton:
                    SE UTILIZAN HABITUALMENTE EN EL DESARROLLO DE INTERFACES PARA INDICAR VARIAS OPCIONES,
                    DE LAS QUE SOLO SE PODRÁ ESCOGER UNA, LAS OPCIONES RESULTARÁN EXCLUYENTES.
                    LAS PROPIEDADES SON IGUALES A LA DEL ELEMENTO 'JCheckBox'.
                    CUANDO INSERTAMOS UN ELEMENTO EN UNA INTERFAZ SU FUNCIONAMIENTO ES MUY PARECIDO AL ELEMENTO DE TIPO 'check'.
                    PARA CONSEGUIR UN COMPORTAMIENTO EXCLUYENTE ES NECESARIO UTILIZAR UN OBJETO TIPO --> 'ButtonGroup'.
                    LA CREACIÓN DE UN ELEMENTO 'ButtonGroup' NOS PERMITE ASOCIAR A ESTE GRUPO TANTOS ELEMENTOS COMO SE DESEEN.
                    TODOS AQUELLOS QUE QUEDEN AGRUPADOS RESULTARÁN EXCLUYENTES ENTRE SÍ.
                       
                            public holaMundo() {
                            //Se define el comportamiento de la ventana  
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            setBounds(100, 100, 450, 300);
                            //Creación de JRadioButton y se ubican 
                            JRadioButton r1 = new JRadioButton(?Opción 1?);
                            getContentPane().add(r1, BorderLayout.NORTH);
                            JRadioButton r2 = new JRadioButton(?Opción 2?);
                            getContentPane().add(r2, BorderLayout.WEST);
                            JRadioButton r3 = new JRadioButton(?Opción 3?);
                            getContentPane().add(r3, BorderLayout.SOUTH);
                            //Se agrupan los JRadioButton creados  
                            ButtonGroup bg=new ButtonGroup();
                            bg.add(r1);
                            bg.add(r2);
                            bg.add(r3);
                            }
                       
            - JComboBox: (MENÚS DESPLEGABLES)
                    PRESENTA UNAS PROPIEDADES MUY PARECIDAS AL RESTO DE COMPONENTES DESCRITOS.
                    PARA INSERTAR LOS VALORES QUE SE MOSTRARÁN EN EL COMBO UTILIZANDO LA VISTA DE DISEÑO:
                    PROPIEDADES --> MODEL --> SE ABRIRÁ UNA VENTANA EN LA QUE SE ESCRIBEN LOS VALORES DEL COMBO.
                       
                    maximumRowCount  --->  ESTABLECE EL VALOR MÁXIMO DE ELEMENTOS MOSTRADOS.
                    selectedIndex    --->  PERMITE INDICAR CUÁL ES EL VALOR QUE MOSTRARÍA POR DEFECTO DE ENTRE TODOS,
                                           SIENDO 0 LA PRIMERA POSICIÓN.                    
                                       
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
                                                         LAYOUT MANAGER.
                       
            LAYOUT MANAGER --> MANEJADOR DE COMPOSICIÓN.
                PERMITE ADAPTAR LA DISTRIBUCIÓN DE LOS COMPONENTES SOBRE UN CONTENEDOR.
                SON LOS ENCARGADOS DE COLOCAR LOS COMPONENTES DE UNA INTERFAZ DE USUARIO
                EN EL PUNTO DESEADO Y CON EL TAMAÑO PRECISO.
                
                - FLOW LAYOUT:
                        SITÚA LOS ELEMENTOS UNO AL LADO DEL OTRO, EN UNA MISMA FILA.
                        PERMITE DAR VALOR AL TIPO DE ALINEACIÓN   --->   setAlignment(int VALOR)
                        ASÍ COMO LA DISTANCIA DE SEPARACIÓN QUE QUEDA ENTRE LOS ELEMENTOS (vgap y hgap):
                                - setVgap(int VALOR)   --->   EN VERTICAL.
                                - setHgap(int VALOR)   --->   EN HORIZONTAL.
                       
                - GRID LAYOUT:
                        PERMITE COLOCAR LOS COMPONENTES DE UNA INTERFAZ SIGUIENDO UN PATRÓN DE COLUMNAS Y FILAS,
                        SIMULANDO UNA REJILLA.
                        AL IGUAL QUE EN EL CASO ANTERIOR, ES POSIBLE MODIFICAR EL VALOR DE LA SEPARACIÓN ENTRE COMPONENTES.
                        LAS PROPIEDADES DE ESTE ELEMENTO INCORPORAN:
                                - column   --->   NÚMERO DE COLUMNAS.
                                - row      --->   NÚMERO DE FILAS.
                        PARA LA CREACIÓN DE ESTE SISTEMA DE REJILLA,
                        SE UTILIZA UN CONSTRUCTOR QUE NECESITA RECIBIR EL VALOR EXACTO
                        DE FILAS Y DE COLUMNAS QUE TENDRÍA LA INTERFAZ:     --->   GridLayout(int numFilas, int numCol)
                        ASÍ COMO LA DISTANCIA DE SEPARACIÓN QUE QUEDA ENTRE LOS ELEMENTOS (vgap y hgap):
                                - setVgap(int VALOR)   --->   EN VERTICAL.
                                - setHgap(int VALOR)   --->   EN HORIZONTAL.
                       
                - BORDER LAYOUT:
                        ES EL LAYOUT POR DEFECTO AL CREAR LAS VENTANAS.
                        PERMITE COLOCAR LOS ELEMENTOS EN LOS EXTREMOS DEL PANEL CONTENEDOR Y EN EL CENTRO.
                        PARA SITUAR A CADA UNO DE LOS ELEMENTOS DESDE LA VISTA DE DISEÑO BASTA
                        CON COLOCARLOS EN LA POSICIÓN DESEADA.
                       
                                          ************************************
                                          *              NORTH               *
                                          *                                  *
                                          *    WEST      CENTER      EAST    *
                                          *                                  *
                                          *              SOUTH               *
                                          ************************************
                       
                        public interfazBorderLayout() {
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            setBounds(100, 100, 450, 300);
                            getContentPane().setLayout(new BorderLayout(10, 5));
                            JButton btnNewButton = new JButton(?WEST?);
                            getContentPane().add(btnNewButton, BorderLayout.WEST);

                            JButton btnNewButton_1 = new JButton(?NORTH?);
                            getContentPane().add(btnNewButton_1, BorderLayout.NORTH);

                            JButton btnNewButton_2 = new JButton(?EAST?);
                            getContentPane().add(btnNewButton_2, BorderLayout.EAST);

                            JButton btnNewButton_3 = new JButton(?SOUTH?);
                            getContentPane().add(btnNewButton_3, BorderLayout.SOUTH);

                            JButton btnNewButton_4 = new JButton(?CENTER?);
                            getContentPane().add(btnNewButton_4, BorderLayout.CENTER);
                           }
                       
                - GRIDBAG LAYOUT:
                        A DIFERENCIA DEL TIPO GRID LAYOUT, ESTE PERMITE UN DISEÑO MÁS FLEXIBLE,
                        DONDE CADA UNO DE LOS COMPONENTES QUE SE COLOQUEN TENDRÁN ASOCIADO UN OBJETO TIPO 'GridBagConstraints'.
                        SERÁ POSIBLE UBICAR EL ELEMENTO DE UNA FORMA MÁS PRECISA,
                        SELECCIONANDO LA POSICIÓN EXACTA DE LA REJILLA.
                                      
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
                                                       ESQUEMA RESUMEN.
                       
                        ***********************************************************************************
                        *                                                                                 *
                        * JFrame  --> DEFINIR LA VENTANA PRINCIPAL DE LA INTERFAZ.                        *
                        * JPanel  --> LIENZO SOBRE EL JFrame PARA COLOCOR TODOS LOS ELEMENTOS.            *
                        * JDialog --> PANTALLAS SECUNDARIAS.  CON DOS BOTONES. (OK) Y (CANCEL).           *
                        *                                                                                 *
                        *  ENLAZAR VENTANAS:   1º  CREAR PREVIAMENTE Ventana1 Y Ventana2                  *
                        *                      2º  DOBLE CLICK SOBRE EL BOTÓN DE Ventana1                 *
                        *                      3º  DENTRO DEL actionPerformed()                           *
                        *      INSTANCIAMOS V2 -->           Ventana2 vent = new Ventana2();              *
                        *      MOSTRAMOS V2    -->           vent.setVisible(true);                       *
                        *      CERRAMOS  V1    -->           dispose();                                   *
                        *                                                                                 *
                        * COMPONENTES:                                                                    *
                        *            - JButton        --> BOTÓN                                           *
                        *            - JLabel         --> CONTENEDOR DE TEXTO, ICONOS E IMÁGENES.         *
                        *            - JTextField     --> UNA LÍNEA DE TEXTO. (A RELLENAR POR EL USUARIO) *
                        *            - JTextArea      --> LÍNEAS DE TEXTO.    (A RELLENAR POR EL USUARIO) *
                        *            - JPassWordField --> PARA INTRODUCIR CONTRASEÑA.                     *
                        *            - JCheckBox      --> CASILLA CUADRADA PARA MARCAR.                   *
                        *            - JRadioButton   --> CASILLA REDONDA PARA MARCAR.                    *
                        *            - ButtonGroup    --> GRUPO DE CASILLAS REDONDAS PARA MARCAR UNA.     *
                        *            - JComboBox      --> MENÚS DESPLEGABLES.                             *
                        *            - JSpinner       --> CAJA CON DOS FLECAS PARA MODIFICAR VALORES.     *
                        *                                                                                 *
                        *            - Flow Layout    --> EN UNA MISMA FILA.                              *
                        *            - Grid Layout    --> PATRÓN MATRIZ (int numFilas, int numCol)        *
                        *            - Border Layout  --> EXTREMOS (NORT-SOUTH-EAST-WEST-CENTER)          *
                        *            - GridBag Layout --> Grid Layout CON POSICIONAMIENTO DE ELEMENTOS.   *
                        *                                                                                 *
                        * INICIO DE SECIÓN POR USUARIO Y CONTRASEÑA:                                      *
                        *                      1º  CREAR PREVIAMENTE VentControl Y VentPortal             *
                        *                      2º  DOBLE CLICK SOBRE EL BOTÓN (Inicio) DE VentControl     *
                        *                      3º  DENTRO DEL actionPerformed()                           *
                        *    String user,pwd;                                                             *
                        *    user = textUsuario.getText();                                                *
                        *    pwd = String.copyValueOf(textContrasena.getPassword());                      *
                        *    if(user.contentEquals("Juan") && pwd.equals("polako")) {                     *
                        *            Fotograma acceso = new Fotograma();                                  *
                        *            acceso.setVisible(true);                                             *
                        *            dispose();                                                           *
                        *    } else {                                                                     *
                        *            JOptionPane.showInternalMessageDialog                                *
                        *            (null, "EL USUARIO O CONTRASEÑA ES INCORRECTO");                     *
                        *    }                                                                            *
                        *                                                                                 *
                        ***********************************************************************************
                                       
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
                case "9" -> {
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
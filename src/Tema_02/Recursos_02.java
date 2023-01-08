package Tema_02;

import static Principal_Main.Main.*;
import static Tema_02.T_02.*;

/**
 *
 * @author Juan Jos� Est�vez Gonz�lez
 */

public class Recursos_02 {
    
    private static String titulo = Principal_Main.Main.asignatura + Principal_Main.Main.tema_02 ;
    
    private static String recurso_01 = """                          
                               
        ************************************************************************************************************************
        """ + titulo + """
        ************************************************************************************************************************
        """ + punto_01 + """
        **********************************************************************************************************************************
                                        EXPLOTACI�N DEL �REA DE DISE�O. 
                       
            - ZONA DE DISE�O:
                    - SOBRE LA QUE SE SITUAN LOS COMPONENTES DE LA INTERFAZ.
                       
            - PALETTE:
                    - SE ENCUENTRAN TODOS LOS ELEMENTOS PARA IMPLEMENTAR LA INTERFAZ.
                       
            - COMPONENTS:
                    - MAPA DE NAVEGACI�N QUE MUESTRA UN RESUMEN DE TODOS LOS ELEMENTOS.
                       
            - PROPIEDADES:
                    - MUESTRA TODAS LAS PROPIEDADES DEL ELEMENTO SELECCIONADO.
                       
            - INSERTAR ELEMENTO:
                    - EN LA PALETA DE COMPONENTES, SE PINCHA SOBRE EL ELEMENTO Y SE ARRASTRA HASTA LA ZONA DE DISE�O.
                       
            - ELIMINAR ELEMENTOS:
                    - DESPU�S DE SELECCIONARLO PULSAR CON EL BOT�N DERECHO Y SELECCIONAR BORRAR, DELETE.
               
                                       
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
                                            CLASES, PROPIEDADES Y M�TODOS EN POO.
                       
            - CLASES:
                UNA CLASE REPRESENTA UN CONJUNTO DE OBJETOS QUE SE COMPARTEN UNA MISMA ESTRUCTURA 'ATRIBUTOS'
                Y COMPORTAMIENTO ' M�TODOS'.
                A PARTIR DE UNA CLASE SE PODR�N INSTANCIAR TANTOS OBJETOS COMO SE QUIERAN. SE UTILIZAN CONSTRUCTORES.
                       
            - LOS CONSTRUCTORES:
                    DEBEN DECLARARSE COMO P�BLICOS.
                    SON LOS ENCARGADOS DE INICIALIZAR LOS OBJETOS DE LA CLASE.
                    LOS CONSTRUCTORES SE LLAMAN IGUAL QUE LA CLASE.
                    LOS CONSTRUCTORES NO DEVOLVER�N NING�N TIPO DE DATO.
                    A LOS CONSTRUCTORES SE LES LLAMA CON EL OPERADOR new.
                    PUEDEN RECIBIR O NO ARGUMENTOS.
                    EL CONSTRUCTOR POR DEFECTO NO RECIBE NING�N PAR�METRO.
                       
            - M�TODOS:
                    DEFINEN EL COMPORTAMIENTO DE UN OBJETO.
                    TODA ACCI�N QUE SE QUIERA REALIZAR CON UN OBJETO TIENE QUE ESTAR DEFINIDA EN UN M�TODO.
                    PUEDEN RECIBIR O NO ARGUMENTOS.
                    PODR�N DEVOLVER ALG�N VALOR.
                    PODR�N MODIFICAR LOS ATRIBUTOS DE LA CLASE.
                       
            - ATRIBUTOS:
                    LOS ATRIBUTOS SON SIEMPRE PRIVADOS.  
                    SON LAS PROPIEDADES INDIVIDUALES DE LOS OBJETOS.
                    LOS ATRIBUTOS DEFINEN LAS CARACTER�STICAS DEL OBJETO.
                    SE PODR�N MODIFICAR A TRAV�S DE M�TODOS CREADOS PARA ELLO.
                                       
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
                       
            - UNA DE LAS CLASES M�S IMPORTANTES DEL PAQUETE SWING ES:  -->  JFrame
                                             
                    JFrame SE ENCARGA DE CREAR LAS VENTANAS SOBRE LAS QUE SE DISE�AN EL RESTO DE ELEMENTOS.
                    EL USO DE JFrame CONLLEVAR� LA APARICI�N DE LA VISTA DE DISE�O:  -->  Desing.

                    DENTRO DE UN JFrame PODREMOS ENCONTRAR M�LTIPLES JPanel:
                       
                            JFrame   -->  DEFINE UNA VENTANA COMPLETA.            (FOTOGRAMA)
                            JPanel   -->  ES SOLO UN CONTENEDOR DE COMPONENTES.   (PANEL)

                            USAREMOS JFrame  -->  PANTALLA PRINCIPAL DE UNA APLICACI�N.
                            USAREMOS JDialog -->  PANTALLAS SECUND�RIAS.

                    PARA INSTANCIAR UN JFrame TENEMOS V�RIOS CONSTRUCTORES:
                               POR DEFECTO COMO      jframe()
                               CON PAR�METROS COMO   jframe(String nombreVentana)

                    OTROS M�TODOS ESTABLECEN LAS DIMENSIONES DE LA VENTANA Y SU VISIVILIDAD.
                       
            - OTRA DE LAS CLASES M�S IMPORTANTES DEL PAQUETE SWING ES:  -->  JPanel
                                       
                    ES UN BLOQUE 'INVISIBLE' QUE SE SIT�A SOBRE UNA VENTANA.
                    ES UN CONTENEDOR DE COMPONENTES SOBRE EL QUE VAMOS A UBICAR TODOS LOS ELEMENTOS.
                    GRACIAS A LOS PANELES PODEMOS TENER M�S ORGANIZADA LA INTERFAZ GR�FICA.
                    LA DISTRIBUCI�N DE ESTOS PANELES CONSTITUYE UN SISTEMA DE CAPAS O LAYOUT.
                       
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
                       
            LAS APLICACIONES QUE SOLO UTILICEN UNA PANTALLA IMPLEMENTAR�N SU INTERF�ZSOLO CON UN ELEMENTO  -->  JFrame.
            LAS APLICACIONES QUE UTILICEN M�S DE UNA VENTANA USAR�N: 
                       
                                USAREMOS JFrame  -->  PANTALLA PRINCIPAL DE UNA APLICACI�N.
                                USAREMOS JDialog -->  PANTALLAS SECUND�RIAS.
                       
                JDialog PERMITE TENER UN ELEMENTO PADRE. 
                PERMITE TENER UN ELEMENTO PRINCIPAL A PARTIR DEL CUAL SE ACCEDE A LA VENTANA SECUNDARIA JDialog.
                LAS VENTANAS JDialog SIEMPRE QUEDAR�N SITUADAS POR ENCIMA DE SUS PADRES, YA SEAN DE TIPO  --> JDialog O JFrame.
                       
            - JDialog MODALES Y NO MODALES:
                       
                    - LOS DI�LOGOS MODALES SON AQUELLOS QUE NO PERMITEN QUE OTRAS VENTANAS DE DI�LOGO SE ABRAN 
                      HASTA QUE LA QUE SE ENCUENTRA ABIERTA SE HAYA CERRADO.
                      JDialog ventanaSec = new JDialog(f, "Dialog", true); 

                    - LOS DI�LOGOS NO MODALES SON AQUELLOS QUE PERMITEN QUE HAYA TANTOS JDialog ABIERTOS COMO SE DESEE.
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
                                            CONEXI�N ENTRE VENTANAS. EVENTOS.
               
            - PRIMERO TENEMOS QUE CREAR TODAS LAS VENTANAS, Y SUS BOTONES, INVOLUCRADAS EN LA CONEXI�N.
              EL PASO DE UNA VENTANA A OTRA SE PRODUCE TRAS LA OCURRENCIA DE UN EVENTO. (PULSACI�N DE UN BOT�N).
                       
              HACIEND DOBLE CLIC SOBRE EL BOT�N SE GENERARA EL C�DIGO DEL EVENTO ESCUCHADOR ASOCIADO.
              DENTRO PONDREMOS LA INSTANCIACI�N DE LA NUEVA VENTANA.
              PENDREMOS QUE PONER LAS VENTANAS VISIBLES CON     -->  ___.setVisible(true);
              PARA HACER QUE SE CIERRE LA VENTANA PRINCIPAL Y MANTIENE ABIERTA LA SECUNDARIA  -->  dispose();
                       
                    JButton btnNewButton = new JButton(?P�lsame?);
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
               
            EXISTE UN GRAN N�MERO DE COMPONENTES.
            SON LOS ELEMENTOS QUE SE SIT�AN EN LA VENTANA, DIRECTAMENTE SOBRE EL JFrame, JDialog O JPanel.
            ALGUNAS PROPIEDADES TIENEN EL MISMO NOMBRE, PERO REALIZAN FUNCIONES DISTINTAS SEG�N EL ELEMENTO AL QUE SE APLIQUE.
                       
            - JButon:
                    NECESITA: -->  import javax.swing E import java.awt.event
                    PERMITE CREAR UN OBJETODE TIPO BOT�N DENTRO DE LA INTERFAZ GR�FICA EN JAVA.
                       
                        background            -> EL COLOR DE FONDO DEL BOT�N. SE MUESTRA SOLO SI ES OPACO.
                        enabled               -> true/false DETERMINA SI EL BOT�N EST� ACTIVO.
                        font                  -> FUENTE DEL TIPO DE LETRA.
                        foreground            -> COLOR DEL TEXTO.
                        horizontalAlignment   -> ALINEACI�N HORIZONTAL DEL TEXTO CON RESPECTO AL BOT�N.
                        verticalAlignment     -> ALINEACI�N VERTICAL DEL TEXTO CON RESPECTO AL BOT�N.
                        text                  -> TEXTO QUE APARECE DENTRO DEL BOT�N.
                        icon                  -> CARGA IMAGEN COMO FONDO DEL BOT�N.
                       
                                JButton btnNewButton = new JButton(?Pulsa aqu�?);
                                panel.add(btnNewButton);
                                btnNewButton.setFont(new Font(?Kohinoor Telugu?, Font.
                                BOLD, 13));
                                btnNewButton.setForeground(Color.RED);
                       
            - JLabel:
                    ES UN ELEMENTO CONTENEDOR DE TEXTO, IM�GENES O ICONOS.

                        background            -> EL COLOR DE LA ETIQUETA SI EST� DESHABILITADA.
                        enabled               -> HABILITA LA ETIQUETA.
                        font                  -> FUENTE DEL TIPO DE LETRA Y TAMA�O.
                        foreground            -> COLOR DEL TEXTO SI LA ETIQUETA EST� HABILITADA.
                        horizontalAlignment   -> ALINEACI�N HORIZONTAL DEL TEXTO CON RESPECTO A LA CAJA DE LA ETIQUETA.
                        verticalAlignment     -> ALINEACI�N VERTICAL DEL TEXTO CON RESPECTO A LA CAJA DE LA ETIQUETA.
                        text                  -> TEXTO QUE APARECE DENTRO DE LA ETIQUETA.
                        icon                  -> PERMITA CARGA UNA IMAGEN.
                       
            - JTextField:
                    SE UTILIZA COMO CONTENEDOR DE UNA L�NEA DE TEXTO,
                    EL TAMA�O QUEDA DEFINIDO POE EL VALOR DEL ATRIBUTO   --->   'columns'
                    NO SE TRATA DE UN VALOR EXACTO EN CUANTO A N�MERO DE CARACTERES,
                    SINO QUE EST� DEFINIENDO SU ANCHO,
                    EN FUNCUI�N DEL CAR�CTER QUE SE ESCRIBA LA CAPACIDAD VARIAR�.
                       
                        background            -> EL COLOR DE FONDO DE LA CAJA DE TEXTO.
                        columns               -> TAMA�O DE LA CAJA DE TEXTO.
                        enabled               -> HABILITA EL CAMPO DE TEXTO.
                        editable              -> PERMITE AL USUARIO MODIFICAR EL CONTENIDO.
                        font                  -> FUENTE DEL TIPO DE LETRA Y TAMA�O.
                        foreground            -> COLOR DEL TEXTO.
                        thorizontalAlignment  -> ALINEACI�N HORIZONTAL DEL TEXTO.
                        text                  -> TEXTO QUE APARECE AL INICIO EN LA CAJA.
                       
            - JCheckBox: (CASILLA O CHECKBOX)
                    SON ELEMENTOS QUE SE PRESENTAN JUNTO A UNA PEQUE�A CAJA CUADRADA
                    Y QUE PUEDEN SER MARCADOS POR EL USUARIO.
                    PRESENTAN UNAS PROPIEDADES SIMILARES A LOS CASOS ANTERIORES,
                    A�ADIENDO ALGUNOS NUEVOS ATRIBUTOS COMO   --->   'selected'
                    EL CU�L PUEDE SER DE VALOR                --->   'true'  O  'false'.
                    EL PRIMERO INDICAR� QUE LA CASILLA SE MUESTRE MARCADA POR DEFECTO Y SI ES 'false', APARECER� SIN MARCAR.
                       
            - JRadioButton:
                    SE UTILIZAN HABITUALMENTE EN EL DESARROLLO DE INTERFACES PARA INDICAR VARIAS OPCIONES,
                    DE LAS QUE SOLO SE PODR� ESCOGER UNA, LAS OPCIONES RESULTAR�N EXCLUYENTES.
                    LAS PROPIEDADES SON IGUALES A LA DEL ELEMENTO 'JCheckBox'.
                    CUANDO INSERTAMOS UN ELEMENTO EN UNA INTERFAZ SU FUNCIONAMIENTO ES MUY PARECIDO AL ELEMENTO DE TIPO 'check'.
                    PARA CONSEGUIR UN COMPORTAMIENTO EXCLUYENTE ES NECESARIO UTILIZAR UN OBJETO TIPO --> 'ButtonGroup'.
                    LA CREACI�N DE UN ELEMENTO 'ButtonGroup' NOS PERMITE ASOCIAR A ESTE GRUPO TANTOS ELEMENTOS COMO SE DESEEN.
                    TODOS AQUELLOS QUE QUEDEN AGRUPADOS RESULTAR�N EXCLUYENTES ENTRE S�.
                       
                            public holaMundo() {
                            //Se define el comportamiento de la ventana  
                            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                            setBounds(100, 100, 450, 300);
                            //Creaci�n de JRadioButton y se ubican 
                            JRadioButton r1 = new JRadioButton(?Opci�n 1?);
                            getContentPane().add(r1, BorderLayout.NORTH);
                            JRadioButton r2 = new JRadioButton(?Opci�n 2?);
                            getContentPane().add(r2, BorderLayout.WEST);
                            JRadioButton r3 = new JRadioButton(?Opci�n 3?);
                            getContentPane().add(r3, BorderLayout.SOUTH);
                            //Se agrupan los JRadioButton creados  
                            ButtonGroup bg=new ButtonGroup();
                            bg.add(r1);
                            bg.add(r2);
                            bg.add(r3);
                            }
                       
            - JComboBox: (MEN�S DESPLEGABLES)
                    PRESENTA UNAS PROPIEDADES MUY PARECIDAS AL RESTO DE COMPONENTES DESCRITOS.
                    PARA INSERTAR LOS VALORES QUE SE MOSTRAR�N EN EL COMBO UTILIZANDO LA VISTA DE DISE�O:
                    PROPIEDADES --> MODEL --> SE ABRIR� UNA VENTANA EN LA QUE SE ESCRIBEN LOS VALORES DEL COMBO.
                       
                    maximumRowCount  --->  ESTABLECE EL VALOR M�XIMO DE ELEMENTOS MOSTRADOS.
                    selectedIndex    --->  PERMITE INDICAR CU�L ES EL VALOR QUE MOSTRAR�A POR DEFECTO DE ENTRE TODOS,
                                           SIENDO 0 LA PRIMERA POSICI�N.                    
                                       
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
                       
            LAYOUT MANAGER --> MANEJADOR DE COMPOSICI�N.
                PERMITE ADAPTAR LA DISTRIBUCI�N DE LOS COMPONENTES SOBRE UN CONTENEDOR.
                SON LOS ENCARGADOS DE COLOCAR LOS COMPONENTES DE UNA INTERFAZ DE USUARIO
                EN EL PUNTO DESEADO Y CON EL TAMA�O PRECISO.
                
                - FLOW LAYOUT:
                        SIT�A LOS ELEMENTOS UNO AL LADO DEL OTRO, EN UNA MISMA FILA.
                        PERMITE DAR VALOR AL TIPO DE ALINEACI�N   --->   setAlignment(int VALOR)
                        AS� COMO LA DISTANCIA DE SEPARACI�N QUE QUEDA ENTRE LOS ELEMENTOS (vgap y hgap):
                                - setVgap(int VALOR)   --->   EN VERTICAL.
                                - setHgap(int VALOR)   --->   EN HORIZONTAL.
                       
                - GRID LAYOUT:
                        PERMITE COLOCAR LOS COMPONENTES DE UNA INTERFAZ SIGUIENDO UN PATR�N DE COLUMNAS Y FILAS,
                        SIMULANDO UNA REJILLA.
                        AL IGUAL QUE EN EL CASO ANTERIOR, ES POSIBLE MODIFICAR EL VALOR DE LA SEPARACI�N ENTRE COMPONENTES.
                        LAS PROPIEDADES DE ESTE ELEMENTO INCORPORAN:
                                - column   --->   N�MERO DE COLUMNAS.
                                - row      --->   N�MERO DE FILAS.
                        PARA LA CREACI�N DE ESTE SISTEMA DE REJILLA,
                        SE UTILIZA UN CONSTRUCTOR QUE NECESITA RECIBIR EL VALOR EXACTO
                        DE FILAS Y DE COLUMNAS QUE TENDR�A LA INTERFAZ:     --->   GridLayout(int numFilas, int numCol)
                        AS� COMO LA DISTANCIA DE SEPARACI�N QUE QUEDA ENTRE LOS ELEMENTOS (vgap y hgap):
                                - setVgap(int VALOR)   --->   EN VERTICAL.
                                - setHgap(int VALOR)   --->   EN HORIZONTAL.
                       
                - BORDER LAYOUT:
                        ES EL LAYOUT POR DEFECTO AL CREAR LAS VENTANAS.
                        PERMITE COLOCAR LOS ELEMENTOS EN LOS EXTREMOS DEL PANEL CONTENEDOR Y EN EL CENTRO.
                        PARA SITUAR A CADA UNO DE LOS ELEMENTOS DESDE LA VISTA DE DISE�O BASTA
                        CON COLOCARLOS EN LA POSICI�N DESEADA.
                       
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
                        A DIFERENCIA DEL TIPO GRID LAYOUT, ESTE PERMITE UN DISE�O M�S FLEXIBLE,
                        DONDE CADA UNO DE LOS COMPONENTES QUE SE COLOQUEN TENDR�N ASOCIADO UN OBJETO TIPO 'GridBagConstraints'.
                        SER� POSIBLE UBICAR EL ELEMENTO DE UNA FORMA M�S PRECISA,
                        SELECCIONANDO LA POSICI�N EXACTA DE LA REJILLA.
                                      
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
                        *  ENLAZAR VENTANAS:   1�  CREAR PREVIAMENTE Ventana1 Y Ventana2                  *
                        *                      2�  DOBLE CLICK SOBRE EL BOT�N DE Ventana1                 *
                        *                      3�  DENTRO DEL actionPerformed()                           *
                        *      INSTANCIAMOS V2 -->           Ventana2 vent = new Ventana2();              *
                        *      MOSTRAMOS V2    -->           vent.setVisible(true);                       *
                        *      CERRAMOS  V1    -->           dispose();                                   *
                        *                                                                                 *
                        * COMPONENTES:                                                                    *
                        *            - JButton        --> BOT�N                                           *
                        *            - JLabel         --> CONTENEDOR DE TEXTO, ICONOS E IM�GENES.         *
                        *            - JTextField     --> UNA L�NEA DE TEXTO. (A RELLENAR POR EL USUARIO) *
                        *            - JTextArea      --> L�NEAS DE TEXTO.    (A RELLENAR POR EL USUARIO) *
                        *            - JPassWordField --> PARA INTRODUCIR CONTRASE�A.                     *
                        *            - JCheckBox      --> CASILLA CUADRADA PARA MARCAR.                   *
                        *            - JRadioButton   --> CASILLA REDONDA PARA MARCAR.                    *
                        *            - ButtonGroup    --> GRUPO DE CASILLAS REDONDAS PARA MARCAR UNA.     *
                        *            - JComboBox      --> MEN�S DESPLEGABLES.                             *
                        *            - JSpinner       --> CAJA CON DOS FLECAS PARA MODIFICAR VALORES.     *
                        *                                                                                 *
                        *            - Flow Layout    --> EN UNA MISMA FILA.                              *
                        *            - Grid Layout    --> PATR�N MATRIZ (int numFilas, int numCol)        *
                        *            - Border Layout  --> EXTREMOS (NORT-SOUTH-EAST-WEST-CENTER)          *
                        *            - GridBag Layout --> Grid Layout CON POSICIONAMIENTO DE ELEMENTOS.   *
                        *                                                                                 *
                        * INICIO DE SECI�N POR USUARIO Y CONTRASE�A:                                      *
                        *                      1�  CREAR PREVIAMENTE VentControl Y VentPortal             *
                        *                      2�  DOBLE CLICK SOBRE EL BOT�N (Inicio) DE VentControl     *
                        *                      3�  DENTRO DEL actionPerformed()                           *
                        *    String user,pwd;                                                             *
                        *    user = textUsuario.getText();                                                *
                        *    pwd = String.copyValueOf(textContrasena.getPassword());                      *
                        *    if(user.contentEquals("Juan") && pwd.equals("polako")) {                     *
                        *            Fotograma acceso = new Fotograma();                                  *
                        *            acceso.setVisible(true);                                             *
                        *            dispose();                                                           *
                        *    } else {                                                                     *
                        *            JOptionPane.showInternalMessageDialog                                *
                        *            (null, "EL USUARIO O CONTRASE�A ES INCORRECTO");                     *
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
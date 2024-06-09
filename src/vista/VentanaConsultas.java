package vista;

import conexionBD.ConexionBD;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaConsultas extends JInternalFrame  implements ActionListener {

    private final ConexionBD miConexion;
    private JTextField txtIdAutomovil;
    private JTextField txtModelo;
    private JTextField txtFechaFabricacion;
    private JTextField txtPlaca;
    private JTextField txtMarcaIdMarca;
    private JTable tablaContenido;
    private JRadioButton radioIdAutomovil, radioModelo, radioFechaFabricacion, radioPlaca, radioMarcaIdMarca;
    private JButton btnBuscar, btnRestablecer;

    public VentanaConsultas(){
        miConexion = ConexionBD.getConexionInstancia();

        setTitle("Consultas");
        setSize(600, 400);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.yellow);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);


        radioIdAutomovil = new JRadioButton("ID AUTOMOVIL");
        radioIdAutomovil.setBounds(10, 10, 150, 20);
        add(radioIdAutomovil);
        txtIdAutomovil = new JTextField();
        txtIdAutomovil.setBounds(160, 10, 150, 20);
        add(txtIdAutomovil);

        radioModelo = new JRadioButton("MODELO");
        radioModelo.setBounds(10, 40, 150, 20);
        add(radioModelo);
        txtModelo = new JTextField();
        txtModelo.setBounds(160, 40, 150, 20);
        add(txtModelo);

        radioFechaFabricacion = new JRadioButton("FECHA");
        radioFechaFabricacion.setBounds(10, 70, 150, 20);
        add(radioFechaFabricacion);
        txtFechaFabricacion = new JTextField();
        txtFechaFabricacion.setBounds(160, 70, 150, 20);
        add(txtFechaFabricacion);

        radioPlaca = new JRadioButton("PLACA");
        radioPlaca.setBounds(10, 100, 150, 20);
        add(radioPlaca);
        txtPlaca = new JTextField();
        txtPlaca.setBounds(160, 100, 150, 20);
        add(txtPlaca);

        radioMarcaIdMarca = new JRadioButton("ID MARCA");
        radioMarcaIdMarca.setBounds(10, 130, 150, 20);
        add(radioMarcaIdMarca);
        txtMarcaIdMarca = new JTextField();
        txtMarcaIdMarca.setBounds(160, 130, 150, 20);
        add(txtMarcaIdMarca);

        btnBuscar = new JButton("BUSCAR");
        btnBuscar.setBounds(10, 160, 100, 25);
        btnBuscar.addActionListener(this);
        add(btnBuscar);

        btnRestablecer = new JButton("RESTABLECER");
        btnRestablecer.setBounds(120, 160, 100, 25);
        btnRestablecer.addActionListener(this);
        add(btnRestablecer);

        tablaContenido = new JTable();
        tablaContenido.setModel(new DefaultTableModel(
                new Object[][]{},
                new String []{
                        "idAutomovil", "modelo", "precio_lista", "fecha_fabricacion", "Cliente_idCliente", "placa", "Marca_idMarca"
                }
        ));

        JScrollPane jScrollPanel = new JScrollPane(tablaContenido);
        jScrollPanel.setBounds(10,200,560,150);
        add(jScrollPanel);

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("VENTANA CONSULTAS");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(600,400);
                JDesktopPane desktopPane = new JDesktopPane();
                frame.add(desktopPane, BorderLayout.CENTER);
                VentanaConsultas ventanaConsultas = new VentanaConsultas();
                desktopPane.add(ventanaConsultas);
                ventanaConsultas.setVisible(true);
                frame.setVisible(true);
                new VentanaConsultas().setVisible(true);
            }
        });
    }
}

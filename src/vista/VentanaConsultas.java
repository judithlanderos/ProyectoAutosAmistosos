package vista;

import conexionBD.ConexionBD;

import javax.swing.*;
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
        setSize(300, 200);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.yellow);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(204, 204, 255));
        panel.setLayout(new GridLayout(9, 2, 5, 5));

        radioIdAutomovil = new JRadioButton("ID AUTOMOVIL");
        txtIdAutomovil = new JTextField();

        radioModelo = new JRadioButton("MODELO");
        txtModelo = new JTextField();

        radioFechaFabricacion = new JRadioButton("FECHA");
        txtFechaFabricacion = new JTextField();

        radioPlaca = new JRadioButton("PLACA");
        txtPlaca = new JTextField();

        radioMarcaIdMarca = new JRadioButton("ID MARCA");
        txtMarcaIdMarca = new JTextField();

        btnBuscar = new JButton("BUSCAR");
        add(btnBuscar);

        btnRestablecer = new JButton("RESTABLECER");


        setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaConsultas().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

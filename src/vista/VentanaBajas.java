package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaBajas extends JInternalFrame {

    private JButton btmSalir;
    private JLabel btmPlaca;
    private JLabel btmidAutomovil;
    private JTextField placa;
    private JTextField idAutomovil;
    private JButton btm_Eliminar;
    private JTable tabla_Contenido;
    private JButton buscar;
    private JButton btnRespaldo;

    public VentanaBajas() {
        setTitle("Bajas");
        setSize(300, 200);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.ORANGE);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }
}
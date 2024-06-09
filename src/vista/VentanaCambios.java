package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaCambios extends JInternalFrame {

        private JButton btm_Modificar = new JButton("MODIFICAR");
        private JButton btm_salir = new JButton("SALIR");
        private JLabel btm_marca = new JLabel("MARCA");
        private JLabel btm_idModelo = new JLabel("MODELO");
        private JLabel btm_idCalcomania = new JLabel("IDAUTOMOVIL");
        private JLabel btm_fechafab = new JLabel("FECHA FABRICACION");
        private JLabel btm_precio = new JLabel("PRECIO");
        private JTextField Marca_idMarca = new JTextField();
        private JTextField modelo = new JTextField();
        private JTextField idAutomovil = new JTextField();
        private JTextField fecha_fabricacion = new JTextField();
        private JTextField precio_lista = new JTextField();
        private JLabel btm_placa = new JLabel("PLACA");
        private JTextField placa = new JTextField();
        private JLabel btm_Cliente = new JLabel("CLIENTE");
        private JComboBox<String> Cliente_idCliente = new JComboBox<>(new String[]{"C001", "C002", "C003", "C004", "C005", "C006", "C007"});

        public VentanaCambios(){

            setTitle("Cambios");
            setSize(600, 400);
            setClosable(true);
            setResizable(true);
            setMaximizable(true);
            setIconifiable(true);
            setBackground(Color.GREEN);
            setLayout(new BorderLayout());
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

}

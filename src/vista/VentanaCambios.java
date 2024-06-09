package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class VentanaCambios extends JInternalFrame implements ActionListener {

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

        private boolean validarCampos() {
                String idAutomovilText = idAutomovil.getText();
                String modeloText = modelo.getText();
                String fechaFabricacionText = fecha_fabricacion.getText();
                String placaText = placa.getText();
                String marcaIdText = Marca_idMarca.getText();

                Pattern idAutomovilPattern = Pattern.compile("^[A-Za-z0-9]+$");
                Pattern modeloPattern = Pattern.compile("^[A-Za-z0-9 ]+$");
                Pattern fechaPattern = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})$");
                Pattern placaPattern = Pattern.compile("^[A-Za-z]{3}[0-9]{3}$");
                Pattern marcaPattern = Pattern.compile("^M[0-9]{3}$");

                if (!idAutomovilText.isEmpty() && !idAutomovilPattern.matcher(idAutomovilText).matches()) {
                        JOptionPane.showMessageDialog(this, "El ID del automóvil debe contener solo letras y números.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                if (!modeloText.isEmpty() && !modeloPattern.matcher(modeloText).matches()) {
                        JOptionPane.showMessageDialog(this, "El modelo debe contener solo letras y números.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                if (!fechaFabricacionText.isEmpty() && !fechaPattern.matcher(fechaFabricacionText).matches()) {
                        JOptionPane.showMessageDialog(this, "La fecha debe estar en el formato YYYY-MM-DD.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                if (!placaText.isEmpty() && !placaPattern.matcher(placaText).matches()) {
                        JOptionPane.showMessageDialog(this, "La placa debe contener 3 letras y 3 números.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                if (!marcaIdText.isEmpty() && !marcaPattern.matcher(marcaIdText).matches()) {
                        JOptionPane.showMessageDialog(this, "El ID de la marca debe ser en el formato M seguido de 3 números.", "Error", JOptionPane.ERROR_MESSAGE);
                        return false;
                }

                return true;
        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                new VentanaCambios().setVisible(true);
            }
        });
    }
}

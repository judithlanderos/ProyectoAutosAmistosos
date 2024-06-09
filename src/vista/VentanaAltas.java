package vista;

import Controlador.AutomovilDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;

public class VentanaAltas extends JInternalFrame implements ActionListener {

    private AutomovilDAO automovilDAO;
    private JPanel pnl_Panel2;
    private JButton btn_BotonSalir;
    private JButton btn_guardar;
    private JLabel lbl_Marca;
    private JLabel lbl_Modelo;
    private JLabel lbl_Placa;
    private JButton btn_restablecer;
    private JComboBox<String> cmb_ClienteIdCliente;
    private JTextField txt_MarcaIdMarca;
    private JTextField txt_fechaFabricacion;
    private JTextField txt_idAutomovil;
    private JTextField txt_modelo;
    private JTextField txt_placa;
    private JTextField txt_precioLista;

    public VentanaAltas() {

        automovilDAO = new AutomovilDAO();

        setTitle("Ventana de Altas");
        setSize(300, 200);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBackground(Color.PINK);
        setLayout(new BorderLayout());
        setVisible(true);

        btn_BotonSalir = new JButton("Salir");
        add(btn_BotonSalir);
        btn_guardar = new JButton("Guardar");
        add(btn_guardar);
        btn_restablecer = new JButton("Restablecer");
        add(btn_restablecer);

        lbl_Marca = new JLabel("Marca:");
        add(lbl_Marca);
        lbl_Modelo = new JLabel("Modelo:");
        add(lbl_Modelo);
        lbl_Placa = new JLabel("Placa:");
        add(lbl_Placa);

        cmb_ClienteIdCliente = new JComboBox<>();
        add(cmb_ClienteIdCliente);
        txt_MarcaIdMarca = new JTextField(10);
        add(txt_MarcaIdMarca);
        txt_fechaFabricacion = new JTextField(10);
        add(txt_fechaFabricacion);
        txt_idAutomovil = new JTextField(10);
        add(txt_idAutomovil);
        txt_modelo = new JTextField(10);
        add(txt_modelo);
        txt_placa = new JTextField(10);
        add(txt_placa);
        txt_precioLista = new JTextField(10);
        add(txt_precioLista);

    }
    private boolean validarCampos() {
        String idAutomovilText = txt_idAutomovil.getText();
        String modeloText = txt_modelo.getText();
        String fechaFabricacionText = txt_fechaFabricacion.getText();
        String placaText = txt_placa.getText();
        String marcaIdText = txt_MarcaIdMarca.getText();

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
        if (e.getSource() == btn_BotonSalir) {
            this.dispose();
        } else if (e.getSource() == btn_guardar) {

            if (validarCampos()) {

            }
        } else if (e.getSource() == btn_restablecer) {
            txt_idAutomovil.setText("");
            txt_modelo.setText("");
            txt_fechaFabricacion.setText("");
            txt_placa.setText("");
            txt_MarcaIdMarca.setText("");
            txt_precioLista.setText("");
        }
    }
 }


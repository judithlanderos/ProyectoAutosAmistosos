package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal(){
        setTitle("Gestión de Autos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 800);

        JMenuBar menuBar = new JMenuBar();

        JMenu menuOperaciones = new JMenu("Acciones");
        JMenu menuAltas = new JMenu("Altas");
        JMenu menuBajas = new JMenu("Bajas");
        JMenu menuConsultas = new JMenu("Consultas");
        JMenu menuCambios = new JMenu("Cambios");

        JMenuItem menuItemAgregarAuto = new JMenuItem("Agregar Auto");
        JMenuItem menuItemAgregarCliente = new JMenuItem("Agregar Cliente");
        JMenuItem menuItemEliminarAuto = new JMenuItem("Eliminar Auto");
        JMenuItem menuItemEliminarCliente = new JMenuItem("Eliminar Cliente");
        JMenuItem menuItemConsultarAutos = new JMenuItem("Consultar Autos");
        JMenuItem menuItemConsultarClientes = new JMenuItem("Consultar Clientes");
        JMenuItem menuItemModificarAuto = new JMenuItem("Modificar Auto");
        JMenuItem menuItemModificarCliente = new JMenuItem("Modificar Cliente");

        menuItemAgregarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        menuAltas.add(menuItemAgregarAuto);
        menuAltas.add(menuItemAgregarCliente);
        menuBajas.add(menuItemEliminarAuto);
        menuBajas.add(menuItemEliminarCliente);
        menuConsultas.add(menuItemConsultarAutos);
        menuConsultas.add(menuItemConsultarClientes);
        menuCambios.add(menuItemModificarAuto);
        menuCambios.add(menuItemModificarCliente);

        menuOperaciones.add(menuAltas);
        menuOperaciones.add(menuBajas);
        menuOperaciones.add(menuConsultas);
        menuOperaciones.add(menuCambios);

        menuBar.add(menuOperaciones);

        setJMenuBar(menuBar);
        setLayout(new BorderLayout());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }
}

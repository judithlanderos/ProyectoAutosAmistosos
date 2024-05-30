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
        JMenuItem menuItemEliminarAuto = new JMenuItem("Eliminar Auto");
        JMenuItem menuItemConsultarAutos = new JMenuItem("Consultar Autos");
        JMenuItem menuItemModificarAuto = new JMenuItem("Modificar Auto");

        menuItemAgregarAuto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });

        menuAltas.add(menuItemAgregarAuto);
        menuBajas.add(menuItemEliminarAuto);
        menuConsultas.add(menuItemConsultarAutos);
        menuCambios.add(menuItemModificarAuto);

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

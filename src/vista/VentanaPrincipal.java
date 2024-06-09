package vista;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame implements ActionListener{
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

        menuAltas.addActionListener(this);
        menuBajas.addActionListener(this);
        menuConsultas.addActionListener(this);
        menuCambios.addActionListener(this);

        menuOperaciones.add(menuAltas);
        menuOperaciones.add(menuBajas);
        menuOperaciones.add(menuConsultas);
        menuOperaciones.add(menuCambios);

        menuBar.add(menuOperaciones);

        setJMenuBar(menuBar);
        setLayout(new BorderLayout());
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        String accion = e.getActionCommand();
        switch (accion){
            case "Altas":
                new VentanaAltas().setVisible(true);
                break;
            case "Bajas":
                new VentanaBajas().setVisible(true);
                break;
            case "Consultas":
                new VentanaConsultas().setVisible(true);
                break;
            case "Cambios":
                new VentanaCambios().setVisible(true);
                break;
            default:
                break;
        }
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

package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaBajas extends JInternalFrame {

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
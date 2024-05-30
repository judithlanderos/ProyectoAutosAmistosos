package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaConsultas extends JInternalFrame {

    public VentanaConsultas(){

        setTitle("Consultas");
        setSize(300, 200);
        setClosable(true);
        setResizable(true);
        setMaximizable(true);
        setIconifiable(true);
        setBackground(Color.yellow);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

    }
}

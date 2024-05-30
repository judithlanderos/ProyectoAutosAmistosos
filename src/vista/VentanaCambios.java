package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaCambios extends JInternalFrame {

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

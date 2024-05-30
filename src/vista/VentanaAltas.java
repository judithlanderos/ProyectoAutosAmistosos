package vista;

import javax.swing.*;
import java.awt.*;

public class VentanaAltas extends JInternalFrame {

    public VentanaAltas() {

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


    }
}

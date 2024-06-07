package vista;

import javax.swing.*;

public class VentanaLogin extends JInternalFrame {
    private JPanel panelLogin;


    public VentanaLogin(){
        setTitle("VENTANA LOGIN");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panelLogin = new JPanel();
        panelLogin.setLayout(null);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }
}
